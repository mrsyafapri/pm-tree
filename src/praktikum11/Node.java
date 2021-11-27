package praktikum11;

/**
 *
 * @author Muhammad Rizki Syafapri <12050110483>
 */
public class Node {

    public int id;
    public String data;
    public Node leftChild;
    public Node rightChild;

    public void displayNode() {
        System.out.print("{ " + id + ", " + data + " } ");
    }
}
