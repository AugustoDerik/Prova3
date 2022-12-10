package arquivos;

import java.awt.Component;

import javax.accessibility.Accessible;
import javax.accessibility.AccessibleContext;
import javax.swing.JComponent;
import javax.swing.filechooser.FileNameExtensionFilter;

public class JFileChooser extends JComponent implements Accessible {

	private static final int APPROVE_OPTION = 0;

	@Override
	public AccessibleContext getAccessibleContext() {
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
		chooser.setFileFilter(filter);
		Object parent = null;
		int returnVal = chooser.showOpenDialog(parent);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			System.out.println("You chose to open this file: " + chooser.getSelectedFile().getName());
		}
		return null;
	}

	private Component getSelectedFile() {
		// TODO Auto-generated method stub
		return null;
	}

	private int showOpenDialog(Object parent) {
		// TODO Auto-generated method stub
		return 0;
	}

	private void setFileFilter(FileNameExtensionFilter filter) {
		// TODO Auto-generated method stub

	}

}
