package gun5odev1.adapters.concretes;

import gun5odev1.GoogleSignup;
import gun5odev1.core.abstracts.IValidationMethod;
import gun5odev1.entities.concretes.User;

public class GoogleManager implements  IValidationMethod{

	GoogleSignup googlesign =new GoogleSignup();

	@Override
	public boolean validMail(User user) {
		System.out.println("Mail google taraf�ndan do�rulanm��t�r");
		return true;
	}

	@Override
	public boolean validPassword(User user) {
		System.out.println("�ifre google taraf�ndan do�rulanm��t�r");
		return true;
	}

	@Override
	public boolean validName(User user) {
		System.out.println("isim google taraf�ndan do�rulanm��t�r");
		return true;
	}

	@Override
	public boolean result() {
		
		return true;
	}

}
