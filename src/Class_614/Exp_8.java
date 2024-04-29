package Class_614;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Exp_8 {
    private static String createPalindrome(String input) {
// Count the frequency of each character
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char ch : input.toCharArray()) {
            charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
        }
        StringBuilder leftHalf = new StringBuilder();
        StringBuilder rightHalf = new StringBuilder();
        char middleChar = '\0';
// Construct the left and right halves of the palindrome
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            char ch = entry.getKey();
            int frequency = entry.getValue();
// If frequency is even, add half occurrences to both left and right halves
            if (frequency % 2 == 0) {
                int halfFrequency = frequency / 2;
                leftHalf.append(String.valueOf(ch).repeat(halfFrequency));
                rightHalf.insert(0, String.valueOf(ch).repeat(halfFrequency));
            } else {
// If frequency is odd, add one occurrence to the middle and the rest to both halves
                middleChar = ch;
                int halfFrequency = (frequency - 1) / 2;
                leftHalf.append(String.valueOf(ch).repeat(halfFrequency));
                rightHalf.insert(0, String.valueOf(ch).repeat(halfFrequency));
            }
        }
// Combine left half, middle character (if any), and right half
        StringBuilder palindrome = new StringBuilder(leftHalf);
        if (middleChar != '\0') {
            palindrome.append(middleChar);
        }
        palindrome.append(rightHalf);
        return palindrome.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input string:");
        String inputString = scanner.nextLine();
        String palindrome = createPalindrome(inputString);
        System.out.println("Longest Palindrome: " + palindrome);
        scanner.close();
    }
}