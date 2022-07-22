
package Race;

public class Carro {
    private String nomeCarro, modelo, motor, nomePiloto;
    private int potencia, ano;
    
    public Carro(String nameCar, String module, String engine, String pilotName, int potencia, int ano) {
        this.nomeCarro = nameCar;
        this.modelo = module;
        this.motor = engine;
        this.nomePiloto = pilotName;
        this.potencia = potencia;
        this.ano = ano;
    }
    
    public String apresentar (Carro piloto1, Carro piloto2) {
        return piloto1.nomePiloto+" X "+ piloto2.nomePiloto;
    }
    
    public String ganharRace (Carro piloto) {
        return  piloto.nomePiloto + " é o vencedor ";
    }
    
    public String perderRace (Carro piloto) {
        return  piloto.nomePiloto + " é o perdedor ";
    }
    
    public String empatarRace (Carro piloto, Carro piloto2) {
        return  piloto.nomePiloto + " e o " + piloto2.nomePiloto + "empataram a corrida";
    }
    
    public String status() {
        return  "Carro: " + this.nomeCarro +
                "\nModelo: " + this.modelo + 
                "\nAno: " + this.ano +
                "\nMotor: " + this.motor +
                "\nPotencia: " + this.potencia + 
                "\nPiloto: " + this.nomePiloto;
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getNomePiloto() {
        return nomePiloto;
    }

    public void setNomePiloto(String nomePiloto) {
        this.nomePiloto = nomePiloto;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
