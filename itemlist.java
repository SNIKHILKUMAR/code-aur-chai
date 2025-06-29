// package com.demo;

import java.util.ArrayList;
import java.util.Collections;

class Item implements Comparable<Item> {
    String name;
    int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override  
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null)? 0 : name.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass()!= obj.getClass())
            return false;
        Item other = (Item) obj;
        if (name == null) {
            if (other.name!= null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (price!= other.price)
            return false;
        return true;
    }

    @Override
    public int compareTo(Item item) {
        return this.price - item.price;
    }

    @Override
    public String toString() {
        return "Item [name=" + name + ", price=" + price + "]";
    }
}

public class itemlist {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Mobile", 12000));
        items.add(new Item("Laptop", 60000));
        items.add(new Item("Shirt", 2000));
        items.add(new Item("TV",12000));
        items.add(new Item("TV",8000));
        items.add(new Item("TV",15000));
        items.add(new Item("Shoes", 150));

        // search
        Item item = new Item("TV", 12000);
        System.out.println("Find TV: " + items.contains(item));

        // sort
        Collections.sort(items);

        for(int i=0;i<items.size();i++){
            System.out.println(items.get(i));
        }
    }
}