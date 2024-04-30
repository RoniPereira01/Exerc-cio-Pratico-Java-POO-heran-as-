package Exercicio;

public class AlunoPostGrad extends Aluno {

	private String orientador;
	private String tese;
	
	//aqui um contrutor recebendo Pai Aluno
	
	public AlunoPostGrad(int ra, String nome ,boolean matriculado, String orientador,String tese){
		super(ra,nome,matriculado);
		this.orientador = orientador;
		this.tese = tese;
		
	}
	
	//aqui sao os get E set
	public String getOrientador() {
		return orientador;
	}
	public void setOrientador(String orientador) {
		this.orientador = orientador;
	}
	public String getTese() {
		return tese;
	}
	public void setTese(String tese) {
		this.tese = tese;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Orientador: " + this.orientador );
		System.out.println("Tese: " + this.tese );
	}
	
}
