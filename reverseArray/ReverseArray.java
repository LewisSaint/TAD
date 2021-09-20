package reverseArray;

public class ReverseArray {




    public String toString() {

        int [] a = {1, 2, 3, 4, 5};

        if (a.length == 0)
            return "[]";
        String s = "[" + a[0];
        for (int i = 1; i < a.length; i++) s += ", " + a[i];
        return s + "]";
    }
}


