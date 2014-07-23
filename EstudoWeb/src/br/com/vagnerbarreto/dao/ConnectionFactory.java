package br.com.vagnerbarreto.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("tb_grade_horarios");

		factory.close();
	}

}
