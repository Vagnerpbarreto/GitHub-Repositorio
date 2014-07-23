package br.com.vagnerbarreto.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteDAO {



	public static void main(String[] args) {
		/*EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("grade");
		EntityManager manager = factory.createEntityManager();
		TypedQuery<GradeBean> lQuery = manager.createQuery("from GradeBean ",
				GradeBean.class);
		 List <GradeBean> lista = lQuery.getResultList();
		
		for (GradeBean t : lista) {
			GradeBean grade = new GradeBean();
			grade.setLinha(t.getLinha());
			grade.setNumOnibus(t.getNumOnibus());
			grade.setHorario(t.getHorario());
			grade.setIntinerario(t.getIntinerario());
			
		}
		
		manager.close();

		manager.close();

	}
*/
		
		
		
		 long init = 0;
	        long end;
	        long diff;
	        init = System.currentTimeMillis();
	        EntityManagerFactory factory = Persistence
					.createEntityManagerFactory("grade");
			EntityManager em = factory.createEntityManager();
	        try {
	            em.getTransaction().begin();
	            em.createNativeQuery("DELETE FROM GradeBean").executeUpdate();
	            em.createNativeQuery("ALTER SEQUENCE GEN_GradeBean RESTART WITH 0").executeUpdate();
	           
	        } catch (Exception e) {
	            System.out.println("Deu erro!" + e);
	            em.getTransaction().rollback(); // desfaz transacao se ocorrer erro ao persitir
	        } finally {
	            if (em.getTransaction().isActive()) {
	                em.getTransaction().commit();
	            }
	           em.close();
	            end = System.currentTimeMillis();
	            diff = end - init;
	            System.out.println("Tempo de resposta = " + (diff / 1000.0) + " segundos em JPA - Hibernate");

	        }
	    
		
	}
}
