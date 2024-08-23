package Task3;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        int l = 5; //Adjust the length
        int w = 3; //Adjust the width
        for (int i=0; i<w; i++){
            for (int j=0; j<l; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
