public class FactoryModerado extends PerfilRiscoFactory {
    @Override
    public PerfilRisco criarPerfilRisco() {
        return new ModeloModerado();
    }
}
