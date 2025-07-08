package LinkedList;

import java.util.HashMap;
import java.util.Map;

import static LinkedList.insertingInLL.Display;
import static LinkedList.insertingInLL.InsertFirst;

public class intersectionPoint {
    public static void main(String[] args) {

        ListNode common = new ListNode(4);
        common.next = new ListNode(6);
        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(1);
        head1.next.next = common;
        head1.next.next.next = new ListNode(6);
        head1.next.next.next.next = new ListNode(2);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(4);
        head2.next.next.next = new ListNode(5);
        head2.next.next.next.next = common;

        //printing of the lists
        System.out.print("List1: "); Display(head1);
        System.out.println();
        System.out.print("List2: "); Display(head2);
        System.out.println();
        //checking if intersection is present
        ListNode answerListNode = intersectionPresent(head1,head2);
        if(answerListNode == null)
            System.out.println("No intersection\n");
        else
            System.out.println("The intersection point is "+answerListNode.val);
    }

    private static ListNode intersectionPresent(ListNode head1, ListNode head2) {
        // Optimal Solution 1 --------------| O(n1 + n2) time and O(1) space
        ListNode t1 = head1, t2 = head2;
        while (t1 != t2) {
            if (t1 == null) {
                t1 = head2;
            }else {
                t1 = t1.next;
            }
            if (t2 == null) {
                t2 = head1;
            }else {
                t2 = t2.next;
            }
        }
        return t1;


        // Optimal solution 2 --------------| O(n1 + 2n2) time and O(1) space

        /*
        - See instead of extra space we need find a solution
        - Maybe we can start both the lists at the same time and compare the nodes
        - But we need to be careful as both lists can be of different sizes
         */

//        int n1 = 0, n2 = 0;
//        ListNode temp1 = head1;
//        ListNode temp2 = head2;
//        while (temp1 != null) {
//            n1++;
//            temp1 = temp1.next;
//        }
//        while (temp2 != null) {
//            n2++;
//            temp2 = temp2.next;
//        }
//        // Re-assign temp1 and temp2 to head1 and head2 because we need to traverse the lists again
//        // Due to the above while loop, temp1 and temp2 became null
//        temp1 = head1;
//        temp2 = head2;
//        // slight optimization
//        if (n2 > n1) {
//            return collisionPoint(temp2, temp1, n2-n1);
//        }else {
//            return collisionPoint(temp1, temp2, n1-n2);
//        }
////        if (n1 > n2) {
////            int diff = n1 - n2;
////            while (diff > 0) {
////                head1 = head1.next;
////                diff--;
////            }
////        } else {
////            int diff = n2 - n1;
////            while (diff > 0) {
////                head2 = head2.next;
////                diff--;
////            }
////        }
////        while (head1 != null && head2 != null) {
////            if (head1 == head2) {
////                return head1;
////            }
////            head1 = head1.next;
////            head2 = head2.next;
////        }
////        return null;

        // Better --------------| O(n) time and O(n) space
        /*
        - 1st thing we need to consider is that there will be a common node in both the lists. Not Node value (VVI)
        - We need to find if both the lists have that common node or not - (not node val)
        - Now to find that we can use Hashing
        ***** Algo *****
        - Put data of any one list in map
        - Now traverse the other list and check if the node is present in the map or not
            - If present return that node - ans
         */
//        Map<ListNode, Integer> map = new HashMap<>();
//        ListNode temp1 = head1;
//        while (temp1 != null) {
//            map.put(temp1, 1);
//            temp1 = temp1.next;
//        }
//        ListNode temp2 = head2;
//        while (temp2 != null) {
//            if (map.containsKey(temp2)) {
//                return temp2;
//            }
//            temp2 = temp2.next;
//        }
//        return null;

        // Brute force --------------| O(n*m) time and O(1) space
        /*
        - Traverse the first list and for each node check if it is present in the second list or not
        - If present return that node - ans
         */
//        ListNode temp1 = head1;
//        while (temp1 != null) {
//            ListNode temp2 = head2;
//            while (temp2 != null) {
//                if (temp1 == temp2) {
//                    return temp1;
//                }
//                temp2 = temp2.next;
//            }
//            temp1 = temp1.next;
//        }
//        return null;
    }

    private static ListNode collisionPoint(ListNode temp2, ListNode temp1, int d) {
        // move t2 pointer d nodes ahead - O(d)
        while (d > 0) {
            temp2 = temp2.next;
            d--;
        }
        // Now t1 and t2 are in same level, so start comparing
        // If they are same return else move ahead
        // O(N1) :: thinking N1 is smaller
        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
}
