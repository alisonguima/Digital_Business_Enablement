package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.model.User;
import br.com.fiap.util.EntityManagerFacade;

public class UserDao {
	
	private EntityManager em = EntityManagerFacade.get();
	
	public void save(User user) {
		try {			
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		em.close();		
	}
	
	public List<User> getAll(){
		String jpql = "Select u from User u";
		TypedQuery<User> createQuery = em.createQuery(jpql, User.class);
		return createQuery.getResultList();
	}
}
