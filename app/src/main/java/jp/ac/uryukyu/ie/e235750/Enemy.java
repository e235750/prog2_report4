package jp.ac.uryukyu.ie.e235750;

/**
 * Enemyクラス
 */
public class Enemy extends LivingThing{
    public Enemy(String name, int hitPoint, int attack){
        super(name, hitPoint, attack);
    }

    @Override
    public void wounded(int damage) {
        int hitPoint = super.getHitPoint();
        hitPoint -= damage;
        setHitpoint(hitPoint);

        if (hitPoint < 0) {
            super.setdead(true);
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }
}

