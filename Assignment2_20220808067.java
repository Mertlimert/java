    // @author: Mert Kedik
    // @since: 9.11.2023

import java.util.Scanner;

public class Assignment2_20220808067 {
    public static void main(String[]args){
    int cat1p,cat2p,cat3p,cat4p,cat5p,sum;
    int cat1v,cat2v,cat3v,cat4v,cat5v;
    boolean cat1vf,cat2vf,cat3vf,cat4vf,cat5vf;
    boolean cat1pf,cat2pf,cat3pf,cat4pf,cat5pf;
    double score1 = 0;
    double score2 = 0;
    double score3 = 0;
    double score4 = 0;
    double score5 = 0;
    double a = 0;
    double b = 0;
    double c = 0;
    double d = 0;
    double e = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("-------------------------------------------------");
        System.out.println("Please enter the name of the category  1: ");
    String cat1 = scanner.nextLine();
    String cat1f = formatCategoryName(cat1);
    do {
        System.out.println("Please enter how many items of type " + cat1f +
         " were given: ");
    cat1v =  scanner.nextInt();
        cat1vf = isQuantityValid(cat1v);
    }while(cat1vf == true);
    do{
        System.out.println("Please enter the percentage weight of "+ cat1f);
    cat1p = scanner.nextInt();
        sum = cat1p;
    cat1pf = isWeightValid(cat1p,sum);
        if (sum>100 || cat1p<=0){
        sum = sum - cat1p;
        }
    }while(cat1pf == true);
        System.out.println("Please enter the name of the category  2: ");
        scanner.nextLine();
    String cat2 = scanner.nextLine();
    String cat2f = formatCategoryName(cat2);
    do{
        System.out.println("Please enter how many items of type " + cat2f +
         " were given: ");
    cat2v =  scanner.nextInt();
            cat2vf = isQuantityValid(cat2v);
    }while(cat2vf == true);
    do{
        System.out.println("Please enter the percentage weight of "+ cat2f);
    cat2p = scanner.nextInt();
        sum = sum + cat2p;
    cat2pf = isWeightValid(cat2p,sum);
        if (sum>100 || cat2p<0){
        sum = sum - cat2p;
        }
    }while(cat2pf == true);
        System.out.println("Please enter the name of the category  3: ");
        scanner.nextLine();
    String cat3 = scanner.nextLine();
    String cat3f = formatCategoryName(cat3);
    do{
        System.out.println("Please enter how many items of type " + cat3f +
         " were given: ");
    cat3v =  scanner.nextInt();
        cat3vf = isQuantityValid(cat3v);
    }while(cat3vf == true);
    do{
        System.out.println("Please enter the percentage weight of "+ cat3f);
    cat3p = scanner.nextInt();
        sum = sum + cat3p;
    cat3pf = isWeightValid(cat3p,sum);
        if (sum>100 || cat3p<0){
        sum = sum - cat3p;
        }
    }while(cat3pf == true);
        System.out.println("Please enter the name of the category  4: ");
        scanner.nextLine();
    String cat4 = scanner.nextLine();
    String cat4f = formatCategoryName(cat4);
    do{
        System.out.println("Please enter how many items of type " + cat4f +
         " were given: ");
    cat4v =  scanner.nextInt();
            cat4vf = isQuantityValid(cat4v);
    }while(cat4vf == true);
    do{
        System.out.println("Please enter the percentage weight of "+ cat4f);
    cat4p = scanner.nextInt();
        sum = sum + cat4p;
    cat4pf = isWeightValid(cat4p,sum);
        if (sum>100 || cat4p<0){
        sum = sum - cat4p;
        }
    }while(cat4pf == true);
        System.out.println("Please enter the name of the category  5: ");
        scanner.nextLine();
    String cat5 = scanner.nextLine();
    String cat5f = formatCategoryName(cat5);
    do{
        System.out.println("Please enter how many items of type " + cat5f +
         " were given: ");
    cat5v =  scanner.nextInt();
        cat5vf = isQuantityValid(cat5v);
    }while(cat5vf == true);
    do{
        System.out.println("Please enter the percentage weight of "+ cat5f);
    cat5p = scanner.nextInt();
       sum = sum + cat5p;
    cat5pf = isWeightValid(cat5p,sum);
       if (sum>100 || cat5p<0){
        sum = sum - cat5p;
        }
    }while(cat5pf == true);
    if(sum == 100){
System.out.println("-------------------------------------------------");
System.out.println("Please enter the value that the student earned" + 
"for each item: ");
    for(int i=1; i<=cat1v; i++){
        System.out.println(cat1f + " " + i + ": ");
        double num = scanner.nextDouble();
        score1 = score1 + num;
        a++;
    }
    for(int i=1; i<=cat2v; i++){
        System.out.println(cat2f + " " + i + ": ");
        double num = scanner.nextDouble();
        score2 = score2 + num;
        b++;
    }
    for(int i=1; i<=cat3v; i++){
        System.out.println(cat3f + " " + i + ": ");
        double num = scanner.nextDouble();
        score3 = score3 + num;
        c++;
    }
    for(int i=1; i<=cat4v; i++){
        System.out.println(cat4f + " " + i + ": ");
        double num = scanner.nextDouble();
        score4 = score4 + num;
        d++;
    }
    for(int i=1; i<=cat5v; i++){
        System.out.println(cat5f + " " + i + ": ");
        double num = scanner.nextDouble();
        score5 = score5 + num;
        e++;
    }
    score1 = score1 / a; score2 = score2 / b; score3 = score3 / c;
    score4 = score4 / d; score5 = score5 / e;
    double avrg = (score1*cat1p + score2*cat2p + score3*cat3p +
    score4*cat4p +score5*cat5p)/100;
    String letter = gradeLetter(avrg);
    double gpa  = gpaPoints(avrg);
    String stat = status(avrg);
    System.out.println("-------------------------------------------------");
    System.out.println(cat1f + ": "+ score1);
    System.out.println(cat2f + ": "+ score2);
    System.out.println(cat3f + ": "+ score3);
    System.out.println(cat4f + ": "+ score4);
    System.out.println(cat5f + ": "+ score5);
    System.out.println("The student has "+ stat + " CSE 101 with a score of "+
     avrg + ", GPA points of "+ gpa + ", and a grade letter of " + letter);
}
else {
    System.out.println("ERROR: The values sum to "+ sum +
     " but should sum to 100.");
     }
     scanner.close();
}

    public static String formatCategoryName(String name){
    name = name.toLowerCase();
    name = name.substring(0,1).toUpperCase()+name.substring(1);
    return name;
    } 
    public static boolean isQuantityValid(int quantity){
    return  quantity <= 0;
    }
    public static boolean isWeightValid(int weight, int totalWeight){
    return (weight > 100 || (weight < 0 || totalWeight > 100));
    }
    public static String gradeLetter(double grade){
           if (grade >88){
        return "AA";
            }
           else if (grade >81){
        return   "BA"; 
            }      
           else if (grade >74){
        return   "BB"; 
            }
            else if (grade >67){
        return   "CB";     
            }
            else if (grade >60){
        return   "CC";     
            }
            else if (grade >53){
        return   "DC";     
            }
            else if (grade >46){
        return   "DD";     
            }
            else if (grade >35){
        return  "FD";      
            }
            else if (grade >=0){
        return  "FF";
            }
            else {
        return "error";
            }                
    }
    public static double gpaPoints(double grade){
        if (grade >88){
        return 4.0;
            }
           else if (grade >=81){
        return   3.5; 
            }      
           else if (grade >=74){
        return   3.0; 
            }
            else if (grade >=67){
        return   2.5;     
            }
            else if (grade >=60){
        return   2.0;     
            }
            else if (grade >=53){
        return   1.5;     
            }
            else if (grade >=46){
        return   1.0;     
            }
            else if (grade >=35){
        return  0.5;      
            }
            else if (grade >=0){
        return  0.0;      
            }
            else{
        return 0;
            }
    }
    public static String status(double grade){
            if (grade >=60){
        return "Passed";    
            }
            else if (grade >=46){
        return   "Conditionally Passed";     
            }
            else if (grade >=0){
        return  "Failed";      
            }
            else{
        return "error";
            }
    }
    

}
