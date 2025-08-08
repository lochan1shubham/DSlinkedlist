package test;

public class FactoryDesignPattern {
	
	public static void main(String [] args) {
		WindowsButton wButton = new WindowsButton();
		wButton.render();
		
		MacDialog windowsDialog = new MacDialog();
		windowsDialog.renderWindow();
	
	}

}

//Product interface
	interface Button {
	    void render();
	}

	// Concrete Product
	class WindowsButton implements Button {
	    public void render() {
	        System.out.println("Rendering Windows Button");
	    }
	}

	class MacButton implements Button {
	    public void render() {
	        System.out.println("Rendering Mac Button");
	    }
	}

	// Factory (Creator)
	abstract class Dialog {
	    abstract Button createButton();

	    void renderWindow() {
	        Button button = createButton();
	        button.render();
	    }
	}

	// Concrete Factories
	 class WindowsDialog extends Dialog  {
	    Button createButton() {
	        return new WindowsButton();
	    }
	}

	class MacDialog extends Dialog {
	    Button createButton() {
	        return new MacButton();
	    }
	}
