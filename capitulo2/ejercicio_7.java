
package capitulo2;

import java.util.Scanner;

public class ejercicio_7 {
    public static void main(String[] args) {
        int m,y,d;
        Scanner a=new Scanner (System.in);
        System.out.println("Igrese los minutos: ");
        m=a.nextInt();
        y=m/(365*60*24);
        d=m%(365*60*24);
        d/=(60*24);
        System.out.println(m+" minutos es aproximadamente "+y+" años y "+d+" dias");
    }
}
