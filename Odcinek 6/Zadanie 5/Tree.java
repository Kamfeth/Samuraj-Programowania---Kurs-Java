public class Tree {
    private static Tree tree = new Tree();

    private Tree() {
    }

    public static Tree getInstance() {
        return tree;
    }
}
