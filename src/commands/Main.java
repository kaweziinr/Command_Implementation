package commands;

public class Main {
    public static void main(String[] args) {
        Luz luz = new Luz();

        Command ligarLuz = new LigarLuzCommand(luz);
        Command desligarLuz = new DesligarLuzCommand(luz);
    
        ControleRemoto controle = new ControleRemoto();

        controle.setCommand(ligarLuz);
        controle.pressionarBotao();

        controle.setCommand(desligarLuz);
        controle.pressionarBotao();
    }
}