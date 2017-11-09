package lsg.consumables;

import lsg.consumables.drinks.Coffee;
import lsg.consumables.drinks.Whisky;
import lsg.consumables.drinks.Wine;
import lsg.consumables.food.Americain;
import lsg.consumables.food.Hamburger;

import java.util.HashSet;

public class MenuBestOfV3 extends HashSet<Consumable> {

    public MenuBestOfV3(){
        this.add(new Hamburger());
        this.add(new Wine());
        this.add(new Americain());
        this.add(new Coffee());
        this.add(new Whisky());
    }

    @Override
    public String toString() {
        String str = getClass().getSimpleName()+" :\n";
        int i = 0;
        for(Consumable aff :this){
            str += i+1 + " : " + aff.toString() +"\n";
            i++;
        }
        return str;
    }

    public static void main(String[] args) {
        MenuBestOfV3 m1 = new MenuBestOfV3();
        System.out.println(m1.toString());
    }
}
