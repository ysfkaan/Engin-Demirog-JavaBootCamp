package gun4odev2;

public class DirectCheck implements ICustomerCheckService {

	@Override
	public boolean ifCheckRealPerson(Customer customer) {
		System.out.println("kontrol edilmeden sisteme eklenmiþtir");
		return true;
	}

}
