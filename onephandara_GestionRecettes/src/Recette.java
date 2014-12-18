import java.util.ArrayList;


public class Recette {
	int idRecette,tempsPreparation,tempsCuisson;
	String nomRecette;
	Type type;
	
	public Recette(int idRecette, int tempsPreparation, int tempsCuisson,
			String nomRecette, Type type) {
		
		this.idRecette = idRecette;
		this.tempsPreparation = tempsPreparation;
		this.tempsCuisson = tempsCuisson;
		this.nomRecette = nomRecette;
		this.type = type;
		ArrayList<Aliment> lesAliments = new ArrayList<Aliment>();
	}
	
	
	
	
	

}
