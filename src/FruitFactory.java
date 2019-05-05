public class FruitFactory {

    public static Fruit getFruit(String type) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        if(type.equalsIgnoreCase("apple")){
            return Apple.class.newInstance();
        }else if(type.equalsIgnoreCase("banana")){
            return Banana.class.newInstance();
        }else{
            System.out.println("找不到相应的实例");
            return null;
        }
    }

    //        Class fruit = Class.forName(type);
//        return (Fruit) fruit.newInstance();

}
