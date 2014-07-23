package br.com.vagnerbarreto.dao;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.br.vagnerbarreto.bean.GradeBean;

public class GradeDAO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void insere(String linha, int nuOnibus, Date horario,
			String intinenario) {
		GradeBean grade = new GradeBean();

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("grade");
		EntityManager manager = factory.createEntityManager();

		grade.setLinha(linha);
		grade.setNumOnibus(nuOnibus);
		grade.setHorario(horario);
		grade.setIntinerario(intinenario);

		manager.getTransaction().begin();
		manager.persist(grade);
		manager.getTransaction().commit();

		System.out.println(" Linha  :" + linha);
		System.out.println(" Ônibus  :" + nuOnibus);
		System.out.println(" Horário  :" + horario);
		System.out.println(" Via  :" + intinenario);

		manager.close();

	}

	public List<GradeBean> consultarTodos() {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("grade");
		EntityManager manager = factory.createEntityManager();
		TypedQuery<GradeBean> lQuery = manager.createQuery("from GradeBean where horario_partida > CURRENT_TIME ",
				GradeBean.class);
		List<GradeBean> lista = lQuery.getResultList();

		for (GradeBean t : lista) {
			GradeBean grade = new GradeBean();
			grade.setLinha(t.getLinha());
			grade.setNumOnibus(t.getNumOnibus());
			grade.setHorario(t.getHorario());
			grade.setIntinerario(t.getIntinerario());

		}

		manager.close();
		return lista;
	}
	


}
