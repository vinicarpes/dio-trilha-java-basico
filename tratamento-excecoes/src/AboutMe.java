import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite sua idadee: ");
        int idade = scanner.nextInt();
    }
    catch(InputMismatchException e){
        System.err.println("Os campos idade e altura precisam ser numéricos!");
    }
}
}
