/**
* Find LAST index of zero
*
* @param x array to search
* @return index of last 0 in x; -1 if absent
* @throws NullPointerException if x is null
*/

public class ejercicio2{

	static int resultado;
	public static void main(String[] args)
	{
		int[] numeros = {4,0,1,0,3};
		resultado = metodoPrincipal(numeros);
		pintar(resultado);
		int[] numeros2 = {4,4,1,2,3};
		resultado = metodoPrincipal(numeros2);
		int[] numeros3 = {4,0,1,2,3};
		resultado = metodoPrincipal(numeros3);
		pintar(resultado);		
		resultado = metodoPrincipal(null);


	}
	
	public static int lastZero (int[] x)
	{
		int cont = -1;
		for (int i = 0; i < x.length; i++)
		{
			if (x[i] == 0)
			{
				cont = i;
			}
		}
		return cont;
	}
	
	public static int metodoPrincipal (int[] x)
	{
		try{
			int c = lastZero(x);	

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
			System.out.println("La posición del último cero del array es: " + c);
		}else{
			System.out.println("El array no contiene ningún cero");
		}
	}


}
