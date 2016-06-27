package teaching;

/**
 * Created by Administrator on 2016/6/27.
 */
public class OverloadTest {
    int i;
    double d;
    boolean b;

    public OverloadTest(int i, double d, boolean b) {
        this.i = i;
        this.d = d;
        this.b = b;
    }

    public OverloadTest(double d, boolean b) {
        this.d = d;
        this.b = b;
    }

    public OverloadTest(double d) {

        this.d = d;
    }

    public OverloadTest(int i) {

        this.i = i;
    }

    public OverloadTest() {

    }
    void method(double d){

    }

}
