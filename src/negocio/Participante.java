package negocio;

import java.util.ArrayList;

public class Participante {

	private int id;
	private String nome;

	private String campeao;

	public ArrayList<String> SelecaoNomeQ = new ArrayList<String>();
	public ArrayList<Integer> SelecaoPlacarQ = new ArrayList<Integer>();

	public ArrayList<String> SelecaoNomeS = new ArrayList<String>();
	public ArrayList<Integer> SelecaoPlacarS = new ArrayList<Integer>();

	public ArrayList<String> SelecaoNomeF = new ArrayList<String>();
	public ArrayList<Integer> SelecaoPlacarF = new ArrayList<Integer>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCampeao() {
		return campeao;
	}

	public void setCampeao(String campeao) {
		this.campeao = campeao;
	}
}
