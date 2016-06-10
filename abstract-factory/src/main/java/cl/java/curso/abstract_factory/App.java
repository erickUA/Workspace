package cl.java.curso.abstract_factory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String plataform = System.getProperty("os.name").toLowerCase();
    	
    	System.out.println( plataform);
    	GUIBuilder builder = new GUIBuilder();
    	if( plataform.startsWith("win"))
    		builder.buildWindow( new MSWindowWidgetFactory());
    	else{
    		builder.buildWindow(new MacOSWidgetFactory());
    	}
    }
}
