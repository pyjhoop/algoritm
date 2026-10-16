class Solution {
    public int[] solution(int[] num_list) {
        // 방법 1. n-1 인덱스부터 0 순으로 새로운 리스트에 추가하기
        // 배열을 뒤집는 또다른 방법이 있나?
        int[] reverse_num = new int[num_list.length];
        
        for(int i = num_list.length - 1; i >= 0; i--) {
            reverse_num[num_list.length - 1 - i] = num_list[i];
        } 
        
        return reverse_num;
    }
}