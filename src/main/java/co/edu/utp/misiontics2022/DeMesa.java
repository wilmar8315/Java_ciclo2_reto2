package co.edu.utp.misiontics2022;

public class DeMesa extends Computador{
    
    public double ram = 4;

    public DeMesa(double precioBase, double ram){
        this.precioBase=precioBase;
        this.ram=ram;
    }
    
    public DeMesa(double pantalla, double precioBase, double ram){
        this.pantalla=pantalla;
        this.precioBase=precioBase;
        this.ram=ram;
    }
    

    public double calcularPrecio(){


        double factor=0.9;
        
        if (ram>12){
            factor=1.3;}

        if(ram>=4 && ram<=12 ){
                factor=1.1; }
    
        double precioFinal = precioBase * (ano/2021) *( pantalla/16) * factor;
        return precioFinal;
        
    }
}

