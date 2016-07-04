package cn.src.books.teachter.teaching;

/**
 * Created by Administrator
 *2016/6/28.
 */
public abstract class AbstractTest {
    private int i;

    public abstract String method(String s);

//    public void m1(){
//        i=0;
//    }
    public abstract void m2();


    public void main(String[] args) {
        SubAbstractTest subAbstractTest=new SubAbstractTest();
        subAbstractTest.m2();


    }
class SubAbstractTest extends AbstractTest{

    @Override
    public String method(String s) {
        return null;
    }

    @Override
    public void m2() {

    }
}
}
