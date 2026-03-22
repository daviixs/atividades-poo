import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
    private final LocalDate dataEmprestimo;
    private final LocalDate dataDevolucaoPrevista;
    private final Leitor leitor;
    private final Livro livro;

    public Emprestimo(LocalDate dataEmprestimo, LocalDate dataDevolucaoPrevista, Leitor leitor, Livro livro) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.leitor = leitor;
        this.livro = livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public Livro getLivro() {
        return livro;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Emprestimo{" +
                "dataEmprestimo=" + dataEmprestimo.format(formatter) +
                ", dataDevolucaoPrevista=" + dataDevolucaoPrevista.format(formatter) +
                ", leitor=" + leitor.getNome() +
                ", livro='" + livro.getTitulo() + '\'' +
                '}';
    }
}
