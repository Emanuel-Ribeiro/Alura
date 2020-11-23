public class TesteGerente 
{
  public static void main(String[] args) 
  {
    Gerente g1 = new Gerente();
    g1.setNome("Reinaldo");
    g1.setCpf("05412874647");
    g1.setSalario(5000);
    g1.setSenha(29788);

    System.out.println("\nSenha: " + g1.autentica(29788));
    System.out.println("\nNome: " + g1.getNome());
    System.out.println("\nFunção: " + g1.getClass());
    System.out.println("\nCPF: " + g1.getCpf());
    System.out.println("\nSalario: " + g1.getSalario());
    System.out.println("\nBonificação: " + g1.getBonificacao());
  }
}
