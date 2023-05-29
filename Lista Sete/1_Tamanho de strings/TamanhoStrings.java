public class TamanhoStrings {
    
    private String stringUm, stringDois;

    public void setregistrarStringUm(String stringUmInformada) {
        stringUm = stringUmInformada;
    }

    public void setregistrarStringDois(String stringDoisInformada) {
        stringDois = stringDoisInformada;
    }

    public String getstringUm() {
        return stringUm;
    }

    public String getstringDois() {
        return stringDois;
    }

    public int gettamanhoFraseUm() {
        int quantidadeCaracteresFraseUm = stringUm.length();
        return quantidadeCaracteresFraseUm;
    }

    public int gettamanhoFraseDois() {
        int quantidadeCaracteresFraseDois = stringDois.length();
        return quantidadeCaracteresFraseDois;
    }
}
