
import java.io.FileNotFoundException;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Start
	{
		public static void main ( String[] args ) throws FileNotFoundException 
	  {
	    	 Frame frame = new Frame("Kampf der Klassen");
	    
	    JFrame.setDefaultLookAndFeelDecorated(true);
	    frame.setSize(800,650);
	    frame.setVisible( true );
	    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	      
	  }
		
		
		
		
	}