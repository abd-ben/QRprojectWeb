package test;

import beans.User;
import services.ServiceUser;

public class Test {

	public static void main(String[] args) {
		
		User user = new User("azer", "1234");
		ServiceUser serviceUser = new ServiceUser();
		
		//serviceUser.create(user);
		
		serviceUser.getAllUsers().forEach(u -> System.out.println(u.toString()));
		
		//System.out.println(serviceUser.getUserByLoginPass("abd", "123").toString());
		/*
		
		ExempleService exempleService = new ExempleService();
		List<Exemple> exemples = new ArrayList<Exemple>();
 		
		exemples = exempleService.findAllExemple();
		
		exemples.forEach((exp) -> {
			System.out.println(exp.getNom());
		});
		*/
	}

}
