public class ModeloModerado implements PerfilRisco {
    @Override
    public double calcularRisco(Cliente cliente) {
        // Fórmula moderada
        return cliente.getInvestimento() * 0.5 + cliente.getIdade() * 0.5;
    }
}
