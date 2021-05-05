package gun4odev2;

public abstract class BaseCustomerService implements ICustomerService {
	
	
	public void customerAdd(Customer customer) {
		System.out.println(customer.name+" kullanıcısı eklendi");
	}
	
	public void customerDelete(Customer customer) {
		System.out.println(customer.name+" kullanıcısı silindi");
	}
	
	public void customerUpdate(Customer customer) {
		System.out.println(customer.name+" kullanıcısı güncellendi");
	}
	
	

}
