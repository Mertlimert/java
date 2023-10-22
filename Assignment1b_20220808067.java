import java.util.Scanner;

public class Assignment1b_20220808067 {
    public static void main(String[]args){
    System.out.println("Please enter the grading weight (percentage) for the" +
     " following question.");
// abc is scanner
    Scanner abc = new Scanner(System.in);
    System.out.println("Quizzes:");
    double quizp = abc.nextDouble();
    if (quizp < 0 || quizp >100){
            System.out.println("Error: invalid value (must be 0 - 100)");
    }  
    else {
        System.out.println("Homework:");
        double homeworkp = abc.nextDouble();
    if (homeworkp <0 || homeworkp >100){
            System.out.println("Error: invalid value (must be 0 - 100)");
    }       
    else {
            System.out.println("Mid Term Exam:");
            double mid_Termp = abc.nextDouble();
    if (mid_Termp < 0 || mid_Termp >100){
        System.out.println("Error: invalid value (must be 0 - 100)"); 
    }
    else {
        System.out.println("Final Exam");
        double finalexp = abc.nextDouble();
    if (finalexp < 0 || finalexp > 100){
        System.out.println("Error: invalid value (must be 0 - 100)");

    }
    else if ((finalexp + mid_Termp + homeworkp + quizp) != 100){
        System.out.println("Your total percentage must be 100");
    }
    else {
            System.out.println("Please enter the what Mert Kedik " +
            " earned for each category:");
            System.out.println("Quizzes:");
            double quiz = abc.nextDouble();
            if (quiz < 0 || quiz >100){
            System.out.println("Error: invalid value (must be 0 - 100)");
    }  
            else {
                System.out.println("Homework:");
                double homework = abc.nextDouble();
            if (homework <0 || homework >100){
                System.out.println("Error: invalid value (must be 0 - 100)");
    }       
            else {
                    System.out.println("Mid Term Exam:");
                    double mid_Term = abc.nextDouble();
            if (mid_Term < 0 || mid_Term >100){
                System.out.println("Error: invalid value (must be 0 - 100)");
    }
            else {
                System.out.println("Final Exam");
                double finalex = abc.nextDouble();
            if (finalex < 0 || finalex > 100){
                System.out.println("Error: invalid value (must be 0 - 100)");

    }
            else {
            double result = (quiz * quizp + homework * homeworkp +
             mid_Term * mid_Termp + finalex * finalexp)/100;
            if (result >88){
             System.out.println("Mert Kedik passed CSE 101 with a score of "+
             result +", GPA points of 4.0, and a grade letter of AA");
             }
            else if (result >81){
             System.out.println("Mert Kedik passed CSE 101 with a score of "+
             result +", GPA points of 3.5, and a grade letter of BA");
             }      
            else if (result >74){
             System.out.println("Mert Kedik passed CSE 101 with a score of "+
             result +", GPA points of 3.0, and a grade letter of BB");
             }
             else if (result >67){
             System.out.println("Mert Kedik passed CSE 101 with a score of "+
             result +", GPA points of 2.5, and a grade letter of CB");
             }
             else if (result >60){
             System.out.println("Mert Kedik passed CSE 101 with a score of "+
             result +", GPA points of 2.0, and a grade letter of CC");
             }
             else if (result >53){
             System.out.println("Mert Kedik passed CSE 101 with a score of "+
             result +", GPA points of 1.5, and a grade letter of CD");
             }
             else if (result >46){
             System.out.println("Mert Kedik passed CSE 101 with a score of "+
             result +", GPA points of 1.0, and a grade letter of DD");
             }
             else if (result >35){
             System.out.println("Mert Kedik passed CSE 101 with a score of "+
             result +", GPA points of 0.5, and a grade letter of FD");
             }
             else if (result >=0){
             System.out.println("Mert Kedik passed CSE 101 with a score of "+
             result +", GPA points of 0.0, and a grade letter of FF");
             }                   
            }          
            }
            }
            }
    }          
    }
    }
    }
    abc.close();
     
}

}


