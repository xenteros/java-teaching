package pass;

import pass.model.Dog;

/**
 * Created by agurgul on 22.06.2017.
 */
public class Main {

    public static void main(String[] args) {
        Dog d = new Dog("Fifi");
        barkify(d);
        System.out.println(d.toString());
        burkify(d);
        System.out.println(d.toString());
    }

    public static void barkify(Dog d) {
        System.out.println(d.toString());
        d = new Dog("Bark");
        System.out.println(d.toString());
    }

    public static void burkify(Dog d) {
        d.setName("Burk");
    }
}