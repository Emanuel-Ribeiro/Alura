
public class TestaSomatoria 
{
	public static void main(String[] args) 
	{
		int contador = 0;
		@SuppressWarnings("unused")
		int total = 0;
		
		while(contador <= 10)
		{
			total += contador;
			contador++;
		}
	}
}
