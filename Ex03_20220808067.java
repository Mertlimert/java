import java.util.Scanner;

public class Ex03_20220808067 {
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
// Exercise 1
    System.out.println("A restaurant has these meals and drinks:");
    System.out.println("Id    Meal       Price");
    System.out.println("1     Doner      80 lira");
    System.out.println("2     Kebab      110 lira");
    System.out.println("3     Lahmacun   75 lira");
    System.out.println("");
    System.out.println("Id  Drink       Price");
    System.out.println("1   Ayran       10 lira");
    System.out.println("2   Kola        20 lira");
    System.out.println("3   Salgam      15 lira");
    System.out.println("Please choose a meal;");
    int meal = scanner.nextInt();
    System.out.println("Please choose drink:");
    int drink = scanner.nextInt();
    if (meal == 1){
        if (drink == 1){
            System.out.println("Doner and Ayran 90 lira");
        }
        else if (drink == 2){
            System.out.println("Doner and Kola 100 lira");
        }
        else if (drink == 3){
            System.out.println("Doner and Salgam 95 lira");
        }
        else {
            System.out.println("Wrong id");
        }
    }
    else if ( meal == 2){
        if (drink == 1){
            System.out.println("Kebab and Ayran 120 Lira");
        }
        else if (drink == 2){
            System.out.println("Kebab and Kola 130 Lira");
        }
        else if (drink == 3){
            System.out.println("Kebab and Salgam 125 Lira");
        }
        else {
            System.out.println("Wrong id");
        }
    }
    else if (meal == 3){
        if (drink == 1){
            System.out.println("Lahmacun and Ayran 85 Lira");
        }
        else if (drink == 2){
            System.out.println("Lahmacun and Kola 95 Lira");
        }
        else if (drink == 3){
            System.out.println("Lahmacun and Salgam 90 Lira");
        }
        else {
            System.out.println("Wrong id");
        }
    }
    else {
        System.out.println("Wrong id");
    }
// Exercise 2
    System.out.println("Which internet provider do you prefer ? (1 or 2)");
    int provider = scanner.nextInt();
    if (provider == 1){
    System.out.println("How much gb did you use ?");
    double gb = scanner.nextDouble();
        if (gb >= 100){

            double pv1 = (115 * (80 + 3 * (gb-100))/100);
            System.out.println("You have to pay "+ pv1 + " liras.");
        }
        else if (gb >= 0) {
            System.out.println("You have to pay 80 liras.");
        }
        else {
            System.out.println("Your usage can not be negative");
        }
    }
    else if (provider == 2){
    System.out.println("How much gb did you use ?");
    double gb = scanner.nextDouble();
        if (gb >= 200){
        double pv2 = (110 *(140 + (5 * (gb - 200)))/100);
        System.out.println("You have to pay "+ pv2 + " liras.");
        }
        else if (gb >= 0){
            System.out.println("You have to pay 140 liras.");
        }
        else{
            System.out.println("Your usage can not be negative");
        }
    } 
    else {
        System.out.println("You have to choose 1 or 2");
    }
// Exercise 3
    System.out.println("Folkémon card");
    System.out.println("Choose your attack card (1 or 2)");
    int attack = scanner.nextInt();
    System.out.println("Choose first coin: 0 = tail , 1 = head , 2 = random");
    int answer1 = scanner.nextInt();
    if (answer1 == 2){
    answer1 = (int)(Math.random()* 2);
    }
    else if (answer1 != 0 && answer1 !=1 && answer1 !=2) {    
        System.out.println("Invalid number results can be incorrect");
    }
    System.out.println("Choose second coin: 0 = tail , 1 = head , 2 = random");
    int answer2 = scanner.nextInt();
    if (answer2 == 2){
    answer2 = (int)(Math.random()* 2);
    }
    else if (answer2 != 0 && answer2 !=1 && answer2 !=2) {    
        System.out.println("Invalid number results can be incorrect");
    }
    if (attack == 1){
        if(answer1 == answer2 && answer1 == 1){
            System.out.println("You deal 60 damage");
        }
        else {
            System.out.println("You miss");
        }
    }
    else if (attack == 2){
        System.out.println("You deal " + (50 + 20*(answer1+answer2)) + "damage");
    } 
    else {
        System.out.println("Invalid attack type");
    }
    scanner.close();
}
}