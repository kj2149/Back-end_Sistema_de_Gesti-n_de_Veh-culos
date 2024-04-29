import java.util.Scanner;

public class Automovil extends VehiculoBase implements Vehiculo{
  private boolean movimiento;


  public Automovil(String marca, int velocidadActual, boolean movimiento) {
    super(marca, velocidadActual, movimiento);
    this.movimiento = false;
  }



  @Override
  public void arrancar() {
    System.out.println("Encendiendo carro....");
    movimiento = true;
    System.out.println("El carro está encendido: " + movimiento);
    System.out.println("El carro ya puede arrancar");

  }

  @Override
  public void detener() {
    movimiento = false;
    System.out.println("el carro se detuvo y se apagó");

  }

  @Override
  public void acelerar(int velocidad) {
    if(velocidad > 0){
      System.out.println("El carro marca " + getMarca() +   " está acelerando a velocidad: " + velocidad + "km/h");
      setVelocidadActual(getVelocidadActual() + velocidad);

    }else{
      System.out.println("El carro no puede acelerar en " + velocidad + "Km/h");
    }
  }

  @Override
  public void frenar() {
    System.out.println("frenando... ");
    int velFreno = getVelocidadActual() - 10;
    System.out.println("El carro " + this.getMarca() + " a frenado de " + getVelocidadActual() + " a " + velFreno);
  }

  @Override
  public void obtenerMarca() {
    System.out.println("La marca es:" + getMarca() );

  }

  @Override
  public void obtenerEstado() {
    if(movimiento = true){
      System.out.println("Info carro:");
      System.out.println("El carro está encendido: " + movimiento);

      System.out.println("Vas a un velocidad " + getVelocidadActual());
    }else{
      System.out.println("El carro está apago");
    }
  }


}
