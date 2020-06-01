package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.StatusAluno;

/*Esta é a nossa classe/objeto que representa o Aluno*/
public class Aluno extends Pessoa {

	/*Esses são os atributos do Aluno*/
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
/*	private Disciplina disciplina = new Disciplina();
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}*/

	public Aluno() { //Cria os dados na memoria, sendo padrão Java
		
	}
	
	public Aluno(String nomePadrao) {
		super.nome = nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao) {
		super.nome = nomePadrao;
		super.idade = idadePadrao;
	}
	
	/*Metodos SETTERS e GETTERS do objeto*/
	//SET é para adicionar ou receber dados do atributos
	//GET é para resgatar ou obter o valor do atributo
	
	/*Atalho para gerar os objetos GETTER e SETTER*/
	//botão direito do mouse, Source, Generate Getters and Setter...
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCPF() {
		return numeroCPF;
	}

	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	/*Metodo que retorna a media das notas do aluno*/
	public double getMediaNota() {
		
		double somaNotas = 0.0;
		
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		
		return somaNotas / disciplinas.size();
		
//		return (disciplina.getNota1() + disciplina.getNota2() + disciplina.getNota3() + disciplina.getNota4())/4;
	}
	
	/*metodo retorna VERDADEIRO ou FALSO*/
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {//aprovado
			return true;
		}else {
			return false;//reprovado
		}
	}
	
	/*metodo retorna TEXTO*/	
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		
		if (media >= 50) {
			if (media >= 70) {
				if (media >= 91) {
					return "Aluno Aprovado Direto";
				} else {
					return StatusAluno.APROVADO;
					//return "Aluno Aprovado";
				}
			} else {
				return StatusAluno.RECUPERACAO;
				//return "Aluno em Recuperação";
			}
		} else {
			return StatusAluno.REPROVADO;
			//return "Reprovado direto";
		}
	}

	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numeroCPF == null) ? 0 : numeroCPF.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroCPF == null) {
			if (other.numeroCPF != null)
				return false;
		} else if (!numeroCPF.equals(other.numeroCPF))
			return false;
		return true;
	}
	
	public boolean pessoaMaiorIdade() {
		return idade >= 21;
	}
	
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade()?"Obaa aluno é maior de idade":"Ixii vc é menor de idade";
	}
	

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + "]";

//		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
//		+ registroGeral + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
//		+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
//		+ serieMatriculado + ", disciplina=" + disciplina + "]";	
	}

	@Override
	public double salario() {
		return 1500.90;
	}	
	
		
}
