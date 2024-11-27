package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); //Object -> Integer 캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); //Object -> String 캐스팅
        System.out.println("string = " + str);

        integerBox.set("문자100");
        Integer int2 = (Integer) integerBox.get(); //String -> Integer 캐스팅 예외
        System.out.println("int2 = " + int2);
    }
}
