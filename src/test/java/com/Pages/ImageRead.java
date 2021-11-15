package com.Pages;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ImageRead {
	
	
	public void readImageTest() throws TesseractException {
		
		String basePath = System.getProperty("user.dir");
		
		String filePath = basePath + "\\Agile 2.PNG";
		
		File file = new File(filePath);
		
		ITesseract tess = new Tesseract();
		
		tess.setDatapath(System.getProperty("user.dir"));
		
		String text = tess.doOCR(file);
		
		System.out.println("Text Extracted from Image is ");
		
		System.out.println(text);
		
}
	
	
	
	
	public static void main(String[] args) throws TesseractException {
		ImageRead IR = new ImageRead();
		IR.readImageTest();
	}

}
