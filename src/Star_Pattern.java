public class Star_Pattern {
    public static void main(String[] args) {

        // Pattern 1
//        for(int i=1; i<5; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Pattern 2
//        for(int i=1; i<5; i++){
//            for(int j=4; j>=i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Pattern 3
//        for(int i=1; i<5; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=1; i<5; i++){
//            for(int j=4; j>i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Pattern 4
//        for(int i=1; i<5; i++){
//            for(int j=3; j>=i; j--){
//                System.out.print(" ");
//            }
//            for(int k=1; k<=i; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Pattern 5
//        for(int i=1; i<5; i++){
//            for(int j=1; j<i; j++){
//                System.out.print(" ");
//            }
//            for(int k=4; k>=i; k--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Pattern 6
//        for(int i=1; i<5; i++){
//            for(int j=3; j>=i; j--){
//                System.out.print(" ");
//            }
//            for(int k=1; k<=i; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=1; i<4; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(" ");
//            }
//            for(int k=3; k>=i; k--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Pattern 7
//        for(int i=1; i<=4; i++){
//            for(int j=3; j>=i; j--){
//                System.out.print(" ");
//            }
//            for(int k=1; k<=i; k++){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }

        // Pattern 8
//        for(int i=1; i<=4; i++){
//            for(int j=3; j>=i; j--){
//                System.out.print(" ");
//            }
//            for(int k=1; k<=i; k++){
//                System.out.print("*");
//            }
//            for(int l=2; l<=i; l++) {
//                System.out.print("*");
//            }
//                System.out.println();
//        }

        // Pattern 9
//        for(int i=1; i<=4; i++){
//            for(int j=1; j<i; j++){
//                System.out.print(" ");
//            }
//            for(int k=4; k>=i; k--){
//                System.out.print("*");
//            }
//            for(int l=3; l>=i; l--) {
//                System.out.print("*");
//            }
//                System.out.println();
//        }

        // Pattern 10
//        for(int i=1; i<=4; i++){
//            for(int j=1; j<=i; j++) {
//                if (i >= 2 && j <= (i - 1)) {
//                    System.out.print(" ");
//                } else {
//                    System.out.println("*");
//                }
//            }
//        }

        // Pattern 11
//        for(int i=1; i<=4; i++){
//            for(int j=4; j>=i; j--){
//                if (i <= 3 && j >= (i + 1)) {
//                    System.out.print(" ");
//                } else {
//                    System.out.println("*");
//                }
//            }
//        }

        // Pattern 12
        for(int i=1; i<=4; i++){
            for(int j=3; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<i*2; k++){
                if(k>1 && k<(i*2)-1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }





    }
}
