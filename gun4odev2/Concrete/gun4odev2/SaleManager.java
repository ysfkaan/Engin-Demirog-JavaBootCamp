package gun4odev2;

public class SaleManager extends BaseSaleService{



public void gameSale(Game game , Customer customer) {
	System.out.println(game.gameName + " oyunu "+customer.name+" kullanısına satılmıştır");
}

public void gameSale(Game game , Customer customer, Campaign campaign) {
	System.out.println(game.gameName + " oyunu "+ campaign.campaignName +" kampanyasıyla indirime girmiştir"
			+" Yeni Fiyatı " + (game.price-(campaign.discount*game.price/100)));
	
}





	
}
