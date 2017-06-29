package binary.search.tree;

import binary.search.tree.service.WordCountingService;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by agurgul on 27.06.2017.
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        WordCountingService wordCountingService = new WordCountingService();

        File f = new File("input.txt");

        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {
            Scanner lineScanner = new Scanner(sc.next());
            while (lineScanner.hasNext()) {
                String s = lineScanner.next();
                s.replaceAll("[^A-Za-z]", "");
                if (s.length() > 4) {
                    wordCountingService.add(s.toUpperCase());
                }
            }
        }

//        wordCountingService.getTree().printInOrder();

        wordCountingService.findTop(30).forEach(w -> {
            System.out.println(w.toString());
        });

//        Tree <Integer> tree = new Tree<>();
//        tree.add(6);
//        tree.add(4);
//        tree.add(8);
//        tree.add(2);
//        tree.add(5);
//        tree.add(1);
//        tree.add(7);
//        tree.add(9);
//        tree.add(11);
//        tree.add(10);
//        tree.add(12);
//
//        tree.printInOrder();
//        System.out.println();
////        tree.printPreOrder();
//        System.out.println();
////        System.out.println(tree.get(5));
////        System.out.println(tree.get(12));
//        //tree.remove(11);
////        tree.remove(9);
//        System.out.println();
//        tree.printInOrder();
//
//        System.out.println(Arrays.toString(tree.sorted().toArray()));

    }
}
