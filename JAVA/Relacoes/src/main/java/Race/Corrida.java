
package Race;

public class Corrida {
    private Carro desafiante, desafiado;
    
    public Boolean marcarCorrida(Carro desafiante1, Carro desafiado1) {
        this.desafiante = desafiante1;
        this.desafiado = desafiado1;
        
        if (desafiante1 != desafiado1) {
            return true;
        }
        return false;
    }

    public Carro getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Carro desafiante) {
        this.desafiante = desafiante;
    }

    public Carro getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Carro desafiado) {
        this.desafiado = desafiado;
    }
    
    
}
