import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// % not less than 40 and each subject not less than 33
//        Scanner scn = new Scanner(System.in);
//        int m1 = scn.nextInt();
//        int m2 = scn.nextInt();
//        int m3 = scn.nextInt();
//        float total = (m1+m1+m3)/3f;
//        System.out.println(total +"%");
//       if (total >= 40 && m1>=33 && m2>=33 && m3>=33) {
//            System.out.println("pass");
//        } else {
//            System.out.println("fail");
//        }
//        float tax = 0;

//        Scanner scn = new Scanner(System.in);
//        float income = scn.nextInt();
//        if(income <= 2.5f);{
//            tax = tax + 0;
//        } if(income > 2.5f && income <= 5f){
//          tax = tax + 0.05f*(income-2.5f);
//        }
//        else if(income > 5f && income <= 10f){
//            tax = tax + 0.05f*(5f - 2.5f);
//            tax = tax + 0.2f*(income-5f);
//        }
//        else if(income > 10f){
//            tax = tax + 0.05f*(5-2.5f);
//            tax = tax + 0.2f*(10f - 5f);
//            tax = tax + 0.3f*(income-10f);
//        }
//        System.out.println(tax);

//        Scanner scn = new Scanner(System.in);
//        int day = scn.nextInt();
//        switch(day){
//            case 1,8,15 -> System.out.println("monday");
//            case 2 -> System.out.println("tuesday");
//            case 3 -> System.out.println("wednesday");
//            case 4 -> System.out.println("thursday");
//            case 5 -> System.out.println("friday");
//            case 6 -> System.out.println("saturday");
//            case 7 -> System.out.println("sunday");
//        }
//         int year = scn.nextInt();
//         if(year % 4 == 0){                       //leap year
//             System.out.println("leap");
//         }else{
//             System.out.println("not leap");
//         }
//        String site = scn.nextLine();
//          if(site.endsWith(".org")){
//              System.out.println("organization");
//          }else if(site.endsWith(".com")) {
//              System.out.println("commercial");
//          }else if(site.endsWith("in")) {
//              System.out.println("Indian");
//          }else{
//              System.out.println("not a site");
//          }
        //Rock Paper Scissor
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter \n0 for Rock \n1 for Paper \n2 for Scissor");
//        int user = scn.nextInt();
//
//        Random random = new Random();
//        int computer = random.nextInt(3);
//
//        if(user == computer){
//            System.out.println("Draw");
//        }else if (user==0 && computer==2 || user==1 && computer==0 || user==2 && computer==1){
//            System.out.println("User wins");
//        }else {
//            System.out.println("Computer wins");
//        }
//        System.out.println("Computer choices:" + computer);

//        int n=3;
//        for(int i=n; i>0; i--){
//            System.out.println(i);
//        }
                                     //even numbers sum
//         int sum=0,n=3,i=0;
//         while(i<n){
//             sum = sum+(2*i);
//             i++;
//         }
//        System.out.println(sum);
//        int n=3,sum=0;
//        for(int i=0; i<n; i++){
//           sum = sum + (2*i);
//        } System.out.println(sum);
                                     // table of 5 and 10
//        int n=5;
//        for(int i=1; i<=10; i++){
//            System.out.printf("%d X %d = %d\n",n ,i ,n*i);
//        }
//        int n=10;
//        for(int i=10; i>=1; i--){
//            System.out.printf("%d X %d = %d\n",n ,i ,n*i);
//        }
                                         //factorial
//        int n=4;
//        int f=1;
//        for(int i=1; i<=n; i++){
//           f*=i;
//        } System.out.print(f);
//        int i=1,n=3,f=1;             //or by while loop
//        while(i<=n){
//            f*=i;
//            i++;
//        }
//        System.out.println(f);

//        int n=8,sum=0;
//        for(int i=1; i<=10; i++){
//            sum += n*i;                                 //addition of multiplied numbers
//        }System.out.println(sum);

                                                    //star pattern 1
//           for(int i=1; i<=4; i++){
//          for(int j=4; j>=i; j--){
//              System.out.print("*");
//          }
//          System.out.println();
//      }
//      for(int i=1; i<=4; i++){                      //star pattern 2
//          for(int j=1; j<=i; j++){
//              System.out.print("*");
//          }
//          System.out.println();
//      }
//      for(int i=1; i<=3; i++){
//            for(int j=3; j>=i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for(int i=1; i<=4; i++){                      //star pattern 3
//            for(int j=3; j>=i; j--) {
//                System.out.print(" ");
//            }
//            for(int k=1; k<=i; k++){
//                System.out.print("*");                //pattern 6 give space
//            }
//            System.out.println();
//        }
//
//        for(int i=1; i<=4; i++){                      //star pattern 4
//            for(int j=1; j<=i; j++) {
//                System.out.print(" ");
//            }
//            for(int k=4; k>=i; k--){                 //k is for stars
//                System.out.print("*");               //pattern 7 give space
//            }
//            System.out.println();
//        }

//        for(int i=1; i<=4; i++){                      //star pattern 5
//            for(int j=3; j>=i; j--) {
//                System.out.print(" ");
//            }
//            for(int k=1; k<=i; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//            for(int i=1; i<=4; i++){
//                for(int j=1; j<=i; j++) {
//                    System.out.print(" ");
//                }
//                for(int k=3; k>=i; k--){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }

//        for(int i=1; i<=4; i++){                      //star pattern 8 from 2
//            for(int j=1; j<=i; j++){
//                if(i>1 && j<=i-1) {
//                    System.out.print(" ");
//                }else{
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//    }

//        for(int i=1; i<=4; i++){                      //star pattern 9 from 3
//            for(int j=3; j>=i; j--) {
//                System.out.print(" ");              //i=1  j=0  k=1
//            }                                       //i=2  j=1  k=1
//            for(int k=1; k<=i; k++){
//                if(i>1 && k>1){
//                    System.out.print(" ");
//                }else{
//                System.out.print("*");
//                }
//            }
//            System.out.println();
//        }

//           for(int i=1; i<=5; i++){                             //star pattern 10
//              for(int j=1; j<=5; j++){
//                  if(i>=2 && j>=2 && i<=4 && j<=4){
//                   System.out.print(" ");
//                  }else{
//                      System.out.print("*");
//                  }
//              }
//               System.out.println();
//           }
                                          //format output
//         float a = 4 , b=2 , r=a/b;
//        System.out.format("%.3f",r);
                                            //Addition of marks in array
//          float []marks = {55.5f,65f,85.5f,95f,78.5f};
//          float sum = 0;
//          for(float element:marks){
//             sum = sum+element;
//          }
//        System.out.println(sum);
                                      //To check whether a number is present in array
//          int []a = {3,4,6,7,2};
//          int n =3;
//          boolean inside = false;
//          for(int element:a){
//              if(n==element){
//                   inside = true;
//                    break;
//              }
//          }
//          if(inside){
//              System.out.println("Number is present in the array");
//          }else {
//              System.out.println("Number is not present in the array");
//          }
                                             //Average in array
//           int []marks ={55,84,33,36,97};
//           int av = 0;
//           int sum = 0;
//           for(int element:marks){
//               System.out.println(element);
//               sum = sum + element;
//           }
//           av = sum/ marks.length;
//        System.out.println("Average: " +av);





















    }
}

