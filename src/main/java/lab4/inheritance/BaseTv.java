package lab4.inheritance;

import lab4.TVInterface;

abstract class BaseTv implements TVInterface {

    private int volume;
    private String channel = "MTV";

    BaseTv(int volume) {
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        } else {
            showWarning();
        }
    }

    @Override
    public void decreaseVolume() {
        volume--;
    }

    @Override
    public String getChannel() {
        return channel;
    }

    @Override
    public void setChannel(String channel) {
        this.channel = channel;
    }

    private void showWarning() {
        System.out.println("Warning! Max volume reached");
    }
}
