import java.util.*;
class func{
    int number(int a, int b) {
       if (a>b) {
        return a;
       }
        return b;
    }



    // int sum(int n){
    //     int s = 0;
    //     for (int i = 1; i <= n; i++) {
    //         if ((i%2) !=0 ) {
    //           s = s+i;  
    //         }
    //     }
    //     return s;
    // }



    // public float average(int a, int b, int c) {
    //     return (a+b+c)/3f;
    // }
}
public class practice {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        func f = new func();
        //Problem 1st    
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println(f.average(a,b,c));   
        //Problem number 2nd
      
        // System.out.println(f.sum(n));
        System.out.println(f.number(a,b));
    } 
}

