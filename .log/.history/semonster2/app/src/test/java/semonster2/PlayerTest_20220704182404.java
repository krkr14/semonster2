package semonster2;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {
  
  @Test
  public void testShowDeck() {
    LinkedList<Integer> numList = new LinkedList<>();
    numList.add(3);
    numList.add(0);
    numList.add(2);
    numList.add(4);
    numList.add(3);
    numList.add(0);
    numList.add(3);
    numList.add(3);
    numList.add(0);
    numList.add(1);
    Player player = new Player(numList, "user");
    Assert.assertEquals(expected, player.toString());
  }
}
