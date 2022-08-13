package extend.practice;

import java.util.Random;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
  


        // 人間
        Human brave = new Brave("勇者");
        Human fighter = new Fighter("戦士");
        Human wizard = new Wizard("魔法使い");

        List<Human> humans = new ArrayList<>();
        humans.add(brave);
        humans.add(fighter);
        humans.add(wizard);
        
        

        // モンスター
        Monster slime = new Slime("スライム");
        ...

        List<Monster> monsters = new ArrayList<>();
        monsters.add(slime);
        monsters.add(oak);
        monsters.add(dragon);

        while (true) {
            System.out.println("人間のターン！");

            // Listの中から、人間とモンスターをランダムの取得
            Human human = humans.get(Rand.get(humans.size()));
            Monster monster = monsters.get(Rand.get(monsters.size()));
            
            // 人間の攻撃
            human.attack(monster);
            ...
            // 次はモンスターのターン
       }
        for (int i = 0; i < list.size() ;i++){
            System.out.println(list.get(i));
            if (list.get(i).hp<= 0) {
            	list.remove("あ");
            	
            }
            
        }
    }

}
