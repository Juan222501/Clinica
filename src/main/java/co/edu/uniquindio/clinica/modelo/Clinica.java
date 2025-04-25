package co.edu.uniquindio.clinica.modelo;

import java.util.LinkedList;
import java.util.List;

public class Clinica {
    private List<Paciente> pacientes;
    private List<Cita> citas;
    private List<Servicio> servicios;

    public boolean registrarPaciente(Paciente paciente) {
        if(pacientes == null) {
            pacientes = new LinkedList<>();
        }
        for (Paciente p : pacientes) {
            if(p.getCedula().equals(paciente.getCedula())) {
                return false;
            }
        }

        pacientes.add(paciente);
        return true;
    }

    public boolean registrarServicio(Servicio servicio) {
        if(servicios == null) {
            servicios = new LinkedList<>();
        }
        for (Servicio s : servicios) {
            if(s.getId().equals(servicio.getId())) {
                return false;
            }
        }
        servicios.add(servicio);
        return true;
    }

    public boolean registrarCita(Cita cita) {
        if(citas == null) {
            citas = new LinkedList<>();

        }
        for (Cita c : citas) {
            if(c.getId().equals(cita.getId())) {
                return false;
            }
        }
        citas.add(cita);
        return true;
    }

    public Factura generarFactura(String Paciente,List<Servicio> servicios) {
        Paciente paciente=null;
        for(Paciente p : pacientes) {
            if(p.getCedula().equals(Paciente)) {
                paciente = paciente;
                break;
            }
        }
        if(paciente == null) {
            throw new RuntimeException("No se encontro el paciente");
        }

        String idFactura = "F" + (facturas.size() +1 );

        Factura factura  = new Factura();

        facturas.add(factura);

        return  factura;

    }
}
