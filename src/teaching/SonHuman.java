package teaching;//import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by 932940344@qq.com
 * on 2016/6/24
 */
public class SonHuman extends Human {
    public SonHuman(String name) {
        super(name);
        System.out.println("invoke Human age");
    }
    boolean haveChildren;
}
