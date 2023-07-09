import java.util.Random;
import java.util.Scanner;

class Game{
    int number;
    int inputNumber;
    int noOfGuesses = 0;
//    public int getNoOfGuesses(){
//        return noOfGuesses;
//    }
//    public void setNoOfGuesses(int noOfGuesses){
//        this.noOfGuesses = noOfGuesses;
//    }
    Game(){
    Random rd = new Random();
     this.number = rd.nextInt(100);
    }
    public void takeUserInput(){
        System.out.print("Guess the no: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrctNumber(){
        noOfGuesses++;
        if(number == inputNumber){
            System.out.println("Correct guess");
            System.out.println("It was " + number);
            System.out.println("Your attemts: "+noOfGuesses);
            return true;
        }else if(number>inputNumber){
            System.out.println(" Your Guess is low");
        }else if(number<inputNumber){
            System.out.println("Your Guess is high");
        }
        return false;
    }
}

public class Guessing_Game {
    public static void main(String[] args) {
//        Game g = new Game();
//
//        boolean b = false;
//        while(!b) {
//            g.takeUserInput();
//            b = g.isCorrctNumber();
//        }

    }
}
