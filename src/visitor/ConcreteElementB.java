package visitor;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author ：liubaosong
 * @date ：Created in 2020/8/19 10:54
 * @description：具体元素
 */
public class ConcreteElementB extends Element{


    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }
    public void operationB(){

    }
}
