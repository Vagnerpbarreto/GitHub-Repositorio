package com.br.vagnerbarreto.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import br.com.vagnerbarreto.dao.GradeDAO;

import com.br.vagnerbarreto.bean.GradeBean;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class LerArquivosController {

	public void arquivo() {
		String linha = null;

		try {
			FileReader reader = new FileReader(
					"C:/Documents and Settings/vagner.barreto/git/GitHub-Repositorio/EstudoWeb/arquivos/leituradearquivos.txt"); // Localização
																																	// do
																																	// Arquivo
			BufferedReader leitor = new BufferedReader(reader);
			StringTokenizer st = null;

			GradeBean gradeBean = new GradeBean();

			while ((linha = leitor.readLine()) != null) {

				// UTILIZA DELIMITADOR ; PARA DIVIDIR OS CAMPOS
				st = new StringTokenizer(linha, ";");
				String dados = null;

				while (st.hasMoreTokens()) {

					// Campo Linha
					dados = st.nextToken();
					gradeBean.setLinha(dados);

					// Campo NuOnibus
					dados = st.nextToken();
					gradeBean.setNumOnibus(Integer.parseInt(dados));

					// Campo Horario
					dados = st.nextToken();
					Date data = formataData(dados);

					gradeBean.setHorario(data);

					// Campo Intnerario
					dados = st.nextToken();
					gradeBean.setIntinerario(dados);

					GradeDAO dao = new GradeDAO();

					dao.insere(gradeBean.getLinha(), gradeBean.getNumOnibus(),
							gradeBean.getHorario(), gradeBean.getIntinerario());

				}
			}
			leitor.close();
			reader.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Date formataData(String hora) throws Exception {
		String str = hora;
		SimpleDateFormat formatador = new SimpleDateFormat("HH:mm");
		Date data = formatador.parse(str);
		Time time = new Time(data.getTime());
		return time;
	}

	public static void main(String[] args) throws java.text.ParseException {
		LerArquivosController t = new LerArquivosController();
		t.arquivo();

	}

}
