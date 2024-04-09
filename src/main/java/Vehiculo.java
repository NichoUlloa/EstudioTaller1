public abstract class Vehiculo {
    // atributos
    private String marcaVehiculo;
    private String modeloVehiculo;
    private int anioFabricacionVehiculo;
    private int pesoVehiculo;
    private double precioVehiculo;
    private int cantidadStockVehiculo;

    // constructor
    public Vehiculo(String marcaVehiculo, String modeloVehiculo, int anioFabricacionVehiculo, int pesoVehiculo, double precioVehiculo, int cantidadStockVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
        this.modeloVehiculo = modeloVehiculo;
        this.anioFabricacionVehiculo = anioFabricacionVehiculo;
        this.pesoVehiculo = pesoVehiculo;
        this.precioVehiculo = precioVehiculo;
        this.cantidadStockVehiculo = cantidadStockVehiculo;
    }

    // getters y setters
    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }
    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getModeloVehiculo() {
        return modeloVehiculo;
    }
    public void setModeloVehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public int getAnioFabricacionVehiculo() {
        return anioFabricacionVehiculo;
    }
    public void setAnioFabricacionVehiculo(int anioFabricacionVehiculo) {
        this.anioFabricacionVehiculo = anioFabricacionVehiculo;
    }

    public int getPesoVehiculo() {
        return pesoVehiculo;
    }
    public void setPesoVehiculo(int pesoVehiculo) {
        this.pesoVehiculo = pesoVehiculo;
    }

    public double getPrecioVehiculo() {
        return precioVehiculo;
    }
    public void setPrecioVehiculo(double precioVehiculo) {
        this.precioVehiculo = precioVehiculo;
    }

    public int getCantidadStockVehiculo() {
        return cantidadStockVehiculo;
    }
    public void setCantidadStockVehiculo(int cantidadStockVehiculo) {
        this.cantidadStockVehiculo = cantidadStockVehiculo;
    }

    // metodos

    // metodo abstracto getTipoVehiculo
    public abstract String getTipoVehiculo();

    // metodo abstracto calcularVelocidadMaxima
    public abstract double calcularVelocidadMaxima();

    @Override
    public String toString() {
        return "Marca: " + marcaVehiculo + "\n" +
                "Modelo: " + modeloVehiculo + "\n" +
                "Año de fabricación: " + anioFabricacionVehiculo + "\n" +
                "Peso: " + pesoVehiculo + " kg\n" +
                "Precio: $" + precioVehiculo + "\n" +
                "Cantidad en stock: " + cantidadStockVehiculo + "\n";
    }
}
