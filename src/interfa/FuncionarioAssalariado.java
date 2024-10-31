package interfa;

// Classe FuncionarioAssalariado que complementa a funcionario
public class FuncionarioAssalariado implements Funcionario {
    // Atributo para armazenar o salário
    protected float salario;

    // Construtor para definir o salário inicial
    public FuncionarioAssalariado(float salario) {
        this.salario = salario;
    }

    // Método para calcular o bônus, conforme definido na interface
    @Override
    public float calcularBonus() {
        float bonusSalario = 5000; // Bonus fixo
        return bonusSalario; // Retorna o valor do bônus
    }
}