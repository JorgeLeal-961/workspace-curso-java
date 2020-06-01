package cursojava.classes;

public class Disciplina {

/*Esta classe "class Disciplina" servira para todos os objetos e instancias DE materias e notas*/	
	
	private String disciplina;
	private double nota;

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disciplina == null) ? 0 : disciplina.hashCode());
		long temp;
		temp = Double.doubleToLongBits(nota);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Disciplina other = (Disciplina) obj;
		if (disciplina == null) {
			if (other.disciplina != null)
				return false;
		} else if (!disciplina.equals(other.disciplina))
			return false;
		if (Double.doubleToLongBits(nota) != Double.doubleToLongBits(other.nota))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Disciplina [disciplina=" + disciplina + ", nota=" + nota + "]";
	}
	
	
	
	
	
/*	private String disciplinaNota1;
	private double nota1;
	private String disciplinaNota2;
	private double nota2;
	private String disciplinaNota3;
	private double nota3;
	private String disciplinaNota4;
	private double nota4;
*/	
	
/*	public String getDisciplinaNota1() {
		return disciplinaNota1;
	}
	public void setDisciplinaNota1(String disciplinaNota1) {
		this.disciplinaNota1 = disciplinaNota1;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public String getDisciplinaNota2() {
		return disciplinaNota2;
	}
	public void setDisciplinaNota2(String disciplinaNota2) {
		this.disciplinaNota2 = disciplinaNota2;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public String getDisciplinaNota3() {
		return disciplinaNota3;
	}
	public void setDisciplinaNota3(String disciplinaNota3) {
		this.disciplinaNota3 = disciplinaNota3;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public String getDisciplinaNota4() {
		return disciplinaNota4;
	}
	public void setDisciplinaNota4(String disciplinaNota4) {
		this.disciplinaNota4 = disciplinaNota4;
	}
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disciplinaNota1 == null) ? 0 : disciplinaNota1.hashCode());
		result = prime * result + ((disciplinaNota2 == null) ? 0 : disciplinaNota2.hashCode());
		result = prime * result + ((disciplinaNota3 == null) ? 0 : disciplinaNota3.hashCode());
		result = prime * result + ((disciplinaNota4 == null) ? 0 : disciplinaNota4.hashCode());
		long temp;
		temp = Double.doubleToLongBits(nota1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota3);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota4);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Disciplina other = (Disciplina) obj;
		if (disciplinaNota1 == null) {
			if (other.disciplinaNota1 != null)
				return false;
		} else if (!disciplinaNota1.equals(other.disciplinaNota1))
			return false;
		if (disciplinaNota2 == null) {
			if (other.disciplinaNota2 != null)
				return false;
		} else if (!disciplinaNota2.equals(other.disciplinaNota2))
			return false;
		if (disciplinaNota3 == null) {
			if (other.disciplinaNota3 != null)
				return false;
		} else if (!disciplinaNota3.equals(other.disciplinaNota3))
			return false;
		if (disciplinaNota4 == null) {
			if (other.disciplinaNota4 != null)
				return false;
		} else if (!disciplinaNota4.equals(other.disciplinaNota4))
			return false;
		if (Double.doubleToLongBits(nota1) != Double.doubleToLongBits(other.nota1))
			return false;
		if (Double.doubleToLongBits(nota2) != Double.doubleToLongBits(other.nota2))
			return false;
		if (Double.doubleToLongBits(nota3) != Double.doubleToLongBits(other.nota3))
			return false;
		if (Double.doubleToLongBits(nota4) != Double.doubleToLongBits(other.nota4))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Disciplina [disciplinaNota1=" + disciplinaNota1 + ", nota1=" + nota1 + ", disciplinaNota2="
				+ disciplinaNota2 + ", nota2=" + nota2 + ", disciplinaNota3=" + disciplinaNota3 + ", nota3=" + nota3
				+ ", disciplinaNota4=" + disciplinaNota4 + ", nota4=" + nota4 + "]";
	}	
*/	
	
	
	
	
}
