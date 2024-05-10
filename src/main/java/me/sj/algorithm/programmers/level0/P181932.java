package me.sj.algorithm.programmers.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181932
 */
public class P181932 {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int mode = 0;

        char[] codeArr = code.toCharArray();

        for (int idx = 0; idx < codeArr.length; idx++) {
            if (codeArr[idx] == '1') {
                mode = mode == 0 ? 1 : 0;
                continue;
            }

            if (mode == 0) {
                if (idx % 2 == 0) {
                    sb.append(codeArr[idx]);
                }
            } else {
                if (idx % 2 != 0) {
                    sb.append(codeArr[idx]);
                }
            }
        }

        String ret = sb.toString();

        if (ret.isEmpty()) {
            return "EMPTY";
        }

        return ret;
    }
}
