public class ModeloModerado implements PerfilRiscoStrategy {
    public double calcularPerfil(Cliente cliente) {
        return cliente.getRenda() * 0.5 + cliente.getIdade() * 0.3 + cliente.getInvestimentos() * 0.2;
    }
}
