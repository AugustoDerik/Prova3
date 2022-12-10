package arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import negocio.Participante;

public class ExportarBolao {

	private Participante p = new Participante();

	public void escrever(String mensagem, File file, Participante p) {

		this.p = p;

		try {
			FileWriter arquivo = new FileWriter(file);
			arquivo.write(mensagem);
			arquivo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
