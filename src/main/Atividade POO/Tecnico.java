public class Tecnico extends Funcionario {
    private String departamento;
    private String especialidade;

    public Tecnico (String nome, double salario, int idade, String departamento, String especialidade) {
        super(nome, salario, idade);
        this.departamento = departamento;
        this.especialidade = especialidade;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void imprimirdados() {
        System.out.println("==== Adição de Funcionário ====");
        System.out.println("Nome: " + getNome());
        System.out.println("Salario: " + getSalario());
        System.out.println("Idade: " + getIdade());
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Especialidade: " + this.especialidade);
    }
}
