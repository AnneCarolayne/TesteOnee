package ExercicioMaven.TesteOnee;

import java.util.ArrayList;

public class Eleicao {
	
	private String nomePleito;
    private String dataInicial;
    private String dataFinal;
    private ArrayList <Candidato> candidatos= new ArrayList();
    private static int contadorVotos;
    
    public Eleicao(String nomePleito, String dataInicial, String dataFinal){
        this.setNomePleito(nomePleito);
        this.setDataInicial(dataInicial);
        this.setDataFinal(dataFinal);
    }
    
	public static int getContadorVotos() {
		return contadorVotos;
	}

	public static void setContadorVotos(int contadorVotos) {
		Eleicao.contadorVotos = contadorVotos;
	}

	public String getNomePleito() {
		return nomePleito;
	}

	public void setNomePleito(String nomePleito) {
		this.nomePleito = nomePleito;
	}

	public String getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(String dataInicial) {
		this.dataInicial = dataInicial;
	}

	public String getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}

	public ArrayList<Candidato> getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(ArrayList<Candidato> candidatos) {
		this.candidatos = candidatos;
	}
    
    
    

}
