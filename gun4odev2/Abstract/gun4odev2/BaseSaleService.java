package gun4odev2;

public abstract class BaseSaleService implements IBaseSaleService{
	
	public void gameAdd(Game game) {
		System.out.println(game.gameName+ " oyun sisteme eklenmiştir");
	}
	
	public void gameSale(Game game) {
		System.out.println(game.gameName+" oyunun satışı yapılmıştır");
	}
	public void gameReturn(Game game) {
		System.out.println(game.gameName+" oyununun iadesi alınmıştır");
		
	}
	

}
