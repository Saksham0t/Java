package Class_614;
import java.util.*;
class Card {
    String symbol;
    int number;
    public Card(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Card card = (Card) obj;
        return Objects.equals(symbol, card.symbol);
    }
    @Override
    public int hashCode() {
        return Objects.hash(symbol);
    }
    @Override
    public String toString() {
        return symbol + " " + number;
    }
}
public class Exp_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Card> cardSet = new HashSet<>();
        while (true) {
            System.out.println("Enter a card : ");
            String symbol = scanner.next();
            int number = scanner.nextInt();
            Card card = new Card(symbol, number);
            cardSet.add(card);
            if (cardSet.size() == 4) {
                List<Card> cards = new ArrayList<>(cardSet);
                cards.sort(Comparator.comparing(c -> c.symbol));
                System.out.println("Four symbols gathered in " + cardSet.size() + " cards.");
                System.out.println("Cards in Set are : ");
                for (Card c : cards) {
                    System.out.println(c);
                }
                break;
            }
        }
    }
}