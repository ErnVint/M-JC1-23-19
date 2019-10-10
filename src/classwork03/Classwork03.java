import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Classwork03 {


        public static void main (String[] args) {
            String s1 = "Cat";
            String s2 = "Cat";
            String s3 = new String("Cat");
            String s4 = s3.intern();
            System.out.println("s1==s2 "+(s1==s2));
            System.out.println("s1==s3 "+(s1==s3));
            System.out.println("s1==s4 "+(s1==s4));

            Integer intObject = new Integer(3);
            int aa = 3;
            System.out.println(aa == intObject);


            String a1 = "I love you JAVA";
            //a1.contains("i");
            System.out.println(a1.toLowerCase().contains("i"));
            //a1.endsWith("JAVA");
            System.out.println(a1.contains("JAVA"));


            System.out.println("\n\t\rregex " + "I love JAVA".matches("!?"));

            /*String str = "Test      string for split";
            String[] words = str.split(" +");
            for (String word : words){
                System.out.println(word + " ");


            }*/
                Pattern pattern = Pattern.compile("www\\.(\\w+)\\.(by)");
                Matcher matcher = pattern.matcher("    www.tut.by  www.mo.by  ");
                while (matcher.find()) {
                System.out.println(matcher.group(2));
                }

                String pattern_email = "(\\w+)@(\\w+)";
                Pattern pattern1 = Pattern.compile(pattern_email);
                String[] emails = new String[] {
                        "ernvint@gmail.com",
                        "sdgs@tut.by",
                        "qewgsdsdgf@fas.com"
                };

                for (int i=0; i<emails.length; i++){
                    pattern1.matcher(emails[i]);
                    System.out.print(emails[i] + " ");
                    Matcher matcher1 = pattern1.matcher(emails[i]);
                    System.out.println(matcher1.find());
                }

            String pattern_tel = "(\\.)";
            Pattern pattern2 = Pattern.compile(pattern_tel);
            String[] tel = new String[] {
                    "+375 33 6666255",
                    "+375 29 6666222",
                    "qewgsdsdgf@fas.com"
            };

            for (int i=0; i<tel.length; i++){
                pattern2.matcher(tel[i]);
                System.out.print(tel[i] + " ");
                Matcher matcher2 = pattern2.matcher(emails[i]);
                System.out.println(matcher2.find());
            }

        }


}
