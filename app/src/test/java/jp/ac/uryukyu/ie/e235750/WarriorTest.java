package jp.ac.uryukyu.ie.e235750;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarriorTest {
    @Test
    void warriorTest(){
        int defaultHitpoint = 100;
        Warrior demoWarrior = new Warrior("ウォリアー", defaultHitpoint, 10);
        Enemy demoSlime1 = new Enemy("でもスライム１", defaultHitpoint, 0);

        for(int count = 0; count < 3; count ++){
            demoSlime1.setHitpoint(defaultHitpoint);
            demoWarrior.attackWithWeponSkil(demoSlime1);
            assertEquals((int)demoWarrior.getAttack()*1.5, (defaultHitpoint - demoSlime1.getHitPoint()));

        }
    }
}
