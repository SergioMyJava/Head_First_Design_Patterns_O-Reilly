package chapter6.commandClass;

import chapter6.device.SecurityControl;

public class SecurityControlOn implements Command{
    SecurityControl securityControl;

    public SecurityControlOn(SecurityControl securityControl){
        this.securityControl = securityControl;
    }

    @Override
    public void execute() {
        securityControl.off();
    }


    public void undo() { securityControl.on(); }
}
