package Final_assignment;

import java.util.ArrayList;

public class P4 {
    public static void intersection_or_union_fcn(ArrayList<Integer> v1, ArrayList<Integer> v2, ArrayList<Integer> v3) {

        ArrayList<Integer> result = new ArrayList<Integer>();

        // check if v3 is intersection of v1 and v2
        boolean isIntersection = true;
        boolean flag = false;
        for (int i = 0; i < v3.size(); i++) {
            if (!v1.contains(v3.get(i)) || !v2.contains(v3.get(i))) {
                isIntersection = false;
                break;
            }
        }
        if (isIntersection) {
            System.out.println("v3 is the intersection of v1 and v2");
            flag = true;
        }


        // check if v3 is union of v1 and v2
        boolean isUnion = true;
        for (int i = 0; i < v1.size(); i++) {
            if (!v3.contains(v1.get(i))) {
                isUnion = false;
                break;
            }
        }
        for (int i = 0; i < v2.size(); i++) {
            if (!v3.contains(v2.get(i))) {
                isUnion = false;
                break;
            }
        }
        if (isUnion) {
            System.out.println("v3 is the union of v1 and v2");
            flag = true;
        }

        if (!flag){
            System.out.println("v3 is neither the intersection nor the union of v1 and v2");
        }



    }
    public static void main(String[] args) {

        ArrayList<Integer> v1 = new ArrayList<>();
        ArrayList<Integer> v2 = new ArrayList<>();
        ArrayList<Integer> v3 = new ArrayList<>();

        v1.add(2);v1.add(3);v1.add(1);v1.add(5);
        v2.add(3);v2.add(4);v2.add(5);
        v3.add(2);v3.add(3);v3.add(1);v3.add(5);v3.add(4);

        intersection_or_union_fcn(v1,v2,v3);
    }
}
