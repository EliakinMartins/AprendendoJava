import java.util.Locale;
import java.util.Scanner;

public class Tabuada {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int op;
        System.out.println("Tabuada Generator");

        do {
            System.out.println("Qual a tabuada desejada?: ");
            int tabuada = sc.nextInt();
            int resultado;
            for (int i = 0; i <= 10; i++) {
                resultado = tabuada * i;
                System.out.printf("%d X %d = %d%n", i, tabuada, resultado);
            }
            do {
                System.out.println("Inserir nova tabuada? (1 - sim | 2 - não");
                op = sc.nextInt();
                if(op < 1 || op > 2) {
                    System.out.println("Opção Invalida.");
                }
            } while (op < 1 || op > 2);

        } while (op != 2 );
        System.out.println("Fim do Programa - Obrigado por utilizar o Tabuada Generator!");
        sc.close();
    }
}
