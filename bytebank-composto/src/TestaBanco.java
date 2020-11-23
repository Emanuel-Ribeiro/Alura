
public class TestaBanco 
{
	public static void main(String[] args) 
	{
		Cliente emanuel = new Cliente();
		
		emanuel.nome = "Emanuel Ribeiro";
		emanuel.cpf = "05314234172";
		emanuel.profissao = "Programador";
		
		Conta contaDoEmanuel = new Conta();
		
		contaDoEmanuel.deposita(100); 
		contaDoEmanuel.titular = emanuel;
		
		System.out.println(contaDoEmanuel.titular.nome);
		System.out.println(contaDoEmanuel.titular);
	}
}
