package springb.java.security.Services;

import springd.java.database.repository.Repository;

public class Services {
	
	Repository r = new Repository();
	
	public void Services() {
		System.out.println("this is a services usefull for security");
		r.repository();
	}
	
	

}
