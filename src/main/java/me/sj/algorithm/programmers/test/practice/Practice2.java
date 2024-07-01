package me.sj.algorithm.programmers.test.practice;

/**
 * 데이터 처리 전문가가 되고 싶은 "어피치"는 문자열을 압축하는 방법에 대해 공부를 하고 있습니다. 최근에 대량의 데이터 처리를 위한 간단한 비손실 압축 방법에 대해 공부를 하고 있는데, 문자열에서 같은 값이 연속해서 나타나는 것을 그 문자의 개수와 반복되는 값으로 표현하여 더 짧은 문자열로 줄여서 표현하는 알고리즘을 공부하고 있습니다.
 * 간단한 예로 "aabbaccc"의 경우 "2a2ba3c"(문자가 반복되지 않아 한번만 나타난 경우 1은 생략함)와 같이 표현할 수 있는데, 이러한 방식은 반복되는 문자가 적은 경우 압축률이 낮다는 단점이 있습니다. 예를 들면, "abcabcdede"와 같은 문자열은 전혀 압축되지 않습니다. "어피치"는 이러한 단점을 해결하기 위해 문자열을 1개 이상의 단위로 잘라서 압축하여 더 짧은 문자열로 표현할 수 있는지 방법을 찾아보려고 합니다.
 * <p>
 * 예를 들어, "ababcdcdababcdcd"의 경우 문자를 1개 단위로 자르면 전혀 압축되지 않지만, 2개 단위로 잘라서 압축한다면 "2ab2cd2ab2cd"로 표현할 수 있습니다. 다른 방법으로 8개 단위로 잘라서 압축한다면 "2ababcdcd"로 표현할 수 있으며, 이때가 가장 짧게 압축하여 표현할 수 있는 방법입니다.
 * <p>
 * 다른 예로, "abcabcdede"와 같은 경우, 문자를 2개 단위로 잘라서 압축하면 "abcabc2de"가 되지만, 3개 단위로 자른다면 "2abcdede"가 되어 3개 단위가 가장 짧은 압축 방법이 됩니다. 이때 3개 단위로 자르고 마지막에 남는 문자열은 그대로 붙여주면 됩니다.
 * <p>
 * 압축할 문자열 s가 매개변수로 주어질 때, 위에 설명한 방법으로 1개 이상 단위로 문자열을 잘라 압축하여 표현한 문자열 중 가장 짧은 것의 길이를 return 하도록 solution 함수를 완성해주세요.
 */
public class Practice2 {
    public static void main(String[] args) {
        Practice2 test1 = new Practice2();
        String s = "aabbaccc";
        int ans = test1.solution(s);
        System.out.println(ans);
    }

    public int solution(String s) {
        int answer = s.length();

        //i개 단위로 자르며 반복
        for(int i = 1; i <= s.length() / 2; i++) {
            //타겟 문자 패턴 설정
            String target = s.substring(0, i);
            String cur = ""; //현재 문자열
            int cnt = 1; //압축 카운트
            StringBuilder sb = new StringBuilder();

            for(int start = i; start <= s.length(); start += i) {
                //비교할 현재 문자열
                //다음 자를 문자열의 길이가 단위보다 작으면 남은 글자를 저장
                if(start + i >= s.length()) {
                    cur = s.substring(start, s.length());
                }
                else {
                    cur = s.substring(start, start + i);
                }

                //문자열이 같으면 압축카운트 증가
                if(cur.equals(target)) {
                    cnt++;
                }
                //다르면 압축된 문자열을 추가하고 타겟 패턴 변경
                else if(cnt == 1){
                    sb.append(target);
                    target = cur;
                }
                else {
                    sb.append(cnt).append(target);
                    target = cur;
                    cnt = 1;
                }
            }
            //자르고 마지막에 남는 문자열 추가
            if(i != target.length()) sb.append(target);

            answer = Math.min(answer, sb.toString().length());
        }

        return answer;
    }
}
