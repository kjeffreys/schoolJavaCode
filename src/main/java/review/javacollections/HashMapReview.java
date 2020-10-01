package main.java.scheduler;

import java.util.Map;
import java.util.HashMap;

public class HashMapReview
{
    public static void main(String[] args)
    {
        Map<String, Integer> staff = new HashMap<>();
        staff.put("144-25-5464", 100 );
        staff.put("567-24-2546", 500);
        staff.put("257-62-7935", 200);
        staff.put("458-24-5526", 400);

        // print all entries
        System.out.println(staff);

        // remove an entry
        staff.remove("567-24-2546");

        // replace an entry
        staff.put("257-62-7935", 22000);

        // look up a value
        System.out.println(staff.get("144-25-5464"));

        // iterate through all entries
        staff.forEach((k, v) ->
                System.out.println("key=" + k + ", value=" + v));

        /*
        * Other java.util.Map methods include:
        *
        * // get the value associated with key; returns obj. or defaultValue
        * // if key is not found in map
        * getOrDefault(Object key, V defaultValue)
        *
        * // adds all entries from specified map to this map
        * putAll(Map<? extends K, ? extends V> entries)
        *
        * // containsKey(Object key)
        * returns true if key is present in map
        *
        * // returns true if the value is present in the map
        * containsValue(Object value)
        *
        * // applies the action to all key/value pairs of this map
        * forEach(BiConsumer<? super K, ? super V> action)
        *
         */

    }
}
