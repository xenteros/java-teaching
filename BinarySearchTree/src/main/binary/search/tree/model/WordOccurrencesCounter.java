package binary.search.tree.model;

/**
 * Created by agurgul on 28.06.2017.
 */
public class WordOccurrencesCounter implements Comparable {

    private String word;
    private Integer count;

    public WordOccurrencesCounter() {
    }

    public WordOccurrencesCounter(String word) {
        this.word = word;
        this.count = 1;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int compareTo(Object o) {
        WordOccurrencesCounter word = (WordOccurrencesCounter)o;
        return this.word.compareTo(word.getWord());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WordOccurrencesCounter that = (WordOccurrencesCounter) o;

        return word != null ? word.equals(that.word) : that.word == null;
    }

    @Override
    public int hashCode() {
        return word != null ? word.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "WordOccurrencesCounter{" +
                "word='" + word + '\'' +
                ", count=" + count +
                '}';
    }
}
