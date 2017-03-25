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
        System.out.println("El costo total parcial es de "+cdc.Total+" pesos");
        
        int x;
        x=0;
        while(x==0){
        System.out.println("si desea agregar productos presione |1|, si desea quitar productos presione |2|, si desea pagar presione |3|");
           
        x=ent.nextInt();
        switch(x){
            case 1:
            {
                for(int t=0;t<5;t++){
                System.out.println("cuantos productos "+(t+1)+" desea agregar");
                cc.setNum1(cdc.cantidadProductos[t]);
                cc.setNum2(ent.nextInt());
                cdc.cantidadProductos[t]=cc.sumar();            
                }

            for(int w=0;w<5;w++){
                cc.setNum1(cdc.precioProductos[w]);
                cc.setNum2(cdc.cantidadProductos[w]);
                cdc.costoporProductos(w,cc.multiplicar());
                }

            cdc.Total=0;
            for(int r=0;r<5;r++){
                cc.setNum1(cdc.Total);
                cc.setNum2(cdc.costoxProductos[r]);
                cdc.Total=cc.sumar();            
                }
            System.out.println("El costo total es de "+cdc.Total+" pesos");
            x=0;
            break;
            }
        
        case 2:
        {   
            for(int t=0;t<5;t++){
            System.out.println("cuantos productos "+(t+1)+" desea quitar");
            cc.setNum1(cdc.cantidadProductos[t]);
            cc.setNum2(ent.nextInt());
            cdc.cantidadProductos[t]=cc.restar();
            }
            for(int w=0;w<5;w++){
                cc.setNum1(cdc.precioProductos[w]);
                cc.setNum2(cdc.cantidadProductos[w]);
                cdc.costoporProductos(w,cc.multiplicar());
            }

            cdc.Total=0;
            for(int r=0;r<5;r++){            
                cc.setNum1(cdc.Total);
                cc.setNum2(cdc.costoxProductos[r]);
                cdc.Total=cc.sumar();            
            }
            System.out.println("El costo total es de "+cdc.Total+" pesos");
            x=0;
            break;
            }
        case 3:{
            System.out.println("Con cuanto desea cancelar");
            cc.setNum1(ent.nextInt());
            cc.setNum2(cdc.Total);
            cdc.Vuelto=cc.restar();
            System.out.println("su cambio seria de "+cdc.Vuelto+" pesos");
            break;
            
        }
        }
}}
}







    

    

