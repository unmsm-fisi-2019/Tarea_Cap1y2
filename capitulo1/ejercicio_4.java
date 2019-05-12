
package capitulo1;


public class ejercicio_4 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("a     a^2     a^3");
        for (a=1;a<=4;a++){
            b=a*a;
            c=a*a*a;
            if (b<10){
                System.out.println(a+"     "+b+"       "+c);
            }else {
                System.out.println(a+"     "+b+"      "+c);
            }
        }
    }
}
