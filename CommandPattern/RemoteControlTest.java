package CommandPattern;

public class RemoteControlTest {
  public static void main(String[] args) {
    SimpleRemoteControl remote = new SimpleRemoteControl();
    Light myLight = new Light();
    LightOnCommand lightCommand = new LightOnCommand(myLight);

    remote.setCommand(lightCommand);
    remote.buttonWasPressed();
  }
}
