public class Main {
    public int solution(int num) {
        int answer = 0;
        int[] money = new int[]{500, 100, 50, 10};
        int index = 0;
        num = 1000 - num;
        while (num > 0) {
            answer += num/money[index];
            num -= (num/money[index])*money[index];
            index +=1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        int num1 = 160;
        System.out.println(method.solution(num1));
    }
}