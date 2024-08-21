package Task1;

public class LightDimCommand implements Command{
    Light light;
    int newBrightness;
    int previousBrightness;


    public LightDimCommand(Light light, int level) {
        this.light = light;
        this.newBrightness = level;
    }

    @Override
    public void execute() {
        previousBrightness = light.getBrightness(); //Store the current brightness level
        light.dim(newBrightness); //Set the new brightness level
    }

    @Override
    public void undo() {
        light.dim(previousBrightness); //Restore the previous brightness level
    }

}
