
public class Main {
    public static void main(String[] args){
        BinTree<Integer> tree = new BinTree<>();

        tree.add(5);
        tree.add(1);
        tree.add(9);
        tree.add(8);
        tree.add(4);
        tree.add(7);
        tree.add(6);
        tree.add(2);

//        tree.remove(8);

        tree.print();

    }
}