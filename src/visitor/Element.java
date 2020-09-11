package visitor;

/**
 * @author ：liubaosong
 * @date ：Created in 2020/8/19 10:53
 * @description：
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);

}
