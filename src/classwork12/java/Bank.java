public class Bank {


    void addMoney(User user,Account senderNumber, Account receiverNumber, double amount) {

         if (senderNumber.getUserId()==receiverNumber.getUserId()){

                senderNumber.setAmount(senderNumber.getAmount()-amount);
             receiverNumber.setAmount((receiverNumber.getAmount()+amount));
         }



    }

    enum Curr{
        USD,
        EUR,
        BYN,
        RYR
    }
}
