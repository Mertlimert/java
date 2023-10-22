import java.util.Scanner;

public class mert {
    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            int num1 = inp.nextInt();
            int num2 = inp.nextInt();
            int ab;

            if (num1 > num2) {
                ab = num1;
            } else if (num1 == num2) {
                ab = (num1 + num2) / 2;
            } else  {
                ab = num2;
            }

            System.out.println("daha büyük" + ab);
        }
    }
}






