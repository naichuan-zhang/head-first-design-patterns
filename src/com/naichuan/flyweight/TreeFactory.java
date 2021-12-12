package com.naichuan.flyweight;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class TreeFactory {
    Tree d, c = null;

    public TreeFactory() {
        this.d = new DeciduousTree();
        this.c = new ConiferTree();
    }

    public Tree getTree(String type) throws Exception {
        if (type.equals("deciduous")) {
            return this.d;
        } else if (type.equals("conifer")) {
            return this.c;
        } else {
            throw new Exception("Invalid kind of tree");
        }
    }
}
