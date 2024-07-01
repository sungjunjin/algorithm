package me.sj.algorithm.programmers.test;

public class Test2 {
    public static void main(String[] args) {
        Test2 test1 = new Test2();
        String target = "freedom";
        String typed = "freeeedom";

        boolean answer = test1.solution(target, typed);
        System.out.println(answer);
    }

    public boolean solution(String target, String typed) {
        StringBuilder sb = new StringBuilder();
        if(target.charAt(0) != typed.charAt(0)) return false;
        int typedIdx = 1;
        int targetIdx = 1;
        sb.append(typed.charAt(0));

        while(typedIdx < typed.length()) {
            if(target.charAt(targetIdx) == typed.charAt(typedIdx)) {
                sb.append(typed.charAt(typedIdx));
                targetIdx++;
            } else {
                if(typed.charAt(typedIdx - 1) != typed.charAt(typedIdx)) {
                    return false;
                }
            }

            typedIdx++;
        }

        return target.equals(sb.toString());
}
}
