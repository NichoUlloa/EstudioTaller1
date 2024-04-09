import java.time.LocalDate;

public class Compra {
    // atributos
    private Cliente cliente;
    private CarritoCompras carritoCompras;
    private LocalDate fechaCompra;

    // constructor
    public Compra(Cliente cliente, CarritoCompras carritoCompras) {
        this.cliente = cliente;
        this.carritoCompras = carritoCompras;
        this.fechaCompra = LocalDate.now();
    }

    // getters y setters
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public CarritoCompras getCarritoCompras() {
        return carritoCompras;
    }
    public void setCarritoCompras(CarritoCompras carritoCompras) {
        this.carritoCompras = carritoCompras;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    // metodos
    @Override
    public String toString() {
        return "Cliente: " + cliente + "\n" +
                "Carrito de compras: " + carritoCompras + "\n" +
                "Fecha de compra: " + fechaCompra + "\n";
    }
}
