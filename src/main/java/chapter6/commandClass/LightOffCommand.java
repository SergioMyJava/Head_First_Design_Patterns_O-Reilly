package chapter6.commandClass;

import chapter6.device.Light;

public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }


    public void undo() {
        light.on();
    }
}

