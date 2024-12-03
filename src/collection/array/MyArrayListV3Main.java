package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        //원하는 위치에 추가
        System.out.println("addLast");
        list.add(3, "addList"); //0(1)
        System.out.println(list);

        System.out.println("addFirst");
        list.add(0, "addFirst"); //0(n)
        System.out.println(list);

        Object remove1 = list.remove(4); //remove Last 0(1)
        System.out.println("removed(4)=" + remove1);
        System.out.println(list);

        Object remove2 = list.remove(0); //remove Last 0(n)
        System.out.println("removed(0)=" + remove2);
        System.out.println(list);
    }
}
