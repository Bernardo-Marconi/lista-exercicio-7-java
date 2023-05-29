import java.util.Scanner;

public class ProgramaTamanhoStrings {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        TamanhoStrings tamanhoStrings = new TamanhoStrings();

        System.out.println("Tamanho de Strings");

        System.out.println("Informe a primeira string: ");
        tamanhoStrings.setregistrarStringUm("beranardo");

        System.out.println("Informe a segunda string: ");
        tamanhoStrings.setregistrarStringDois(scan.nextLine());

        System.out.println("Primeira string: " + tamanhoStrings.getstringUm());
        System.out.println("Segunda string: " + tamanhoStrings.getstringDois());
        System.out.printf("Primeira string: %s: %d caracteres", tamanhoStrings.getstringUm(), tamanhoStrings.gettamanhoFraseUm());
        System.out.printf("\nSegunda string: %s: %d caracteres", tamanhoStrings.getstringDois(), tamanhoStrings.gettamanhoFraseDois());

    if (tamanhoStrings.gettamanhoFraseUm() != tamanhoStrings.gettamanhoFraseDois()) {
        System.out.println("\nAs duas strings são de tamanhos diferentes! ");

    } else System.out.println("\nAs duas strings são de tamanhos iguais! ");
    
    if (!tamanhoStrings.getstringDois().equalsIgnoreCase(tamanhoStrings.getstringUm())) {
        System.out.println("As duas strings possuem conteúdo diferente! ");

    } else System.out.println("As duas strings possuem conteúdo iguais! ");

        scan.close();
    }
}
