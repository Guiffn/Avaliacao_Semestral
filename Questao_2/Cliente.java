public class Cliente {
    private int idade;
    private double investimento;

    public Cliente(int idade, double investimento) {
        this.idade = idade;
        this.investimento = investimento;
    }

    public int getIdade() {
        return idade;
    }

    public double getInvestimento() {
        return investimento;
    }
}
