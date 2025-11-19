class CriadorRelatorioEmergencial extends CriadorRelatorio {
    public Relatorio criarRelatorio() {
        return new RelatorioEmergencial();
    }
}
