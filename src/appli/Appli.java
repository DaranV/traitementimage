package appli;

import fr.unistra.pelican.Image;
import traitementImageProject.NoiseTools;
import traitementImageProject.TraitementImagesUtils;

public class Appli {
	
	public static void main(String[] args) {
		
		//test de lecture d'image 
		TraitementImagesUtils.readImage("C:\\Users\\d_vig\\Downloads\\kurtz_image\\maldive.jpg");
		
		//Test filtre médian 
		Image couleur = TraitementImagesUtils.readImage("C:\\Users\\d_vig\\Downloads\\kurtz_image\\maldive.jpg");
		Image newImage = NoiseTools.addNoise(couleur, 0.2);
		//Viewer2D.exec(newImage);
		
		Image result = TraitementImagesUtils.filtreMedian(newImage);
		//Viewer2D.exec(result);
		
		double[][] histo = TraitementImagesUtils.getHistogram(result);
		//double[][][] newHisto = TraitementImagesUtils.discretize(histo); 
		TraitementImagesUtils.displayHistogram(histo);
		
		
	
	
	}

}
