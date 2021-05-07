package gun5odev1.core.abstracts;



import gun5odev1.entities.concretes.User;

public interface IValidationMethod {
	
	boolean validMail(User user);
	boolean validPassword(User user);
	boolean validName(User user);
//	boolean uniqueMail(User user ,List<User> list);
	boolean result ();
	
	
}
