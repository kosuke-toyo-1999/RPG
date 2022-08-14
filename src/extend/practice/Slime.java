package extend.practice;

public class Slime extends Monster {
	int damage ;

	public Slime(String name) {
		this.name = name;
		this.hp = 30;
		this.offensive = 1;
		this.damage = offensive * Rand.get(10);

	}

	public void attack(Living target) {

		System.out.println(name + "が体当たりで攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
		System.out.println("");
		target.hp = target.hp - damage;
	}

}
