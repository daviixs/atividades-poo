package composicao;

public class TestaComposicao {
    public static void main(String[] args) {
        empresa empresa = new empresa(2, "Google", "123");
        Funcionario funcionario = new Funcionario(1, "Teste", "123", "Tester");

        empresa.addFuncionario(funcionario);
        System.out.println("Funcionario adicionado" + funcionario);

        empresa.removeFuncionario(funcionario.getId());
        System.out.println("Funcionario removido" + funcionario);
    }
}
