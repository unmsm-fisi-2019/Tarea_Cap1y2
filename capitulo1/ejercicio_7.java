
package capitulo1;


public class ejercicio_7 {
    public static void main(String[] args) {
        double i,a,c=1,suma,res;
        suma = 0;
        for(i=1;i<12;i++){
            if(i % 2 != 0){
                a=1/i;
                if (c%2==0){
                    a=a*(-1);
                }
                suma+=a;
                c++;
            }
        }
        res=4*suma;
        System.out.println("El valor de pi es: "+res);
        suma=0;
        c=1;
        for(i=1;i<14;i++){
            if(i % 2 != 0){
                a=1/i;
                if (c%2==0){
                    a=a*(-1);
                }
                suma+=a;
                c++;
            }
        }
        res=4*suma;
        System.out.println("El valor de pi es: "+res);
    }
}
