package extend.practice;

public class Brave extends Human {
	int damage ;

	public Brave(String name) {
		this.name = name;
		this.hp = 30;
		this.offensive = 1;
		this.damage = offensive * Rand.get(10);

	}

	public void attack(Living target) {

		System.out.println(name + "が剣で攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
		System.out.println("");
		target.hp = target.hp - damage;
	}

}
