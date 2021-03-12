/**
 * @author ：liubaosong
 * @date ：Created in 2020/10/10 9:50
 * @description：20201010 test
 */
public class T20201010 {
    /**
     * 两数之和
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode res = root;
        int index = 0;
        while (l1!=null||l2!=null||index!=0){
            int l1val=l1!=null?l1.val:0;
            int l2val=l2!=null?l2.val:0;
            int tem = l1val+l2val+index;
            if (tem<10){
                index=0;
                res.next=new ListNode(tem);
            }else {
                index=1;
                res.next=new ListNode(tem%10);
            }
            if (l1!=null){
                l1=l1.next;
            }
            if (l2!=null){
                l2=l2.next;
            }
            res=res.next;

        }
        return root.next;

    }

    /**
     * 动态规划之爬楼梯
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (n==1){
            return 1;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i=3;i<n+1;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];

    }
}
