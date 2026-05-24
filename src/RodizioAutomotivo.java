import java.util.Locale;
import java.util.Scanner;

public class RodizioAutomotivo {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("SISTEMA RODIZIO CIDADE DE SÃO PAULO");
        System.out.println("Insira o ultimo numero da placa do seu veículo: ");

        int placa = sc.nextInt();

        switch (placa){
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
        sc.close();
    }
}
