public class Gerente extends Funcionario
{
  private int senha;

  public void setSenha(int senha) 
  {
    this.senha = senha;
  }

  public boolean autentica(int senha)
  {
    if(this.senha == senha)
    {
      System.out.println("Acesso liberado");
      return true;
    }

    else
    {
      System.out.println("Senha incorreta!");
      return false;
    }
  }

  public double getBonificacao()
  {
    System.out.println("Chamando o metodo de bonificacao do GERENTE.");
    return super.getBonificacao() + super.getSalario();
  }
}
