package dacabeca;

import java.util.Scanner;

public class TestandoCodePointAt
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um texto:");
		String texto = sc.nextLine();
		int[] codigos = new int[texto.length()];
		for(int i = 0; i < texto.length(); i++)
		{
			codigos[i] = texto.codePointAt(i);
			if(i < (texto.length() - 1))
			{
				System.out.print(codigos[i] + " ");
			}
			else
			{
				System.out.println(codigos[i]);
			}
		}
		sc.close();
	}
}