public class TestaContas 
{
  public static void main(String[] args) 
  {
    Conta conta = new Conta(1337, 23334);
    conta.deposita(200);
    conta.setAgencia(570);

    System.out.println("O saldo dessa conta eh: " + conta.getSaldo());
    System.out.println("O numero dessa agencia eh: " + conta.getAgencia());
    System.out.println("O total de contas eh: " + Conta.getTotal());
  }
}
