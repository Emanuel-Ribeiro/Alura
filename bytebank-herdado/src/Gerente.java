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

  // public double getBonificacao()
  // {
  //   return this.salario;
  // }
}
