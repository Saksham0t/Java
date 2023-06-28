import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println(" 1 for Rock \n 2 for Paper \n 3 for Scissors");
        int a = sc.nextInt();
     if(a==1){
         System.out.println("You choose Rock");
     }else if(a==2){
         System.out.println("You choose Paper");
     }else if(a==3){
            System.out.println("You choose Scissors");
        }

     Random ra = new Random();
     int b = ra.nextInt(1,4);
        System.out.print("cmputer choices:" + b);
        if(b==1){
            System.out.println(" = Rock");
        }else if(b==2){
            System.out.println(" = Paper");
        }else if(b==3){
            System.out.println(" = Scissors");
        }

        if(a==b){
            System.out.println("Tie");
        }else if(a==1 && b==3 || a==2 && b==1 || a==3 && b==2){
            System.out.println("Person Wins");
        }else{
            System.out.println("Computer Wins");
        }


    }
}
