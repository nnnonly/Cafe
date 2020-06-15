package AVLTree;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        ODRS<String> tree = new ODRS<>();
        // String[] names = new String[10];
        // names[0] = "Banh mi";
        // names[1] = "Banh bao";
        // names[2] = "h asd";
        // names[3] = "Banh pate";
        // names[4] = "Banh mi dua ngot";
        // names[5] = "Banh mi khong";
        // names[6] = "Banh opela";
        // names[7] = "Banh caream";
        // names[8] = "Banh ngot";
        // names[9] = "asdas";

        // Arrays.sort(names);
        // int id_bm_bd = 0;
        // int id_bm_kt = 7;

        // for (String name: names) {
        //     System.out.println(name);
        // }

        // for (int i = 0;i < 10;++ i) {
        //     tree.addNode(i);
        // }
        tree.addNode("banh my" );
        tree.addNode("banh bao");
        tree.printTree();

        // tree.search("Banh", "Banh");
    }
}