//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Automovil auto = new Automovil("Toyota", 0, false);
    Moto moto1 = new Moto("Honda", 0, false);

    auto.arrancar();
    auto.acelerar(60);
    auto.frenar();
    auto.obtenerEstado();
    System.out.println("******");
    moto1.arrancar();
    moto1.acelerar(100);
    moto1.frenar();
    moto1.obtenerEstado();
  }
}