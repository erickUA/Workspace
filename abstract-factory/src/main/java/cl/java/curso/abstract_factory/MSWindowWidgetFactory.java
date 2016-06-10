package cl.java.curso.abstract_factory;

public class MSWindowWidgetFactory implements AbstractWidgetFactory {

	public Window createWindow() {
		
		return new MacOSwindow();
	}

}
