public class TesteReferencias 
{
  public static void main(String[] args) 
  {

    Gerente g1 = new Gerente();
    g1.setNome("Emanuel");
    g1.setSalario(5000);

    EditorVideo e1 = new EditorVideo();
    e1.setNome("Alessandro");
    e1.setSalario(2500);

    Designer d1 = new Designer();
    d1.setNome("jessica");
    d1.setSalario(1500);

    Funcionario f1 = new Funcionario();
    f1.setNome("thiago");
    f1.setSalario(2000);

    ControleBonificacao controle = new ControleBonificacao();
    controle.registra(g1);
    controle.registra(e1);
    controle.registra(f1);
    controle.registra(d1);

    System.out.println("A bonificação é: " + controle.getSoma());

  }
}