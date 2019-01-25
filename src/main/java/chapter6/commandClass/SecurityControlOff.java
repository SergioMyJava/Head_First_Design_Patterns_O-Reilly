package chapter6.CommandClass;

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

    @Override
    public void undo() {
        securityControl.on();
    }
}
