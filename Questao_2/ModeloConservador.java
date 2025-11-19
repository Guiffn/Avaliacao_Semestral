public class ModeloConservador implements PerfilRisco {
    @Override
    public double calcularRisco(Cliente cliente) {
        // Fórmula conservadora
        return cliente.getInvestimento() * 0.2 + cliente.getIdade() * 0.8;
    }
}
