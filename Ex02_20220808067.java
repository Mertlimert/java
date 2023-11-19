import java.util.Scanner;

public class Ex02_20220808067 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        // exercise 1
    System.out.println("give a number");
        int num = scanner.nextInt();
        int a = num % 100;
        a = a / 10;
    System.out.println(a);
        //exercise 2
    System.out.println("How much time did you spend on internet cafe");
        int money = scanner.nextInt();
        int kalan = 60 - (money % 60);
        money = (money / 60)+ 1;
    System.out.println("The money you have to pay = "+money * 50);
    System.out.println("The amount of time the customer didn't use = "+ kalan);
        //exercise 3
    System.out.println("Please enter k value");
    double k = scanner.nextDouble(); 
    double result = (Math.pow((1.0 - 1.0 / 6),(k - 1))* 1.0 / 6);
    System.out.println("The probability of rolling the first 4 on trial "+ k + " is " +result +" .");
    scanner.close();
    }
}

