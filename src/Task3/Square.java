package Task3;

public class Square implements Shape{
    @Override
    public void draw() {
        int s = 5; //Adjust the side length

        for (int i=0; i<s; i++){
            for (int j=0; j<s; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
