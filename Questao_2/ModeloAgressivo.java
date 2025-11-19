public class ModeloAgressivo implements PerfilRiscoStrategy {
    public double calcularPerfil(Cliente cliente) {
        return cliente.getRenda() * 0.7 + cliente.getIdade() * 0.1 + cliente.getInvestimentos() * 0.2;
    }
}
