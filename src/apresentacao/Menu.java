package apresentacao;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import arquivos.ExportarBolao;
import arquivos.LerScanner;
import negocio.FrameEscreverNome;
import negocio.FrameMostrar;
import negocio.FrameQuartas;
import negocio.Participante;
import persistencia.ParticipanteDAO;

public class Menu extends JFrame {

	Participante p = new Participante();
	ParticipanteDAO dao = new ParticipanteDAO();

	public Menu() {

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 400);
		organizarLayout();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void organizarLayout() {
		setLayout(new GridLayout(5, 1));

		add(new JLabel("Funcionalidades do bolão", (int) CENTER_ALIGNMENT));

		JButton b1 = new JButton("Cadastrar novo bolão");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameEscreverNome escreverNome = new FrameEscreverNome(p);
				setVisible(false);
			}
		});
		b1.setBackground(Color.lightGray);
		add(b1);

		JButton b2 = new JButton("Mostrar bolões cadastrados");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameMostrar bolao = new FrameMostrar();
				setVisible(false);
			}
		});
		b2.setBackground(Color.lightGray);
		add(b2);

		JButton b3 = new JButton("Importar bolões");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				LerScanner ler = new LerScanner();
//				ler.ler();

			}
		});
		b3.setBackground(Color.lightGray);
		add(b3);

		JButton b4 = new JButton("Exportar bolões");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File file = new File("arquivo.txt");
				ExportarBolao ex = new ExportarBolao();
				String msg = "";
				int i = 0;
				while (i < dao.listar(p).size()) {
					msg += dao.listar(p).get(i).getNome() + ";" + dao.listar(p).get(i).SelecaoNomeQ.get(0) + ";"
							+ dao.listar(p).get(i).SelecaoPlacarQ.get(0) + ";"
							+ dao.listar(p).get(i).SelecaoNomeQ.get(1) + ";"
							+ dao.listar(p).get(i).SelecaoPlacarQ.get(1) + ";"
							+ dao.listar(p).get(i).SelecaoNomeQ.get(2) + ";"
							+ dao.listar(p).get(i).SelecaoPlacarQ.get(2) + ";"
							+ dao.listar(p).get(i).SelecaoNomeQ.get(3) + ";"
							+ dao.listar(p).get(i).SelecaoPlacarQ.get(3) + ";"
							+ dao.listar(p).get(i).SelecaoNomeQ.get(4) + ";"
							+ dao.listar(p).get(i).SelecaoPlacarQ.get(4) + ";"
							+ dao.listar(p).get(i).SelecaoNomeQ.get(5) + ";"
							+ dao.listar(p).get(i).SelecaoPlacarQ.get(5) + ";"
							+ dao.listar(p).get(i).SelecaoNomeQ.get(6) + ";"
							+ dao.listar(p).get(i).SelecaoPlacarQ.get(6) + ";"
							+ dao.listar(p).get(i).SelecaoNomeQ.get(7) + ";"
							+ dao.listar(p).get(i).SelecaoPlacarQ.get(7) + ";"
							+ dao.listar(p).get(i).SelecaoNomeS.get(0) + ";"
							+ dao.listar(p).get(i).SelecaoPlacarS.get(0) + ";"
							+ dao.listar(p).get(i).SelecaoNomeS.get(1) + ";"
							+ dao.listar(p).get(i).SelecaoPlacarS.get(1) + ";"
							+ dao.listar(p).get(i).SelecaoNomeS.get(2) + ";"
							+ dao.listar(p).get(i).SelecaoPlacarS.get(2) + ";"
							+ dao.listar(p).get(i).SelecaoNomeS.get(3) + ";"
							+ dao.listar(p).get(i).SelecaoPlacarS.get(3) + ";"
							+ dao.listar(p).get(i).SelecaoNomeF.get(0) + ";"
							+ dao.listar(p).get(i).SelecaoPlacarF.get(0) + ";"
							+ dao.listar(p).get(i).SelecaoNomeF.get(1) + ";"
							+ dao.listar(p).get(i).SelecaoPlacarF.get(1) + ";" + dao.listar(p).get(i).getCampeao()
							+ "\n";
					i++;
				}
				ex.escrever(msg, file, p);
				setVisible(false);
			}
		});
		b4.setBackground(Color.lightGray);
		add(b4);
	}
}
