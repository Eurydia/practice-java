/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.ArrayBag;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author bli
 */
public class ArrayBag {

    private final ArrayList<BagItem> data;

    public ArrayBag() {
        this.data = new ArrayList<>();
    }

    public void add(String item, int num) {
        if (num <= 0) {
            throw new IllegalArgumentException();
        }
        BagItem bi = getItem(item);
        if (bi == null) {
            data.add(new BagItem(item, num));
        } else {
            bi.addNum(num);
        }
    }

    public boolean contains(String item) {
        BagItem bi = getItem(item);
        return (bi != null);
    }

    public Integer remove(String item) {
        BagItem bi = getItem(item);
        if (bi != null) {
            data.remove(bi);
            return bi.getNum();
        }
        return null;
    }

    public boolean remove(String item, int num) {
        if (num <= 0) {
            throw new IllegalArgumentException();
        }
        BagItem bi = getItem(item);
        if (bi == null) {
            return false;
        }
        int left = bi.getNum() - num;
        if (left > 0) {
            bi.setNum(left);
        } else {
            remove(item);
        }
        return true;
    }

    public int howMany(String item) {
        BagItem bi = getItem(item);
        if (bi != null) {
            return bi.getNum();
        }
        return 0;
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public void clear() {
        data.clear();
    }

    public ArrayList<String> items() {
        ArrayList<String> items = new ArrayList<>();
        for (BagItem bi : data) {
            items.add(bi.getItem());
        }
        return items;
    }

    public ArrayBag union(ArrayBag arrayBag) {
        ArrayBag result = new ArrayBag();
        for (BagItem bi : arrayBag.data) {
            result.add(bi.getItem(), bi.getNum());
        }
        for (BagItem bi : data) {
            result.add(bi.getItem(), bi.getNum());
        }
        return result;
    }

    // Implement intersection and difference here
    public ArrayBag intersect(ArrayBag other) {
        ArrayBag result = new ArrayBag();
        for (var item : this.data) {
            BagItem otherItem = other.getItem(item.getItem());
            if (otherItem == null) {
                continue;
            }

            int count = Math.min(
                    otherItem.getNum(),
                    item.getNum()
            );
            result.add(item.getItem(), count);
        }
        return result;
    }

    public ArrayBag difference(ArrayBag other) {
        ArrayBag result = new ArrayBag();
        for (var item : this.data) {
            BagItem otherItem = other.getItem(item.getItem());
            if (otherItem != null) {
                continue;
            }
            result.add(item.getItem(), item.getNum());
        }
        return result;
    }


    private BagItem getItem(String item) {
        for (BagItem bi : this.data) {
            if (item.equals(bi.getItem())) {
                return bi;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Bag{" + "data=" + data + '}';
    }
}
