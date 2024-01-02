/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgenciaTurismo.modelos;

import AgenciaTurismo.ClasesHerencia_Asociacion.Persona;

/**

 * @author ALEJANDRA
 */
public class Cliente extends Persona {
     private String cedula;
    private int edad;
    private String telefono;
    private String correo;
    private String tipoCliente;
    private String discapacidad;

    public Cliente(){};
    public Cliente(String cedula, int edad, String telefono, String correo, String tipoCliente, String discapacidad) {
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.tipoCliente = tipoCliente;
        this.discapacidad = discapacidad;
    }


    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        if (cedula.equals('0') && cedula.isEmpty() && cedula.length() < 1) {
            System.out.println("Cédula no válida");
        } else {
            this.cedula = cedula;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        
            this.telefono = telefono;
        
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        
    if (correo != null && correo.length() > 5) {
            this.correo = correo;
        }
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String isDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }
    
    //calculo
    //

    //

    @Override
    public String toString() {
        return  super.toString()+"\nCedula: " + cedula + "\nEdad: " + edad + "\nTelefono: " + telefono + "\nCorreo: " + correo + "\nTipo de Cliente: " + tipoCliente + "\nDiscapacidad: " + discapacidad ;
    }

    
}