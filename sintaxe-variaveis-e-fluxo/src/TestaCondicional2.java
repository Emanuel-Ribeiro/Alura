
public class TestaCondicional2 
{
	public static void main(String[] args) 
	{
		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("Testando condicionais 2");
		
		if (idade >= 18 || acompanhado == true)
		{
			System.out.println("bem vindo");
		}
		
		else
		{	
			System.out.println("Acesso negado (voce tem menos de 18 anos)");
		}
	}
}
