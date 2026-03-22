import java.time.LocalDate;

public class TestaBiblioteca {
    public static void main(String[] args) {
        Leitor leitor = new Leitor(1, "Marina Costa");
        Livro livro = new Livro(1, "Dom Casmurro", "Machado de Assis");

        LocalDate emprestimo = LocalDate.now();
        LocalDate devolucaoPrevista = emprestimo.plusDays(14);

        Emprestimo registro = new Emprestimo(emprestimo, devolucaoPrevista, leitor, livro);

        System.out.println("Empréstimo registrado:");
        System.out.println(registro);
    }
}
