package miproyecto.appticorentcar.capalogica;

/**
 * @author Isaac Serrano, Cédula 208330122
 */
public class Alquiler {

    private String placa;
    private int diaAlquiler, mesAlquiler, annioAlquiler;
    private int diaDevolEsperada, mesDevolEsperada, annioDevolEsperada;
    private int diaDevolucionReal, mesDevolucionReal, annioDevolucionReal;
    private int kmInicial, kmFinal;
    private double montoSeguroObligatorio, montoSeguroTerceros, montoPorKilometraje, montoPorDias;
    private boolean pendiente;

    public Alquiler(String placa, int diaAlquiler, int mesAlquiler, int annioAlquiler, int diaDevolEsperada, int mesDevolEsperada, int annioDevolEsperada, int diaDevolucionReal, int mesDevolucionReal, int annioDevolucionReal, double montoSeguroObligatorio, double montoSeguroTerceros, int kmInicial, int kmFinal, boolean pendiente) {
        this.placa = placa;
        this.diaAlquiler = diaAlquiler;
        this.mesAlquiler = mesAlquiler;
        this.annioAlquiler = annioAlquiler;
        this.diaDevolEsperada = diaDevolEsperada;
        this.mesDevolEsperada = mesDevolEsperada;
        this.annioDevolEsperada = annioDevolEsperada;
        this.diaDevolucionReal = diaDevolucionReal;
        this.mesDevolucionReal = mesDevolucionReal;
        this.annioDevolucionReal = annioDevolucionReal;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.montoSeguroObligatorio = montoSeguroObligatorio;
        this.montoSeguroTerceros = montoSeguroTerceros;
        this.montoPorKilometraje = montoPorKilometraje;
        this.montoPorDias = montoPorDias;
        this.pendiente = pendiente;
    }

    // Getters y Setters...
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(int kmInicial) {
        this.kmInicial = kmInicial;
    }

    public int getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(int kmFinal) {
        this.kmFinal = kmFinal;
    }

    public double getMontoSeguroObligatorio() {
        return montoSeguroObligatorio;
    }

    public void setMontoSeguroObligatorio(double montoSeguroObligatorio) {
        this.montoSeguroObligatorio = montoSeguroObligatorio;
    }

    public double getMontoSeguroTerceros() {
        return montoSeguroTerceros;
    }

    public void setMontoSeguroTerceros(double montoSeguroTerceros) {
        this.montoSeguroTerceros = montoSeguroTerceros;
    }

    public double getMontoPorKilometraje() {
        return montoPorKilometraje;
    }

    public void setMontoPorKilometraje(double montoPorKilometraje) {
        this.montoPorKilometraje = montoPorKilometraje;
    }

    public double getMontoPorDias() {
        return montoPorDias;
    }

    public void setMontoPorDias(double montoPorDias) {
        this.montoPorDias = montoPorDias;
    }

    public boolean isPendiente() {
        return pendiente;
    }

    public void setPendiente(boolean pendiente) {
        this.pendiente = pendiente;
    }

    @Override
    public String toString() {
        return String.format(
                "Placa: %s\n"
                + "Fecha Alquiler: %02d/%02d/%d\n"
                + "Devolución Esperada: %02d/%02d/%d\n"
                + "Devolución Real: %02d/%02d/%d\n"
                + "KM Inicial: %d\n"
                + "KM Final: %d\n"
                + "Seguro INS: %.2f\n"
                + "Seguro Terceros: %.2f\n"
                + "Monto x KM: %.2f\n"
                + "Monto x Días: %.2f\n"
                + "Pendiente: %s",
                placa, diaAlquiler, mesAlquiler, annioAlquiler,
                diaDevolEsperada, mesDevolEsperada, annioDevolEsperada,
                diaDevolucionReal, mesDevolucionReal, annioDevolucionReal,
                kmInicial, kmFinal, montoSeguroObligatorio, montoSeguroTerceros,
                montoPorKilometraje, montoPorDias, pendiente ? "Sí" : "No"
        );
    }

    public int getDiaAlquiler() {
        return diaAlquiler;
    }

    public int getMesAlquiler() {
        return mesAlquiler;
    }

    public int getAnnioAlquiler() {
        return annioAlquiler;
    }

    public void setDiaDevolucionReal(int diaDevolucionReal) {
        this.diaDevolucionReal = diaDevolucionReal;
    }

    public void setMesDevolucionReal(int mesDevolucionReal) {
        this.mesDevolucionReal = mesDevolucionReal;
    }

    public void setAnnioDevolucionReal(int annioDevolucionReal) {
        this.annioDevolucionReal = annioDevolucionReal;
    }

    public double getMontoTotal() {
        return montoSeguroObligatorio + montoSeguroTerceros + montoPorDias + montoPorKilometraje;
    }

    public int getDiaDevolucionReal() {
        return diaDevolucionReal;
    }

    public int getMesDevolucionReal() {
        return mesDevolucionReal;
    }

    public int getAnnioDevolucionReal() {
        return annioDevolucionReal;
    }

}
