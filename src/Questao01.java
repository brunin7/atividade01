
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Questao01 {

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Nota 1 :");
        double nota01 = ler.nextDouble();
        System.out.println("Nota 2");
        double nota02 = ler.nextDouble();
        ler.close();
        double media = nota01+nota02;
        media = media/2;
        System.out.println("Média Final das Notas:" + media);
        if (media >=7) {
            System.out.println("Aprovado,Parabéns");
        } else{
            System.out.println("Reprovado,Estude");
        }
    }
}