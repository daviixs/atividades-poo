public class Teste {
    public static void main(String[] args) {
        System.out.println("=== Teste da Classe Streaming ===");
        
        Streaming streaming1 = new Streaming("João", "Básico");
        Streaming streaming2 = new Streaming("Maria", "Premium");
        Streaming streaming3 = new Streaming("Carlos", "Família");
        
        System.out.println(streaming1);
        System.out.println();
        
        streaming1.assistirFilme("Matrix");
        streaming1.assistirFilme("Interestelar");
        System.out.println(streaming1);
        System.out.println();
        
        streaming1.cancelarAssinatura();
        streaming1.assistirFilme("Avatar");
        System.out.println(streaming1);
        System.out.println();
        
        System.out.println(streaming2);
        System.out.println();
        
        streaming3.assistirFilme("O Poderoso Chefão");
        System.out.println(streaming3);
        System.out.println();
        
        System.out.println("=== Teste da Classe Placar ===");
        
        Placar placar = new Placar("Lakers", "Celtics");
        System.out.println(placar);
        System.out.println();
        
        placar.registrarPonto("casa", 2);
        placar.registrarPonto("visitante", 3);
        placar.registrarPonto("casa", 1);
        System.out.println(placar);
        System.out.println();
        
        placar.proximoQuarto();
        System.out.println(placar);
        System.out.println();
        
        placar.registrarPonto("casa", 3);
        placar.registrarPonto("visitante", 2);
        placar.registrarPonto("casa", 3);
        System.out.println(placar);
        System.out.println();
        
        placar.proximoQuarto();
        placar.proximoQuarto();
        placar.proximoQuarto();
        System.out.println(placar);
        System.out.println();
        
        placar.proximoQuarto();
    }
}
