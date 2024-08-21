package Task2;

public abstract class Beverages {
    boolean wantsExtras;

    void boilWater(){
        System.out.println("Boiling water");
    }

    abstract void brew();

    void pourInCup(){
        System.out.println("Pouring into cup");
    }

    abstract void addCondiments();

    void addExtra(){
        if (wantsExtras){
            System.out.println("Adding vanilla syrup");
        }
    }

    public void finalTemplateMethod(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if (wantsExtras){
            addExtra();
        }
    }

    public void setWantsExtras(boolean wantsExtras) {
        this.wantsExtras = wantsExtras;
    }
}
