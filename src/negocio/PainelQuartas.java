package negocio;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelQuartas extends JPanel {

	public Participante p = new Participante();

	public static JTextField[] field = new JTextField[16];

	public PainelQuartas() {
		setLayout(new GridLayout(4, 9));

		add(new JLabel("Seleção:"));
		add(field[0] = new JTextField(null, 10));
		add(new JLabel("Placar:"));
		add(field[1] = new JTextField(null, 2));
		add(new JLabel("x",(int) CENTER_ALIGNMENT));
		add(new JLabel("Seleção:"));
		add(field[2] = new JTextField(null, 10));
		add(new JLabel("Placar:"));
		add(field[3] = new JTextField(null, 2));

		add(new JLabel("Seleção:"));
		add(field[4] = new JTextField(null, 10));
		add(new JLabel("Placar:"));
		add(field[5] = new JTextField(null, 2));
		add(new JLabel("x",(int) CENTER_ALIGNMENT));
		add(new JLabel("Seleção:"));
		add(field[6] = new JTextField(null, 10));
		add(new JLabel("Placar:"));
		add(field[7] = new JTextField(null, 2));

		add(new JLabel("Seleção:"));
		add(field[8] = new JTextField(null, 10));
		add(new JLabel("Placar:"));
		add(field[9] = new JTextField(null, 2));
		add(new JLabel("x",(int) CENTER_ALIGNMENT));
		add(new JLabel("Seleção:"));
		add(field[10] = new JTextField(null, 10));
		add(new JLabel("Placar:"));
		add(field[11] = new JTextField(null, 2));

		add(new JLabel("Seleção:"));
		add(field[12] = new JTextField(null, 10));
		add(new JLabel("Placar:"));
		add(field[13] = new JTextField(null, 2));
		add(new JLabel("x",(int) CENTER_ALIGNMENT));
		add(new JLabel("Seleção:"));
		add(field[14] = new JTextField(null, 10));
		add(new JLabel("Placar:"));
		add(field[15] = new JTextField(null, 2));

	}

	public void PreencherSQ(Participante p) {

		this.p = p;

		for (int i = 0; i < field.length; i++) {
			if (i % 2 == 0) {
				p.SelecaoNomeQ.add(field[i].getText());
			} else {
				p.SelecaoPlacarQ.add(Integer.parseInt(field[i].getText()));
			}
		}

	}

}
