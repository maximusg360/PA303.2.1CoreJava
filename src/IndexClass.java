
public class IndexClass {
    public static void main(String[] args) {
        System.out.println();

        int a = 1;
        int b = 2;

        int sum = a + b;
        System.out.println(sum);

        double c = 20.54;
        double d = 242134.32;

        double sum2 = c + d;
        System.out.println(sum2);

        int e = 23;
        double f = 202.23;

        double sum3 = e + f;
        System.out.println(sum3);

        double g = 43.32;
        int h = 23;

        double sum4 = g /h;

        System.out.println(sum4);




        double i  = 232.32;
        double j = 3223.23;

        double sum5 = j/i;
        System.out.println(sum5);


        int sum6 = (int) (j/i);
        System.out.println(sum6);



        int newX = 5;
        int newY = 6;

        int q =  newY/newX;

        double qcast = (double) (newY/newX);

        System.out.println(qcast);


        final int five = 5;

        System.out.println(4 +5);






        //Cafe store PArt

        double coffee = 3.50;
        double chocolate = 4.50;
        double tea = 0.75;
        final double salesTax = 3.50;

        double subtotal = (3 * coffee) + (4 * chocolate) + ( 2 * tea);
        double totalSale = subtotal + salesTax;
        System.out.println(totalSale);






    }
}
