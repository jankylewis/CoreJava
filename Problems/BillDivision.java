package Problems;

import java.util.ArrayList;
import java.util.List;

public class BillDivision {

    public static void bonAppetit(List<Integer> bill, int k, int b) {

        int annaCharge = 0;

        for (int idx = 0; idx < bill.size(); idx++) {
            if (idx == k)
                continue;

            annaCharge += bill.get(idx);
        }

        annaCharge/=2;

        if (b == annaCharge){
            System.out.println("Bon Appetit");
            return;
        }

        System.out.println(b - annaCharge);
    }

    public static void main(String[] args) {
        bonAppetit(new ArrayList<>(){{
            add(3);
            add(10);
            add(2);
            add(9);
        }}, 1, 12);

    }
}
