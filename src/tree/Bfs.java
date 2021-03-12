package tree;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author ：liubaosong
 * @date ：Created in 2020/9/24 15:11
 * @description：BFs 二叉树广度优先
 */
public class Bfs {
    private BianryTree bianryTree;

    void setBianryTree(){
        TreeNode root = new TreeNode(2);
        TreeNode l1 = new TreeNode(1);
        TreeNode r1 = new TreeNode(3);
        root.setlNode(l1);
        root.setrNode(r1);

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

    List<TreeNode> dfs(){
        //定义返回的TreeNode 集合
        List<TreeNode> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(bianryTree.root);
        while (!stack.empty()){
            TreeNode node = stack.pop();
            list.add(node);
            if (node.rNode!=null){
                stack.push(node.rNode);
            }
            if (node.lNode!=null){
                stack.push(node.lNode);
            }
        }
        return list;
    }

    boolean ValidBst(){
        return helper(bianryTree.root,null,null);
    }
    boolean helper(TreeNode node,Integer lower,Integer upper){
        if (node == null){
            return true;
        }
        Integer val = node.value;
        if (lower!=null&&val<=lower){
            return false;
        }
        if (upper!=null&&val>=upper){
            return false;
        }
        if (!helper(node.lNode,lower,val)){
            return false;
        }
        if (!helper(node.rNode,val,upper)){
            return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Bfs bfs = new Bfs();
        bfs.setBianryTree();
        boolean b = bfs.ValidBst();
        System.out.println(b);
    }

}
