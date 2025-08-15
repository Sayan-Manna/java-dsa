package StackAndQueue.Impl;

import java.util.ArrayList;
import java.util.List;



class Spanner {
//    List<Integer> list;
    

    Spanner() {
        list = new ArrayList<>();
    }

    public int next(int price) {
        list.add(price);
        int count = 1;
        for (int i=(list.size()-2); i>= 0; --i) {
            if (list.get(i) <= price) {
                count++;
            }else {
                break;
            }
        }
        return count;

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
