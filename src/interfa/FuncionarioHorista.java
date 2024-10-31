package interfa;

// Classe FuncionarioHorista que complementa a funcionario
public class FuncionarioHorista implements Funcionario {
    protected float horaSalario; 
    protected int horasTrabalhadasPorMes; 

    // Construtor para inicializar o salario mês e hora
    public FuncionarioHorista(float horaSalario, int horasTrabalhadasPorMes) {
        this.horaSalario = horaSalario;
        this.horasTrabalhadasPorMes = horasTrabalhadasPorMes;
    }

    // Método para calcular o bônus, conforme definido na interface
    @Override
    public float calcularBonus() {
        // Cálculo do salário mensal
        float salarioMensal = horaSalario * horasTrabalhadasPorMes;
        // Cálculo do salário anual
        float salarioAnual = salarioMensal * 12;     
        return salarioAnual * 0.10f;
    }
}