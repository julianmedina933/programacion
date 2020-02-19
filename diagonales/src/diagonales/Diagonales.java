/*JULIAN ESTEBAN MEDINA MUÑOZ */
import java.util.Scanner;
public class Diagonales 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        int n,m;
        int resul1=0, resul2=0;
        System.out.println("PROGRAMA QUE SUMA LAS DIAGONALES DE UNA MATRIZ Y LUEGO LAS RESTA ENTRE SI");
        System.out.print("digite la dimension de la matriz: ");
        n = teclado.nextInt();
        m = n;
        int matriz[][] = new int[n][m]; 
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<m;k++)
            {
                System.out.print("digite el numero ["+i+"]["+k+"] : ");
                matriz[i][k] = teclado.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<m;k++)
            {
                System.out.print(matriz[i][k]+"   ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<m;k++)
            {
                if(i==k)
                {
                    resul1+=matriz[i][k];
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<m;k++)
            {
                if((i+k)==n-1)
                {
                    resul2+=matriz[i][k];
                }
            }
        }
        System.out.println("la suma de la diagnoal principal es: "+resul1);
        System.out.println("la suma de la diagnoal secundaria es: "+resul2);
        System.out.println("la diferencia entre las 2 diagonales es: "+(resul2-resul1));
    }
}