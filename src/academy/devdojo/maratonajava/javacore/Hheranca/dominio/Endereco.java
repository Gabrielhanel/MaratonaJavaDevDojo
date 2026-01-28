package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Endereco {
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    private String rua;
    private String cep;
}
