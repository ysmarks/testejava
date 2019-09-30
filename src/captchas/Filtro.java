package captchas;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class Filtro {
	 
    //método de aplicação do filtro escala de cinza
    //recebe como parâmetro uma imagem
    public static BufferedImage escalaDeCinza(BufferedImage imagem) {
        //pegar largura e altura da imagem
        int width = imagem.getWidth();
        int height = imagem.getHeight();
 
        int media = 0;
        //laço para varrer a matriz de pixels da imagem
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {  //rgb recebe o valor RGB do pixel em questão  
            	int rgb = imagem.getRGB(i, j);              
            	int r = (int)((rgb&0x00FF0000)>>>16); //R
                int g = (int)((rgb&0x0000FF00)>>>8);  //G
                int b = (int) (rgb&0x000000FF);       //B
 
                //media dos valores do RGB
                //será o valor do pixel na nova imagem
                media = (r + g + b) / 3;
 
                //criar uma instância de Color
                Color color = new Color(media, media, media);
                //setar o valor do pixel com a nova cor
                imagem.setRGB(i, j, color.getRGB());
            }
        }
        return imagem;
    }
 
    public static BufferedImage negativo(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) { 
            	int rgb = image.getRGB(i, j); //a cor inversa é dado por 255 menos o valor da cor                
            	int r = 255 - (int)((rgb&0x00FF0000)>>>16);
                int g = 255 - (int)((rgb&0x0000FF00)>>>8);
                int b = 255 - (int) (rgb&0x000000FF);
                Color color = new Color(r, g, b);
                image.setRGB(i, j, color.getRGB());
            }
        }
        return image;
    }
 
    public static BufferedImage threshold(BufferedImage image, int limiar) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {               
            	int rgb = image.getRGB(i, j);               
            	int r = (int)(rgb&0x00FF0000);
                int g = (int)(rgb&0x0000FFFF);
                int b = (int) (rgb&0x000000FF);
                int media = (r + g + b) / 3;
                Color white = new Color(255, 255, 255);
                Color black = new Color(0, 0, 0);
                //como explicado no artigo, no threshold definimos um limiar,
                //que é um valor "divisor de águas"
                //pixels com valor ABAIXO do limiar viram pixels PRETOS,
                //pixels com valor ACIMA do limiar viram pixels BRANCOS
                if (media < limiar)
                    image.setRGB(i, j, black.getRGB());
                else
                    image.setRGB(i, j, white.getRGB());
            }
        }
        return image;
    }
    public static BufferedImage tornarTransparente(BufferedImage image){
		int corDoCanto = image.getRGB(0,0); // pega a cor de referencia para a transparencia
		Color transparente = new Color(255,255,255,0); // cor transparente, para ser passada pra nova imagem
		
		// nova imagem com o tipo certo
		BufferedImage resultado = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_ARGB);
		
		// percorre todos os pixels
		for (int i = 0; i < image.getWidth(); i++){
			for (int j = 0; j < image.getHeight(); j++){
				int corDoPixel = image.getRGB(i,j); // pega a cor do pixel 
				if (corDoCanto == corDoPixel){ // compara com a cor de referencia do canto 0,0
					resultado.setRGB(i, j, transparente.getRGB()); // torna o pixel transparente
				}else{
					resultado.setRGB(i, j, image.getRGB(i,j)); // mantém a cor original
				}
			}
		}
		
		return resultado; // retorna a nova imagem
	}
}