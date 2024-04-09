import java.util.ArrayList;

public class CarritoCompras {
    // atributos
    private String metodoPago, direccionEnvio;
    private ArrayList<Vehiculo> vehiculosCarrito;
    private Cliente cliente;

    // constructor
    public CarritoCompras(Cliente cliente, String metodoPago, String direccionEnvio) {
        this.vehiculosCarrito = new ArrayList<Vehiculo>();
        this.cliente = cliente;
        this.metodoPago = metodoPago;
        this.direccionEnvio = direccionEnvio;
    }

    // getters y setters
    public String getMetodoPago() {
        return metodoPago;
    }
    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }
    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public ArrayList<Vehiculo> getVehiculosCarrito() {
        return vehiculosCarrito;
    }

    public void setVehiculosCarrito(ArrayList<Vehiculo> vehiculosCarrito) {
        this.vehiculosCarrito = vehiculosCarrito;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // metodos

    // metodo agregarVehiculoCarrito
    public void agregarVehiculoCarrito(Vehiculo vehiculo) {
        this.vehiculosCarrito.add(vehiculo);
    }

    // metodo eliminarVehiculoCarrito
    public void eliminarVehiculoCarrito(Vehiculo vehiculo) {
        this.vehiculosCarrito.remove(vehiculo);
    }

    // metodo vaciarCarrito
    public void vaciarCarrito() {
        this.vehiculosCarrito.clear();
    }

    // metodo calcularTotalCarrito
    public double calcularTotalCarrito() {
        double total = 0;
        for (Vehiculo vehiculo : this.vehiculosCarrito) {
            total += vehiculo.getPrecioVehiculo();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Metodo de pago: " + metodoPago + "\n" +
                "Direccion de envio: " + direccionEnvio + "\n" +
                "Vehiculos en el carrito: " + vehiculosCarrito + "\n";
    }

}

