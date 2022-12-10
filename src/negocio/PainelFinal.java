package negocio;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelFinal extends JPanel {

	public Participante p = new Participante();

	public static JTextField[] field = new JTextField[4];

	public PainelFinal(String array[]) {
		setLayout(new GridLayout(1, 9));

		add(new JLabel("Seleção:"));
		add(field[0] = new JTextField(array[0], 10));
		add(new JLabel("Placar:"));
		add(field[1] = new JTextField(null, 2));
		add(new JLabel("x",(int) CENTER_ALIGNMENT));
		add(new JLabel("Seleção:"));
		add(field[2] = new JTextField(array[1], 10));
		add(new JLabel("Placar:"));
		add(field[3] = new JTextField(null, 2));

	}
	
	public void PreencherSF(Participante p) {

		this.p = p;

		for (int i = 0; i < field.length; i++) {
			if (i % 2 == 0) {
				p.SelecaoNomeF.add(field[i].getText());
			} else {
				p.SelecaoPlacarF.add(Integer.parseInt(field[i].getText()));
			}
		}

	}

}
