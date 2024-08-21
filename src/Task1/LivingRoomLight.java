package Task1;

public class LivingRoomLight implements Light{
    String location = "Living Room light";
    int brightnesslevel;

    @Override
    public void on() {
        brightnesslevel = 100;
        System.out.println(location + " is ON at full brightness.");
    }

    @Override
    public void off() {
        System.out.println(location + " is OFF.");
    }

    @Override
    public void dim(int brightnesslevel) {
        System.out.println(location + " dimmed to " + brightnesslevel + "%.");
    }

    @Override
    public int getBrightness() {
        return brightnesslevel;
    }
}
