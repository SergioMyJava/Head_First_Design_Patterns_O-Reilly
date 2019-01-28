package chapter6.commandClass;

import chapter6.device.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }


    public void undo() {
        light.off();
    }
}
