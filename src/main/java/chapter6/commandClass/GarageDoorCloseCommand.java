package chapter6.commandClass;

import chapter6.device.GarageDoor;

public class GarageDoorCloseCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }


    public void undo() {
        garageDoor.up();
    }
}
