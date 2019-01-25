package chapter6;

import chapter6.controller.SimpleRemoteControl;
import chapter6.device.GarageDoor;
import chapter6.device.Light;
import chapter6.device.Stereo;

public class ApplicationLambda {

    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");

        remoteControl.setCommand(0, ()->{livingRoomLight.on();}, ()->{livingRoomLight.off();});//почему то лямбда не работатет
        remoteControl.setCommand(1, kitchenLight::on, kitchenLight::off);// я так понимаю эта запись типо лямбда то-же самое

        remoteControl.onButtonPressed(0);
        remoteControl.offButtonPressed(0);
        remoteControl.onButtonPressed(1);
        remoteControl.offButtonPressed(1);

    }
}
