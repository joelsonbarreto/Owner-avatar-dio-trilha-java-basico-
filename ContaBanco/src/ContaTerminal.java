import java.util.Scanner;

public class ContaTerminal{
    int Numero;
    String Agencia;
    String NomeCliente;
    double Saldo;

   

    
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);    
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Informe o mumero da conta!");
        conta.Numero = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Iforme a Agencia: ");
        conta.Agencia = entrada.nextLine();
        
        System.out.println("Insira o nome do clente");
        conta.NomeCliente = entrada.nextLine();

        System.out.println("Saldo da conta: ");
        conta.Saldo = entrada.nextDouble();

        System.out.println("Olá [" + conta.NomeCliente + "]\nObrigado por criar uma conta em nosso banco\nsua agência é [" + conta.Agencia + "]\nconta [" + conta.Numero + "]\nsaldo [" + conta.Saldo + "] disponível para saque");


    }

}






    
   

