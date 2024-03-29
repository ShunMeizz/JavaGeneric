package Map;

import java.util.ArrayList;

public class MyMap <K, V>{
    ArrayList<K> keyList;
    ArrayList<V> valueList;

    public MyMap() {
        keyList = new ArrayList<>();
        valueList = new ArrayList<>();
    }
    public void put(K key, V value){
        if(keyList.contains(key)){
            valueList.set(keyList.indexOf(key), value);
        }else{
            keyList.add(key);
            valueList.add(value);
        }
    }
    public V get(K key){
        if(keyList.contains(key)){
            int index = keyList.indexOf(key);
            return valueList.get(index);
        }
        return null;
    }
    public V remove(K key){
       int index = keyList.indexOf(key);
       if(index != -1){
           keyList.remove(key);
           return valueList.remove(index);
       }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<keyList.size(); i++){
            sb.append((i+1)+": "+keyList.get(i)+", "+valueList.get(i)+"\n");
        }
        return sb.toString();
    }
}