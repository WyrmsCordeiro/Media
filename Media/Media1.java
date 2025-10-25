//EX02 Cálculo da Média Aritmética de Duas Notas//
import java.util.Scanner;

public class Media {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in); //Entrada de Dados
        System.out.print("Digite a sua 1ª nota:");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a sua 2ª nota:");
        double nota2 = scanner.nextDouble();
        double media = (nota1 + nota2) / 2;
        
        System.out.println("A média calculada foi: "+ media);

scanner.close();

    }
}
