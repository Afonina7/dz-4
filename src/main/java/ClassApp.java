public class ClassApp {

    public static void main(String[] args) {
        ClassLesson5 cl = new ClassLesson5();
        cl.myNumbers();

        int number2 = 10;
        int result = cl.myNumbers() + number2;
        System.out.println("~~~ <" + result + "> ~~~");
    }
}
