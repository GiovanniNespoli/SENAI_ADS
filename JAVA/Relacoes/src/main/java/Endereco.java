
public class Endereco {
    private String longradouro;
    private String complemento;
    private int numero;
    private String cep;

    public String getLongradouro() {
        return longradouro;
    }

    public void setLongradouro(String longradouro) {
        this.longradouro = longradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public String status() {
        return  this.getLongradouro() + ", " +
                this.getNumero() + " " + 
                this.getComplemento() + "" +
                "\n CEP: " + this.getCep();
    }
}
