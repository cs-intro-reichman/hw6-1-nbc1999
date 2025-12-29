import java.awt.Color;

/**
 * Demonstrates the scaling (resizing) operation featured by Runigram.java. 
 * The program recieves three command-line arguments: a string representing the name
 * of the PPM file of a source image, and two integers that specify the width and the
 * height of the scaled, output image. For example, to scale/resize ironman.ppm to a width
 * of 100 pixels and a height of 900 pixels, use: java Editor2 ironman.ppm 100 900
 */
public class Editor2 {

	public static void main (String[] args){
		String fileName1 = args[0];
        String fileName2 = args[1];
        int n = Integer.parseInt(args[2]);
        Color[][] image1 = Runigram.read(fileName1);
        Color[][] image2 = Runigram.read(fileName2);
        Runigram.setCanvas(image1);
        Runigram.morph(image1, image2, n);		
	}
}
