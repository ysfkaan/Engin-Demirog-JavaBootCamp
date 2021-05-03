package gun4odev1;

public class Main {

	public static void main(String[] args)  {
		
		
		
		Customer customer=new Customer();
		customer.id=1;
		customer.firstName="yusuf kaan";
		customer.lastName="Baþdemir";
		customer.DateofBirth="1998";
		customer.NationalityId="15781112422";
		
		
		BaseCustomerManager customermanager= new NeroCustomerManager(new MernisServiceAdapters());
		customermanager.save(customer);
		
	
		
		
	
		
	
	}

}
