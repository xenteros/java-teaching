package binary.search.tree.service;

import binary.search.tree.model.Tree;
import binary.search.tree.model.WordOccurrencesCounter;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by agurgul on 28.06.2017.
 */
public class WordCountingService {

    private Tree<WordOccurrencesCounter> tree;

    public WordCountingService() {
        this.tree = new Tree<>();
    }

    public Tree<WordOccurrencesCounter> getTree() {
        return tree;
    }

    public void add(String s) {
        WordOccurrencesCounter word = tree.get(new WordOccurrencesCounter(s));
        if (word != null) {
            word.setCount(word.getCount() + 1);
        } else {
            tree.add(new WordOccurrencesCounter(s));
        }
    }

    public List<WordOccurrencesCounter> findTop(int n) {
        return tree.sorted()
                .stream()
                .sorted(Comparator.comparingInt(WordOccurrencesCounter::getCount).reversed())
                .limit(n)
                .collect(toList());
    }


}
