// calculation of simple intrest
public class CalOfSi{
    public static void main(String[] args) {
        float p, r, si;
        int n;
        p = 1000.50f;
        n = 3;
        r = 15.5f;

        /* Simple Intrest Formula */
        si = p*n*r/100;
        System.out.println(si);
    }
}