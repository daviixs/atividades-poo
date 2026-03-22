public class TestaProjeto {
    public static void main(String[] args) {
        Projeto projeto = new Projeto(1, "Plataforma Web");
        Programador backend = new Programador(1, "Fernanda Lima", "Java");
        Programador frontend = new Programador(2, "Igor Mendes", "JavaScript");

        projeto.adicionarProgramador(backend);
        projeto.adicionarProgramador(frontend);

        System.out.println(projeto);
        System.out.println("Programadores alocados:");
        System.out.println(projeto.listarProgramadores());
    }
}
