package StackAndQueue.Impl;

import java.util.*;

class Spanner {
//    List<Integer> list;
    Deque<Pair> stack;
    private int idx;

    Spanner() {
//        list = new ArrayList<>();
        stack = new ArrayDeque<>();
        idx = -1;
    }

    public int next(int price) {
        idx++;
        while (!stack.isEmpty() && stack.peek().x <= price) {
            stack.pop();
        }
        int ans = stack.isEmpty() ? idx+1 : idx - stack.peek().y;
        stack.push(new Pair(price, idx));
        return ans;

//        list.add(price);
//        int count = 1;
//        for (int i=(list.size()-2); i>= 0; --i) {
//            if (list.get(i) <= price) {
//                count++;
//            }else {
//                break;
//            }
//        }

    }
}


public class StockSpanner {
    public static void main(String[] args) {
        Spanner spanner = new Spanner();
        int a, b, c, d,e,f,g;
        a = spanner.next(100);
        b = spanner.next(80);
        c = spanner.next(60);
        d = spanner.next(70);
        e = spanner.next(60);
        f = spanner.next(75);
        g = spanner.next(85);
        System.out.println(List.of(a,b,c,d,e,f,g));
    }
}
