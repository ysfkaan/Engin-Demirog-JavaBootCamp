package gun4odev2;

public class SaleManager extends BaseSaleService{



public void gameSale(Game game , Customer customer) {
	System.out.println(game.gameName + " oyunu "+customer.name+" kullanýsýna satýlmýþtýr");
}

public void gameSale(Game game , Customer customer, Campaign campaign) {
	System.out.println(game.gameName + " oyunu "+ campaign.campaignName +" kampanyasýyla indirime girmiþtir"
			+" Yeni Fiyatý " + (game.price-(campaign.discount*game.price/100)));
	
}





	
}
