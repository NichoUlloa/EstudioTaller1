public class Bicicleta extends Vehiculo {
    // atributos
    private String materialConstruccion;
    private int fuerzaPedaleo, cantidadVelocidades;

    // constructor
    public Bicicleta(String marcaVehiculo, String modeloVehiculo, int anioFabricacionVehiculo, int pesoVehiculo, double precioVehiculo, int cantidadStockVehiculo, String materialConstruccion, int fuerzaPedaleo, int cantidadVelocidades) {
        super(marcaVehiculo, modeloVehiculo, anioFabricacionVehiculo, pesoVehiculo, precioVehiculo, cantidadStockVehiculo);
        this.materialConstruccion = materialConstruccion;
        this.fuerzaPedaleo = fuerzaPedaleo;
        this.cantidadVelocidades = cantidadVelocidades;
    }

    // getters y setters
    public String getMaterialConstruccion() {
        return materialConstruccion;
    }
    public void setMaterialConstruccion(String materialConstruccion) {
        this.materialConstruccion = materialConstruccion;
    }

    public int getFuerzaPedaleo() {
        return fuerzaPedaleo;
    }
    public void setFuerzaPedaleo(int fuerzaPedaleo) {
        this.fuerzaPedaleo = fuerzaPedaleo;
    }

    public int getCantidadVelocidades() {
        return cantidadVelocidades;
    }
    public void setCantidadVelocidades(int cantidadVelocidades) {
        this.cantidadVelocidades = cantidadVelocidades;
    }

    // metodos

    // metodo getTipoVehiculo
    public String getTipoVehiculo() {
        return "Bicicleta";
    }

    // metodo calcularVelocidadMaxima Bicicleta
    public double calcularVelocidadMaxima() {
        return ((fuerzaPedaleo / getPesoVehiculo()) * 100) + 10;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Material de construcción: " + materialConstruccion + "\n" +
                "Fuerza de pedaleo: " + fuerzaPedaleo + " N\n" +
                "Cantidad de velocidades: " + cantidadVelocidades + "\n";
    }

}