public class Cliente {
    private double renda;
    private int idade;
    private double investimentos;

    public Cliente(double renda, int idade, double investimentos) {
        this.renda = renda;
        this.idade = idade;
        this.investimentos = investimentos;
    }

    public double getRenda() { return renda; }
    public int getIdade() { return idade; }
    public double getInvestimentos() { return investimentos; }
}
