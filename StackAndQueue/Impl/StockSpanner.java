package StackAndQueue.Impl;

import java.util.*;


class Spanner {
//    List<Integer> list;
    Deque<Integer> stack = new Stack<>();

    Spanner() {
//        list = new ArrayList<>();
        stack = new Stack<>();
    }

    public int next(int price) {
        int ans = 0;
        map.put(price, count++);

        while (!stack.isEmpty() && stack.peek() <= price) {
            stack.pop();
        }
        ans = stack.isEmpty() ? count : count - map.get(stack.peek())-1;
        stack.push(price);
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
