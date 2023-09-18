import java.util.Scanner;

public class Contador {

    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner scanner = new Scanner(System.in);


        int primeiroNumero = scanner.nextInt();
        int segundoNumero = scanner.nextInt();


        if (segundoNumero <= primeiroNumero) {
            throw new ParametrosInvalidosException();
        }


        int quantidadeInteracoes = segundoNumero - primeiroNumero + 1;


        for (int i = primeiroNumero; i <= segundoNumero; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}