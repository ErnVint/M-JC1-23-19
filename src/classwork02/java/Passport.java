public class Passport {
    private String name;
    private int age;
    private String id;


    public Passport (String name, String id, int age){
        this.age = age;
        this.id = id;
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return id.equals(passport.id);

    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }


}
