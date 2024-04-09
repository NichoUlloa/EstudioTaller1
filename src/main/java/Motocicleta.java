public class Motocicleta extends Vehiculo {
    // atributos
    private int potenciaMotorHP;
    private String tipoMotor, suspension;

    // constructor
    public Motocicleta(String marcaVehiculo, String modeloVehiculo, int anioFabricacionVehiculo, int pesoVehiculo, double precioVehiculo, int cantidadStockVehiculo, int potenciaMotorHP, String tipoMotor, String suspension) {
        super(marcaVehiculo, modeloVehiculo, anioFabricacionVehiculo, pesoVehiculo, precioVehiculo, cantidadStockVehiculo);
        this.potenciaMotorHP = potenciaMotorHP;
        this.tipoMotor = tipoMotor;
        this.suspension = suspension;
    }

    // getters y setters
    public int getPotenciaMotorHP() {
        return potenciaMotorHP;
    }
    public void setPotenciaMotorHP(int potenciaMotorHP) {
        this.potenciaMotorHP = potenciaMotorHP;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }
    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getSuspension() {
        return suspension;
    }
    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    // metodos

    // metodo getTipoVehiculo
    public String getTipoVehiculo() {
        return "Motocicleta";
    }

    // metodo calcularVelocidadMaxima Motocicleta
    public double calcularVelocidadMaxima() {
        return ((potenciaMotorHP * 2) / getPesoVehiculo()) * 20;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Potencia del motor: " + potenciaMotorHP + " HP\n" +
                "Tipo de motor: " + tipoMotor + "\n" +
                "Suspensión: " + suspension + "\n";
    }
}