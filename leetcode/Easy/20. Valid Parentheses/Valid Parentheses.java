import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 1. 여는 괄호는 스택에 추가
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // 2. 닫는 괄호 처리
            else {
                // 스택이 비어있으면 닫는 괄호와 짝을 이룰 여는 괄호가 없음
                if (stack.isEmpty()) {
                    return false;
                }

                char openBracket = stack.pop();
                // 짝이 맞지 않으면 즉시 false
                if (!isPair(openBracket, c)) {
                    return false;
                }
            }
        }

        // 모든 문자를 처리한 뒤 스택에 여는 괄호가 남아있지 않아야 유효
        return stack.isEmpty();
    }

    private boolean isPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}