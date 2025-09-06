public abstract class Funcionario {
    private String nome;
    private double salario;
    private int idade;

    public Funcionario(String nome, double salario, int idade) {
        if (salario <= 0 || salario > 10000) {
            throw new SalarioInvalidoException("Valor incorreto");
        }
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario <= 0 || salario > 10000) {
            throw new SalarioInvalidoException("Valor incorreto");
        }
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void imprimirdados(){}
}

