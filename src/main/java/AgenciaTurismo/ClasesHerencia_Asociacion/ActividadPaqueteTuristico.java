/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgenciaTurismo.ClasesHerencia_Asociacion;

/**
 *
 * @author USER
 * 
 */
public class ActividadPaqueteTuristico {

    private String nombre;
    private String descripcion;

    public ActividadPaqueteTuristico(String nombre, String descripcion ) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public ActividadPaqueteTuristico(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
