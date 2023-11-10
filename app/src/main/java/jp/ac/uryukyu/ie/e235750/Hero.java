package jp.ac.uryukyu.ie.e235750;

/**
 * ヒーロークラス。
 */
public class Hero extends LivingThing{
    public Hero(String name, int hitPoint, int attack){
        super(name, hitPoint, attack);
    }
        

    @Override
    public void wounded(int damage) {
        int hitPoint = super.getHitPoint();
        hitPoint -= damage;
        setHitpoint(hitPoint);

        if (hitPoint < 0) {
            super.setdead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
}

