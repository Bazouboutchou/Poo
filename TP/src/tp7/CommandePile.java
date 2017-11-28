package tp7;

import java.util.Stack;

public class CommandePile implements ICommande {
	private Stack<String> pile;
	
	public CommandePile(Stack<String> pile) {
		super();
		this.pile = pile;
	}

	@Override
	public void execute(String str) {
		pile.push(str);
	}

	@Override
	public String toString() {
		return "CommandePile [pile=" + pile + "]";
	}

}
