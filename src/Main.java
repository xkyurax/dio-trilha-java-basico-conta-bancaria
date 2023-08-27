import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //TO do: conhecer e importar a classe Scanner

        //Exibir as mensagems para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibit a mensagem conta criada

        Scanner sc = new Scanner(System.in);
        ContaTerminal novaConta = new ContaTerminal();

        System.out.println("Por favor, digite o número da sua conta: ");
        novaConta.setNumero(sc.nextInt());

        System.out.println("Digite o número da sua agência: ");
        novaConta.setAgencia(sc.next());

        System.out.println("Digite seu nome completo: ");
        novaConta.setNomeCliente(sc.next());

        System.out.println("Digite o valor do seu depósito: ");
        novaConta.setSaldo(sc.nextDouble());

        sc.close();

        novaConta.printConta();
    }

}
