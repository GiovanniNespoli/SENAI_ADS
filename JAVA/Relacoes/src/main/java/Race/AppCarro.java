
package Race;

public class AppCarro {
    public static void main(String[] args) {
        Carro car = new Carro("Honda NSX", "Esportivo", "V6", "Giovanni Nespoli", 600, 1995);
        System.out.println(car.status());
        System.out.println("");
        
        Carro car2 = new Carro("Toyota Supra", "Esportivo", "V6", "Gigio Andrade", 600, 2005);
        System.out.println(car2.status());
        System.out.println("");
        
        Corrida race = new Corrida();
        
        race.marcarCorrida(car, car2);
        
        if (race.marcarCorrida(car, car2) == true) {
            System.out.println("Corrida marcada!!");
            
            System.out.println(car.apresentar(car, car2));
            System.out.println("");
            System.out.println(car.ganharRace(car));
        } else {
            System.out.println("Não é possível marcar a corrida!!");
        
        }
    }
}
