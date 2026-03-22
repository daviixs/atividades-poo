public class TestaComputador {
    public static void main(String[] args) {
        Computador computador = new Computador(1, "Dell", "Intel", "i7-13700H", 3.8);

        System.out.println("Computador montado:");
        System.out.println(computador);

        // composição: o processador é criado dentro do computador e não é compartilhado fora dele
        computador = null;
        System.out.println("Referência do computador anulada. O processador deixa de existir junto com ele.");
    }
}
