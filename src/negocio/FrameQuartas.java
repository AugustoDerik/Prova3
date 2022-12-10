package negocio;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FrameQuartas extends JFrame implements ActionListener {

	public FrameSemi s;
	public Participante p;
	public PainelQuartas quartas;

	public FrameQuartas(Participante p) {
		this.p = p;
		setTitle("Quartas de Final");
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setSize(600, 300);
		orgalizarLayout();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void orgalizarLayout() {
		setLayout(new BorderLayout());

		quartas = new PainelQuartas();
		add(quartas, BorderLayout.CENTER);

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

		JTextField aux[] = PainelQuartas.field;

		String auxVencedores[] = new String[4];

		auxVencedores[0] = (compara(aux[0].getText(), aux[2].getText(), Integer.parseInt(aux[1].getText()),
				Integer.parseInt(aux[3].getText())));
		auxVencedores[1] = (compara(aux[4].getText(), aux[6].getText(), Integer.parseInt(aux[5].getText()),
				Integer.parseInt(aux[7].getText())));
		auxVencedores[2] = (compara(aux[8].getText(), aux[10].getText(), Integer.parseInt(aux[9].getText()),
				Integer.parseInt(aux[11].getText())));
		auxVencedores[3] = (compara(aux[12].getText(), aux[14].getText(), Integer.parseInt(aux[13].getText()),
				Integer.parseInt(aux[15].getText())));

		s = new FrameSemi(p, auxVencedores);
		quartas.PreencherSQ(p);
		this.setVisible(false);

	}

}
