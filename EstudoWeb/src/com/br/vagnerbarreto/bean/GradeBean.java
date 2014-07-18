package com.br.vagnerbarreto.bean;

import java.io.Serializable;
import java.util.Date;

public class GradeBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String linha;
	private int numOnibus;
	private Date horario;
	private String intinerario;

	public String getLinha() {
		return linha;
	}

	public void setLinha(String linha) {
		this.linha = linha;
	}

	public int getNumOnibus() {
		return numOnibus;
	}

	public void setNumOnibus(int numOnibus) {
		this.numOnibus = numOnibus;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public String getIntinerario() {
		return intinerario;
	}

	public void setIntinerario(String intinerario) {
		this.intinerario = intinerario;
	}

}
