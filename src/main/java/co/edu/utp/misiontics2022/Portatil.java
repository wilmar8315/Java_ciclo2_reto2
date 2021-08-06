package co.edu.utp.misiontics2022;

public class  Portatil extends Computador {

    public boolean tarjetaDeVideo = false;
    double factor=1.0;

    public Portatil(double precioBase, boolean tarjetaDeVideo){
        this.precioBase=precioBase;
        this.tarjetaDeVideo = tarjetaDeVideo;
    }
    
    public Portatil(double pantalla, double precioBase, boolean tarjetaDeVideo){
        this.pantalla=pantalla;
        this.precioBase=precioBase;
        this.tarjetaDeVideo = tarjetaDeVideo;
    }   

    public Portatil(double ano, double pantalla, double precioBase, boolean tarjetaDeVideo){
        this.ano=ano;
        this.pantalla=pantalla;
        this.precioBase=precioBase;
        this.tarjetaDeVideo = tarjetaDeVideo;
    }

    public double calcularPrecio(){

        double factor=1.0;

        if (tarjetaDeVideo==true){
            factor= 1.2;}
           
        double precioFinal = precioBase * (ano/2021) *( pantalla/16) * factor;
        return precioFinal;
    }
    
}
