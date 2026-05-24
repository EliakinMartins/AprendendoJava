import java.util.Locale;
import java.util.Scanner;

public class RodizioAutomotivo {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("SISTEMA RODIZIO CIDADE DE SÃO PAULO");

        int placa;
        int op;

        do {
            System.out.println("Insira o ultimo numero da placa do seu veículo: ");
            placa = sc.nextInt();
            switch (placa) {
                case 1:
                case 2:
                    System.out.println("segunda-feira");
                    break;
                case 3:
                case 4:
                    System.out.println("terça-feira");
                    break;
                case 5:
                case 6:
                    System.out.println("quarta-feira");
                    break;
                case 7:
                case 8:
                    System.out.println("quinta feira");
                    break;
                case 9:
                case 0:
                    System.out.println("sexta-feira");
                    break;
                default:
                    System.out.println("Não corresponde");
            }
            do{

                System.out.println("Deseja consultar outra placa? (1 - sim | 2 - não");
                op = sc.nextInt();
                if(op <1 || op >2 ){
                    System.out.println("Opção Invalida");
                }
            }while (op <1 || op >2 );
        } while (op != 2);
        System.out.println("Fim do programa, Volte sempre!");
        sc.close();
    }
}
