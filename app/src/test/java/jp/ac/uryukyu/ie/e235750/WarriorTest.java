package jp.ac.uryukyu.ie.e235750;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarriorTest {
    @Test
    void warriorTest(){
        Warrior demoWarrior = new Warrior("ウォリアー", 100, 10);
        Enemy demoSlime1 = new Enemy("でもスライム１", 100, 0);

        for(int count=0; count<3; count++){
            demoWarrior.attackWithWeponSkil(demoSlime1);
        }
        assertEquals(45, (100 - demoSlime1.getHitPoint()));
    }
}
