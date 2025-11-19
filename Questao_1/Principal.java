
public class Principal {
    public static void main(String[] args) {
        CriadorRelatorio criadorDiario = new CriadorRelatorioDiario();
        Relatorio relatorioDiario = criadorDiario.criarRelatorio();
        relatorioDiario.preparar();

        CriadorRelatorio criadorSemanal = new CriadorRelatorioSemanal();
        Relatorio relatorioSemanal = criadorSemanal.criarRelatorio();
        relatorioSemanal.preparar();

        CriadorRelatorio criadorEmergencial = new CriadorRelatorioEmergencial();
        Relatorio relatorioEmergencial = criadorEmergencial.criarRelatorio();
        relatorioEmergencial.preparar();
    }
}
