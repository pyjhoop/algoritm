class Solution {
    public int numberOfSteps(int num) {

        int count = 0;

        while(num != 0) {
            if(isEven(num)){
                num /= 2;
            }else {
                num -= 1;
            }
            count++;
        }

        return count;
    }

    public boolean isEven(int num) {
        return num % 2 == 0;
    }
}