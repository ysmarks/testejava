package captchas;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
/**
 * https://oxenteexception.wordpress.com/2011/01/21/processamento-digital-de-imagens-pdi-com-java/
 * https://www.guj.com.br/t/resolvido-tirar-fundo-verde-de-uma-imagem/382966/7
 * @author ysantos
 *
 */
public class App1 {
	 
    public static void main(String[] args) throws IOException {
 
        try {
            //carrega nova imagem
            BufferedImage imagem1 = ImageIO.read(new File("captcha.jpeg"));
            //instancia um filtro e aplica a escala de cinza
            Filtro filtro = new Filtro();
            filtro.threshold(imagem1, 1);
            //gera uma nova imagem a partir da imagem1
            ImageIO.write(imagem1,"jpg",new File("captcha2.jpeg"));
 
            //aqui apenas para demonstração,
            //carreguei novamente as duas imagens para exibi-las dentro de um JFrame
            imagem1 = ImageIO.read(new File("captcha.jpeg"));
            BufferedImage imagem2 = ImageIO.read(new File("captcha2.jpeg"));
            Exibicao show = new Exibicao();
            show.exibirImagem(imagem1, imagem2);
            System.out.println("Filtro aplicado com sucesso!");
        }
        catch(IOException e){
            System.out.println("Erro! Verifique se o arquivo especificado existe e tente novamente.");
        }
        catch(Exception e){
            System.out.println("Erro! " + e.getMessage());
        }
    }
 
}