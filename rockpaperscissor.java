import java.util.Scanner;

public class rockpaperscissor {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Welcome to the game!");
        System.out.println("Please make a decision:");
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissor");
        int answer = inp.nextInt();
        int pc = (int)(Math.random()* 3)+ 1;
        if (pc == answer){
            System.out.println("berabere");
        }





    }
}