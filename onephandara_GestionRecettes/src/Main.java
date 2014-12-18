import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static ArrayList<Aliment> lesAlimentsTemp = new ArrayList<Aliment>();
	public static ArrayList<Recette> lesRecettesTemp = new ArrayList<Recette>();
	public static ArrayList<Type> lesTypesTemp =new ArrayList<Type>();
	public static void main(String[] args) {
		
		Menu();
		
	


			
		}
		
	private static void Menu() {
		
		Scanner sc = new Scanner(System.in);
		int reponse;
		System.out.println("Que voulez vous faire ?");
		System.out.println("1.Ajouter un aliment à la liste .");
		System.out.println("2.Ajouter une recette à la liste .");
		System.out.println("3.Consulter la liste des recettes .");
		System.out.println("4.Quitter");
		reponse=sc.nextInt();	
		if(reponse == 1){
			int idAliment,calories,typeAliment;
			String nomAliment;
			
			System.out.println("Quel type d'aliment voulez vous ajouter ?");
			System.out.println("1.Légume.");
			System.out.println("2.Fruit.");
			System.out.println("3.Viande.");
			System.out.println("4.Poisson");
			typeAliment=sc.nextInt();
			System.out.println("Quel est l'id de l'aliment ?");
			idAliment=sc.nextInt();
			System.out.println("Quel est le nom de l'aliment ?");
			nomAliment=sc.next();
			System.out.println("Combien de calories ?");
			calories=sc.nextInt();
			switch (typeAliment){
			case 1: Aliment A1= new Legume(idAliment,calories,nomAliment);
					System.out.println("Aliment crée");
					lesAlimentsTemp.add(A1);
					Menu();
					break;
			case 2: Aliment A2= new Fruit(idAliment,calories,nomAliment);
					System.out.println("Aliment crée");
					lesAlimentsTemp.add(A2);
					Menu();
					break;
			case 3: Aliment A3= new Viande(idAliment,calories,nomAliment);
					System.out.println("Aliment crée");
					lesAlimentsTemp.add(A3);
					Menu();
					break;
			case 4: Aliment A4= new Poisson(idAliment,calories,nomAliment);
					System.out.println("Aliment crée");
					lesAlimentsTemp.add(A4);
					Menu();
					break;
			
			}
			
			
		
			
		}
		// Ajouter une recette
		if(reponse ==2){
			int idRecette,tempsPreparation,tempsCuisson,niveau,reponseAliment,reponseType;
			String nomRecette;
			
			ArrayList<Aliment> recetteAliment = new ArrayList<Aliment>();
			
			System.out.println("Quel est l'id de la recette ?");
			idRecette=sc.nextInt();
			System.out.println("Quel est le nom de la recette ?");
			nomRecette=sc.next();
			System.out.println("Quel est le temps de préparation ?(en min)");
			tempsPreparation=sc.nextInt();
			System.out.println("Quel est le temps de Cuisson ?(en min)");
			tempsCuisson=sc.nextInt();
			System.out.println("Quel est le niveau de difficulté ? (1 à 5)");
			niveau=sc.nextInt();
			System.out.println("Quel est le type de recette ?");
			System.out.println("1.Entrée");
			System.out.println("2.plat");
			System.out.println("3.dessert");
			reponseType=sc.nextInt();
			switch(reponseType){
			case 1: Type typeRecette=new Type(1,"Entrée");
					lesTypesTemp.add(typeRecette);
					break;
			case 2: Type typeRecette1=new Type(2,"Plat");
					lesTypesTemp.add(typeRecette1);
					break;
			case 3: Type typeRecette2=new Type(3,"Dessert");
					lesTypesTemp.add(typeRecette2);
					break;
		
			}
			
			Recette r1= new Recette(idRecette,tempsPreparation,tempsCuisson,nomRecette,lesTypesTemp.get(reponseType));
			
			System.out.println("Quels sont les aliments nécessaire à la recette parmi la liste suivante? :");
			for (int i=0;i<lesAlimentsTemp.size();i++){
				System.out.println(i+"."+lesAlimentsTemp.get(i).getNomAliment());
			}
			System.out.println("-1 quand vous avez fini.");
			reponseAliment=sc.nextInt();
			
			if(reponseAliment != 999){
			// r1.lesAliments.add(lesAlimentsTemp.get(reponseAliment));
			System.out.println("Quels sont les aliments nécessaire à la recette parmi la liste suivante? :");
			for (int i=0;i<lesAlimentsTemp.size();i++){
				System.out.println(i+"."+lesAlimentsTemp.get(i).getNomAliment());
			}
			System.out.println("-1 quand vous avez fini.");
			
			}
			
			System.out.println("vous avez répondu -1");
			Menu();
			
			
			
			
			
		}
		// Consulter la liste des recettes
		if(reponse ==3){
			System.out.println("réponse 3");
		}
		//Quitter
		if(reponse==4){
			System.exit(0);
		}
		
	}
}	


