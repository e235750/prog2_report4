/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jp.ac.uryukyu.ie.e235750;


public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead = false;

    LivingThing(String name, int hitPoint, int attack){
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
    }

    public boolean isDead(){
        return dead;
    }

    public void setdead(boolean dead){
        this.dead = dead;
    }

    public String getName(){
        return name;
    }

    public int getHitPoint(){
        return hitPoint;
    }

    public void setHitpoint(int hitPoint){
        this.hitPoint = hitPoint;
    }



    public void attack(LivingThing opponent){
        if(this.dead == false){
            int damage = (int)(Math.random() * attack);
                System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
                opponent.wounded(damage);
            } else{
                ; //何もしない
            }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            this.dead = true;
            System.out.printf("%sは倒れた。\n", getName());
        }
    }
}