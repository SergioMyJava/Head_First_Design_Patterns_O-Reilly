package chapter6.commandClass;

import chapter6.device.Stereo;

public class StereoOffCommand implements Command{
    Stereo stereo;

    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }


    public void undo() {
        stereo.on();
    }
}
