package gun4odev2;

public abstract class BaseSaleService implements IBaseSaleService{
	
	public void gameAdd(Game game) {
		System.out.println(game.gameName+ " oyun sisteme eklenmi�tir");
	}
	
	public void gameSale(Game game) {
		System.out.println(game.gameName+" oyunun sat��� yap�lm��t�r");
	}
	public void gameReturn(Game game) {
		System.out.println(game.gameName+" oyununun iadesi al�nm��t�r");
		
	}
	

}
