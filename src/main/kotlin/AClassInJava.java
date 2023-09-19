public class AClassInJava {
    private String name;
    int count;

    public AClassInJava(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public AClassInJava(String name) {
        this.name = name;
        this.count = 0;
    }

    // Getters and Setters
    public void setName(String name) {

    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        AClassInJava c = new AClassInJava("Java", 0);
        AClassInJava d = new AClassInJava("Java again");

    }
}
