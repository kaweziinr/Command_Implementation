package commands;

public class LigarLuzCommand implements Command {
    private Luz luz;

    public LigarLuzCommand(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void execute() {
        luz.ligar();
    }
}
