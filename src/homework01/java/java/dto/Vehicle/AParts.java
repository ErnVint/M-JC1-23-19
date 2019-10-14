package java.dto.Vehicle;

public abstract class AParts implements IParts {
    public void install() {
        System.out.println(this.getPartName() + " installed");
    }

    public void remove() {
        System.out.println(this.getPartName() + " removed");
    }
}
