
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answerList = new ArrayList<>();
        

        int[] days = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {

            days[i] = (100 - progresses[i] + speeds[i] - 1) / speeds[i];
        }
        

        int maxDay = days[0];
        int count = 1;
        
        for (int i = 1; i < days.length; i++) {
            if (days[i] <= maxDay) {
                // 이전 기능과 함께 배포 가능
                count++;
            } else {
                // 새로운 배포 날짜 시작
                answerList.add(count);
                count = 1;
                maxDay = days[i];
            }
        }

        answerList.add(count);
        

        return answerList.stream().mapToInt(i -> i).toArray();
    }
}