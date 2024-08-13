public class App {
    public static void main(String[] args) {
        ProcessadorTexto maiuscula = new TudoMaiuscula();
        ProcessadorTexto minuscula = new TudoMinuscula();

        String textoOriginal = "Exemplo de Texto";
        String textoMaiusculo = maiuscula.processarTexto(textoOriginal);
        String textoMinusculo = minuscula.processarTexto(textoOriginal);

        System.out.println("Texto Original: " + textoOriginal);
        System.out.println("Texto em Maiúsculas: " + textoMaiusculo);
        System.out.println("Texto em Minúsculas: " + textoMinusculo);
    }
}
