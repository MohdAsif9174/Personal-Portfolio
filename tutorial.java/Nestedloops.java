import java.util.*;

public class Nestedloops {

    public static void main(String[] args) {
        // print the number in half pyramid 1 to 15 number in java nested Loops//
        int n = 5;
        for(int i=1; i<=n; i++){
            //inner Loops//
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
            
        }
        for(int i=n; i>=1; i){
            //inner Loops//
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
            
        }
        //second half//


    }
        // int number = 1;
        //outer Loops// this loops is detect the rows//
    //     for(int i=1; i<=n; i++) {
    //         //inner Loops//
    //         for(int j=1; j<=i; j++){
    //             System.out.print(number);
    //             number++;
    //         }
    //         System.out.println();
    //     }
    // }
}
//         int n = 5;
//         //print the 1234 and next line is the 123 and the nth next line is 12 and last line is 1 with the help of nested Loops/
//         //outer Loops//
//         for(int i=1; i<=n; i++) {
//             //inner Loops//
//             for(int j=1; j<=n-i+1; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
        // outer Loops//
        // for(int i=1; i<=n; i++){
        // // inner Loops//
        // for(int j=1; j<=m; j++){
        // System.out.print("*");
        // }
        // System.out.println("*");
        // }

        // hollow rectangle //
        // outer Loops//
//         for (int i=1; i<=n; i++) {
//             //inner Loops ->space print
//             for(int j=1; j<=n; j++){
//                 System.out.print("");
//             }
//             // inner Loops//
//             for (int j = 1; j <=i; j++) {
//                System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
//down to top pyramid(inverted pyramid)
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc nextInt();

//         int sum = 0;
//         for(int i=0; i<=n; i++);{
//             sum = sum + 1;
//        }   
//     system.out.println(sum); 
//     }
// }

