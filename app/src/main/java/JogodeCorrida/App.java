/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package JogodeCorrida;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Veiculo fusca = new Veiculo(new MotorDeFusca());
        Veiculo ferrari = new Veiculo(new MotorDeFerrari());
        Veiculo lamborguini = new Veiculo(new MotorDeLamborguini());
        System.out.println(fusca.acelerar());
        System.out.println(ferrari.acelerar());
        System.out.println(lamborguini.acelerar());
        
    }
}
