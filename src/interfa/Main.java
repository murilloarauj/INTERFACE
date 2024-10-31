package interfa;

public class Main {
    public static void main(String[] args) {
        //Funcionario que recebe vaor atribuido anualmente
        Funcionario funcionarioAssalariado = new FuncionarioAssalariado(60000); 
        
        //Funcionario horista que recebe o primeiro valor por hora e trabalha 160 horas mensais
        Funcionario funcionarioHorista = new FuncionarioHorista(20, 160); 

        System.out.println("Bônus do Funcionário Assalariado: R$ " + funcionarioAssalariado.calcularBonus());
        System.out.println("Bônus do Funcionário Horista: R$ " + funcionarioHorista.calcularBonus());
    }
}