package gun5odev1.business.abstracts;

import java.util.List;

import gun5odev1.entities.concretes.User;

public interface UserService {
	
	void auth(User user);
	void addUser(User user);
	void delete(User user);
	void update(User user,int id);
	void users();
	public void login(User user,User user1);
}
