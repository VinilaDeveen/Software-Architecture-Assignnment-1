package Task1;

public interface Light {
    void on();
    void off();
    void dim(int level);
    int getBrightness(); //New method to get the current brightness
}
