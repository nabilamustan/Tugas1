/*Nabila Putri Utami Mustan */
package casting1;

/**
 *
 * @author nabil
 */
public class Casting1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=5, b=6;
        float d=2.f,e=3.2f;
        char g='5';
        double k=3.14;
        System.out.println((float)a); // int <-- float
        System.out.println((double)b); // int <-- double
        System.out.println((int)d); // float <-- int
        System.out.println((double)e); // float <-- double
        System.out.println((int)g); // char <-- int (ARCII)
        System.out.println((float)g);
        System.out.println((double)g);
        System.out.println((int)k);
        System.out.println((float)k);
    }
    
}
