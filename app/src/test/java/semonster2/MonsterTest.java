package semonster2;

import org.junit.Assert;
import org.junit.Test;

public class MonsterTest {
  @Test
  public void testSummonMonster1() {
    Monster monster1 = new Monster(0, 0);
    Assert.assertEquals("スライム:レア度[0]\n", monster1.toString());
    Monster monster2 = new Monster(0, 5);
    monster2.evolve();
    Assert.assertEquals("超スライム:レア度[5]\n", monster2.toString());
  }
}
