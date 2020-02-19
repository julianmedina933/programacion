package sumatoria.numeros.impares;
import java.util.Scanner;
public class
SumatoriaNumerosImpares {
public static void main(String[] args)
{
Scanner muetra =new Scanner(System.in);
System.out.println("Suma de numeros impares de 1 hasta 100 ");

long acumulador=1;
acumulador = 100+1;
acumulador =acumulador/2;
acumulador=acumulador*acumulador;
System.out.println("La suma de los numeros impares de 1 a 100 es :"+acumulador );
}
}