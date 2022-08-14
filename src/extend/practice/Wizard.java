package extend.practice;

public class Wizard extends Human {
	int damage ;

	public Wizard(String name) {
		this.name = name;
		this.hp = 300;
		this.offensive = 1;

	}

	public void attack(Living target) {
		damage = offensive * Rand.get(10);
		System.out.println(damage);
		System.out.println(name + "が魔法で攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
		System.out.println("");
		target.hp = target.hp - damage;
	}

}
