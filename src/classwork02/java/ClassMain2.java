import java.util.HashMap;
import java.util.Map;

class Main2 {
    public static void main(String[] args) {
        Passport passport1 = new Passport("Vasia", "123", 10);
        Passport passport2 = new Passport("las", "12223", 210);
        Passport passport3 = new Passport("pas", "322123", 310);

        Map<Passport, Integer> data = new HashMap<Passport, Integer>();
        data.put(passport1, 1);
        data.put(passport2, 2);
        data.put(passport3, 3);
        System.out.printf(String.valueOf(passport1));
        System.out.printf(String.valueOf(passport2));
        System.out.printf(String.valueOf(passport3));

        System.out.printf(String.valueOf(data.get(passport1)));
        System.out.printf(String.valueOf(data.get(passport2)));
        System.out.printf(String.valueOf(data.get(passport3)));
    }
}
