import java.util.Scanner;

public class ProjetoNomeContrario {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        NomeContrario nomeContrario = new NomeContrario();

        System.out.println("Informe seu nome 'em caixa alta ou baixa': ");
        nomeContrario.setNomeInvertido(nomeContrario.inverterString(scan.nextLine()));

        nomeContrario.setNomeInvertido(nomeContrario.converterCaixaAlta(nomeContrario.getNomeInvertido()));
        
        System.out.printf("O nome invertido é: %s", nomeContrario.getNomeInvertido());

        scan.close();
    }
}
