package negocio;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameEscreverNome extends JFrame implements ActionListener {

	public JTextField BarradeNome;
	public JLabel Comando;
	public Participante part;
	public JButton Enviar;
	public FrameQuartas f;

	public FrameEscreverNome(Participante p) {
		part = p;

		setSize(500, 100);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

		setLayout(new FlowLayout());
		Comando = new JLabel("Insira o Nome do Jogador para Continuar: ");
		add(Comando);

		BarradeNome = new JTextField(30);
		BarradeNome.setSize(getPreferredSize());
		add(BarradeNome);

		Enviar = new JButton("Enviar");
		Enviar.addActionListener(this);
		add(Enviar);

		setLocationRelativeTo(null);

		setVisible(true);
		setAlwaysOnTop(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String n;
		n = this.BarradeNome.getText();

		if (n.equals("")) {
			this.Comando.setText("O jogo não poderá prosseguir enquanto o Jogador não tiver Nome!");
		} else {
			this.setVisible(false);
		}
		f = new FrameQuartas(part);
		
		part.setNome(BarradeNome.getText());

	}

}
