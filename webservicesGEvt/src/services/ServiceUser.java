package services;

import java.util.List;

import beans.User;

public class ServiceUser extends Service<User> {
	
	
	public void createUser(User user) {
		this.create(user);
	}

	public User getUserByLoginPass(String login, String password) {
		return this.getByLogin(login, password, "User");
	}
	
	public List<User> getAllUsers(){
		return this.findAll("User");
	}
}
