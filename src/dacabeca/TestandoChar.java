package dacabeca;

public class TestandoChar
{
	public static void main(String[] args)
	{
		String texto = "matias";
		char[] vetorTexto = new char[texto.length()];
		int[] vetorCodigos = new int[texto.length()];
		for(int i = 0; i < texto.length(); i++)
		{
			vetorCodigos[i] = texto.codePointAt(i) + 3;
			vetorTexto[i] = (char) vetorCodigos[i];
			System.out.print(vetorTexto[i]);
		}
		System.out.println();
	}
}