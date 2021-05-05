package gun4odev2;

public abstract class BaseCustomerService implements ICustomerService {
	
	
	public void customerAdd(Customer customer) {
		System.out.println(customer.name+" kullan�c�s� eklendi");
	}
	
	public void customerDelete(Customer customer) {
		System.out.println(customer.name+" kullan�c�s� silindi");
	}
	
	public void customerUpdate(Customer customer) {
		System.out.println(customer.name+" kullan�c�s� g�ncellendi");
	}
	
	

}
