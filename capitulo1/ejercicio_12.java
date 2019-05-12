
package capitulo1;

public class ejercicio_12 {
    public static void main(String[] args) {
        float k,m,s,mi,t,r;
        mi=24;
        m=45;
        s=30;
        k=(float) (mi*1.6);
        t=(m/60)+(s/3600);
        r=k/t;
        System.out.println("velocidad = "+r+" Km/h");
    }
}
