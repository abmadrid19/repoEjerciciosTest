/**
* Count odd or positive elements in an array
*
* @param x array to search
* @return count of odd or positive elements in x
* @throws NullPointerException if x is null
*/

public class ejercicio4{

	static int resultado;
	static int dato;
	public static void main(String[] args)
	{
		int[] numeros = {4,0,1,0,3};
		resultado = metodoPrincipal(numeros);
		pintar(resultado);
		int[] numeros2 = {-1,0,2,3};
		resultado = metodoPrincipal(numeros2);
		pintar(resultado);
		int[] numeros3 = {-1,-3};
		resultado = metodoPrincipal(numeros3);
		pintar(resultado);
		int[] numeros4 = {-2,-4};
		resultado = metodoPrincipal(numeros4);
		pintar(resultado);
		resultado = metodoPrincipal(null);
		
	}

	public static int oddOrPos (int[] x)
	{
		int count = 0;
		for (int i = 0; i < x.length; i++)
		{
			if (x[i]%2 == 1 || x[i] > 0 || x[i]%2 == -1)
			{
				count++;
			}
		}
		return count;
	}
	
	public static int metodoPrincipal (int[] x)
	{
		try{
			int c = oddOrPos(x);	
			return c;
		} catch (NullPointerException e) {
			System.out.println("Valores erroneos en el array");
			e.printStackTrace();
			return 0;
		}		
	}
	public static void pintar(int c)
	{
		if (c!= -1)
		{
			System.out.println("El número de valores impares o positivos del array es " + c);
		}else{
			System.out.println("El número introducido no está en el array");
		}
	}

}

