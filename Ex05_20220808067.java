import java.util.Scanner;

public class Ex05_20220808067 {
    public static void main(String[]args){
        System.out.println(computePI());
        System.out.println(factorial());
        System.out.println(isPrime());
        nPrime();
        nPerfectNumbers();
        displayStatistics();
    }


    public static double computePI(int parameter){
        double piC = 0;
        if (parameter == 0)
        return 3;
        for (int i = 1; i <= parameter; i++)
        piC += (Math.pow(-1.0, i+1.0)/(2.0*i-1.0));
        double pi = piC*4.0;
        return pi;

    }


    public static int factorial(int parameter){
        int result = 1;
        for(int i = parameter; i != 0; i--)
        result *= i;
        return result;
    }


    public static boolean isPrime(int parameter){
    int var  = 1;
    double sqrtParameter = Math.sqrt(parameter);
        if ((int)sqrtParameter % 2 == 0)
    sqrtParameter++;
        if (parameter % 2 == 0)
    return false;
        for(int i = (int)sqrtParameter; i != 1 && var != 0; i = i-2)
    var = parameter % i;
    boolean result = (var == 0 ? false : true);
    return result;
    }


    public static void nPrime(int parameter){
        if(parameter == 2)
        System.out.println("2");
        else{
        if (parameter % 2 == 0)
        parameter--;
    for(int i = parameter; 1 < i; i = i-2){
        System.out.print((calculator(i) ? i + " ": ""));
        
    }
    }
    System.out.println("");
    }



    public static void nPerfectNumbers(int n){
        int number =2;
        int reversePerfect =0;
        while (reversePerfect<n){
            int a = 0;
            for(int i = 1; i < number; i++){
                if(number % i == 0){
                    a += i;
                }
            }if(a == number){
                reversePerfect++;
                System.out.print(number+" ");
            }
            number++;
   }
   System.out.println("");
}


    public static void displayStatistics(int parameter){
    double sum = 0;
    double sumPow = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("prompt " + parameter +" data points");
    for(int i = 0; i < parameter; i++){
    double n = scanner.nextDouble();
    sum += n;
    sumPow += Math.pow(n, 2);
    }
    double mean = sum / parameter;
    System.out.printf("mean: %.2f", mean);
    System.out.printf(" deviation: %.5f", Math.sqrt( (sumPow - ( 
        Math.pow(sum, 2) / parameter )) / (parameter - 1) ));
    scanner.close();
    }


    public static boolean calculator(int parameter){
    int var  = 1;
    double sqrtParameter = Math.sqrt(parameter);
        if ((int)sqrtParameter % 2 == 0)
    sqrtParameter++;
        if (parameter % 2 == 0)
    return false;
        for(int i = (int)sqrtParameter; i != 1 && var != 0; i = i-2)
    var = parameter % i;
    boolean result = (var == 0 ? false : true);
    return result;    
    }
}