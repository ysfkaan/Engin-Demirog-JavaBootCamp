package gun4odev2;

public class SaleManager extends BaseSaleService{



public void gameSale(Game game , Customer customer) {
	System.out.println(game.gameName + " oyunu "+customer.name+" kullan�s�na sat�lm��t�r");
}

public void gameSale(Game game , Customer customer, Campaign campaign) {
	System.out.println(game.gameName + " oyunu "+ campaign.campaignName +" kampanyas�yla indirime girmi�tir"
			+" Yeni Fiyat� " + (game.price-(campaign.discount*game.price/100)));
	
}





	
}
