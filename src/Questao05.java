

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println ("Valor Jantar :");
        float Jantar = ler.nextFloat();
        Systemout.println (Jantar + " 10% "+ (Jantar + 1.1));
        float gorgeta = (Jantar / 100)*10;
        System.out.println(String.format("%.2f + 10%s = %.2f", Jantar,"%", (gorgeta)));
    }
    
}
