public class AnaliseInvestimento {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(30, 10000);
        // Escolha dinâmica do modelo (exemplo: agressivo)
        PerfilRiscoFactory factory = new FactoryAgressivo();
        PerfilRisco perfil = factory.criarPerfilRisco();
        double risco = perfil.calcularRisco(cliente);
        System.out.println("Risco calculado: " + risco);
    }
}
