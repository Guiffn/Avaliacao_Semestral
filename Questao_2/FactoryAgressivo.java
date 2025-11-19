public class FactoryAgressivo extends PerfilRiscoFactory {
    @Override
    public PerfilRisco criarPerfilRisco() {
        return new ModeloAgressivo();
    }
}
