class Ex01_20220808067 { 

    
    public static void main(String[] args){
            
        // 1
        int sayi = 1;
        System.out.println("a\ta^2\ta^3 ");          
        System.out.println(sayi + "\t" + sayi + "\t" + sayi);
        System.out.println(sayi + 1 + "\t" + (sayi + 1)*(sayi + 1) + "\t" + (sayi + 1)*(sayi + 1)*(sayi + 1));
        System.out.println(sayi + 2 + "\t" + (sayi + 2)*(sayi + 2) + "\t" + (sayi + 2)*(sayi + 2)*(sayi + 2));
        System.out.println(sayi + 3 + "\t" + (sayi + 3)*(sayi + 3) + "\t" + (sayi + 3)*(sayi + 3)*(sayi + 3));

        // 2
        System.out.println((9.5*4.5-2.5*3)/(45.5-3.5));
        // 3
        double pia = 4*(1-1.0/3+1.0/5-1.0/7+1.0/9-1.0/11);
        double pib = 4*(1-1.0/3+1.0/5-1.0/7+1.0/9-1.0/11+1.0/13);
        System.out.println("1. pi =" + pia);
        System.out.println("2. pi =" + pib);
        System.out.println("average pi =" + (pib+pia)/2);

        // 4 (π'yi ortalama aldım)
        System.out.println("the area of a circle is calculated => " + (pia+pib)/2 * 5.5*5.5);
        System.out.println("the perimeter of a circle is calculated => " + (pia+pib)/2 * 2 * 5.5);
        // 5
        System.out.println("x = " + (44.5 * 0.55 - 50.2 * 5.9) / (3.4*0.55 - 50.2 * 2.1));
        System.out.println("y = " + (3.4 * 5.9 - 44.5 * 2.1) / (3.4*0.55 - 50.2 * 2.1));
};


}
  
   





















