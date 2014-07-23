package com.br.vagnerbarreto.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.vagnerbarreto.dao.GradeDAO;

import com.br.vagnerbarreto.bean.GradeBean;

@ManagedBean(name = "grade")
@ViewScoped
public class GradeController implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private List<GradeBean> listarGrade;
	private GradeDAO gradeDAO = new GradeDAO();

	public GradeController() {
		this.nome = "teste de contrutor default!!!!";
		setListarGrade(gradeDAO.consultarTodos());
		
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<GradeBean> getListarGrade() {
		return listarGrade;
	}

	public void setListarGrade(List<GradeBean> listarGrade) {
		this.listarGrade = listarGrade;
	}

	public GradeDAO getGradeDAO() {
		return gradeDAO;
	}

	public void setGradeDAO(GradeDAO gradeDAO) {
		this.gradeDAO = gradeDAO;
	}

}
