public class Automovil extends Vehiculo {
    // atributos
    private int potenciaMotorHP;
    private int cantidadPuertas;
    private double tamanioMotor;

    // constructor
    public Automovil(String marcaVehiculo, String modeloVehiculo, int anioFabricacionVehiculo, int pesoVehiculo, double precioVehiculo, int cantidadStockVehiculo, int potenciaMotorHP, int cantidadPuertas, double tamanioMotor) {
        super(marcaVehiculo, modeloVehiculo, anioFabricacionVehiculo, pesoVehiculo, precioVehiculo, cantidadStockVehiculo);
        this.potenciaMotorHP = potenciaMotorHP;
        this.cantidadPuertas = cantidadPuertas;
        this.tamanioMotor = tamanioMotor;
    }

    // getters y setters
    public int getPotenciaMotorHP() {
        return potenciaMotorHP;
    }
    public void setPotenciaMotorHP(int potenciaMotorHP) {
        this.potenciaMotorHP = potenciaMotorHP;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }
    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public double getTamanioMotor() {
        return tamanioMotor;
    }
    public void setTamanioMotor(double tamanioMotor) {
        this.tamanioMotor = tamanioMotor;
    }

    // metodos

    // metodo getTipoVehiculo
    public String getTipoVehiculo() {
        return "Automovil";
    }

    // metodo calcularVelocidadMaxima Automovil
    public double calcularVelocidadMaxima() {
        return (potenciaMotorHP / getPesoVehiculo()) * 10;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Potencia del motor: " + potenciaMotorHP + " HP\n" +
                "Cantidad de puertas: " + cantidadPuertas + "\n" +
                "Tamaño del motor: " + tamanioMotor + " L\n";
    }
}
