package co.edu.uniquindio.clinica.modelo.factory;

import co.edu.uniquindio.clinica.modelo.Servicio;

import java.util.List;
import java.util.ArrayList;  // Importar ArrayList para inicializar la lista

public class SuscripcionBasica implements Suscripcion {
    private List<Servicio> serviciosDisponibles;  // Lista de servicios disponibles

    // Constructor que inicializa la lista de servicios
    public SuscripcionBasica() {
        serviciosDisponibles = new ArrayList<>();  // Inicializamos la lista
    }

    @Override
    public List<Servicio> getServiciosDisponibles() {
        return serviciosDisponibles;
    }

    @Override
    public void getFactura(Servicio servicio) {
        System.out.println("Factura:");
        System.out.println("Servicio: " + servicio.getNombre());
        System.out.println("Precio: $" + servicio.getPrecio());
        serviciosDisponibles.add(servicio);  // Agregar el servicio a la lista
    }

    @Override
    public double calcularTotal(Servicio servicio) {
        // Aquí debería ir la lógica de cálculo del precio total
        return 0;
    }

    public void agregarServicio(String nombre, double precio) throws Exception {
        validarServicio(nombre);  // Verifica que el servicio no exista

        // Creamos un nuevo servicio y lo agregamos a la lista de servicios
        Servicio servicio = Servicio.builder()
                .nombre(nombre)
                .precio(precio)
                .build();

        serviciosDisponibles.add(servicio);  // Agregar el servicio a la lista
    }

    private void validarServicio(String nombre) throws Exception {
        // Verifica si el servicio ya existe
        for (Servicio servicio : serviciosDisponibles) {
            if (servicio.getNombre().equalsIgnoreCase(nombre)) {
                throw new Exception("El servicio ya existe.");
            }
        }

        // Verifica si el nombre del servicio no es nulo o vacío
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El servicio no puede ser nulo o vacío.");
        }
    }
}