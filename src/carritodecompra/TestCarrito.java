package carritodecompra;
import java.util.Scanner;


public class TestCarrito {
    static Scanner ent = new Scanner(System.in);
    

public static void main(String[] args) {
    
    CarritoDeCompra cdc = new CarritoDeCompra();
    CalculadoraCarrito cc = new CalculadoraCarrito();
    
        for(int q=0;q<5;q++){        
            System.out.println("Cantidad de productos "+(q+1));
            cdc.cantidadProductos(ent.nextInt(),q);
        }
                
        for(int w=0;w<5;w++){
            cc.setNum1(cdc.precioProductos[w]);
            cc.setNum2(cdc.cantidadProductos[w]);
            cdc.costoporProductos(w,cc.multiplicar());
        }
        
        
        for(int r=0;r<5;r++){
            cc.setNum1(cdc.Total);
            cc.setNum2(cdc.costoxProductos[r]);
            cdc.Total=cc.sumar();
            
        }
        System.out.println("El costo total es de "+cdc.Total+" pesos");
        
        




}

}
    

    

