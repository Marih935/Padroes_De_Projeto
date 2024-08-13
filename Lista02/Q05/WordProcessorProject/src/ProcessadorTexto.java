public abstract class ProcessadorTexto {
    public final String processarTexto(String entrada) {
        char[] caracteres = extrairCaracteres(entrada);
        char[] caracteresConvertidos = converterCaracteres(caracteres);
        String resultado = juntarCaracteresConvertidos(caracteresConvertidos);
        return resultado;
    }

    private char[] extrairCaracteres(String texto) {
        return texto.toCharArray();
    }

    protected abstract char[] converterCaracteres(char[] caracteres);

    private String juntarCaracteresConvertidos(char[] caracteres) {
        return new String(caracteres);
    }
}
