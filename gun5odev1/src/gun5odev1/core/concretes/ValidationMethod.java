package gun5odev1.core.concretes;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import gun5odev1.core.abstracts.IValidationMethod;
import gun5odev1.entities.concretes.User;

public class ValidationMethod implements IValidationMethod {
	private String regex = "^(.+)@(.+)$";
	boolean mail;
	boolean password;
	boolean name;
	boolean uniqueMail;

	public boolean validMail(User user) {

		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(user.getMail());

		if (match.matches()) {
			System.out.println("E-posta olu�turuldu ");

			mail = true;
			return mail;

		} else {
			mail=false;
			System.out.println("Eposta hatal�d�r");
			return mail;
		}
	}

	public boolean validPassword(User user) {
		if (user.getPassword().length() > 5) {
			System.out.println("�ifreniz olu�turuldu");
			password = true;
			return password;
		} else {
			password=false;
			System.out.println("�ifre 6 karakterden daha az olamaz");
			return password;
		}

	}

	public boolean validName(User user) {

		if (user.getName().length() > 2 && user.getSurname().length() > 2) {
			System.out.println("isim ve soyisim olu�turuldu ");
			name = true;

			return name;

		} else {
			name=false;
			System.out.println("isim ve soyisim hatal� ");
			return name;
		}

	}

//	public boolean uniqueMail(User user , List<User> list ) {
//		for (User users:list) {
//			System.out.println(users.getMail());
//			System.out.println(user.getMail());
//			if (users.getMail()==user.getMail()) {
//			System.out.println("Eposta sisteme kay�tl�d�r");
//			uniqueMail=false;
//			
//			
//			} else {
//			uniqueMail=true;
//			System.out.println("Eposta olu�turuldu");
//			
//			}
//		}
//		return uniqueMail;
//		
//		burada liste i�inde ayn� eposta varm�d�r kontrol�n� yapacakt�m fakat hata veriyor
//	}

	public boolean result() {

		if ((mail && password && name )  ) {

			System.out.println("kullan�c� bilgileri do�rudur");
			return true;
		} else {
			System.out.println("l�tfen bilgilerinizi kontrol ediniz");
			return false;
		}
	}

}
