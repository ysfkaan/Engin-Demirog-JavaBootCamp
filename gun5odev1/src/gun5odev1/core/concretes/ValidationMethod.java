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
			System.out.println("E-posta oluþturuldu ");

			mail = true;
			return mail;

		} else {
			mail=false;
			System.out.println("Eposta hatalýdýr");
			return mail;
		}
	}

	public boolean validPassword(User user) {
		if (user.getPassword().length() > 5) {
			System.out.println("þifreniz oluþturuldu");
			password = true;
			return password;
		} else {
			password=false;
			System.out.println("þifre 6 karakterden daha az olamaz");
			return password;
		}

	}

	public boolean validName(User user) {

		if (user.getName().length() > 2 && user.getSurname().length() > 2) {
			System.out.println("isim ve soyisim oluþturuldu ");
			name = true;

			return name;

		} else {
			name=false;
			System.out.println("isim ve soyisim hatalý ");
			return name;
		}

	}

//	public boolean uniqueMail(User user , List<User> list ) {
//		for (User users:list) {
//			System.out.println(users.getMail());
//			System.out.println(user.getMail());
//			if (users.getMail()==user.getMail()) {
//			System.out.println("Eposta sisteme kayýtlýdýr");
//			uniqueMail=false;
//			
//			
//			} else {
//			uniqueMail=true;
//			System.out.println("Eposta oluþturuldu");
//			
//			}
//		}
//		return uniqueMail;
//		
//		burada liste içinde ayný eposta varmýdýr kontrolünü yapacaktým fakat hata veriyor
//	}

	public boolean result() {

		if ((mail && password && name )  ) {

			System.out.println("kullanýcý bilgileri doðrudur");
			return true;
		} else {
			System.out.println("lütfen bilgilerinizi kontrol ediniz");
			return false;
		}
	}

}
