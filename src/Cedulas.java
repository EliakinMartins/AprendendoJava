import java.util.Locale;
import java.util.Scanner;

public class Cedulas {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

        int op;
        int saldo = 0;
        int valor;
        int deposito = 0;

        do {
            System.out.println("1 - Ver Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");

            op = sc.nextInt();
            if (op == 1) {
                System.out.printf("Saldo: R$ %d%n", saldo);
            } else if (op == 2) {
                System.out.println("Quanto deseja depositar?");
                deposito = sc.nextInt();
                saldo = saldo + deposito;
            } else if (op == 3) {
                System.out.printf("Seu saldo R$: %d%n", saldo);
                System.out.println("Saque: Quanto deseja sacar ?");

                valor = sc.nextInt();
                saldo = saldo - valor;
                int n100, n50, n20, n10, n5, n2;

                n100 = (int) valor / 100;
                valor = valor % 100;
                n50 = (int) valor / 50;
                valor = valor % 50;
                n20 = (int) valor / 20;
                valor = valor % 20;
                n10 = (int) valor / 10;
                valor = valor % 10;
                n5 = (int) valor / 5;
                valor = valor % 5;
                n2 = (int) valor / 2;
                valor = valor % 2;

                System.out.printf("%d nota(s) de R$ 100,00%n", n100);
                System.out.printf("%d nota(s) de R$ 50,00%n", n50);
                System.out.printf("%d nota(s) de R$ 20,00%n", n20);
                System.out.printf("%d nota(s) de R$ 10,00%n", n10);
                System.out.printf("%d nota(s) de R$ 5,00%n", n5);
                System.out.printf("%d nota(s) de R$ 2,00%n", n2);
                System.out.printf("%d nota(s) de R$ 1,00%n", (int) valor);

                System.out.printf("Saldo atual: R$ %d%n",saldo);

            } else {
                System.out.println("Obrigado por utilizar!");
            }
        }while (op !=4);

        sc.close();
    }
}
