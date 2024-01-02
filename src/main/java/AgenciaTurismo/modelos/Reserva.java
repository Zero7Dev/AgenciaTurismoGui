package AgenciaTurismo.modelos;

import java.util.ArrayList;

public class Reserva {

    private String idReserva;
    private String cedula;
    private String correo;
    private String pasajero;
    private int dia;    private int mes;
    private int año;
    private String equipaje;
    public String paqueteSeleccionado;
    public PaqueteTuristico paqueteTuristico;

    public Reserva() {
    }

    public void CrearPaquete(String nombrePaquete) {
        switch (nombrePaquete) {
            case "Costa":
                this.paqueteTuristico = new PaqueteTuristico("Costa", "Manabí");
                break;
            case "Sierra":
                this.paqueteTuristico = new PaqueteTuristico("Sierra", "Ibarra");
                break;
            case "Oriente":
                this.paqueteTuristico = new PaqueteTuristico("Oriente", "Puyo");
                break;
            default:
                throw new AssertionError();
        }
    }

    public Reserva(int dia, int mes, int año, String correo) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.correo = correo;

    }

    public String getIdReserva() {
        return idReserva;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPasajero() {
        return pasajero;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public String getEquipaje() {
        return equipaje;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setPasajero(String pasajero) {
        this.pasajero = pasajero;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setEquipaje(String equipaje) {
        this.equipaje = equipaje;
    }

    @Override
    public String toString() {
        return "\nReserva: " + "\nIdReserva: " + idReserva + "\nCedula: " + cedula + "\nCorreo: " + correo + "\nPasajero: " + pasajero + "\nDia: " + dia + "\nMes: " + mes + "\nAnio: " + año + "\nEquipaje: " + equipaje
                + "\nNombre del Paquete Turistico: " + this.paqueteTuristico.getNombrePaquete() + "\nEl lugar de viaje sera : " + this.paqueteTuristico.getDestino();
    }

}
