public class MainClass {

    public static void main(String args[]){
        try {
            Fruit apple = FruitFactory.getFruit("Apple");
            Fruit banana = FruitFactory.getFruit("Banana");

            apple.get();
            banana.get();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

}
