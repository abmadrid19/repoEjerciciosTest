/**
* Counts positive elements in array
*
* @param x array to search
* @return number of positive elements in x
* @throws NullPointerException if x is null
*/

public class ejercicio1{

	static int resultado;
	public static void main(String[] args)
	{
		int[] numeros = {0,0,0};
		resultado = metodoPrincipal(numeros);
		int[] numeros2 = {-1,-8,-4};
		resultado = metodoPrincipal(numeros2);
		int[] numeros3 = {2,2,5};
		resultado = metodoPrincipal(numeros3);
		resultado = metodoPrincipal(null);
	}

	public static int countPositive (int[] x)
	{
		int count = 0;
	
		for (int i=0; i < x.length; i++)
		{
			if (x[i] >= 0)
			{
				count++;
			}
		}
		return count;
	}
	public static int metodoPrincipal (int[] x)
	{
		try{
			int c = countPositive(x);
			System.out.println("El total de números positivos es: " + c);
			return c;
		} catch (NullPointerException e) {
			System.out.println("Valores erroneos en el array");
			e.printStackTrace();
			return 0;
		}		
	}
}
