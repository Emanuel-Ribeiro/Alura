public class TestaCondicional 
{
	public static void main(String[] args) 
	{
		int idade = 16;
		int quantidadePessoas = 3;
		
		System.out.println("Testando condicionais");
		
		if (idade >= 18)
		{
			System.out.println("voce tem mais de 18 anos seja bem vindo");
		}
		
		else
		{
			if(quantidadePessoas >= 2)
			{
				System.out.println("Voce nao tem 18 anos, mas pode entrar pois esta acompanhado");
			}
			
			else
			{
				System.out.println("Acesso negado (voce tem menos de 18 anos)");
			}
		}
	}
}
