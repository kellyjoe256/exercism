public class Twofer {
    public String twofer(String name) {
        return "One for " + ((name == null || name.equals("")) ? "you" : name) + ", one for me.";
    }
}
