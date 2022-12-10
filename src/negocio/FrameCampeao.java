package negocio;

import java.awt.BorderLayout;
import java.awt.Image;
import java.util.Objects;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class FrameCampeao extends JFrame {

	public Participante p;
	public String aux[];
	public JLabel label;
	private ImageIcon brasil = new ImageIcon("brasil.png");

	public FrameCampeao(Participante p, String vencedorF[]) {

		setLayout(new BorderLayout());

		this.p = p;
		aux = vencedorF;
		setTitle("Seleção Campeã segundo o palpite do participante");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 600);
		add(new JLabel(p.getCampeao()));
		setLocationRelativeTo(null);
		label = new JLabel();
		// bandeira();
		add(label, BorderLayout.NORTH);
		setVisible(true);

	}

//	public void bandeira() {
//		if (aux[0].equals("BRA")) {
//			
//			label.setIcon(new ImageIcon("brasil.png"));
//			
//			ImageIcon imagemMenor = ((((Image) brasil).getScaledInstance(500, 400, Image.SCALE_SMOOTH)));
//			
//			
//			//ImageIcon brasil = new ImageIcon(Objects.requireNonNull(getClass().getResource("/img/brasil.png")));
//			//label.setIcon(brasil);
//
//		}
//	}

}
