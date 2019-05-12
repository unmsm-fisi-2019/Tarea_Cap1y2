
package capitulo2;

public class ejercicio_18 {
    public static void main(String[] args) {
        int a,b,r;
        System.out.println("a     b     pow(a,b)");
        b=2;
        for(a=1;a<=5;a++){
            r=(int)Math.pow(a, b);
            System.out.println(a+"     "+b+"     "+r);
            b++;
        }
    }
}
