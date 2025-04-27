package co.edu.uniquindio.clinica.modelo.factory;

import co.edu.uniquindio.clinica.modelo.Servicio;
import co.edu.uniquindio.clinica.modelo.enume.TipoDescueto;

import java.util.List;
//Abstarct Factory Method
public abstract class SuscripcionFactory{
    public abstract Suscripcion crearSuscripcion();
    public double calcularTotal(Servicio servicio, TipoDescuento tipoDescuento)


}
