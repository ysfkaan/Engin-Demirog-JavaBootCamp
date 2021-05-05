package gun4odev2;


public class CustomerManager extends BaseCustomerService{

	
	ICustomerCheckService customercheckservice;

	public CustomerManager(ICustomerCheckService customercheckservice) {
		
		this.customercheckservice = customercheckservice;
	}
	
	
	
	
	public void customerAdd( Customer customer) {
		if (customercheckservice.ifCheckRealPerson(customer)) {
			System.out.println(customer.name+" kullan�c� eklendi" );
		}else {
			System.out.println("do�rulama yap�lamam��t�r");
		}
		
	}
	
	
	
	
	
	
	}


