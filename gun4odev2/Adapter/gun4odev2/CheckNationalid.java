package gun4odev2;

public class CheckNationalid implements ICustomerCheckService {

	@Override
	public boolean ifCheckRealPerson(Customer customer) {
		if(customer.nationalityId.length()==11) {
			System.out.println("Do�rulama TC kimlik no ile yap�lm��t�r");
			return true;
		}else {
			System.out.println("girdi�niz kullan�c� bilgileri mernisde yoktur");
			return false;
		}
		
	}

}
