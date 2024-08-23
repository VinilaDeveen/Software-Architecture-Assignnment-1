package Task3;

public class Triangle implements Shape{
    @Override
    public void draw() {
        int h = 5; //Adjust the height

        for (int i=1; i<=h; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
