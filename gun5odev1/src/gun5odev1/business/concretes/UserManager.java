package gun5odev1.business.concretes;


import java.util.List;

import gun5odev1.business.abstracts.UserService;
import gun5odev1.core.abstracts.IMailService;
import gun5odev1.core.abstracts.IValidationMethod;

import gun5odev1.dataAccess.abstracts.IUserDao;

import gun5odev1.entities.concretes.User;

public class UserManager implements UserService {
	IValidationMethod validationmethod;
	IUserDao userdao;
	List<User> listss;
	IMailService mailservice;

	public UserManager(IValidationMethod validationmethod, IUserDao userdao,IMailService mailservice) {
		super();
		this.validationmethod = validationmethod;
		this.userdao = userdao;
		this.listss=this.userdao.getAll();
		this.mailservice=mailservice;
	}

	public void auth(User user) {

		this.validationmethod.validMail(user);
		this.validationmethod.validName(user);
		this.validationmethod.validPassword(user);


	}

	public void addUser(User user) {
		if (this.validationmethod.result()) {
			this.userdao.registerUser(user);
			this.mailservice.VerficationMail();

		}

	}

	public void update(User user, int id) {
		this.userdao.updateUser(user, id);

	}

	public void delete(User user) {
		this.userdao.deleteUser(user);

	}

	public void users() {
		for (User users : this.listss) {
			System.out.println(users.getName() + " " + users.getSurname() + " " + users.getMail());
		}

	}

	@Override
	public void login(User user, User user1) {
		this.userdao.Login(user, user1);
		
	}
	
}
