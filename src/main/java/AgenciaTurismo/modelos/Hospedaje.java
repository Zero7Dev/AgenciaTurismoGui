
package AgenciaTurismo.modelos;
public class Hospedaje  {

    private boolean Reservar;
    private String hoteles;
    private int NumeroHabitaciones,NumeroCedula,NumeroTelefono;
    private int precioFinal = 0;
     
    public Hospedaje(){
    }
    
    public Hospedaje(int NumeroCedula, int NumeroTelefono, boolean Reservar, int NumeroHabitaciones) {
        this.NumeroCedula = NumeroCedula;
        this.NumeroTelefono = NumeroTelefono;
        this.Reservar = Reservar;
        this.NumeroHabitaciones = NumeroHabitaciones;
    }

    public int getNumeroCedula() {
        return NumeroCedula;
    }

    public int getNumeroTelefono() {
        return NumeroTelefono;
    }

    public boolean getReservar() {
        return Reservar;
    }

    public String getHoteles() {
        return hoteles;
    }

    public int getNumeroHabitaciones() {
        return NumeroHabitaciones;
    }

    public void setNumeroCedula(int NumeroCedula) {
        if (NumeroCedula > 0 && String.valueOf(NumeroCedula).length() == 9) {
        this.NumeroCedula = NumeroCedula;
    } else {
        System.out.println("cedula incorrecta");
    }
    }

    public void setNumeroTelefono(int NumeroTelefono) {
       
           this.NumeroTelefono=NumeroTelefono; 
           
        
    }

    public void setReservar(boolean Reservar) {
        if (Reservar || !Reservar) {
            this.Reservar = Reservar;
        }
    }

    public void setHoteles(String hoteles) {
        this.hoteles = hoteles;
    }
    
    public void setNumeroHabitaciones(int NumeroHabitaciones) {
             precioFinal=0;
       if (NumeroHabitaciones == 2) {
        precioFinal += 20;
    } else if (NumeroHabitaciones == 3) {
        precioFinal += 40;
    } else if (NumeroHabitaciones == 4) {
        precioFinal += 50;
    } else if (NumeroHabitaciones == 5) {
        precioFinal += 60;
    }
       this.NumeroHabitaciones = NumeroHabitaciones;
    }

   public int Calcularprecio(){
   
    if (hoteles.equalsIgnoreCase("Hotel economico")) {
        precioFinal += 100;
    } else if (hoteles.equalsIgnoreCase("Hotel de lujo")) {
        precioFinal += 250;
    } else if (hoteles.equalsIgnoreCase("Hotel Vip")) {
        precioFinal += 300;
    }

         return precioFinal;
   }
    public int getprecioFinal() {
        return Calcularprecio();
    }

   @Override
    public String toString() {
        return "\nDATOS DE LA RESERVACION DE HOSPEDAJE" + "\nNumeroCedula=" + getNumeroCedula() + "\nNumeroTelefono=" 
                + getNumeroTelefono() + "\nhoteles=" + getHoteles() + "\nNumeroHabitaciones=" +
                getNumeroHabitaciones()+"\nReservar=" + getReservar() + "\nprecioFinal=" + Calcularprecio();
}
   
}
