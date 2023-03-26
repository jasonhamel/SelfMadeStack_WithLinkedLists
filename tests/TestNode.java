import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestNode {
    Node<String> nodes;

    @Before
    public void setup() {
        nodes = new Node<>("Node 1");
    }

    @Test
    public void testNodeCreation() {
        Assert.assertEquals("Node 1", nodes.getValue());
        Assert.assertNull(nodes.getNext());
    }

    @Test
    public void testSetNext() {
        nodes.setNext(new Node<>("Node 2"));
        Assert.assertEquals("Node 2", nodes.getNext().getValue());
    }
}
