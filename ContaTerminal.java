package BancoPacote;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Por favor, digite o número da conta!");
            int numero = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

            System.out.println("Por favor, digite o número da Agência!");
            String agencia = scanner.nextLine();

            System.out.println("Por favor, digite o nome do cliente!");
            String nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o saldo inicial!");
            double saldo = scanner.nextDouble();

            String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.",
                                            nomeCliente, agencia, numero, saldo);
            System.out.println(mensagem);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, reinicie o programa e use o formato correto para cada dado.");
        } finally {
            scanner.close(); // Fecha o scanner independentemente de qualquer coisa
        }
    }
}
