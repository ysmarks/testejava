package captchas;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ReadImage {
	public static void main(String[] args) throws TesseractException {
		
		File imageFile = new File("captcha.jpeg");
		ITesseract instance = new Tesseract();
		instance.setDatapath("tessdata");
        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
	}

}
