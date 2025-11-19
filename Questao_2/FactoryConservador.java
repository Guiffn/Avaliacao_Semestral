public class FactoryConservador extends PerfilRiscoFactory {
    @Override
    public PerfilRisco criarPerfilRisco() {
        return new ModeloConservador();
    }
}
