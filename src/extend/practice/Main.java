package extend.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// 人間
		Human brave = new Brave("勇者");
		Human fighter = new Fighter("戦士");
		Human wizard = new Wizard("魔法使い");

		// 人間 list
		List<Human> humans_list = new ArrayList<>();
		humans_list.add(brave);
		humans_list.add(fighter);
		humans_list.add(wizard);

		// モンスター
		Monster slime = new Slime("スライム");
		Monster oak = new Oak("オーク");
		Monster dragon = new Dragon("ドラゴン");

		// モンスター list
		List<Monster> monsters_list = new ArrayList<>();
		monsters_list.add(slime);
		monsters_list.add(oak);
		monsters_list.add(dragon);

		while (true) {
			// 人間の攻撃
			System.out.println("人間のターン！");
			// Listの中から、人間をランダムの取得
			Human human = humans_list.get(Rand.get(humans_list.size()));

			// Listの中から、モンスターをランダムの取得
			Monster monster = monsters_list.get(Rand.get(monsters_list.size()));

			human.attack(monster);

			if (monster.hp <= 0) {
				monsters_list.remove(monster);
				System.out.println(monster.name + "は倒れた");
				System.out.println("");
			}
			if (monsters_list.isEmpty()) {
				// 人間の勝ち
				System.out.println("勇者達は勝利した！");
				System.exit(0);
			}

			// 次はモンスターのターン
			System.out.println("モンスターのターン！");

			human = humans_list.get(Rand.get(humans_list.size()));

			// Listの中から、モンスターをランダムの取得
			monster = monsters_list.get(Rand.get(monsters_list.size()));

			monster.attack(human);

			if (human.hp <= 0) {
				humans_list.remove(human);
				System.out.println(human.name + "は倒れた");
				System.out.println("");
			}
			if (humans_list.isEmpty()) {
				// 人間の勝ち
				System.out.println("モンスター達は勝利した！");
				System.exit(0);
			}
		}

	}
}
