package AgenciaTurismo.modelos;

import AgenciaTurismo.ClasesHerencia_Asociacion.ActividadPaqueteTuristico;
import java.awt.List;
import java.util.ArrayList;

public class PaqueteTuristico {

    private String nombre;
    private int id;
    private String destino;
    private String duracion;
    private double precio;
    private boolean comidaIncluida;
    private String TipoViaje;
    public ArrayList<ActividadPaqueteTuristico> actividades;


    public PaqueteTuristico( String nombre,String destino) {
        this.nombre=nombre;
        this.destino=destino;
    }
    
    public PaqueteTuristico() {
        this.actividades = new ArrayList<>();
    };

    public String getTipoViaje() {
        return TipoViaje;
    }

    public void setTipoViaje(String TipoViaje) {
        this.TipoViaje = TipoViaje;
    }

    public String getNombrePaquete() {
        return nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public int getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDestino() {
        return destino;
    }
    
    public void agregarActividad(String nombre, String descripcion) {
    ActividadPaqueteTuristico actividad = new ActividadPaqueteTuristico(nombre, descripcion);
    if (actividades.size() < 1) {
        this.actividades.add(actividad);
    } 
}
    
    public void setId(int id) {
        if (id > 0 && id <= 1000) {
            this.id = id;
        } else {
            System.out.println("ID inválido. Debe ser mayor que 0 y menor o igual a 1000.");
        }
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre inválido. Debe proporcionar un nombre válido.");
        }
    }

    public void setDestino(String destino) {
        if (destino != null && !destino.trim().isEmpty()) {
            this.destino = destino;
        }
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setPrecio(double precio) {
        if (precio > 0 && precio <= 10000) {
            this.precio = precio;
        }
    }

    public boolean isComidaIncluida() {
        return comidaIncluida;
    }

    public void setComidaIncluida(boolean comidaIncluida) {
        if (comidaIncluida || !comidaIncluida) {
            this.comidaIncluida = comidaIncluida;
        }
    }
    private int precioFinal = 0;

    public int calcularPrecio() {
        int precioFinal = (int) getPrecio();
        if (comidaIncluida) {
            precioFinal += 50;
        }
        if (TipoViaje == " Intraprovincial") {
            precioFinal += 10;
        }
        if (TipoViaje == "Interprovincial") {
            precioFinal += 25;
        }

        switch (duracion) {
            case "7 dias":
                precioFinal += 50;
                break;
            case "15 dias":
                precioFinal += 100;

                break;
            case "30 dias":
                precioFinal += 150;

                break;
            default:
                throw new AssertionError();

        }
        return precioFinal;
    }

    public int getPrecioFinal() {
        return calcularPrecio();
    }


    @Override
    public String toString() {
        return "\nID unico del Paquete Turistico: " + getId() + "\nNombre del Paquete Turistico: " + nombre + "\nEl lugar de viaje sera : " + destino
                + " \nDuración del viaje: " + duracion + "\nTipo de viaje: " + getTipoViaje()
                + " \nComida Incluida en el paquete : " + (comidaIncluida ? "Sí" : "No") + "\nPrecio base:" + precio + "\nDescripcion actividad: \n" + "Nombre de la actividad: "
                +"\n"+this.actividades.get(0).getNombre()+"\n"+"Descripcion de la Actividad:\n"+ this.actividades.get(0).getDescripcion()+"\nPrecio final del viaje:" + calcularPrecio();

    }

}
