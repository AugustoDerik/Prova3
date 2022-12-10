package negocio;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import persistencia.ParticipanteDAO;

public class FrameFinal extends JFrame implements ActionListener {

	public Participante p;
	public String aux[];
	public PainelFinal f;
	public FrameCampeao frame;

	public FrameFinal(Participante p, String vencedoresS[]) {
		aux = vencedoresS;
		this.p = p;
		setTitle("Final");
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setSize(600, 100);
		orgalizarLayout();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void orgalizarLayout() {
		setLayout(new BorderLayout());

		f = new PainelFinal(aux);
		add(f, BorderLayout.CENTER);

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

		String auxVencedores[] = new String[1];

		auxVencedores[0] = (compara(aux[0].getText(), aux[2].getText(), Integer.parseInt(aux[1].getText()),
				Integer.parseInt(aux[3].getText())));
		
		p.setCampeao(auxVencedores[0]);

		f.PreencherSF(p);
		frame = new FrameCampeao(p,auxVencedores);
		
		ParticipanteDAO participanteDAO = new ParticipanteDAO();
		participanteDAO.inserir(p);
		
		this.setVisible(false);

	}

}
