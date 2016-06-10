package cl.curso.java.login;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;

public class WebcamService {
	
	
	public static void camara() throws IOException{
		   Webcam webcam = Webcam.getDefault();
	        webcam.setViewSize(WebcamResolution.VGA.getSize());
	        webcam.open();
	        ImageIO.write(webcam.getImage(), "PNG" , 
	        		new File("/Users/erick/"+ new Date().getTime() + ".png"));
	        webcam.close();
	      
	        
	    
	} 

}
