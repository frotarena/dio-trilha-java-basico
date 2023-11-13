import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner leituraNumber = new Scanner(System.in);
        Scanner leituraText = new Scanner(System.in);

        int agenciaConta;
        int numeroConta;
        String nomeCliente;
        Double saldoConta;

        System.out.println("Por favor, digite o número da Agência ! ");
        agenciaConta = leituraNumber.nextInt();

        System.out.println("Por favor, digite o número da Conta ! ");
        numeroConta = leituraNumber.nextInt();

        System.out.println("Por favor, digite o nome do Cliente ! ");
        nomeCliente = leituraText.nextLine();

        System.out.println("Por favor, digite o valor do primero depósito ! ");
        saldoConta = leituraNumber.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agenciaConta + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque!");
    }
}
