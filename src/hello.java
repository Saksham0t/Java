import java.util.Locale;
import java.util.Scanner;

public class hello {
   public static void main (String[] args){
//        int x=10;
//        int y=40;
//        int sum=x+y, sub=x-y, v1=(x+y)/(x-y), v2=x%y;
//        System.out.println("sum of "+x+" and "+y+" is "+sum);
//        System.out.println(v1);
//        System.out.println(v2);
//        if(x==y){
//            System.out.println(x +" is equal to "+ y);
//        }else
//        {
//            if(x>y){
//                System.out.println(x +" is greater than "+ y);
//            }else{
//                System.out.println(x +" is smaller than "+ y);
//            }
//        }
//    }
//        if(x==y)
//        {
//            System.out.println(x +" is equal to "+ y);
//        }else if(x>y)  CAN BE USED MANY TIMES
//        {
//                System.out.println(x +" is greater than "+ y);
//        }else
//            {
//                System.out.println(x +" is smaller than "+ y);
//            }
//    }
//}
                                                        //Loops
//        for(int i=1; i <= 9; i++) {                      //i++  or  i=i+1
//            System.out.println("i");
//        }
//        int i=1;                               //intialisation
//        while(i<=9){                           //valuation
//            System.out.println(i);
//            i++;                              //incrimant
//        }
//          int n = 0;
//          do{
//              System.out.println(n);
//              n++;
//          }while(n<=10);
                                              //2n+1 for odd
//         for(int i=0; i<4; i++){
//        System.out.println(2*i+1);
//        }

//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();                     //for integer
//        for(int i=1; i<=n; i++){
//            System.out.println(i);
//        }
//        String name = scn.nextLine();               //for alphabet
//        System.out.println(" hello "+name);
//        int n = Integer.parseInt(scn.nextLine());       //for both
//        String name = scn.nextLine();
//        System.out.println(" hello "+name+" counting: ");
//        for(int i=1; i<=n; i++){
//            System.out.println(i);
//        }
//    }
//}
//      Scanner scn = new Scanner(System.in);
//      int n = scn.nextInt();
//      for(int i=1;i<n;i++) {
//          System.out.println(i);
//      }
//        int n1 = scn.nextInt();         // % problem
//        int n2 = scn.nextInt();
//        int n3 = scn.nextInt();
//        int n4 = scn.nextInt();
//        int n5 = scn.nextInt();
//        int total = (n1+n2+n3+n4+n5)/5;
//        System.out.println("percentage is:");
//        System.out.println(total+"%");

//        System.out.println(scn.hasNextInt());     // for checking value is in integer

//        System.out.print("Enter Km:");              // km to miles
//        double km = scn.nextDouble();
//        double miles = km*0.621371;
//        System.out.println(miles+" Miles");

//     Scanner scn = new Scanner(System.in);
//         char grade = 'A';
//        // grade =  grade + 3;               //int + char = int
//        grade = (char) (grade + 3);          //Type casting  and encrypting
//         System.out.println(grade);
//        grade = (char) (grade - 3);          //decrypting
//        System.out.println(grade);

//        int n = scn.nextInt();                 //checking input no. is greater
//        System.out.println(n>8);
//          String name = "Saksham";               //0123456=index
//          System.out.println(name.length());     //length
//          String low = name.toLowerCase();       //lowercase
//          System.out.println(low);
//          String high = name.toUpperCase();      //uppercase
//          System.out.println(high);
//
//          String name2 = "   saksham   ";
//          System.out.println(name2.trim());      //trim
//
//          System.out.println(name.substring(2));       //substring
//          System.out.println(name.substring(2,7));              //7 index not included
//          System.out.println(name.replace('s','g'));          //replace
//          System.out.println(name.replace("Sak","tt"));
//          System.out.println(name.startsWith("Sak"));
//          System.out.println(name.endsWith("Sak"));
//          System.out.println(name.charAt(3));
//          System.out.println(name.equals("Saksham"));
//          System.out.println(name.equalsIgnoreCase("SAKsham"));

//          String name3 = "Sakshamhamham";
//          System.out.println(name3.indexOf('s'));
//          System.out.println(name3.indexOf('a',6));
//          System.out.println(name3.lastIndexOf('a'));
//          System.out.println(name3.lastIndexOf("am",7));

//            System.out.println("my name is \tsaksham");            //Escape Sequences
//            System.out.println("my name is \bsaksham");
//            System.out.println("my name is \rsaksham");
//            System.out.println("my name is \fsaksham");
//            System.out.println("my name is \"saksham");
//            System.out.println("my name is \\saksham");

//           boolean a = true;                                      //Logical Operators
//           boolean b = false;
//          // if (a&&b){
//             if  (a||b){
//               System.out.println("yes");
//           }else {
//               System.out.println("no");
//           }
//          System.out.println(!a);

//          Scanner scn = new Scanner(System.in);
//          int age = scn.nextInt();
//          switch(age){                                     //switch statements
//              case 18:
//                  System.out.println("good");
//                  break;
//              case 23:
//                  System.out.println("excellent");
//                  break;
//              default:
//                  System.out.println("ok");
//          }
//          switch (age) {
//              case 18 -> System.out.println("good");
//              case 23 -> System.out.println("excellent");
//              default -> System.out.println("ok");
//          }

//       for(int i=0; i<5; i++){              //break
//          System.out.println(i);
//          if(i==2){
//              System.out.println("hello");
//            break;
//         }
//       }
//        int i=0;
//       while(i<5){
//           System.out.println(i);
//           i++;
//           if (i == 2) {
//        System.out.println("hello");
//               break;
//           }
//       }
//        for(int i=0; i<5; i++){                             //continue: it skips lower code
//            if(i==2){
//                System.out.println("hello");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("good");
//        }
//        int i=0;
//       while(i<5){
//           i++;
//           if (i == 2) {
//        System.out.println("hello");
//               continue;
//           }
//           System.out.println(i);
//           System.out.println("good");
//       }
                                          // To check prime
//       int n=6;
//       int t=0;
//       for(int i=2; i<(n-1); i++ ) {
//           if (n % i == 0) {
//               t = t + 1;
//           }
//       }
//           if(t>1){
//               System.out.println("not prime");
//           }else {
//               System.out.println("prime");
//       }
                                                               //Arrays
//        int [] marks;               //declaration
//        marks = new int[4];         //memory allocation
//        marks[0] = 10;                //initialization
//        marks[1] = 40;
//       System.out.println(marks[0]);
//       int []marks = new int[4];      //or
//       int []marks ={34,45,56,76};    //or
//       System.out.println(marks[0]);
//         float []marks = {78.5f,98f,45.5f,97f};
//         System.out.println(marks[0]);
//
//         String []name ={"saksham","akshit","abhay","pankaj"};
//         System.out.println(name[3]);
//         System.out.println(name.length);
//                                       //Array traversal
//         for(int i=0; i<name.length; i++){
//             System.out.println(name[i]);
//         }
//       System.out.println("Reverse order");
//         for(int i= name.length-1; i>=0; i--){
//             System.out.println(name[i]);
//         }
//       System.out.println("By for-each loop");
//         for(String element:name){
//             System.out.println(element);
//         }
                                           //Multidimensional Arrays
//          int [][]house = new int[2][3];
//          house[0][0] = 10;
//          house[0][1] = 20;
//          house[0][2] = 30;
//          house[1][0] = 40;
//          house[1][1] = 50;
//          house[1][2] = 60;
//          for(int i=0; i<house.length; i++){                  //row number of times
//              for(int j=0; j<house[i].length; j++) {          //column number of times
//                  System.out.print(house[i][j]);
//                  System.out.print(" ");
//              }
//              System.out.println();
//          }
                                               //Matrix addition in array
//          int[][]mat1 = {{1,2,3},
//                         {4,5,6}};
//          int[][]mat2 = {{7,8,9},
//                         {4,5,4}};
//          int[][]mat3 = {{0,0,0},
//                         {0,0,0}};
//          for(int i=0; i<mat1.length; i++) {
//              for (int j = 0; j < mat1[i].length; j++) {
//                  //System.out.format("i=%d  j=%d\n" ,i,j);
//                  mat3[i][j] = mat1[i][j] + mat2[i][j];
//              }
//          }
//              for(int i=0; i<mat1.length; i++) {
//                  for (int j = 0; j < mat1[i].length; j++) {
//                      System.out.print(mat3[i][j] + " ");
//                      mat3[i][j] = mat1[i][j] + mat2[i][j];
//                  }
//                  System.out.println();
//              }
                                                   //for Greatest Integer
//       int n = Math.floorDiv(10,3);
//       System.out.println(n);
                                               // Reverse of Array
//         int []arr = {1,2,3,4,5,9};
//         int l = arr.length;
//         int n = Math.floorDiv(l,2);          //swap till l/2
//         int temp;
//         for(int i=0; i<n; i++){               //i<n bcz we have to swap till n ,i.e, half
//            // swap logic a[i] and a[l-1-i]
//                                      // |1| |5| ||
//             temp=arr[i];             // ||  |5| |1|     1
//             arr[i]=arr[l-1-i];       // |5| ||  |1|
//             arr[l-1-i]=temp;       // |5| |1| ||
//         }
//         for(int element:arr) {
//             System.out.print(element + " ");
//         }
                                               //Maximum in array
//       int []arr = {1,2,3,4,5,9};
//       int max = Integer.MIN_VALUE;
//       for(int e:arr) {
//           if (e > max) {
//               max = e;
//           }
//       }
//           System.out.println(max);
                                               //Minimum in array
//       int []arr = {1,2,-3,4,5,9};
//       int min = Integer.MAX_VALUE;
//       for(int e:arr) {
//           if (e < min) {
//               min = e;
//           }
//       }
//           System.out.println(min);
                                            //To check array is sorted
//         int []arr = {1,2,3,4,5,9};
//         boolean sort = true;
//         for(int i=0; i< arr.length-1; i++){
//            if(arr[i]>arr[i+1]){
//               sort = false;
//            }
//         }
//         if(sort){
//            System.out.println("Array is sorted");
//         }else {
//            System.out.println("Array is not sorted");
//         }
                                                    //Fibonacci series
//      int a=0,b=1;
//      int c;
//      System.out.print(a +" "+ b+ " ");
//      for(int i=1; i<=10; i++){
//         c=a+b;
//         System.out.print(c+" ");
//         a=b;
//         b=c;
//      }
                                                        //Celcius to Fahrenheit
//      Scanner sc = new Scanner(System.in);
//      float c = sc.nextFloat();
//      float f;
//      f = (c*(1.8f))+32;
//      System.out.println(f);








   }
}