public class Tree {
    public Directory root;

    public Tree(Directory root) {
        this.root = root;
    }

    public void add(Directory directory) {
        Directory current = root;
        while (true) {
            if (directory.name.compareTo(current.name) < 0) {
                if (current.left == null) {
                    current.left = directory;
                    break;
                } else {
                    current = current.left;
                }
            } else {
                if (current.right == null) {
                    current.right = directory;
                    break;
                } else {
                    current = current.right;
                }
            }
        }
    }

    public void traverse(Directory directory) {
        if (directory == null) {
            return;
        }

        traverse(directory.left);
        System.out.println(directory.name);
        traverse(directory.right);
    }

}
