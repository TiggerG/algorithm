import java.util.Deque;
import java.util.LinkedList;

/**
 * @author ：liubaosong
 * @date ：Created in 2020/10/9 14:56
 * @description：滑动窗口的最大值
 */
public class T20201009 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0 || k == 0) return new int[0];
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        //未形成窗口
        for(int i = 0; i < k; i++) { // 未形成窗口
           while (!deque.isEmpty()&&deque.peekLast()<nums[i]){
               deque.removeLast();
           }
           deque.addLast(nums[i]);
        }
        //形成窗口
        res[0]=deque.peekFirst();
        for (int i=k;i<nums.length;i++){
            if (deque.peekFirst()==nums[i-k]){
                deque.removeFirst();
            }
            while (!deque.isEmpty()&&deque.peekLast()<nums[i]){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
            res[i-k+1]=deque.peekFirst();
        }
     return res;


    }

    /**
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {

       ListNode cur = new ListNode(0);
       cur.next=head;
       ListNode start = cur;
       int i=0;
       while (head.next!=null){
           if (i<n){
               i++;
               head=head.next;
           }else {
               head=head.next;
               start=start.next;
           }

       }
       start.next=start.next.next;
       return cur.next;

    }

    /**
     * 合并两个有序的链表
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode preHead = new ListNode(0);
        ListNode result = preHead;
        while (l1.next!=null && l2.next!=null){
            if (l1.val<=l2.val){
                preHead.next=l1;
                l1=l1.next;
            }else {
                preHead.next=l2;
                l2=l2.next;
            }
            preHead=preHead.next;
        }
        if (l2.next!=null){
            preHead.next=l2;
        }
        if (l1.next!=null){
            preHead.next=l1;
        }
        return result.next;

    }

    public static void main(String[] args) {
      ListNode l1=new ListNode(1);
      ListNode l2=new ListNode(2);
        T20201009 T = new T20201009();
        T.mergeTwoLists(l1,l2);
    }

    }
