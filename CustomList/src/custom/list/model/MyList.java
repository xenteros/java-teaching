package custom.list.model;

/**
 * Created by agurgul on 26.06.2017.
 */
public class MyList {

    private String value;
    private MyList nextElement;

    public MyList(String value) {
        this.value = value;
    }

    public void add(String s) {
        if (nextElement == null) {
            nextElement = new MyList(s);
        } else {
            nextElement.add(s);
        }
    }

    public void add(String s, int i) {
        if (i > 0) {
            nextElement.add(s, --i);
        } else {
            MyList next = new MyList(this.value);
            next.setNextElement(this.nextElement);

            this.nextElement = next;
            this.value = s;
        }
    }

    public void remove(String string) {
        if (!value.equals(string)) {
            nextElement.remove(string);
        } else {
            this.value = nextElement.value;
            this.nextElement = this.nextElement.getNextElement();
        }
    }


    public void print() {
        System.out.println(value);
        if (nextElement != null) {
            nextElement.print();
        }
    }



    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public MyList getNextElement() {
        return nextElement;
    }

    public void setNextElement(MyList nextElement) {
        this.nextElement = nextElement;
    }
}
