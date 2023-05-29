import java.util.Scanner;

public class ProgramaNumeroPorExtenso {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        NumeroPorExtenso numeroPorExtenso = new NumeroPorExtenso();

        System.out.print("Digite um número de 1 até 99: ");
        numeroPorExtenso.setNumeroEscolhido(scanner.nextInt());

        if (numeroPorExtenso.getNumeroEscolhido() < 0 || numeroPorExtenso.getNumeroEscolhido() > 99) {
            System.out.println("Número inválido. Digite um número entre 0 e 99.");

        } else numeroPorExtenso.converterNumero();
        
        scanner.close();
    }
}