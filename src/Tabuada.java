import java.util.Locale;
import java.util.Scanner;

public class Tabuada {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Tabuada Generator");

        System.out.println("Por favor, entre com a tabuada desejada:");
        int tabuada = sc.nextInt();
        int resultado;
        for(int i = 0; i <=10; i++){
            resultado = tabuada * i;
            System.out.printf("%d X %d = %d%n", i, tabuada, resultado);
        }
        sc.close();
    }
}
