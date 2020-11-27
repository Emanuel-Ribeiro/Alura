public class EditorVideo extends Funcionario
{

  public double getBonificacao()
  {
    System.out.println("chamando o metodo de bonificacao do EDITORVIDEO");
    return super.getBonificacao() + 100;
  }

}
