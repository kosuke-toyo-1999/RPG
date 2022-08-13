package extend.practice;

public class Fighter extends Human {

	public void fighter(String name) {
		this.name = name;
		this.hp = 300;
		this.offensive = 10;
		
	}
	
	public void attack(Living target) {
		
		System.out.println(name + "が斧で攻撃！" + target + "に" + Rand.get(offensive) + "のダメージを与えた。");
	
	}

}
