import java.util.Scanner;

public class Ex04_20220808067 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        //Exercise 1
    System.out.println("Enter the coordinates of center of a circle");
    double x1 = scanner.nextDouble();
    double y1 = scanner.nextDouble();
    System.out.println("Enter cordinates of somewhere on circle");
    double x2 = scanner.nextDouble();
    double y2 = scanner.nextDouble();
    scanner.nextLine();
    double radius = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
    double area = Math.PI * Math.pow(radius, 2);
    double circumference = Math.PI * 2 * radius;
    System.out.println("Area of this circle is " + area + 
    " and circumference is " + circumference);
        //Exercise 2
        System.out.println("Enter your full name:");
        String fullN = scanner.nextLine();
        int spaceIn = fullN.indexOf(" ");
        if (spaceIn != -1) {
            String firstN = fullN.substring(0, spaceIn);
            String lastN = fullN.substring(spaceIn + 1);
            String reversedN = lastN + ", " + firstN;
            System.out.println(reversedN);
        } else {
            System.out.println("Invalid input");
        }
        //Exercise 3 (string array)
/*    System.out.println("Enter the day number (1 - 7):");
    int dayN = scanner.nextInt();
    String[] weekN = {"Monday","Tuesday","Wednesday","Thursday"
    ,"Friday","Saturday","Sunday"};
    String result = (dayN <= 7 && 1 <= dayN) ? weekN[dayN-1] : "Hatalı giriş";
    System.out.println(result); */
        //Exercise 3
    System.out.println("Enter the day number (1 - 7):");
    int dayN = scanner.nextInt();
    String dayNa;
        switch (dayN){
            case 1:
                dayNa = "Monday";
                break;
            case 2:
                dayNa = "Tuesday";
                break;
            case 3:
                dayNa = "Wednesday";
                break;
            case 4:
                dayNa = "Thursday";
                break;
            case 5:
                dayNa = "Friday";
                break;
            case 6:
                dayNa = "Saturday";
                break;
            case 7:
                dayNa = "Sunday";
                break;
            default:
                dayNa = "Unknown";
                break;
        }
            System.out.println("Day is "+ dayNa);
        //Exercise 4
    System.out.println("Enter first city:");
    String firstA = scanner.next();
    System.out.println("Enter second city:");
    String firstB = scanner.next();
    System.out.println("Enter thirth city:");
    String firstC = scanner.next();
    System.out.println("");
        if (firstA.compareTo(firstC) < 0){
            if (firstA.compareTo(firstB) < 0){
                if (firstB.compareTo(firstC) < 0){
    System.out.println(firstA + " " + firstB + " " + firstC);
                }
                else {
    System.out.println(firstA + " " + firstC + " " + firstB);                
                }
            }
            else {
    System.out.println( firstB + " " + firstA + " " + firstC);
            }
        }
        else {
            if (firstC.compareTo(firstB) < 0){
                if (firstB.compareTo(firstA) < 0){
    System.out.println( firstC + " " + firstB + " " + firstA);
                }
                else {
        System.out.println(firstC + " " + firstA + " " + firstB);
                }
            }
            else {
        System.out.println(firstB + " " + firstC + " " + firstA);
            }
        }
    //exercise 5
    System.out.println("Enter height");
    double height = scanner.nextDouble();
    System.out.println("Enter base of the triangle");
    double base = scanner.nextDouble();
    double sonuc = height * base /2.0;
    System.out.printf("Area 3 decimal places %.3f%n", sonuc);
        scanner.close();


}
}

