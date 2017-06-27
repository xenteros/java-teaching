package custom.list;

import custom.list.model.MyGenericList;

/**
 * Created by agurgul on 26.06.2017.
 */
public class Main {

    public static void main(String[] args) {

        MyGenericList<String> list = new MyGenericList<>("Barack Obama");
        list.addRecursive("Donald Trump");
        list.print();
    }
}
