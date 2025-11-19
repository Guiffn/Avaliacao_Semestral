public class ModeloConservador implements PerfilRiscoStrategy {
    public double calcularPerfil(Cliente cliente) {
        return cliente.getRenda() * 0.3 + cliente.getIdade() * 0.5 + cliente.getInvestimentos() * 0.2;
    }
}
