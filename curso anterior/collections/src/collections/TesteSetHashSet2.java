package collections;

public class TesteSetHashSet2 {
	
	public static void maim(String[] args) {
		Set<Aluno> alunos SimuladorBancoDeDados.buscarAlunos();
		
		Aluno alunoSorteado = new Aluno("Maria");
		
		if (alunos.contains(alunoSorteado)) {
			System.out.println("Parab�ns: " + alunoSorteado.getNome() + "! Voc� ganhou um brinde!");;
		} else {
			System.out.println("Aluno n�o cadastrado no Baco de Dados!");
		}
	}

}
