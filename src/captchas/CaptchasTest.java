package captchas;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class CaptchasTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		/*
		 * Runtime run = Runtime.getRuntime(); Process proc; String comand =
		 * "convert imagem.png -level 20000,0,20000 imagem.png"; proc =
		 * run.exec(comand); proc.waitFor(); proc.destroy();
		 */
		
		BufferedImage imagem = ImageIO.read(new File("captcha.jpeg"));
		int w = imagem.getWidth();
		int h = imagem.getHeight();
		int[] pixels = imagem.getRGB(0, 0, w, h, null, 0, w);
		Random r = new Random();

		for (int col = 0; col < w; col++) {
		  for (int lin = 0; lin < h; lin++) {
		    pixels[w * lin + col] = new Color(r.nextInt(10), col % 100, lin % 100).getRGB();
		  }
		}

		imagem.setRGB(0, 0, w, h, pixels, 0, w);
		ImageIO.write(imagem, "PNG", new File("teste.png"));
		
	}
}
