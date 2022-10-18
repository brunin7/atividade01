

import java.util.Scanner;

public class Questao02 {
    public static void main(String[]arg) {

    Scanner ler = new Scanner(System.in);
    System.out.println ("Digite 1 número:");
    int n = ler.nextInt();
    System.out.println("Anterior: " +(n-1));
    System.out.println("Posterior: "+(n+1));
    }
}