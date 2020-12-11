/**
* Find last index of element
*
* @param x array to search
* @param y value to look for
* @return last index of y in x; -1 if absent
* @throws NullPointerException if x is null
*/
public class ejercicio3{

	static int resultado;
	static int dato;
	public static void main(String[] args)
	{
		dato = 1;
		int[] numeros = {4,0,1,0,3};
		resultado = metodoPrincipal(numeros,dato);
		pintar(dato,resultado);
		dato = 0;
		resultado = metodoPrincipal(numeros,dato);
		pintar(dato,resultado);
		dato = 4;
		resultado = metodoPrincipal(numeros,dato);
		pintar(dato,resultado);
		dato = 8;
		resultado = metodoPrincipal(numeros,dato);
		pintar(dato,resultado);
		resultado = metodoPrincipal(null,dato);
		pintar(dato,resultado);

	}
	
	public static int findLast (int[] x, int y)
	{
		for (int i=x.length-1; i >= 0; i--)
		{
			if (x[i] == y)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static int metodoPrincipal (int[] x,int num)
	{
		try{
			int c = findLast(x,num);	
			return c;
		} catch (NullPointerException e) {
			System.out.println("Valores erroneos en el array");
			e.printStackTrace();
			return 0;
		}		
	}
	public static void pintar(int dat, int c)
	{
		if (c!= -1)
		{
			System.out.println("La posición del número " + dat + " en el array es " + c);
		}else{
			System.out.println("El número introducido no está en el array");
		}
	}

}
