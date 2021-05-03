package gun4odev1;

public abstract class BaseCustomerManager implements ICustomerService {
	
	
	public void save(Customer customer) {
		
		
		System.out.println("save to db:"+ customer.firstName);
		
	}

	
		
	}
	


