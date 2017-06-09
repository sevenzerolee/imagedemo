package org.sevenzero.imagedemo;

import java.io.IOException;

import net.coobird.thumbnailator.Thumbnails;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		try {
			Thumbnails.of("/home/lb/temp/image/logincust-1920.jpg").size(200, 50).toFile("/home/lb/temp/image/200x50.jpg");
			
			Thumbnails.of("/home/lb/temp/image/logincust-1920.jpg").size(30, 30).toFile("/home/lb/temp/image/30x30.jpg");
			
			Thumbnails.of("/home/lb/temp/image/logincust-1920.jpg").scale(0.25F).toFile("/home/lb/temp/image/scale_0.25.jpg");
			
			Thumbnails.of("/home/lb/temp/image/logincust-1920.jpg").scale(0.1F).toFile("/home/lb/temp/image/scale_0.1.jpg");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
