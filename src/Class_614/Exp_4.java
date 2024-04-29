//package Class_614;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.ArrayList;
//
//class Card {
//    String symbol;
//    int number;
//    public Card(String symbol, int number) {
//        this.symbol = symbol;
//        this.number = number;
//    }
//    public int getNumber() {
//    return number;
//}
//@Override
//    public String toString() {
//        return "Card{" + "symbol='" + symbol + '\'' + ", number=" + number + '}';
//    }
//}
//public class Exp_4 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter Number of Cards : ");
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        Map<String, List<Card>> cardsMap = new HashMap<>();
//        for (int i = 1; i <= n; i++) {
//            System.out.println("Enter card " + i + ":");
//            String symbol = scanner.next();
//            int number = scanner.nextInt();
//            scanner.nextLine();
//            List<Card> cards = cardsMap.getOrDefault(symbol, new ArrayList<>());
//            cards.add(new Card(symbol, number));
//            cardsMap.put(symbol, cards);
//        }
//
//        System.out.println("Distinct Symbols are : ");
//        List<String> distinctSymbols =
//                cardsMap.keySet().stream().sorted().toList();
//
//        for (String symbol : distinctSymbols) {
//            List<Card> cards = cardsMap.get(symbol);
//
//            System.out.println(symbol);
//            for (Card card : cards) {
//                System.out.println(card);
//            }
//
//            int count = cards.size();
//            int sum = cards.stream().mapToInt(Card::getNumber).sum();
//            System.out.println("Number of cards : " + count);
//            System.out.println("Sum of Numbers : " + sum);
//            System.out.println();
//        }
//    }
//}
//
