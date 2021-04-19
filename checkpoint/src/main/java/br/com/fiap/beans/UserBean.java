package br.com.fiap.beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.fiap.dao.UserDao;
import br.com.fiap.model.User;

@ManagedBean
public class UserBean {

	private User user = new User();

	public void save() {
		new UserDao().save(this.user);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Usuário cadastrado com sucesso"));
	}

	public List<User> getUsers() {
		return new UserDao().getAll();
	}
	
	public void deletar() {
		System.out.println("Deletando...");
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}