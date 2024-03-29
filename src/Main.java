import Arithmetic.Arithmetic;
import Map.MyMap;

public class Main {
    public static void main(String[] args) {
        Arithmetic<Integer, Double> a1 = new Arithmetic<>(2, 3.5);
        Arithmetic<Float, Float> a2 = new Arithmetic<>(2.83f, 0f);
        Arithmetic<Integer, Float> a3 = new Arithmetic<>(2, 5.5f);
        Arithmetic<Short, Long> a4 = new Arithmetic<>((short)2, 3L);

        System.out.println(a1.add());
        System.out.println(a2.divide());
        System.out.println(a3.multiply());
        System.out.println(a2.subtract());
        System.out.println(a4.getMin()+" and "+a4.getMax()  +"\n");

        MyMap <Integer, String> map = new MyMap<>();
        map.put(13,"Michieda");
        map.put(23,"Kyoto");
        map.put(35,"Kenma");
        map.put(11,"Todoroki");
        map.put(24,"Shunmei");

        System.out.println("Map:"+"\n"+ map);
        System.out.println("Get: " + map.get(13));
        System.out.println("Get: " + map.get(1));
        System.out.println("Remove: "+map.remove(35));
        System.out.println("Map:"+"\n"+ map);
        System.out.println("Remove: "+ map.remove(3));
    }
}