
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prac4{
    public static void main ( String[ ] args ) throws Exception 
    { 
        float p, r, si ; 
        int n ; 
        InputStreamReader isr ; 
        BufferedReader br ; 
        isr = new InputStreamReader ( System.in ) ; 
        br = new BufferedReader ( isr ) ; 
        System.out.println ( "Enter values of p, n and r" ) ; 
        p = Float.parseFloat ( br.readLine( ) ) ; 
        n = Integer.parseInt ( br.readLine( ) ) ; 
        r = Float.parseFloat ( br.readLine( ) ) ; 
        si = ( p * n * r ) / 100 ; 
        System.out.println ( "Simple interest = Rs. " + si ) ; 
 } 
}