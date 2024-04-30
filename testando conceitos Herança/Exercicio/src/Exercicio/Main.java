package Exercicio;

public class Main {

    public static void main(String[] args) {
        // Criando objetos AlunoGrad e AlunoPostGrad com os parâmetros corretos
        AlunoGrad AluG = new AlunoGrad(123, "João", true, 8.5);
        AluG.imprimir();
        
        AlunoPostGrad APG = new AlunoPostGrad(456, "Thiago", true, "Professor X", "Tese de Física");
        APG.imprimir();
    }

}
