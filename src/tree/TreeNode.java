package tree;

public class TreeNode {

	int value;

	TreeNode lNode;

	TreeNode rNode;
	public TreeNode(int value){
		this.value=value;
	}
	public void setlNode(TreeNode lNode)
	{
		this.lNode=lNode;
	}
	public void setrNode(TreeNode rNode)
	{
		this.rNode=rNode;
	}
}
