class Calculator {
    int product(int a, int b) {
        int c = a*b;
        return c;
    }
    void greet(){
        System.out.println("Good morning ");
    }
}

public class functions {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println( c.product(2, 03));
        c.greet();
    }

}
