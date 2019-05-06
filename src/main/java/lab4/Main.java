package lab4;

public class Main {

    public static void main(String[] args) {
        TVInterface mainRoomTv = new SamsungTv(90);
        TVInterface kitchenTv = new LgTv(10);

        mainRoomTv.setChannel("VIVA!");
        kitchenTv.setChannel("Comedy central");

        System.out.println("Main room TV channel: " + mainRoomTv.getChannel());
        System.out.println("Kitchen TV channel: " + kitchenTv.getChannel());
        System.out.println("Main room TV volume: " + mainRoomTv.getVolume());
        System.out.println("Kitchen TV volume:" + kitchenTv.getVolume());

        kitchenTv.increaseVolume();
        System.out.println("Kitchen TV volume:" + kitchenTv.getVolume());

        System.out.println(SamsungTv.BRAND);
    }
}
