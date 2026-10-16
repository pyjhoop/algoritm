class Solution {
    public double solution(int[] arr) {
        // 시간: O(n);
        // 반복문으로 sum을 구한뒤 arr의 길이만큼 나누면 됨
        // 리턴값이 double 이기에 실수로 변경해줘야한다. -? 이거 기억 안남
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        
        return (double) sum / arr.length;
        
    }
}