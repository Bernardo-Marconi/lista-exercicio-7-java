public class ValidarNumeroDeTelefone {
    private String numeroTelefone;
    private boolean contemCaractere = numeroTelefone.contains(Character.toString('-'));

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public boolean isContemCaractere() {
        return contemCaractere;
    }

    public void formatarNumeroSemEspaco() {
        if (numeroTelefone.length() == 8) {

            StringBuilder numeroFormatadoOitoCaracteres = new StringBuilder(numeroTelefone);
            numeroFormatadoOitoCaracteres.insert(4, "-");
            String numeroJaFormatado = numeroFormatadoOitoCaracteres.toString();

            System.out.println("Telefone: " + numeroJaFormatado);
            System.out.println("Telefone possui 8 dígitos!\nVou acrescentar o digito nove na frente! ");
            System.out.println("Telefone corrigido sem formatação: 9" + numeroTelefone);
            System.out.println("Telefone corrigido com formatação: 9" + numeroJaFormatado);

        } else if (numeroTelefone.length() == 9) {

            StringBuilder numeroFormatadoNoveCaracteres = new StringBuilder(numeroTelefone);
            numeroFormatadoNoveCaracteres.insert(5, "-");
            String numeroJaFormatado = numeroFormatadoNoveCaracteres.toString();

            System.out.println("Telefone: " + numeroJaFormatado);
            System.out.println("Telefone possui 9 dígitos! ");
            System.out.println("Telefone sem formatação: " + numeroTelefone);
            System.out.println("Telefone com formatação: " + numeroJaFormatado);

        } else if (numeroTelefone.length() > 10
                || numeroTelefone.length() > 8) {
            System.out.println("Telefone inválido!");           
        }
    }
    
    public void formatarNumeroComEspaco() {
        if (numeroTelefone.length() == 9) {

            System.out.println("Telefone: " + numeroTelefone);
            System.out.println("Telefone possui 8 dígitos!\nVou acrescentar o digito nove na frente! ");
            System.out.println("Telefone corrigido com formatação: 9" + numeroTelefone);

        } else if (numeroTelefone.length() == 10) {

            System.out.println("Telefone: " + numeroTelefone);
            System.out.println("Telefone possui 9 dígitos! ");
            System.out.println("Telefone com formatação: " + numeroTelefone);

        } else if (numeroTelefone.length() > 11
                || numeroTelefone.length() > 9) {
            System.out.println("Telefone inválido!");
        }
    }
}
