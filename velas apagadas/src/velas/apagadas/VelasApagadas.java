/*JULIAN ESTEBAN MEDINA MUÑOZ
 */

package velas.apagadas;
import java.util.Scanner;
public class VelasApagadas {
    public int velasnum = 0, velasApa = 0;
    public int[] tamanoVelas = new int[100]; 
    public int maximo=tamanoVelas[0];
    public void setVelas(int x)
    {
            this.velasnum=x;
    }
     public int getVelas() {
            return this.velasnum;
     }
     public void tamano()  {
        
        for(int i=0;i<velasnum;i++)
        {
            tamanoVelas[i]= (int) (Math.random()*velasnum+1);
        }
            
    }
     public int gettamano()    {
            return this.tamanoVelas[100];
    }
    public void Imptamano()   {
        System.out.print("\n El tamaño de las velas : -> ");           
        for(int i=0;i<velasnum;i++)
        {
            System.out.print( + tamanoVelas[i] + " ");
        }
    }
    public void ApagarVelas()   {
        
        for(int i=0;i<velasnum;i++)
        {
            if (maximo<tamanoVelas[i])                
                maximo=tamanoVelas[i];                                      
        }
        for (int i=0; i<velasnum;i++)
        {
            if (maximo==tamanoVelas[i])
                    velasApa+=1;           
        }
        System.out.println("\nLas velas que se apagaron fueron: -> " + velasApa);
        
        
    }
        public static void main(String[] args) {
       Scanner Tec = new Scanner(System.in);
        VelasApagadas v = new VelasApagadas();
        int edad;
        System.out.println("\t\t\t\tPastel de cumpleaños\t\t\t\t");     
        System.out.println("\nIngrese la edad de la persona que cumple años\t");
        edad = Tec.nextInt();
        v.setVelas(edad);
        v.tamano();
        v.Imptamano();
        v.ApagarVelas();
        
        }
}
