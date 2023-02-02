class Student { // 클래스 선언
    String name; // 이름
}
class ParaTest {
    public static void main(String[] args) {
        Student kim = new Student();
        kim.name = "김윤선";
        System.out.println("main() : name = " + kim.name);
//
//        change(kim.name);
//        System.out.println("main() : kim.name = " + kim.name);
//
//        change2(kim);
//        System.out.println("kim.name = " + kim.name);
//    }
//    static void change(String name) {
//        name = "홍길동";
//       // System.out.println("change() : name = " + name);
//    }
//
//    static void change2(Student hong){
//        hong.name ="홍길동";
//        //System.out.println("change2() : " + hong.name );
    }
}


