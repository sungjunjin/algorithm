package me.sj.algorithm.programmers.level2;

/**
 * n개의 음이 아닌 정수들이 있습니다. 이 정수들을 순서를 바꾸지 않고 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다. 예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.
 * <p>
 * -1+1+1+1+1 = 3
 * +1-1+1+1+1 = 3
 * +1+1-1+1+1 = 3
 * +1+1+1-1+1 = 3
 * +1+1+1+1-1 = 3
 * 사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.
 */
public class P43165 {
    static int answer = 0;

    public static void main(String[] args) {
        P43165 p43165 = new P43165();
        int[] numbers = {4, 1, 2, 1};
        int target = 4;

        int answer = p43165.solution(numbers, target);
        System.out.println(answer);

    }

    public int solution(int[] numbers, int target) {
        dfs(0, numbers[0], numbers, target);
        dfs(0, -numbers[0], numbers, target);

        return answer;
    }

    public void dfs(int level, int num, int[] numbers, int target) {
        if (level == numbers.length - 1) {
            if (num == target) {
                answer++;
            }
        } else {
            dfs(level + 1, num + numbers[level + 1], numbers, target);
            dfs(level + 1, num - numbers[level + 1], numbers, target);
        }
    }
}
