package Code_package;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Prueba extends JOptionPane{
	public static void main(String[] args) {
		//default message
		JOptionPane.showMessageDialog(getRootFrame(), "omg this is working.");
		//custom title, warning icon
		JOptionPane.showMessageDialog(getRootFrame(),
		    "And this still working xd",
		    "Warning",
		    JOptionPane.WARNING_MESSAGE);
		//custom title, error icon
		JOptionPane.showMessageDialog(getRootFrame(),
		    "Mensaje de error asi bien erroroso",
		    "Error",
		    JOptionPane.ERROR_MESSAGE);
		//custom title, no icon
		JOptionPane.showMessageDialog(getRootFrame(),
		    "Mensaje asi bien claro sin icono",
		    "A message without an icon",
		    JOptionPane.PLAIN_MESSAGE);
		//custom title, custom icon
		/*ImageIcon icon = createImageIcon("images/middle.gif",
                "a pretty but meaningless splat");
		JOptionPane.showMessageDialog(getRootFrame(),
		    "Ni idea que decir aca, no se como sacar el icono custom :c.",
		    "Dialogo Random",
		    JOptionPane.INFORMATION_MESSAGE);*/
	}
	
	/** Returns an ImageIcon, or null if the path was invalid. */
	protected ImageIcon createImageIcon(String path,
	                                           String description) {
	    java.net.URL imgURL = getClass().getResource(path);
	    if (imgURL != null) {
	        return new ImageIcon(imgURL, description);
	    } else {
	        System.err.println("Couldn't find file: " + path);
	        return null;
	    }
	}

	private static final long serialVersionUID = 1L;
	
}
