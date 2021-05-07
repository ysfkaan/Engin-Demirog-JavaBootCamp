package gun5odev1.dataAccess.concretes;

import java.util.ArrayList; 
import java.util.List;
import gun5odev1.dataAccess.abstracts.IUserDao;
import gun5odev1.entities.concretes.User;

public class UserDao implements IUserDao{
	


	List<User> list =new ArrayList <User>();
	
	

	
	
	@Override
	public void registerUser(User user) {
		
		this.list.add(user);
		System.out.println("kullanýcý eklendi");
		
		
		
		
		
	}

	
	@Override
	public void updateUser(User user, int id) {
		this.list.set(id, user);
		
	}

	@Override
	public void deleteUser(User user) {
		this.list.remove(user);
		
	}




	@Override
	public List<User> getAll() {
		
	return this.list;		
	}

	
	
	
	@Override
	public User get(int id) {
		for (User user:this.list) {
			if (user.getId()==id) {
				System.out.println("Kullanýcý: "+user.getName()+" "+user.getSurname());
				return user;
			}
		}
		return null;
		
		
	
	

	
	
	

}


	@Override
	public void Login(User user, User user1) {
		if (user.getMail()==user1.getMail()&& user.getPassword()==user.getPassword()) {
			System.out.println("kullanýcý sisteme giriþ yaptý");
		}else {
			System.out.println("lütfen girdiðiniz bilgileri kontrol ediniz");
		}
		
	}}
