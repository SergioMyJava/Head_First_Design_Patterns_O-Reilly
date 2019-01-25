package chapter6;

import chapter6.CommandClass.*;
import chapter6.controller.SimpleRemoteControl;
import chapter6.device.*;

public class Application {

    public static void main(String[] args ){

        // создаем объекты которыми будем управлять с пульта и сам пульт SimpleRemoteControl
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        SecurityControl securityControl = new SecurityControl();
        Stereo stereo = new Stereo("Stereo in dining room");
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        CeilingFan celingFan = new CeilingFan("Living room");

        // создаем объекты комманд, которые выполняют действия в созданных выше объектах

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        NoCommand noCommand = new NoCommand();
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        SecurityControlOff securityControlOff = new SecurityControlOff(securityControl);
        SecurityControlOn securityControlOn = new SecurityControlOn(securityControl);

        StereoOffCommand srereoOffCommand = new StereoOffCommand(stereo);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);

        //создаем несколько скоростей работы вентилятора

        CeilingFanLowCommand fanLowCommand = new CeilingFanLowCommand(celingFan);
        CeilingFanMediumCommand fanMediumCommand = new CeilingFanMediumCommand(celingFan);
        CeilingFanOffCommand fanOFFCommand = new CeilingFanOffCommand(celingFan);

        //присваиваем кнопкам команды вкл или выкл
        simpleRemoteControl.setCommand(0,garageDoorOpenCommand,garageDoorCloseCommand);
        simpleRemoteControl.setCommand(1,lightOnCommand,noCommand);
        simpleRemoteControl.setCommand(2,securityControlOn,securityControlOff);
        simpleRemoteControl.setCommand(3,stereoOnWithCDCommand,srereoOffCommand);
        simpleRemoteControl.setCommand(4,fanLowCommand,fanOFFCommand);
        simpleRemoteControl.setCommand(5,fanMediumCommand,fanOFFCommand);

        //выводим содержимое массива в котором хранятся кнопки
        System.out.println(simpleRemoteControl);

        //жмеем кнопки проверяем что будет

        simpleRemoteControl.onButtonPressed(0);
        simpleRemoteControl.offButtonPressed(0);
        System.out.println();
        simpleRemoteControl.onButtonPressed(1);
        simpleRemoteControl.offButtonPressed(1);
        System.out.println();
        simpleRemoteControl.onButtonPressed(3);
        simpleRemoteControl.offButtonPressed(3);
        simpleRemoteControl.undoButtonPressed();
        System.out.println();
        simpleRemoteControl.onButtonPressed(4);
        simpleRemoteControl.onButtonPressed(5);
        simpleRemoteControl.undoButtonPressed();
        System.out.println();


        //необходимо создать кнопку которая будет совершать несколько действий
        //создаем два массива с командами отключающими включающими
        Command[] manyCommandON = {stereoOnWithCDCommand,fanMediumCommand,lightOnCommand};
        Command[] manyCommandOFF= {srereoOffCommand,fanOFFCommand,lightOffCommand};

        //создаем две команды вкл и выкл
        MacroCommandON macroCommandON = new MacroCommandON(manyCommandON);
        MacroCommandOFF macroCommandOFF = new MacroCommandOFF(manyCommandOFF);

        //передаем их в кнопку
        simpleRemoteControl.setCommand(6,macroCommandON,macroCommandOFF);
        System.out.println("Party is on!");

        simpleRemoteControl.onButtonPressed(6);
    }
}
