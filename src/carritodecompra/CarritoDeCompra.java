
package carritodecompra;


public class CarritoDeCompra {
    

    //Atri
    public int precioProductos[]={5500,6400,3900,1000,500};
    public double cantidadProductos[]= new double[5];
    public double costoxProductos[]= new double[5];
    public double Total=0;  
    public double Vuelto=0;
    
    //Met
  
    
    public void cantidadProductos(int Num1, int Num2){
        
        this.cantidadProductos[Num2]=Num1;
                
    }
        
    public void costoporProductos(int Num3, double Num4){
    
        this.costoxProductos[Num3]=Num4;
    }
    
    public void agregarProductos(int Num5,int Num6){
        
        this.cantidadProductos[Num5]=cantidadProductos[Num5]+Num6;
    }
    
    public void quitarProductos(int Num7,int Num8){
        
        this.cantidadProductos[Num7]=cantidadProductos[Num7]-Num8;
    }

}

    
    
   
