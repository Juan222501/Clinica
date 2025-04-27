package co.edu.uniquindio.clinica.modelo.factory;

import co.edu.uniquindio.clinica.modelo.Servicio;

import java.util.List;

public class SuscripcionBasica implements Suscripcion {
    private List<Servicio> serviciosDisponibles;

    @Override
    public List<Servicio> getServiciosDisponibles() {
        return serviciosDisponibles;
    }

    @Override
    public void getFactura(Servicio servicio) {
        serviciosDisponibles.add(servicio);
    }

    @Override
    public double calcularTotal(Servicio servicio) {
        return 0;
    }
}
