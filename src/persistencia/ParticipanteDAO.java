package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import negocio.Participante;

public class ParticipanteDAO {

	private Participante p;

	public void inserir(Participante p) {
		this.p = p;

		try {
			Connection conexao = new Conexao().getConexao();

			PreparedStatement inserir = conexao.prepareStatement(
					"insert into bolao (nome, SQ1, PQ1,	SQ2, PQ2, SQ3, PQ3, SQ4, PQ4, SQ5, PQ5, SQ6, PQ6, SQ7, PQ7,	SQ8, PQ8, SS1, PS1,	SS2, PS2, SS3, PS3,	SS4, PS4, SF1, PF1, SF2, PF2, campeao) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

			inserir.setString(1, p.getNome());

			inserir.setString(2, p.SelecaoNomeQ.get(0));
			inserir.setInt(3, p.SelecaoPlacarQ.get(0));
			inserir.setString(4, p.SelecaoNomeQ.get(1));
			inserir.setInt(5, p.SelecaoPlacarQ.get(1));
			inserir.setString(6, p.SelecaoNomeQ.get(2));
			inserir.setInt(7, p.SelecaoPlacarQ.get(2));
			inserir.setString(8, p.SelecaoNomeQ.get(3));
			inserir.setInt(9, p.SelecaoPlacarQ.get(3));
			inserir.setString(10, p.SelecaoNomeQ.get(4));
			inserir.setInt(11, p.SelecaoPlacarQ.get(4));
			inserir.setString(12, p.SelecaoNomeQ.get(5));
			inserir.setInt(13, p.SelecaoPlacarQ.get(5));
			inserir.setString(14, p.SelecaoNomeQ.get(6));
			inserir.setInt(15, p.SelecaoPlacarQ.get(6));
			inserir.setString(16, p.SelecaoNomeQ.get(7));
			inserir.setInt(17, p.SelecaoPlacarQ.get(7));

			inserir.setString(18, p.SelecaoNomeS.get(0));
			inserir.setInt(19, p.SelecaoPlacarS.get(0));
			inserir.setString(20, p.SelecaoNomeS.get(1));
			inserir.setInt(21, p.SelecaoPlacarS.get(1));
			inserir.setString(22, p.SelecaoNomeS.get(2));
			inserir.setInt(23, p.SelecaoPlacarS.get(2));
			inserir.setString(24, p.SelecaoNomeS.get(3));
			inserir.setInt(25, p.SelecaoPlacarS.get(3));

			inserir.setString(26, p.SelecaoNomeF.get(0));
			inserir.setInt(27, p.SelecaoPlacarF.get(0));
			inserir.setString(28, p.SelecaoNomeF.get(1));
			inserir.setInt(29, p.SelecaoPlacarF.get(1));

			inserir.setString(30, p.getCampeao());

			inserir.executeUpdate();

			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Participante> listar(Participante p) {

		this.p = p;
		ArrayList<Participante> aux = new ArrayList<Participante>();
		try {
			Connection conexao = new Conexao().getConexao();

			ResultSet resultado = conexao.prepareStatement("select * from bolao").executeQuery();

			while (resultado.next()) {
				p.setNome(resultado.getString("nome"));
				
				p.SelecaoNomeQ.add(resultado.getString("SQ1"));
				p.SelecaoPlacarQ.add(resultado.getInt("PQ1"));
				p.SelecaoNomeQ.add(resultado.getString("SQ2"));
				p.SelecaoPlacarQ.add(resultado.getInt("PQ2"));
				p.SelecaoNomeQ.add(resultado.getString("SQ3"));
				p.SelecaoPlacarQ.add(resultado.getInt("PQ3"));
				p.SelecaoNomeQ.add(resultado.getString("SQ4"));
				p.SelecaoPlacarQ.add(resultado.getInt("PQ4"));
				p.SelecaoNomeQ.add(resultado.getString("SQ5"));
				p.SelecaoPlacarQ.add(resultado.getInt("PQ5"));
				p.SelecaoNomeQ.add(resultado.getString("SQ6"));
				p.SelecaoPlacarQ.add(resultado.getInt("PQ6"));
				p.SelecaoNomeQ.add(resultado.getString("SQ7"));
				p.SelecaoPlacarQ.add(resultado.getInt("PQ7"));
				p.SelecaoNomeQ.add(resultado.getString("SQ8"));
				p.SelecaoPlacarQ.add(resultado.getInt("PQ8"));
				
				p.SelecaoNomeS.add(resultado.getString("SS1"));
				p.SelecaoPlacarS.add(resultado.getInt("PS1"));
				p.SelecaoNomeS.add(resultado.getString("SS2"));
				p.SelecaoPlacarS.add(resultado.getInt("PS2"));
				p.SelecaoNomeS.add(resultado.getString("SS3"));
				p.SelecaoPlacarS.add(resultado.getInt("PS3"));
				p.SelecaoNomeS.add(resultado.getString("SS4"));
				p.SelecaoPlacarS.add(resultado.getInt("PS4"));
				
				p.SelecaoNomeF.add(resultado.getString("SF1"));
				p.SelecaoPlacarF.add(resultado.getInt("PF1"));
				p.SelecaoNomeF.add(resultado.getString("SF2"));
				p.SelecaoPlacarF.add(resultado.getInt("PF2"));
				
				p.setCampeao(resultado.getString("campeao"));

				aux.add(p);
			}
			conexao.close();
		} catch (Exception e) {

		}
		return aux;
	}

}
