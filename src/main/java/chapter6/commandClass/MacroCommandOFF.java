package chapter6.commandClass;

public class MacroCommandOFF implements Command {
    Command[] manyCommandOFF;

    public MacroCommandOFF(Command[] manyCommandON){
        this.manyCommandOFF = manyCommandON;
    }

    @Override
    public void execute() {
        for(int i = 0;i<manyCommandOFF.length;i++){
            manyCommandOFF[i].execute();
        }
    }


    public void undo() {

    }
}
