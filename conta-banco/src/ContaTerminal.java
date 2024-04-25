import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        conta.setAgencia(scanner.next());

        System.out.print("\nPor favor, digite o número da Conta: ");
        conta.setNumero(scanner.nextInt());

        scanner.nextLine();

        System.out.print("\nPor favor, digite o seu Nome Completo: ");
        conta.setNome(scanner.nextLine());

        System.out.print("\nPor favor, digite o valor que deseja Depositar: ");
        conta.depositar(scanner.nextDouble());

        scanner.nextLine();

        /*TODO:

        * Conhecer e importar a classe Scanner → OK;
        * Exibir as mensagens para o usuário → Ok;
        * Obter pelo scanner os valores digitados no terminal → Ok;
        * Exibir a mensagem de conta criada.
        */

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %s já está disponível para saque.\n",
                         conta.getNome(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());
    }
}
