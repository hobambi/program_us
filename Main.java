public class Main {
    public int solution(String s) {
        int answer = 0; // 최종 점수
        int count = 1; // 현재 점수를 세는 변수
        for (int i = 0; i < s.length(); i++) { // OX를 하나씩 다 받음
            if (s.charAt(i) == 'O') { // O면 정답 맞은거니까
                answer += count; // 최종 점수에 현재 점수 넣어줌
                count += 1; // 연속으로 나오면 점수가 늘어나니까 점수 증가
            } else { // O가 아닐때 X일때니까
                count = 1; // 증가하던 점수 초기화
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        String s = "OXOOOXXXOXOOXOOOOOXO";
        System.out.println(method.solution(s));
    }
}