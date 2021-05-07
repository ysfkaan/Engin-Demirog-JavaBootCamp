package gun5odev1.dataAccess.abstracts;
import java.util.List; 
import gun5odev1.entities.concretes.User;



public interface IUserDao {
	
	
	List<User> getAll();

	void registerUser(User user);
	
	void updateUser(User user ,int id);
	
	void deleteUser(User user);
	
	User get(int id);
	
	void Login(User user,User user1);

	
	
	
}
