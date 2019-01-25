package chapter6.CommandClass;

public class MacroCommandON implements Command {
    Command[] manyCommandON;

    public MacroCommandON(Command[] manyCommandON){
        this.manyCommandON = manyCommandON;
    }

    @Override
    public void execute() {
        for(int i = 0;i<manyCommandON.length;i++){
            manyCommandON[i].execute();
        }
    }

    @Override
    public void undo() {

    }
}
