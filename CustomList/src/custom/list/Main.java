package custom.list;

import custom.list.model.MyList;

/**
 * Created by agurgul on 26.06.2017.
 */
public class Main {

    public static void main(String[] args) {
        MyList presidentsOfTheUSA = new MyList("Barack Obama");
        presidentsOfTheUSA.add("Donald Trump");
        presidentsOfTheUSA.print();
        System.out.println();
        presidentsOfTheUSA.add("Ronald Regan", 1);
        presidentsOfTheUSA.print();
        System.out.println();
        System.out.println(MyList.get(presidentsOfTheUSA, 2));

    }
}
