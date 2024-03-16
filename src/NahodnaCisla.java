import java.util.Random;

public class NahodnaCisla {

    public static void main(String[] args) {

        Random rand = new Random();


        // (0 - 49)
        int a = rand.nextInt(49);
        int b = rand.nextInt(49);
        int c = rand.nextInt(49);
        int d = rand.nextInt(49);
        int e = rand.nextInt(49);
        int f = rand.nextInt(49);



        a += 1;
        b += 1;
        c += 1;
        d += 1;
        e += 1;
        f += 1;


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}