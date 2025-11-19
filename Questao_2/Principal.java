public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(10000, 35, 50000);
        AnaliseInvestimento analise = new AnaliseInvestimento(new ModeloAgressivo());
        System.out.println(analise.analisar(cliente));
        analise.setEstrategia(new ModeloConservador());
        System.out.println(analise.analisar(cliente));
    }
}
