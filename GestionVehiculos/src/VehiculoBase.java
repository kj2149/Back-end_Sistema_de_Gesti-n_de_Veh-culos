public class VehiculoBase implements Vehiculo{
  private String marca;
  private int velocidadActual;
  private boolean movimiento;

  public VehiculoBase(String marca, int velocidadActual, boolean movimiento) {
    this.marca = marca;
    this.velocidadActual = velocidadActual;
    this.movimiento = movimiento;
  }


  @Override
  public void arrancar() {


  }

  @Override
  public void detener() {

  }

  @Override
  public void acelerar(int velocidad) {

  }

  @Override
  public void frenar() {

  }

  @Override
  public void obtenerMarca() {

  }

  @Override
  public void obtenerEstado() {

  }

  public String getMarca() {
    return marca;
  }

  public int getVelocidadActual() {
    return velocidadActual;
  }

  public void setVelocidadActual(int velocidadActual) {
    this.velocidadActual = velocidadActual;
  }

  public boolean isMovimiento() {
    return movimiento;
  }
}
