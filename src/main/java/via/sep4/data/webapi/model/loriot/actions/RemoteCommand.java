package via.sep4.data.webapi.model.loriot.actions;

public class RemoteCommand {
    private int value;
    private int destinationPort;

    public RemoteCommand(int value, int destinationPort) {
        this.value = value;
        this.destinationPort = destinationPort;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(int destinationPort) {
        this.destinationPort = destinationPort;
    }
}
