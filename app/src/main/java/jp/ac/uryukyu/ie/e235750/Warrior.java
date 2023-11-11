package jp.ac.uryukyu.ie.e235750;

public class Warrior extends Hero{
    public Warrior(String name, int hitPoint, int attack){
        super(name, hitPoint, attack);
    }

    public void attackWithWeponSkil(LivingThing opponent){
        if(super.isDead() == false){
            int damage = (int)(super.getAttack() * 1.5);
                System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", super.getName(), opponent.getName(), damage);
                opponent.wounded(damage);
        } else{
            ; //何もしない
        }
    }
}

