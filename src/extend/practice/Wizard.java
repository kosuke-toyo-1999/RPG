package extend.practice;

public class Wizard extends Human{
	
	public void wizard(String name) {
		this.name = name;
		this.hp = 300;
		this.offensive = 10;
		
	}
	
	public void attack(Living target) {
		
		System.out.println(name + "が魔法で攻撃！" + target + "に" + Rand.get(offensive) + "のダメージを与えた。");
	
	}

}
