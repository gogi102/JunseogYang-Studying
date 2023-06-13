package tdfas;
public class Test {
	
	String name;
	int hp;
	int atk;
	int def;
	int lv = 1;
		
	void crying() {
		
	}
	void up() {
		lv++;
	}
		
}


package tdfas;

public class Game {

	public static void main(String[] args) {

	Test p1 = new Test();
	p1.name = "고라파덕";
	p1.hp = 58;	
	p1.atk = 21;		
	p1.def = 80;	
	System.out.println(p1.name+"의 레벨은:"+p1.lv);
	System.out.println("레벨업!");
	p1.up();
	System.out.println(p1.name+"의 레벨은:"+p1.lv);
	
	
	
	}

}
