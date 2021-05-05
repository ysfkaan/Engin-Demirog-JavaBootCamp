package gun4odev2;

public abstract class BaseSaleService implements IBaseSaleService{
	
	public void gameAdd(Game game) {
		System.out.println(game.gameName+ " oyun sisteme eklenmiþtir");
	}
	
	public void gameSale(Game game) {
		System.out.println(game.gameName+" oyunun satýþý yapýlmýþtýr");
	}
	public void gameReturn(Game game) {
		System.out.println(game.gameName+" oyununun iadesi alýnmýþtýr");
		
	}
	

}
