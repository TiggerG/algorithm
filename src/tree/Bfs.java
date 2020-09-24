package tree;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：liubaosong
 * @date ：Created in 2020/9/24 15:11
 * @description：BFs 二叉树广度优先
 */
public class Bfs {
    private BianryTree bianryTree;

    void setBianryTree(){
        TreeNode root = new TreeNode(1);
        TreeNode l1 = new TreeNode(2);
        TreeNode r1 = new TreeNode(3);
        root.setlNode(l1);
        root.setrNode(r1);
        TreeNode l1l2 = new TreeNode(4);
        TreeNode l1r2 = new TreeNode(5);
        l1.setlNode(l1l2);
        l1.setrNode(l1r2);
        bianryTree = new BianryTree();
        bianryTree.setRoot(root);
    }

    List<Integer> bfs(){
        //定义返回的遍历二叉树数组
        List<Integer> list = new ArrayList<>();
        //初始化二叉树
        setBianryTree();
        //利用双端对列 插入头部 消耗尾部 实现广度优先遍历
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(bianryTree.root);
        while (arrayDeque.size()>0){
           int len = arrayDeque.size();
           for (int i = 0;i<len;i++){
              TreeNode node = (TreeNode) arrayDeque.removeLast();
              list.add(node.value);
              if (node.lNode!=null){
                  arrayDeque.push(node.lNode);
              }
              if (node.rNode!=null){
                  arrayDeque.push(node.rNode);
              }
           }
        }
     return list;
    }

    public static void main(String[] args) {
        Bfs bfs = new Bfs();
        bfs.setBianryTree();
       List list =  bfs.bfs();
    }

}
