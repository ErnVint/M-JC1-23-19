public class Homework07 {
    public static void main(String[] args) {
        System.out.println("Изучить конструкцию try - catch - finally. Попробовать разделить число на 0 и обработать эту ситуацию при помощи:\n" +
                " 1.1 try - catch\n");
        int i = 1;
        try {
            i=i/0;
        } catch (Exception e) {
            System.out.println("Cannot divided by zero.");
        }
        System.out.println("_______________________");

        System.out.println("try - finally\n");
//        try {
//            i=i/0;
//        }finally {
//            System.out.println(i);
//        }
        System.out.println("_______________________");

        System.out.println("try - catch - finally\n");
        try {
            i=i/0;
        } catch (Exception e) {
            System.out.println("Cannot divided by zero.");
            i=100;
        }finally {
            System.out.println(i);
        }
        System.out.println("_______________________");

        System.out.println("2. Написать свой класс котором будет:\n" +
                " 2.1 метод который принимает 1 параметр, его обрабатывает и выбрасывать чекед эксепшн (который вы должны написать сами) при условиях заданных вами\n");
        try {
            Task2 task2 = new Task2();
            task2.task2(501);
        } catch (MyException e) {
          //  e.printStackTrace();
            System.out.println(e);
            System.out.println("Task 2 done!");
        }
        System.out.println("_______________________");

        System.out.println("2.2 Класс который будет наследовать предыдущий класс и перекрывать написанный вами метод и добавлять туда свой чекед эксепшн (новый написанный также вами)\n");
        try {
            Task21 task22 = new Task21();
            task22.task2(700);
        } catch (MyException e) {
         //   e.printStackTrace();
            System.out.println(e);
            System.out.println("Task 2.2 done");
        }
        System.out.println("_______________________");

        System.out.println("3. Написать программу которая будет обрабатывать ввод в консоль. Наполнять массив int тем что введут из консоли, давать не более трёх ошибочных попыток подряд на ввод через консоль.\n");
        int [] forTask24 = Task23.type();
        System.out.println("_______________________");

        System.out.println("4. Полученный массив через консоль преобразовать в коллекцию и отсортировать данную коллекцию по возрастанию.");
        Task24.sort(forTask24);

    }
}
