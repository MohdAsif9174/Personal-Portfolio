import java.util.*;

public class advancepattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n - 1 - i; j >= 0; j--) {
                System.out.print(" ");    
            }
            for (int j = 1; j <= n; j++) {
                if (i==1 || j==1 || i==5 || j==5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");}
            }
            System.out.println();

        }
    }
}
