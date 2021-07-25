package dacabeca;

public class TestandoStrings
{
	public static void main(String[] args)
	{
		String texto = "matias";
		
		//Retorna a letra que está na posição passada como parâmetro
		System.out.println(texto.charAt(0));
		
		//Retorna o código da letra. Variando de 0 a length - 1
		System.out.println(texto.codePointAt(0));
		
		//Retorna o código da letra. Variando de 1 a length
		System.out.println(texto.codePointBefore(1));
		
		//Retorna a diferença do segundo parâmetro com o primeiro
		System.out.println(texto.codePointCount(0, 0));
		
		//Não sei como funciona, ainda!
		System.out.println(texto.compareTo("manoel"));
		
		//Não sei como funciona, ainda!
		System.out.println(texto.compareToIgnoreCase("mAtIaS"));
		
		//Concatena as Strings
		System.out.println(texto.concat(texto));
		char codigo = '8';
		System.out.println(codigo);
	}
}