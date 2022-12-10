package negocio;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import persistencia.ParticipanteDAO;

public class FrameMostrar extends JFrame {

	private JTable tabela;
	private Participante p;
	private ParticipanteDAO dao = new ParticipanteDAO();
	private DefaultTableModel modelo = new DefaultTableModel();

	public FrameMostrar() {
		setTitle("Bolões cadastrados");

		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		String colunas[] = { "bolões" };
		// Object linhas[][] = criarTabela(p);

//		modelo.setNumRows(70);
//		modelo.addRow(criarTabela(p));
//		modelo.addColumn(colunas);

		tabela = new JTable(criarTabela(p),colunas);
		tabela.setRowHeight(20);
		tabela.setFillsViewportHeight(true);
		add(tabela);

		JScrollPane barra = new JScrollPane(tabela);
		barra.setViewportView(tabela);
		add(barra);

		setLocationRelativeTo(null);
		setVisible(true);
	}

	public Object[][] criarTabela(Participante p) {
		this.p = p;

		Object[][] dados = new Object[dao.listar(p).size()][1];

		for (int i = 1; i < dao.listar(p).size(); i++) {
			for (int j = 0; j < 31; j++) {
				dados[i][j] = dao.listar(p).get(i).getNome() + dao.listar(p).get(i).SelecaoNomeQ.get(0)
						+ dao.listar(p).get(i).SelecaoPlacarQ.get(0) + dao.listar(p).get(i).SelecaoNomeQ.get(1)
						+ dao.listar(p).get(i).SelecaoPlacarQ.get(1) + dao.listar(p).get(i).SelecaoNomeQ.get(2)
						+ dao.listar(p).get(i).SelecaoPlacarQ.get(2) + dao.listar(p).get(i).SelecaoNomeQ.get(3)
						+ dao.listar(p).get(i).SelecaoPlacarQ.get(3) + dao.listar(p).get(i).SelecaoNomeQ.get(4)
						+ dao.listar(p).get(i).SelecaoPlacarQ.get(4) + dao.listar(p).get(i).SelecaoNomeQ.get(5)
						+ dao.listar(p).get(i).SelecaoPlacarQ.get(5) + dao.listar(p).get(i).SelecaoNomeQ.get(6)
						+ dao.listar(p).get(i).SelecaoPlacarQ.get(6) + dao.listar(p).get(i).SelecaoNomeQ.get(7)
						+ dao.listar(p).get(i).SelecaoPlacarQ.get(7) + dao.listar(p).get(i).SelecaoNomeS.get(0)
						+ dao.listar(p).get(i).SelecaoPlacarS.get(0) + dao.listar(p).get(i).SelecaoNomeS.get(1)
						+ dao.listar(p).get(i).SelecaoPlacarS.get(1) + dao.listar(p).get(i).SelecaoNomeS.get(2)
						+ dao.listar(p).get(i).SelecaoPlacarS.get(2) + dao.listar(p).get(i).SelecaoNomeS.get(3)
						+ dao.listar(p).get(i).SelecaoPlacarS.get(3) + dao.listar(p).get(i).SelecaoNomeF.get(0)
						+ dao.listar(p).get(i).SelecaoPlacarF.get(0) + dao.listar(p).get(i).SelecaoNomeF.get(1)
						+ dao.listar(p).get(i).SelecaoPlacarF.get(1) + dao.listar(p).get(i).getCampeao();

			}
		}

		return dados;
	}

}
