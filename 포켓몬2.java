package test;
public class Pokemon {
	int level = 1;
	int hp = 50;
	int atk = 10;
	String name;
	static int pn = 0;
	
	Pokemon(){
		pn++;
		name = "포켓몬"+pn;
	}	
	
	Pokemon(String name){
		pn++;
		this.name = name;
	}
	
	
	void level_up() {
		level++;
		hp+=10;
		atk+=2;
	}
	void attack() {
		System.out.println(name+"가 공격했다");
	}
}
