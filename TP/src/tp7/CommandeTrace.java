package tp7;

public class CommandeTrace implements ICommande {

	@Override
	public void execute(String str) {
		System.out.println("méthode appelé : " + str);
	}

}
