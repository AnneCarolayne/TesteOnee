package ExercicioMaven.TesteOnee;

public class Candidato {
	
	 private String cpf;
     private String nomeCandidato;
     private String dataNasc;
     private String endereco;
     
     public Candidato(String cpf, String nomeCandidato, String dataNasc, String endereco){
         this.setCpf(cpf);
         this.setNomeCandidato(nomeCandidato);
         this.setDataNasc(dataNasc);
         this.setEndereco(endereco);
     }
     
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNomeCandidato() {
		return nomeCandidato;
	}
	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String enedereco) {
		this.endereco = enedereco;
	}


}
