package Day10Klasy.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeDemo {
    public static void main(String[] args) {
        class Tree {
            public void display() {
                System.out.println("Zwyk³e Drzewo");
            }
        }

        List<Tree> forest = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Tree tree = new Tree();
            forest.add(tree);

        }
        Tree magicTree = new Tree() {
            @Override
            public void display() {
                System.out.println("@@@@@@ MAGICZNE DRZEWO @@@@@");
            }
        };
        forest.add(magicTree);
        Collections.shuffle(forest);

        for (Tree tree : forest) {
            tree.display();
        }

    }
}
