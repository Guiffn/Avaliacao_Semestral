
public class CriadorRelatorioSemanal extends CriadorRelatorio {
    public Relatorio criarRelatorio(){
        return new RelatorioSemanal();
    }
}