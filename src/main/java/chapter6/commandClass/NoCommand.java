package chapter6.commandClass;

public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println(" No Command ");
    }


    public void undo() {
        System.out.println(" No Command ");
    }
}
