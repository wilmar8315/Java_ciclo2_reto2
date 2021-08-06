package co.edu.utp.misiontics2022;

public class PrecioTotal{
       
    public double totalComputadores;
    public double totalPortatiles;
    public double totalDeMesa;
    public Computador listaComputadores[];
    

    public PrecioTotal(Computador[] listaComputadores){
        this.totalComputadores=0.0;
        this.totalPortatiles=0.0;
        this.totalDeMesa=0.0;
        this.listaComputadores=listaComputadores;
    
    }


    public void mostrarTotales(){
    
        for (Computador pc:listaComputadores ){

            if(pc instanceof Computador){
               totalComputadores+=pc.calcularPrecio();
            }

            if(pc instanceof Portatil){
                totalPortatiles=totalPortatiles+pc.calcularPrecio();
            }

            if(pc instanceof DeMesa){
                totalDeMesa=totalDeMesa+pc.calcularPrecio();
            }
        }
        
             
         System.out.println("La suma del precio de los computadores es de "+totalComputadores);
         System.out.println("La suma del precio de los portatiles es de " +totalPortatiles);
         System.out.println("La suma del precio de los de mesa es de " +totalDeMesa);
        
      
    }             
}


