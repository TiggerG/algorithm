package visitor;

/**
 * @author ：liubaosong
 * @date ：Created in 2020/8/19 10:22
 * @description：访问者
 */
public abstract class Visitor {
    public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);
    public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}
