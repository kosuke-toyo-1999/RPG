package extend.practice;

public class Brave extends Human {
	public Brave(String name) {
		this.name = name;
		this.hp = 30;
		this.offensive = 1;

	}

	public void attack(Living target) {

		int damage;
		damage = offensive * Rand.get(10);
		System.out.println(name + "が剣で攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
		System.out.println("");
		target.hp = target.hp - damage;
	}

}
