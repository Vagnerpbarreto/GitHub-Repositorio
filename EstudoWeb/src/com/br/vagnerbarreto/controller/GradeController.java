package com.br.vagnerbarreto.controller;



import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
@ManagedBean(name="grade")
@ViewScoped 
public class GradeController  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String 	nome ;
	
	
	public GradeController()  {
		this.nome= "teste de contrutor default!!!!";
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
