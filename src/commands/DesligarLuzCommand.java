package commands;

public class DesligarLuzCommand implements Command {
	private Luz luz;

	public DesligarLuzCommand(Luz luz) {
		this.luz = luz;
	}

	@Override
	public void execute() {
		luz.desligar();
	}
}
