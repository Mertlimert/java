// import java.util.Scanner;

// public class to_do_list {
//     public static void main(String[]args){
//         Scanner scanner = new Scanner(System.in);
//         int list = 0;
//         String quit = "";
//         String sumT = "";
//         String sumA = "";
//         System.out.println("Welcome to the to do list");
//         do{

//         System.out.println("You have "+ list+ "things in your to do list.");
//         System.out.println("What is your desire: ");
//         System.out.println("(Add, Delete, Arrangement, Quit)");
//         String firstAns = scanner.next();
//         if(firstAns.equalsIgnoreCase("Add")){
//             list++;
//             System.out.println("Adding enter title before writing");
//             String title = scanner.next();
//             scanner.nextLine();
//             String add = scanner.nextLine();
//             System.out.println("Added.");
//             sumT += (list)+"" + title;
//             sumA += (list)+"" + add;
//         }
//         else if(firstAns.equalsIgnoreCase("Delete") && list > 0){
//             sumT += list+1;
//             System.out.println("Which list do you want to delete.");
//             for(int i = 0; i<list; i++){
//             int a = sumT.indexOf(String.valueOf(i+1));
//             int b = sumT.indexOf(String.valueOf(i+2))-1;
//             String title1 = sumT.substring(a,b+1);
//             System.out.println(title1);
//             }
//             int delete = scanner.nextInt();
            
//         }
//         else if(firstAns.equalsIgnoreCase("Delete")){
//         System.out.println("There is no list so you can't delete.");
//         }
//         else if(firstAns.equalsIgnoreCase("arrangement") && list > 0){
        
//         }
//         else if(firstAns.equalsIgnoreCase("arrangement")){
//         System.out.println("There is no list so you can't arrange.");
//         }
//         else if(firstAns.equalsIgnoreCase("quit")) {
//         quit = "quit";
//         }
//         else{
//         System.out.println("Wrong input program restart.");
//         }
//         }while(!"quit".equals(quit));
//         System.out.println("Have a good one!");

// }
// }