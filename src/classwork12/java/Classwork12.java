
//@TODO только на свой акк. печатать ткущий баланс двух акков. Изучить BigDecimal. Double. Float.
//@TODO перевод между людьми не менее 1 проц 5 денег. банк дает кол-во счетов и людей

public class Classwork12 {

    public static void main(String[] args) {
        User user1 = new User(1,"Afanasiy");
        User user2 = new User (2, "Nefras");
        Account a1 = new Account(user1, "a1", 20.4d);
        Account a2 = new Account(user1, "a2", 2000.44d);

        System.out.println(a1.getAmount());
        System.out.println(a2.getAmount());
        new Bank().addMoney(user1, a1,  a2, 12.1d);
        System.out.println(a1.getAmount());
        System.out.println(a2.getAmount());

    }

}
