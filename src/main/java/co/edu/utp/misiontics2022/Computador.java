package co.edu.utp.misiontics2022;

public class Computador{
  
    protected double ano = 2019;
    protected double pantalla = 16;
    protected double precioBase = 1570500;
    

    public Computador(){
    }

    public Computador(double precioBase){
        this.precioBase=precioBase;}

    public Computador(double pantalla, double precioBase){
        this.pantalla=pantalla;
        this.precioBase=precioBase;}
        
    public Computador( double pantalla,double ano, double precioBase){
        this.ano=ano;
        this.pantalla=pantalla;
        this.precioBase=precioBase;}
       
    public double calcularPrecio(){
       
        double factor=1;
        double precioFinal = precioBase * (ano/2021) *( pantalla/16) * factor;
        return precioFinal;}
    }
