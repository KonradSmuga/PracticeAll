import java.util.Random;

public class NumberChase {

    public static void main(String[] args) {
        int sumaA = 1000;
        int sumaB = 0;

        Random random = new Random();
        while (sumaA > sumaB) {
            int i = random.nextInt(9);
            int bigger = random.nextInt(49);
            sumaA = sumaA + i;
            sumaB = sumaB + bigger;
            System.out.println(sumaA);
            System.out.println(sumaB);
        }
    }
}
