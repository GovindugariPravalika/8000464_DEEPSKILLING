public class CommandTest {

    public static void main(String[] args) {

        Light roomLight = new Light();

        Command lightOn = new LightOnCommand(roomLight);
        Command lightOff = new LightOffCommand(roomLight);

        RemoteControl remote = new RemoteControl();

        System.out.println("Turning Light ON:");

        remote.setCommand(lightOn);
        remote.pressButton();

        System.out.println();

        System.out.println("Turning Light OFF:");

        remote.setCommand(lightOff);
        remote.pressButton();
    }
}