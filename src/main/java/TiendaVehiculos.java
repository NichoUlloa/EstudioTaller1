import java.util.ArrayList;

public class TiendaVehiculos {
	// atributos

	private ArrayList<Vehiculo> catalogoVehiculos;
	private ArrayList<Cliente> clientes;
	private CarritoCompras carritoCompras;

	// constructor
	public TiendaVehiculos() {
		this.catalogoVehiculos = new ArrayList<Vehiculo>();
		this.clientes = new ArrayList<Cliente>();
	}

	// getters y setters
	public ArrayList<Vehiculo> getCatalogoVehiculos() {
		return catalogoVehiculos;
	}
	public void setCatalogoVehiculos(ArrayList<Vehiculo> catalogoVehiculos) {
		this.catalogoVehiculos = catalogoVehiculos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public CarritoCompras getCarritoCompras() {
		return carritoCompras;
	}
	public void setCarritoCompras(CarritoCompras carritoCompras) {
		this.carritoCompras = carritoCompras;
	}

	// metodos

	// Los clientes pueden registrarse y tener una cuenta en la tienda de vehículos.
	// metodo registrarCliente, si el cliente ya existe, no se registra y se informa al usuario
	public void registrarCliente(Cliente cliente) {
		if (!this.clientes.contains(cliente)) {
			this.clientes.add(cliente);
		} else {
			System.out.println("El cliente ya existe en la tienda.");
		}
	}

	// Los clientes pueden buscar vehículos por marca, modelo o tipo.
	// metodo buscarVehiculoPorMarca, si no se encuentra el vehiculo, se informa al usuario
	public void buscarVehiculoPorMarca(String marca) {
		boolean encontrado = false;
		for (Vehiculo vehiculo : this.catalogoVehiculos) {
			if (vehiculo.getMarcaVehiculo().equals(marca)) {
				System.out.println(vehiculo);
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("No se encontraron vehículos de la marca " + marca + ".");
		}
	}

	// metodo buscarVehiculoPorModelo, si no se encuentra el vehiculo, se informa al usuario
	public void buscarVehiculoPorModelo(String modelo) {
		boolean encontrado = false;
		for (Vehiculo vehiculo : this.catalogoVehiculos) {
			if (vehiculo.getModeloVehiculo().equals(modelo)) {
				System.out.println(vehiculo);
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("No se encontraron vehículos del modelo " + modelo + ".");
		}
	}

	// metodo buscarVehiculoPorTipo, si no se encuentra el vehiculo, se informa al usuario
	public void buscarVehiculoPorTipo(String tipo) {
		boolean encontrado = false;
		for (Vehiculo vehiculo : this.catalogoVehiculos) {
			if (vehiculo.getTipoVehiculo().equals(tipo)) {
				System.out.println(vehiculo);
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("No se encontraron vehículos del tipo " + tipo + ".");
		}
	}

	// Los clientes pueden agregar vehículos a su carrito de compras del pedido y ver el subtotal.
	// metodo agregarVehiculoCarrito, si el vehiculo no existe en el catalogo, se informa al usuario
	public void agregarVehiculoCarrito(Vehiculo vehiculo) {
		if (this.catalogoVehiculos.contains(vehiculo)) {
			this.carritoCompras.agregarVehiculoCarrito(vehiculo);
		} else {
			System.out.println("El vehículo no existe en el catálogo.");
		}
	}

	// Los clientes pueden hacer una compra y proporcionar información de envío y pago.
	// metodo hacerCompra, si el carrito de compras está vacío, se informa al usuario
	public void hacerCompra(Compra compra) {
		if (this.carritoCompras.getVehiculosCarrito().isEmpty()) {
			System.out.println("El carrito de compras está vacío.");
		} else {
			compra.setCarritoCompras(this.carritoCompras);
			this.carritoCompras.vaciarCarrito();
			System.out.println(compra);
		}
	}
}