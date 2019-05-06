package lab4;

public class SamsungTv implements TVInterface {

    public static String BRAND = "Samsung";

    private int volume;
    private String channel = "MTV";

    public SamsungTv(int volume) {
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
