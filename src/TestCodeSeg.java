/**
 * Created by yiben on 2015/10/30.
 */
public class TestCodeSeg {
    static {
        System.out.println("2");
    }

    {
        System.out.println("3");
    }

    public TestCodeSeg() {
        System.err.println("4");
    }

    public static void main(String[] args) {
        new TestCodeSeg();
    }
}
