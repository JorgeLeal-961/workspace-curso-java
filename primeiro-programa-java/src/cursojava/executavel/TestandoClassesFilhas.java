package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Alex");
		aluno.setNomeEscola("JDev - Treinamento");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("e70wr0wrw0r7w0er70");
		diretor.setNome("Egidio");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administracao");
		secretario.setNumeroCPF("3242342380234");
		secretario.setNome("Paula");
		secretario.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salario é = "+aluno.salario());
		System.out.println("Salario é = "+diretor.salario());
		System.out.println("Salario é = "+secretario.salario());	
		
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
	}

	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais= "
		+pessoa.getNome()+" e recebe salario de= "+pessoa.salario());
	}



}
