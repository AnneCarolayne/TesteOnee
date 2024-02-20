package ExercicioMaven.TesteOnee;

public class Voto {

	 private String cpfEleitor;
     private String dataVoto;
     private String horaVoto;
     
     
     public Voto(String cpfEleitor, String dataVoto, String horaVoto){
         this.setCpfEleitor(cpfEleitor);
         this.setDataVoto(dataVoto);
         this.setHoraVoto(horaVoto);
         
     }

	public String getCpfEleitor() {
		return cpfEleitor;
	}

	public void setCpfEleitor(String cpfEleitor) {
		this.cpfEleitor = cpfEleitor;
	}

	public String getDataVoto() {
		return dataVoto;
	}

	public void setDataVoto(String dataVoto) {
		this.dataVoto = dataVoto;
	}

	public String getHoraVoto() {
		return horaVoto;
	}

	public void setHoraVoto(String horaVoto) {
		this.horaVoto = horaVoto;
	}

	
     
     
	
	
	
}
