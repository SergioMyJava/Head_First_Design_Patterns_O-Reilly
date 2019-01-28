package chapter6.commandClass;

import chapter6.device.SecurityControl;

public class SecurityControlOff implements Command{
    SecurityControl securityControl;

    public SecurityControlOff(SecurityControl securityControl){
        this.securityControl = securityControl;
    }

    @Override
    public void execute() {
        securityControl.off();
    }


    public void undo() {
        securityControl.on();
    }
}
