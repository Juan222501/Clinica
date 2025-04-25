package co.edu.uniquindio.clinica.modelo.factory;

import co.edu.uniquindio.clinica.modelo.Servicio;

import java.util.List;

public class SuscripcionPremium implements Suscripcion {

    @Override
    public void getFactura(Servicio servicio) {

    }

    @Override
    public List<Servicio> getServiciosDisponibles() {
        return List.of();
    }
}
