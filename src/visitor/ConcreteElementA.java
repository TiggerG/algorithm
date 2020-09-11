package visitor;

/**
 * @author ：liubaosong
 * @date ：Created in 2020/8/19 10:54
 * @description：具体元素
 */
public class ConcreteElementA extends Element{


    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }
}
