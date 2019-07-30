package gxw.lc19;

/**
 * Definition for singly-linked list.
 **/
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}


public class LC19 {
    public static void main(String[] args) {
        LC19 lc19 = new LC19();
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        lc19.removeNthFromEnd(head, 5);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 1. 先计算当前链表的长度
        // 2. 从head开始，移动 len -2，到达指定倒数第n + 1个节点位置，移除n后 拼接
        ListNode p = head;
        int len = 0;
        while (null != p) {
            p = p.next;
            len++;
        }

        p = head;
        // 如果移除第一个
        if (n == len) {
            return head.next;
        }

        int index = 0;
        while (null != p.next) {
            if (len - n - 1 == index) {
                p.next = p.next.next;
                break;
            }
            p = p.next;
            index++;
        }
        return head;
    }
}
