package extend.practice;

public class Brave extends Human{
	
	public void brave(String name) {
		this.name = name;
		this.hp = 300;
		this.offensive = 10;
		
	}
	
	public void attack(Living target) {
		
		System.out.println(name + "が魔法で攻撃！" + target + "に" + Rand.get(offensive) + "のダメージを与えた。");
	
	}
	
}
