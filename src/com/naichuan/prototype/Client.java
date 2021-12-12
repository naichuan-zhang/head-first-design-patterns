package com.naichuan.prototype;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class Client {
    public static void main(String[] args) {
        Monster monster1 = new Dragon("Lagon", false);
        Monster monster2 = new Drakon("Drakon", 2, true);
        Monster monsterCopy1 = operation(monster1);
        Monster monsterCopy2 = operation(monster2);

        System.out.println(monster1);
        System.out.println(monster2);
        System.out.println(monsterCopy1);
        System.out.println(monsterCopy2);
    }

    private static Monster operation(Monster monster) {
        Monster mCopy = null;
        try {
            mCopy = monster.copy();
            System.out.println("Operating with mCopy!");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mCopy;
    }
}
