package designpattern.abstractFactory.third;

public class Suit {
	private AbstractCoat coat;
	private AbstractTrouser trouser;
	
	public Suit(AbstractClothes abstractClothes){
		this.coat = abstractClothes.createCoat();
		this.trouser = abstractClothes.createTrouser();
	}
	
	public void showMyClothes(){
		System.out.println("Coat : " + coat.getSex() + ","+ coat.getStyle());
		System.out.println("Trouser : " + trouser.getSex() + ","+ trouser.getStyle());
	}
}
