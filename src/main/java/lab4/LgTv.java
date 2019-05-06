package lab4;

public class LgTv implements TVInterface{

    private int volume;
    private String channel = "TVN";

    public LgTv(int volume) {
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void increaseVolume() {
        System.out.println("It's broken!");
    }

    @Override
    public void decreaseVolume() {
        volume-=2;
    }

    @Override
    public String getChannel() {
        return channel;
    }

    @Override
    public void setChannel(String channel) {
        this.channel = channel;
    }
}
