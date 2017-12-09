public class Twofer {
    public String twofer(String name) {

       return String.format("one for %s, one for me.", name == null? "you" : name);
    }
}