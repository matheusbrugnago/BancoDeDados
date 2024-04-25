package introducaoPOO.sozinho;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioTrapezio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia;
        leia= new Scanner(System.in);
        Trapezio x;
        Trapezio y;
        x= new Trapezio();
        y= new Trapezio();
        System.out.println("Precisa-se descobrir a área de um trapézio X.Dê para mim as respectivas medidas:\na)Base Maior\nb)Base Menor\nc)Altura");
        x.baseMaior=leia.nextDouble();
        x.baseMenor= leia.nextDouble();
        x.altura= leia.nextDouble();
        System.out.println("Agora um outro trapézio Y.Dê para mim as respectivas medidas:\na)Base Maior\nb)Base Menor\nc)Altura");
        y.baseMaior=leia.nextDouble();
        y.baseMenor=leia.nextDouble();
        y.altura= leia.nextDouble();
        double valorAreaX= x.areaTrapezio();
        double valorAreaY= y.areaTrapezio();
        System.out.println("O valor da área x é igual a: "+valorAreaX+"\nO valor da área y é igual a: "+valorAreaY);
        leia.close();
    }
}
