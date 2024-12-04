package collection.list;

//BatchProcessor는 MyList에 의존한다.
public class BatchProcessorMain {
    public static void main(String[] args) {
//        MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> list = new MyLinkedList<>();

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(1050_000);
    }
}
