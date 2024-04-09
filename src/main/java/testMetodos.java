public class testMetodos {
    public static void main(String[] args) {
        // Crear un cliente
        Cliente cliente = new Cliente("Juan", "Perez", 12345678);
        // Crear un carrito de compras
        CarritoCompras carritoCompras = new CarritoCompras(cliente, "Efectivo", "Calle Falsa 123");
        // Crear un vehiculo: Automovil1 public Automovil(String marcaVehiculo, String modeloVehiculo, int anioFabricacionVehiculo, int pesoVehiculo, double precioVehiculo, int cantidadStockVehiculo, int potenciaMotorHP, int cantidadPuertas, double tamanioMotor)
          Automovil automovil1 = new Automovil("Toyota", "Corolla", 2021, 1200, 25000, 5, 150, 4, 1.6);
        // Agregar vehiculo al carrito de compras
        carritoCompras.agregarVehiculoCarrito(automovil1);
        // Crear una compra
        Compra compra = new Compra(cliente, carritoCompras);
        // Imprimir la compra
        System.out.println(compra);
    }
}
