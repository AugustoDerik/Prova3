package negocio;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FrameSemi extends JFrame implements ActionListener {

	public FrameFinal f;
	public Participante p;
	public String aux[];
	public PainelSemi semi;

	public FrameSemi(Participante p, String vencedoresQ[]) {
		aux = vencedoresQ;
		this.p = p;
		setTitle("Semifinal");
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setSize(600, 150);
		orgalizarLayout();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void orgalizarLayout() {
		setLayout(new BorderLayout());

		semi = new PainelSemi(aux);
		add(semi, BorderLayout.CENTER);

		JButton b = new JButton("Enviar");
		b.addActionListener(this);
		add(b, BorderLayout.SOUTH);
	}

	public String compara(String s1, String s2, Integer p1, Integer p2) {

		int placar1 = p1;
		int placar2 = p2;
		String vencedor = "";
		if (placar2 > placar1)
			vencedor = s2;
		else
			vencedor = s1;
		return vencedor;

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JTextField aux[] = PainelSemi.field;

		String auxVencedores[] = new String[2];

		auxVencedores[0] = (compara(aux[0].getText(), aux[2].getText(), Integer.parseInt(aux[1].getText()),
				Integer.parseInt(aux[3].getText())));
		auxVencedores[1] = (compara(aux[4].getText(), aux[6].getText(), Integer.parseInt(aux[5].getText()),
				Integer.parseInt(aux[7].getText())));

		f = new FrameFinal(p, auxVencedores);
		semi.PreencherSS(p);
		this.setVisible(false);

	}

}
