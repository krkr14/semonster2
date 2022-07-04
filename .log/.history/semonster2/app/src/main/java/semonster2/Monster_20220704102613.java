package semonster2;

public class Monster {
  private String name;
  private int rare; // 戦うとレア度が高いほうが勝つ．同じ場合は引き分け

  @Override
  public String toString() {

    return this.name + ":レア度[" + this.rare + "]\n";
  }
}
