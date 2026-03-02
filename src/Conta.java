public class Conta {
    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status;

    public Conta(int numeroConta, int agencia, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0f;
        this.status = true;
    }

    public void depositar(float valor) {
        if (!status) {
            System.out.println("Conta inativa");
            return;
        }
        saldo += valor;
        System.out.println("Deposito realizado: R$ " + valor);
    }

    public void sacar(float valor) {
        if (!status) {
            System.out.println("Conta inativa");
            return;
        }
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado: R$ " + valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void encerrarConta() {
        if (saldo == 0f) {
            status = false;
            System.out.println("Conta encerrada");
        } else {
            System.out.println("Conta com saldo. Saque o valor antes de encerrar.");
        }
    }

    @Override
    public String toString() {
        String statusTexto = status ? "Ativa" : "Encerrada";
        return "Conta{" +
                "Numero=" + numeroConta +
                ", Agencia=" + agencia +
                ", Cliente='" + nomeCliente + '\'' +
                ", Saldo=R$ " + saldo +
                ", Status=" + statusTexto +
                '}';
    }
}
