package arquivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class LerScanner {

	JFileChooser ch = new JFileChooser();

	public void ler() {
		Scanner scanner;
		try {
			scanner = new Scanner((Readable) ch.getAccessibleContext()).useDelimiter(";");

			while (scanner.hasNext()) {
				System.out.println(scanner.next());
			}

		} catch (java.lang.ClassCastException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
