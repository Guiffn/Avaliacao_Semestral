public class AnaliseInvestimento {
    private PerfilRiscoStrategy estrategia;

    public AnaliseInvestimento(PerfilRiscoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(PerfilRiscoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public double analisar(Cliente cliente) {
        return estrategia.calcularPerfil(cliente);
    }
}
