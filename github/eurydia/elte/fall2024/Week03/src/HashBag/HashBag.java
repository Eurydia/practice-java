/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.HashBag;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bli
 */
public class HashBag {
    HashMap<String, Integer> data;

    public HashBag() {
        data = new HashMap<>();
    }

    public void add(String item, int num) {
        if (num <= 0) {
            throw new IllegalArgumentException();
        }
        if (!data.containsKey(item)) {
            data.put(item, num);
        } else {
            data.put(item, data.get(item) + num);
        }
    }

    public boolean contains(String item) {
        return data.containsKey(item);
    }

    public Integer remove(String item) {
        return data.remove(item);
    }

    public boolean remove(String item, int num) {
        if (!data.containsKey(item)) {
            return false;
        } else {
            int left = data.get(item) - num;
            if (left > 0) {
                data.put(item, left);
            } else {
                data.remove(item);
            }
            return true;
        }
    }

    public int howMany(String item) {
        Integer num = data.get(item);
        return num != null ? num : 0;
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public void clear() {
        data.clear();
    }

    public HashBag union(HashBag hashBag) {
        HashBag result = new HashBag();
        for (Map.Entry<String, Integer> entry : hashBag.data.entrySet()) {
            result.add(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : this.data.entrySet()) {
            result.add(entry.getKey(), entry.getValue());
        }
        return result;
    }

    // Implement intersection and difference here
    public HashBag intersect(HashBag other) {
        HashBag result = new HashBag();
        for (Map.Entry<String, Integer> entry : this.data.entrySet()) {
            var otherItem = other.data.get(entry.getKey());
            if (otherItem == null || otherItem == 0) {
                continue;
            }
            int count = Math.min(entry.getValue(), otherItem);
            result.add(entry.getKey(), count);
        }
        return result;
    }

    public HashBag difference(HashBag other) {
        HashBag result = new HashBag();
        for (Map.Entry<String, Integer> entry : this.data.entrySet()) {
            var otherItem = other.data.get(entry.getKey());
            if (otherItem != null && otherItem > 0) {
                continue;
            }
            result.add(entry.getKey(), entry.getValue());
        }
        return result;
    }

    @Override
    public String toString() {
        return "Bag{" + "data=" + data + '}';
    }
}
