package gun4odev2;


public class CustomerManager extends BaseCustomerService{

	
	ICustomerCheckService customercheckservice;

	public CustomerManager(ICustomerCheckService customercheckservice) {
		
		this.customercheckservice = customercheckservice;
	}
	
	
	
	
	public void customerAdd( Customer customer) {
		if (customercheckservice.ifCheckRealPerson(customer)) {
			System.out.println(customer.name+" kullanıcı eklendi" );
		}else {
			System.out.println("doğrulama yapılamamıştır");
		}
		
	}
	
	
	
	
	
	
	}


