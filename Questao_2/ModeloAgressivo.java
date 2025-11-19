public class ModeloAgressivo implements PerfilRisco {
    @Override
    public double calcularRisco(Cliente cliente) {
        // Fórmula agressiva
        return cliente.getInvestimento() * 0.8 + cliente.getIdade() * 0.2;
    }
}
