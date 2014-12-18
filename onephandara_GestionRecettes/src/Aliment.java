
public class Aliment {
	int idAliment,calories;
	String nomAliment;
	
	public Aliment(int idAliment, int calories, String nomAliment) {
		this.idAliment = idAliment;
		this.calories = calories;
		this.nomAliment = nomAliment;
	}

	public int getIdAliment() {
		return idAliment;
	}

	public void setIdAliment(int idAliment) {
		this.idAliment = idAliment;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public String getNomAliment() {
		return nomAliment;
	}

	public void setNomAliment(String nomAliment) {
		this.nomAliment = nomAliment;
	}
	
	

}
