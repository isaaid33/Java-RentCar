package miproyecto.appticorentcar.capalogica;

/**
 * @author Isaac Serrano, Cédula 208330122
 */
public class Auto {

    public static final int CLIENTE_SIN_REGISTRO = 0;
    public static final int CLIENTE_REGULAR = 1;
    public static final int CLIENTE_CORPORATIVO = 2;

    private String placa;
    private String marca;
    private int modelo;
    private String tipoAuto;
    private String color;
    private int kilometraje;
    private boolean estado;
    private String cedulaCliente;
    private String nombreCliente;
    private int tipoCliente;

    public Auto(String placa, String marca, int modelo, String tipoAuto, String color, int kilometraje, boolean estado) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoAuto = tipoAuto;
        this.color = color;
        this.kilometraje = kilometraje;
        this.estado = estado;
        this.cedulaCliente = "Sin cliente";
        this.nombreCliente = "Sin cliente";
        this.tipoCliente = CLIENTE_SIN_REGISTRO;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(int tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return String.format("Auto {Placa: %s, Marca: %s, Modelo: %d, Tipo: %s, Color: %s, KM: %d, Estado: %s, Cliente: %s (%s)}",
                placa, marca, modelo, tipoAuto, color, kilometraje,
                estado ? "Libre" : "Ocupado",
                nombreCliente,
                tipoCliente == CLIENTE_REGULAR ? "Regular"
                        : tipoCliente == CLIENTE_CORPORATIVO ? "Corporativo" : "Sin cliente"
        );
    }

}
