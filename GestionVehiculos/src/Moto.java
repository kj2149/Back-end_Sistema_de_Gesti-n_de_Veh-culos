public class Moto extends VehiculoBase implements Vehiculo{
  private boolean movimiento;
  public Moto(String marca, int velocidadActual, boolean movimiento) {
    super(marca, velocidadActual,movimiento);
    this.movimiento = false;
  }


  @Override
  public void arrancar() {
    System.out.println("Encendiendo Moto....");
    movimiento = true;
    System.out.println("La moto está encendido: " + movimiento);
    System.out.println("La moto ya puede arrancar");
  }

  @Override
  public void detener() {
    movimiento = false;
    System.out.println("La moto se detuvo y se apagó");
  }

  @Override
  public void acelerar(int velocidad) {
    if(velocidad > 0 && velocidad <= 150 ){
      System.out.println("La moto " + getMarca() + " está acelerando a " + velocidad + "Km/h");
      setVelocidadActual(getVelocidadActual() + velocidad);
    }else{
      System.out.println("La moto solo puede acelerar entre 1km/h y 150km/h");
      System.exit(0);
    }

  }

  @Override
  public void frenar() {
    System.out.println("frenando... ");
    int velFreno = getVelocidadActual() - 10;
    System.out.println("La moto " + this.getMarca() + " a frenado de " + getVelocidadActual() + " a " + velFreno);
  }

  @Override
  public void obtenerMarca() {
    System.out.println("La marca es:" + getMarca() );
  }

  @Override
  public void obtenerEstado() {
    if(movimiento = true){
      System.out.println("Info moto:");
      System.out.println("La moto está encendido: " + movimiento);
      System.out.println("Vas a un velocidad " + getVelocidadActual());
    }else{
      System.out.println("El carro está apago");
    }
  }
}
