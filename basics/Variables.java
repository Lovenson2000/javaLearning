import java.util.Scanner;

class Variables {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your a number: ");
        int number  = scanner.nextInt();
        System.out.println((int) Math.sqrt(number));
        
    }
};