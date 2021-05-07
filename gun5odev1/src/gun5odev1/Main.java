package gun5odev1;



import gun5odev1.adapters.concretes.GoogleManager;
import gun5odev1.business.abstracts.UserService;
import gun5odev1.business.concretes.UserManager;
import gun5odev1.core.concretes.MailManager;
import gun5odev1.core.concretes.ValidationMethod;
import gun5odev1.entities.concretes.User;
import gun5odev1.dataAccess.concretes.UserDao;

public class Main {

	public static void main(String[] args) {
		
		User user =new User(0, "yusuf", "basdemir", "05.05.1998", "istanbul", 
				"ysfkaanbasdemir@gmail.com", "123456789");
		User user1 =new User(0, "yusuf2", "basdemir", "05.05.1998", "istanbul", 
				"ysfkaanbasdemir@gmail.com", "123456789");
		User user2 =new User(0, "yusuf3", "basdemir", "05.05.1998", "istanbul", 
				"ysfkaanbasdemir@gmail.com", "123456789");
		
		UserService userservice =new UserManager(new ValidationMethod(),new UserDao(),new MailManager());
		userservice.auth(user);
		userservice.addUser(user);
		userservice.login(user2, user1);
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	

	}

}
