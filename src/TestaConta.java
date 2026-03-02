public class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta(1, 100, "Joao Silva");
        c1.depositar(500f);
        c1.sacar(200f);
        System.out.println(c1.toString());

        Conta c2 = new Conta(2, 200, "Maria Souza");
        c2.sacar(50f);

        c1.encerrarConta();
        c1.sacar(300f);
        c1.encerrarConta();
        System.out.println(c1.toString());
    }
}
