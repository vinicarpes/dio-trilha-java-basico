import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;


public class ContaTerminal {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
       
        try{

            System.out.println("Olá! Informe o seu nome para continuar seu atendimento: ");
            String nomeCliente = scanner.next();

            System.out.println("Olá, " + nomeCliente + "! Por favor, insira o numero de sua agência: ");
            int agencia = scanner.nextInt();
            
            System.out.println("Insira o numero da sua conta: ");
            int conta = scanner.nextInt();

            System.out.println("Por fim, qual valor você deseja fazer de depósito inicial?\nR$");
            float saldo = scanner.nextFloat();

            System.out.println(nomeCliente + ", parabéns! Sua conta " + conta + " foi criada com sucesso na agência " + agencia+ ". Seu saldo inicial é de R$" + saldo);
        } catch(InputMismatchException e){
            System.out.println("Dados inválidos!!! \nPor favor, digite uma entrada válida.");
        } catch(Exception e){
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        } finally{
            scanner.close();
        }
        

    }
}
