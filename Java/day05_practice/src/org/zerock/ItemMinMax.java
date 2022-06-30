package org.zerock;

import java.util.Arrays;

public class ItemMinMax {
    Item[] ch = new ItemArr().itemSet();
    Item maxItem = new Item("",0);
    Item minItem = new Item("",100000);;
    Item[] chSelct = new Item[2];

    public Item[] ItemCalculate(int money){
        Item[] itemRange = new Restaurant().itemSelct(ch, money);
        for (Item temp : itemRange) {
            if (maxItem.price < temp.price) {
                maxItem = temp;
            }
            if (minItem.price > temp.price) {
                minItem = temp;
            }
        }
        chSelct[0] = minItem;
        chSelct[1] = maxItem;

        return chSelct;
    }
}
