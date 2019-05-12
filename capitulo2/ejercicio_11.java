
package capitulo2;

import java.util.Scanner;

public class ejercicio_11 {
    public static void main(String[] args) {
        System.out.println("Ingrese el numero de años: ");
        Scanner x=new Scanner (System.in);
        int birth, death, inmi, pob,i,n;
        n=x.nextInt();
        pob = 312032486;
        birth = (365 * 24 * 3600)/7;
        
        death = (365 * 24 * 3600)/13;
        
        inmi =(365 * 24 * 3600)/45;
        
        for (i = 1; i <= n; i++) {
            pob = pob + birth - death + inmi;
            System.out.println("La poblacion despues de "+i+" año es : " + pob);
        }
    }
}
