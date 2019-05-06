package lab4.inheritance;

class LgTv extends BaseTv {

    LgTv(int volume) {
        super(volume);
    }

    @Override
    public void increaseVolume() {
        System.out.println("It's broken!");
    }
}
