import java.util.Scanner;

public class ProgramaVerificacaoCpf {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        VerificacaoCpf verificacaopf = new VerificacaoCpf();

        System.out.println("Informe seu CPF com o formato xxx.xxx.xxx-xx ");
        verificacaopf.setCpfInformado(scan.nextLine());

    if (verificacaopf.getCpfInformado().charAt(3) == '.' && verificacaopf.getCpfInformado().charAt(7) == '.' && verificacaopf.getCpfInformado().charAt(11) == '-' && verificacaopf.getCpfInformado().length() == 14) {
        System.out.println("O CPF informado é válido!");

    } else System.out.println("O CPF informado é inválido!");

        scan.close();
    }
}