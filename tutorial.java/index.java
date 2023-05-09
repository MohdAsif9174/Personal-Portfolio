class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int age = 89;
        if (age < 6) {
            System.out.print("you are a kid");
        }
        else if (age >= 6 && age < 12) {
            System.out.println("you are teen");
        }
        else if (age >= 18) {
            System.out.println("you can come to the party");
        }
        else{
            System.out.println("else block");
        }


        int roll = 33;
        switch (roll) {
            case 33:
                System.out.println("jitin");
                break;
            case 45:
                System.out.println("asif");
                break;
        
            default:
            System.out.println("default");
                break;
        }
    }
}