
package capitulo1;

public class ejercicio_10 {
    public static void main(String[] args) {
        float k,m,s,mi,t,r;
        k=14;
        m=45;
        s=30;
        mi=(float) (k/1.6);
        t=(m/60)+(s/3600);
        r=mi/t;
        System.out.println("velocidad = "+r+" miles/hour");
    }
}
