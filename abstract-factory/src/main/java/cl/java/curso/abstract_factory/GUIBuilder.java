package cl.java.curso.abstract_factory;

public class GUIBuilder {
	
	public Window buildWindow( AbstractWidgetFactory factory){
		return factory.createWindow();
		
	}

}
