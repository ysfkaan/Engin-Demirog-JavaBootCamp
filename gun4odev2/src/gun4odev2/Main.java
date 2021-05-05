package gun4odev2;

public class Main {

	public static void main(String[] args) {
		Customer customer =new Customer();
		customer.id=1;
		customer.name="yusuf";
		customer.surname="basdemir";
		customer.nationalityId="12311111111";
		customer.dayofBirth="1985";	
	
	
	BaseCustomerService customermanager =new CustomerManager(new CheckNationalid());
	customermanager.customerAdd(customer);
	customermanager.customerDelete(customer);
	customermanager.customerUpdate(customer);
	
	
	
	
	
		Game game = new Game();
		game.gameName="GTA5";
		game.gameCategory="Aksiyon";
		game.id=1;
		game.price=185;
		
		
	
	SaleManager salemanager =new SaleManager();
	
	salemanager.gameAdd(game);
	salemanager.gameReturn(game);
	salemanager.gameSale(game,customer);
	
	
		Campaign campaign = new Campaign();
		campaign.campaignGame="GTA5";
		campaign.discount=30;
		campaign.campaignName="Yýlbaþý ";
		
		
	CampaignManager campaignmanager =new CampaignManager();
	campaignmanager.addCampaign(campaign);
	campaignmanager.deleteCampaign(campaign);
	campaignmanager.updateCampaign(campaign);
	
	
	salemanager.gameSale(game, customer, campaign);
	
	}
	
	

}
