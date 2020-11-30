public class TesteFuncionario 
{
  public static void main(String[] args) 
  {
    Funcionario emanuel = new Gerente();
    emanuel.setNome("Emanuel Ribeiro");
    emanuel.setCpf("05314234172");
    emanuel.setSalario(2400.50);

    System.out.println("Nome do funcionario: " + emanuel.getNome());
    System.out.println("Salario do funcionario: " + emanuel.getSalario());
    System.out.println("Bonificação do funcionario: " + emanuel.getBonificacao());
  }
}
