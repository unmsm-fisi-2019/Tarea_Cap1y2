package capitulo1;

public class ejercicio_11 {

    public static void main(String[] args) {
        int birth, death, inmi, pob,i;
        pob = 312032486;
        birth = (365 * 24 * 3600)/7;
        
        death = (365 * 24 * 3600)/13;
        
        inmi =(365 * 24 * 3600)/45;
        
        for (i = 1; i <= 5; i++) {
            pob = pob + birth - death + inmi;
            System.out.println("La poblacion despues de "+i+" año es : " + pob);
        }
    }
}
