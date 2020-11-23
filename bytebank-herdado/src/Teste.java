public class Teste 
{
  public static void main(String[] args) 
  {
    FuncionarioTeste f1 = new FuncionarioTeste();
    f1.setTipo("comum");
    f1.setSalario(3000.50);

    FuncionarioTeste f2 = new FuncionarioTeste();
    f2.setTipo("gerente");
    f2.setSalario(5000.50);
    
    FuncionarioTeste f3 = new FuncionarioTeste();
    f3.setTipo("diretor");
    f3.setSalario(7000.50);

    System.out.println("\nTipo de funcionario: " + f1.getTipo());
    System.out.println("Bonificação: " + f1.getBonificacao());
    
    System.out.println("\nTipo de funcionario: " + f2.getTipo());
    System.out.println("Bonificação: " + f2.getBonificacao());
    
    System.out.println("\nTipo de funcionario: " + f3.getTipo());
    System.out.println("Bonificação: " + f3.getBonificacao());
  }
}
