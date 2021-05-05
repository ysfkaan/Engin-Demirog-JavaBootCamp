package gun4odev2;

public class CheckNationalid implements ICustomerCheckService {

	@Override
	public boolean ifCheckRealPerson(Customer customer) {
		if(customer.nationalityId.length()==11) {
			System.out.println("Doðrulama TC kimlik no ile yapýlmýþtýr");
			return true;
		}else {
			System.out.println("girdiðniz kullanýcý bilgileri mernisde yoktur");
			return false;
		}
		
	}

}
