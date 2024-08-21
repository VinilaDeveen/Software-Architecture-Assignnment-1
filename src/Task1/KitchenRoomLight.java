package Task1;

public class KitchenRoomLight implements Light{
    String location = "Kitchen Room light";
    int brigthnesslevel;

    @Override
    public void on() {
        brigthnesslevel = 100;
        System.out.println(location + " is ON at full brightness.");
    }

    @Override
    public void off() {
        System.out.println(location + " is OFF.");
    }

    @Override
    public void dim(int brigthnesslevel) {
        System.out.println(location + " dimmed to " + brigthnesslevel + "%.");
    }

    @Override
    public int getBrightness() {
        return brigthnesslevel;
    }
}
