
package capitulo2;

import java.util.Scanner;

public class ejercicio_17 {
    public static void main(String[] args) {
        double t,tf,v;
        Scanner leer=new Scanner (System.in);
        System.out.print("Ingrese la temperatura entre -58°F y 41°F: ");
        t=leer.nextDouble();
        System.out.print("Ingrese la velociad del viento: ");
        v=leer.nextDouble();
        if (t>-58 && t<41 && v>=2){
            tf=35.74+(0.6215*t)-(35.75*(Math.pow(v,0.16)))+(0.4275*t*(Math.pow(v,0.16)));
            System.out.println("The wind chill index is "+String.format("%.5f",tf));
        }else{
            System.out.println("Datos incorrectos");
        }
    }
}
