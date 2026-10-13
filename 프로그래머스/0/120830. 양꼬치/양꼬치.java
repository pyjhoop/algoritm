class Solution {
    public int solution(int n, int k) {
        // k의 최종 개수는  k - n / 10 임.
        return n * 12000 + (k - (n / 10)) * 2000;
    }
}