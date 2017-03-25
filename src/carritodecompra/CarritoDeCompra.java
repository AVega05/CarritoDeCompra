
package carritodecompra;


public class CarritoDeCompra {
    

    //Atri
    public int precioProductos[]={5500,6400,3900,1000,500};
    public int cantidadProductos[]= new int[5];
    public double costoxProductos[]= new double[5];
    public double Total=0;    
    //Met
  
    
    public void cantidadProductos(int Num1, int Num2){
        
        this.cantidadProductos[Num2]=Num1;
                
    }
        
    public void costoporProductos(int Num3, double Num4){
    
        this.costoxProductos[Num3]=Num4;
    }
    
    

}

    
    
   
