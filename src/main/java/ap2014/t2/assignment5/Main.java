package ap2014.t2.assignment5;

public class Main {
  public static void main(String... params) {
    Deck deck = new Deck();
    Card[] hand1 = new Card[5];
    Card[] hand2 = new Card[5];
    for (int i = 0; i < hand1.length; i++) {
      hand1[i] = deck.getTopCard();
      hand2[i] = deck.getTopCard();
    }
    int hand1Sum = sum(hand1);
    int hand2Sum = sum(hand2);
    System.out.println("Hand 1: total points " + hand1Sum);
    print(hand1);
    System.out.println();
    System.out.println("Hand 2: total points " + hand2Sum);
    print(hand2);
    System.out.println();
    if (hand1Sum > hand2Sum) {
      System.out.println("Hand 1 wins");
    } else if (hand1Sum < hand2Sum) {
      System.out.println("Hand 2 wins");
    } else {
      System.out.println("Draw");
    }
  }

  private static void print(Card[] cards) {
    for (Card card : cards) {
      System.out.println(card);
    }
  }

  private static int sum(Card[] cards) {
    int sum = 0;
    for (Card card : cards) {
      sum += card.pointValue();
    }
    return sum;
  }
}
