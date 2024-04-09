public class Cliente {
    // atributos
    private String nombreCliente, apellidoCliente;
    private int runCliente;

    // constructor
    public Cliente(String nombreCliente, String apellidoCliente, int runCliente) {
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.runCliente = runCliente;
    }

    // getters y setters
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }
    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public int getRunCliente() {
        return runCliente;
    }
    public void setRunCliente(int runCliente) {
        this.runCliente = runCliente;
    }

    // metodos
    @Override
    public String toString() {
        return "Nombre: " + nombreCliente + "\n" +
                "Apellido: " + apellidoCliente + "\n" +
                "RUN: " + runCliente + "\n";
    }
}