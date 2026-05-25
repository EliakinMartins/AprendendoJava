import java.util.Locale;
import java.util.Scanner;

public class Cedulas {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

        System.out.println("Digite o valor em R$ que deseja sacar: ");

        int valor = sc.nextInt();
        int n100, n50, n20, n10, n5, n2;

        n100 = valor / 100;
        valor = valor % 100;
        n50 = valor / 50;
        valor = valor % 50;
        n20 = valor / 20;
        valor = valor % 20;
        n10 = valor / 10;
        valor = valor % 10;
        n5 = valor / 5;
        valor = valor % 5;
        n2 = valor / 2;
        valor = valor % 2;

        System.out.printf("%d nota(s) de R$ 100,00%n",n100 );
        System.out.printf("%d nota(s) de R$ 50,00%n",n50 );
        System.out.printf("%d nota(s) de R$ 20,00%n",n20 );
        System.out.printf("%d nota(s) de R$ 10,00%n",n10 );
        System.out.printf("%d nota(s) de R$ 5,00%n",n5 );
        System.out.printf("%d nota(s) de R$ 2,00%n",n2 );
        System.out.printf("%d nota(s) de R$ 1,00%n",valor );

        sc.close();
    }
}
