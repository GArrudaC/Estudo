public class Administrativo extends Funcionario {
    private String departamento;

    public Administrativo(String nome, double salario, int idade, String departamento) {
        super(nome, salario, idade);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void imprimirdados() {
        System.out.println("==== Adição de Funcionário ====");
        System.out.println("Nome: " + getNome());
        System.out.println("Salario: " + getSalario());
        System.out.println("Idade: " + getIdade());
        System.out.println("Nome do departamento: " + this.departamento);
    }
}
