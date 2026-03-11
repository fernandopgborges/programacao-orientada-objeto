public class Conta {
    private double saldo;
    private double limite;

    // Tudo que é static é apenas da Classe e não do Objeto
    private static int qtdContas = 2; // Roda apenas uma vez
    public static final double TAXA = 3.5; // Roda apenas uma vez e é uma constante

    public Conta( double s, double lim ) {  // Construtor, nao eh estatico
        saldo = s;
        limite = lim;
    }

    public static double getQtdContas() {
        return qtdContas;
    }
} 
