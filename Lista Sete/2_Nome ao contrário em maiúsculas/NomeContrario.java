public class NomeContrario {

    private String nomeInvertido;
   
    public String inverterString(String nomeContrario) {
        StringBuilder stringbuilder = new StringBuilder(nomeContrario);
        return stringbuilder.reverse().toString();
    }

    public void setNomeInvertido(String nomeInvertido) {
        this.nomeInvertido = nomeInvertido;
    }

    public String getNomeInvertido() {
        return nomeInvertido;
    }

    public  String converterCaixaAlta(String nomeSemFormatacao) {
        return nomeSemFormatacao.toUpperCase();
    }
}
