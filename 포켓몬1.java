package test;

public class Game {

	public static void main(String[] args) {
		Pokemon p1 = new Pokemon("한결몬");
		System.out.println(p1.pn+":"+p1.name);
		Pokemon p2 = new Pokemon();
		System.out.println(p2.pn+":"+p2.name);
	}

}
