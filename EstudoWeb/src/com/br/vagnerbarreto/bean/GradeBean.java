package com.br.vagnerbarreto.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "tb_grade_horarios")
public class GradeBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id_grade_horarios")
	private long id;

	@Column(name = "linha")
	private String linha;

	@Column(name = "numero_onibus")
	private int numOnibus;

	@Temporal(TemporalType.TIME)
	@Column(name = "horario_partida")
	private Date horario;

	@Column(name = "intinerario")
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
