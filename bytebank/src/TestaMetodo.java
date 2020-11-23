
public class TestaMetodo 
{
	public static void main(String[] args) 
	{
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		
		Conta conta2 = new Conta();
		conta2.deposita(1000);
		
		System.out.println(conta.saldo);
		
		conta.saca(20);
		
		System.out.println(conta.saldo);
		
		conta2.transfere(300, conta);
		
		System.out.println(conta2.saldo);
		
		conta.titular = "Emanuel Ribeiro";
		
		System.out.println(conta.titular);
	}
}
