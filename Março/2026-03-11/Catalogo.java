public class Catalogo {
    private Produto [] catalogo;
    private int count;
    private int tamanho;

    public Catalogo( int t ) {
        tamanho = tamanho;
        count = 0;
        catalogo = new Produto[tamanho];
    }

    public void registraProduto( Produto p ) {
        catalogo[count++] = p;
    }
    
}
