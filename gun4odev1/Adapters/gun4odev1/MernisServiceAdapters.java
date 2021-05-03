package gun4odev1;



import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;





public class MernisServiceAdapters implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublic =new KPSPublicSoapProxy();
		
		boolean result=false;
		
		
		try {	
			
			result=kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.NationalityId),
					customer.firstName.toUpperCase(), customer.lastName.toUpperCase(), 
					Integer.parseInt(customer.DateofBirth));
				
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return result;
	}

}
