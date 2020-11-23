public class FuncionarioTeste
{
  private String nome;
  private String cpf;
  private double salario;
  private String tipo = "comum";
  

  public double getBonificacao()
  {
    if(this.tipo == "comum")
    {
      return this.salario * 0.1;
    }

    else if(this.tipo == "gerente")
    {
      return this.salario;
    }

    else
    {
      return this.salario + 1000;
    }
  }

  public String getTipo() 
  {
    return tipo;
  }

  public void setTipo(String tipo) 
  {
    this.tipo = tipo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome)
  {
    this.nome = nome;
  }

  public String getCpf() 
  {
    return cpf;
  }

  public void setCpf(String cpf)
  {
    this.cpf = cpf;
  }

  public double getSalario()
  {
    return salario;
  }

  public void setSalario(double salario)
  {
    this.salario = salario;
  }


}
