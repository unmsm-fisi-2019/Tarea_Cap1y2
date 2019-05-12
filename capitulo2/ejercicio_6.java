
package capitulo2;

import java.util.Scanner;

public class ejercicio_6 {
    public static void main(String[] args) {
        int a,b,c;
        c=0;
        Scanner x=new Scanner (System.in);
        System.out.println("Ingrese un numeroo entre 0 y 1000: ");
        a=x.nextInt();
        if(a<1000 && a>0){
            do{
                b=a%10;
                a=(a-b)/10;
                c+=b;
            }while (a>0);
            System.out.println("La suma de digitos es: "+c);
        }else {
            System.out.println("Error!!! numero no valido");
        }
        
    }
}
