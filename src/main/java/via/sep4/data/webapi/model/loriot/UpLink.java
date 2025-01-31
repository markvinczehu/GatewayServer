package via.sep4.data.webapi.model.loriot;

import via.sep4.data.webapi.util.Constants;

public class UpLink {
    private String cmd;
    private String eui;
    private long ts;
    private boolean ack;
    private double fcnt;
    private int port;
    private String data;

    /**
     * This model is for the data that are received from the Loriot Network.
     */
    public UpLink(String eui, long ts, boolean ack, double fcnt, int port, String data) {
        this.cmd = Constants.RECEIVE_COMMAND;
        this.eui = eui;
        this.ts = ts;
        this.ack = ack;
        this.fcnt = fcnt;
        this.port = port;
        this.data = data;
    }

    public String getCmd() {
        return cmd;
    }

    public String getEui() {
        return eui;
    }

    public void setEui(String eui) {
        this.eui = eui;
    }

    public long getTs() {
        return ts;
    }

    public boolean isAck() {
        return ack;
    }

    public double getFcnt() {
        return fcnt;
    }

    public int getPort() {
        return port;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "UpLinkMessage{" +
                "cmd='" + cmd + '\'' +
                ", EUI='" + eui + '\'' +
                ", ts=" + ts +
                ", ack=" + ack +
                ", fcnt=" + fcnt +
                ", port=" + port +
                ", data='" + data + '\'' +
                '}';
    }
}
