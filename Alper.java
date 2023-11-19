public class Alper {
    static void getNumbers(){
        for (int i = 0; i <= 4; i++) {
            if(i==0){
                System.out.println("A^1\tA^2\tA^3");
            }
            else{
                String result=String.format("%d\t%d\t%d",i,i*i,i*i*i);
                System.out.println(result);
            }
        }
    }
    public static void main(String[] args){
        getNumbers();
    }
}

