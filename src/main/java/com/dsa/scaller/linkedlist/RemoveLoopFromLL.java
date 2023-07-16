package com.dsa.scaller.linkedlist;

public class RemoveLoopFromLL {
    //Problem Description
    //You are given a linked list that contains a loop.
    //You need to find the node, which creates a loop and break it by making the node point to NULL.
    //
    //
    //
    //Problem Constraints
    //1 <= number of nodes <= 1000
    //
    //
    //
    //Input Format
    //The first of the input contains a LinkedList, where the first number is the number of nodes N, and the next N nodes are the node value of the linked list.
    //The second line of the input contains an integer which denotes the position of node where cycle starts.
    //
    //
    //
    //Output Format
    //return the head of the updated linked list.
    //
    //
    //
    //Example Input
    //Input 1:
    //
    //
    //1 -> 2
    //^    |
    //| - -
    //Input 2:
    //
    //3 -> 2 -> 4 -> 5 -> 6
    //          ^         |
    //          |         |
    //          - - - - - -
    //
    //
    //Example Output
    //Output 1:
    //
    // 1 -> 2 -> NULL
    //Output 2:
    //
    // 3 -> 2 -> 4 -> 5 -> 6 -> NULL
    //
    //
    //Example Explanation
    //Explanation 1:
    //
    // Chain of 1->2 is broken.
    //Explanation 2:
    //
    // Chain of 4->6 is broken.

    public ListNode solve(ListNode A) {
        if (A == null || A.next == null) {
            return A;
        }
        ListNode fast= A;
        ListNode slow = A;
        boolean hasCycle = false;

        // Check for the existence of a cycle

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                hasCycle = true;
                break;
            }
        }
        // If no cycle is found, return the original list
        if (!hasCycle) {
            return A;
        }

        // Find the start of the cycle

        ListNode x = A;
        while( x!= slow){
            x = x.next;
            slow = slow.next;
        }
        // Break the cycle
        ListNode end = x;
        while (end.next != x) {
            end = end.next;
        }
        end.next = null;

        return A;
    }
}
