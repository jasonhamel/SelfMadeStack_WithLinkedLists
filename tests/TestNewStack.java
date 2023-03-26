import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestNewStack {
    NewStack<Integer> ns;

    @Before
    public void setup() {
        ns = new NewStack<>();
    }

    @Test
    public void testPush() {
        ns.push(1);
        ns.push(2);
        ns.push(3);
        Assert.assertEquals(3, ns.getLength());
    }

    @Test
    public void testPeek() {
        ns.push(1);
        Assert.assertEquals(1, (int)ns.peek().getValue());
        ns.push(2);
        Assert.assertEquals(2, (int)ns.peek().getValue());
        ns.push(3);
        Assert.assertEquals(3, (int)ns.peek().getValue());
    }

    @Test
    public void testPop() {
        ns.push(1);
        ns.push(2);
        ns.push(3);
        Assert.assertEquals(3, (int)ns.peek().getValue());
        Assert.assertEquals(3, ns.getLength());
        ns.pop();
        Assert.assertEquals(2, (int)ns.peek().getValue());
        Assert.assertEquals(2, ns.getLength());
        Node<Integer> testNode = ns.pop();
        Assert.assertEquals(2, (int)testNode.getValue());
        Assert.assertEquals(1, (int)ns.peek().getValue());
        Assert.assertEquals(1, ns.getLength());
    }

    @Test
    public void testIsEmpty() {
        Assert.assertTrue(ns.isEmpty());
        ns.push(1);
        Assert.assertFalse(ns.isEmpty());
        ns.push(2);
        ns.push(3);
        Assert.assertFalse(ns.isEmpty());
        ns.pop();
        ns.pop();
        Assert.assertFalse(ns.isEmpty());
        ns.pop();
        Assert.assertTrue(ns.isEmpty());
    }
}
