package miproyecto.appticorentcar.capalogica;

/**
 * @author Isaac Serrano , cedula 208330122
 */
public class Agencia {

    private Auto[] autos;
    private Alquiler[][] alquileres;

    public Agencia() {
        autos = new Auto[10];
        alquileres = new Alquiler[10][5]; // Inicializa la matriz antes de llenarla

        autos[0] = new Auto("1000", "Toyota Corolla", 2010, "Automovil", "Rojo", 10000, true);
        autos[1] = new Auto("2000", "Honda CRV", 2005, "Doble Traccion", "Azul", 200000, true);
        autos[2] = new Auto("3000", "Hyundai Elantra", 2009, "Doble Traccion", "Gris", 20000, true);
        autos[3] = new Auto("4000", "Honda Accord", 2008, "Automovil", "Verde", 100000, true);
        autos[4] = new Auto("5000", "Nissan Xtrail", 2004, "Doble Traccion", "Negro", 100000, true);
        autos[5] = new Auto("6000", "Nissan Pathfinder", 2005, "Doble Traccion", "Amarillo", 50000, true);
        autos[6] = new Auto("7000", "Toyota Yaris", 2011, "Automovil", "Azul", 5000, true);
        autos[7] = new Auto("8000", "Nissan Pathfinder", 2010, "Doble Traccion", "Negro", 2000, true);
        autos[8] = new Auto("9000", "Toyota Rave For", 2009, "Doble Traccion", "Anaranjado", 15000, true);
        autos[9] = new Auto("10000", "Honda Accord", 2011, "Automovil", "Blanco", 2000, true);
    }

    public Auto[] getAutos() {
        return autos;
    }

    public Alquiler[][] getAlquileres() {
        return alquileres;
    }

    public void mostrarAutos() {
        System.out.println("Lista de Autos de la Agencia:");
        for (Auto auto : autos) {
            System.out.println(auto);
        }
    }

    public int buscarAutoPorPlaca(String placa) {
        for (int i = 0; i < autos.length; i++) {
            if (autos[i].getPlaca().equals(placa)) {
                return i;
            }
        }
        return -1;
    }
//para ver si el auto ha sido alquilado y a quien

    public void mostrarAlquileresAuto(String placa) {
        int fila = buscarAutoPorPlaca(placa);
        if (fila == -1) {
            System.out.println("Auto no encontrado con esa placa.");
        } else {
            System.out.println("Información del Auto:");
            System.out.println(autos[fila]);
            System.out.println("Historial de alquileres:");
            for (int j = 0; j < 5; j++) {
                if (alquileres[fila][j] != null) {
                    System.out.println(alquileres[fila][j]);
                } else {
                    System.out.println("Sin alquiler #" + (j + 1));
                }
            }
        }
    }

    public void agregarAlquiler(int indiceAuto, Alquiler nuevoAlquiler) {
        for (int j = 0; j < 5; j++) {
            if (alquileres[indiceAuto][j] == null) {
                alquileres[indiceAuto][j] = nuevoAlquiler;
                return;
            }
        }
        // Si todos están ocupados, sobreescribe el más antiguo y reinicia en la columna 
        alquileres[indiceAuto][0] = nuevoAlquiler;
    }

    public int obtenerIndiceAuto(String placa) {
        return buscarAutoPorPlaca(placa);
    }
//verificar si un auto está actualmente alquilado.

    public Alquiler buscarAlquilerPendiente(String placa) {

        int fila = buscarAutoPorPlaca(placa);
        if (fila == -1) {
            return null;
        }

        for (int j = 4; j >= 0; j--) {
            Alquiler alquiler = alquileres[fila][j];
            if (alquiler != null && alquiler.isPendiente()) {
                return alquiler;
            }
        }
        return null;
    }
//es para la duración de un alquiler.

    public int calcularDiasEntreFechas(int diaInicio, int mesInicio, int annoInicio,
            int diaFin, int mesFin, int annoFin) {
        int diasInicio = diaInicio + (mesInicio * 30) + (annoInicio * 365);
        int diasFin = diaFin + (mesFin * 30) + (annoFin * 365);
        return diasFin - diasInicio;
    }

    public void liberarAuto(String placa) {
        int i = buscarAutoPorPlaca(placa);
        if (i != -1) {
            autos[i].setEstado(true);
            autos[i].setCedulaCliente("Sin cliente");
            autos[i].setNombreCliente("Sin cliente");
            autos[i].setTipoCliente(Auto.CLIENTE_SIN_REGISTRO);
        }

    }
}
