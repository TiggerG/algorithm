package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：liubaosong
 * @date ：Created in 2020/8/19 11:01
 * @description：提供一个高层的接口以允许访问者访问它的元素
 */
public class ObjectStructure {
    private List<Element> elements=new ArrayList<>();
    public void attach(Element element){
        elements.add(element);
    }
    public void detach(Element element){
        elements.add(element);
    }
    public void accept(Visitor visitor){
        for (Element e: elements) {
            e.accept(visitor);
        }
    }
}
