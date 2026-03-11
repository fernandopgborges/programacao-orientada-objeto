import java.util.*;

public class App {
    public static void main(String[] args) {
        ArrayList<Produto> catalogo;

        catalogo = new ArrayList<Produto>( 10 );

        int tamanho = catalogo.size(); // diz quantos objetos realmente estão no ArrayList

        Produto produto = new Produto( "Agua magica", 5.99 );
        catalogo.set( 0, produto ); // Registro de objeto

        Produto checarProduto = catalogo.get(0); // Pega o item na posição desejada

        Produto cachorro = new Produto(null, tamanho);
        catalogo.add( cachorro );   // Coloca o objeto na última posição livre da lista, a lista aumenta em 1
        
        Produto gato = new Produto(null, tamanho);
        catalogo.add( 7, gato ); // Coloca o objeto na posição indicada da lista, a lista aumenta em 1

        catalogo.remove(7 ); // Remove o objeto da posição indicada

        catalogo.clear(); // limpa todos os objetos da lista e seta size como 0
    }
}