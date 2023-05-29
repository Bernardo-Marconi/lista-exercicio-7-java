public class NumeroPorExtenso {
    
    private int numeroEscolhido = 0;
    private String[] unidades = {"", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove","dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
    private String[] dezenas = {"", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
    
    public int getNumeroEscolhido() {
    return numeroEscolhido;
    }

    public void setNumeroEscolhido(int numeroEscolhido) {
    this.numeroEscolhido = numeroEscolhido;
    }

    public String[] getUnidades() {
        return unidades;
    }

    public String[] getDezenas() {
        return dezenas;
    }

    public void converterNumero() {
        if (numeroEscolhido == 0) {
            System.out.println("zero");

        } else {
    
            if (numeroEscolhido < 20) {
                System.out.println( unidades[numeroEscolhido]);
            } else {
                int unidade = numeroEscolhido % 10;
                int dezena = numeroEscolhido / 10;

                System.out.print(dezenas[dezena]);
                if (unidade > 0) {
                    System.out.print(" e " + unidades[unidade]);
                }
                System.out.println();
            }
        }
    }
}
