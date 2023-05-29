import java.util.Scanner;

public class ProgramaValidarNumeroDeTelefone {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ValidarNumeroDeTelefone validarNumero = new ValidarNumeroDeTelefone();

        System.out.println("Informe o Número de telefone: ");
        validarNumero.setNumeroTelefone(scanner.nextLine());

        if (!validarNumero.isContemCaractere()) {
            validarNumero.formatarNumeroSemEspaco();
        } else {
            validarNumero.formatarNumeroComEspaco();
        }
        scanner.close();
    }
}
