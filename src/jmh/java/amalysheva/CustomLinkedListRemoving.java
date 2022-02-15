package amalysheva;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = 10, time = 1)
@Measurement(iterations = 50, time = 10, timeUnit = TimeUnit.MILLISECONDS)
@OutputTimeUnit(TimeUnit.MILLISECONDS)

public class CustomLinkedListRemoving extends CustomLinkedListInitialization{
    @Benchmark
    public void fillAndRemoveFirst100() {
        CustomDoublyLinkedList<Integer> linkedList = new CustomDoublyLinkedList<>();
        fillFirst(linkedList, 100);
        clearFirst(linkedList, 100);
    }

    @Benchmark
    public void fillAndRemoveFirst1000() {
        CustomDoublyLinkedList<Integer> linkedList = new CustomDoublyLinkedList<>();
        fillFirst(linkedList, 1000);
        clearFirst(linkedList, 1000);
    }

    @Benchmark
    public void fillAndRemoveFirst10000() {
        CustomDoublyLinkedList<Integer> linkedList = new CustomDoublyLinkedList<>();
        fillFirst(linkedList, 10000);
        clearFirst(linkedList, 10000);
    }

    @Benchmark
    public void fillAndRemoveLast100() {
        CustomDoublyLinkedList<Integer> linkedList = new CustomDoublyLinkedList<>();
        fillLast(linkedList, 100);
        clearLast(linkedList, 100);
    }

    @Benchmark
    public void fillAndRemoveLast1000() {
        CustomDoublyLinkedList<Integer> linkedList = new CustomDoublyLinkedList<>();
        fillLast(linkedList, 1000);
        clearLast(linkedList, 1000);
    }

    @Benchmark
    public void fillAndRemoveLast10000() {
        CustomDoublyLinkedList<Integer> linkedList = new CustomDoublyLinkedList<>();
        fillLast(linkedList, 10000);
        clearLast(linkedList, 10000);
    }

    @Benchmark
    public void fillAndRemoveByKey100() {
        CustomDoublyLinkedList<Integer> linkedList = new CustomDoublyLinkedList<>();
        fillAfter(linkedList, 100);
        clearByKey(linkedList, 100);
    }

    @Benchmark
    public void fillAndRemoveByKey1000() {
        CustomDoublyLinkedList<Integer> linkedList = new CustomDoublyLinkedList<>();
        fillAfter(linkedList, 1000);
        clearByKey(linkedList, 1000);
    }

    @Benchmark
    public void fillAndRemoveByKey10000() {
        CustomDoublyLinkedList<Integer> linkedList = new CustomDoublyLinkedList<>();
        fillAfter(linkedList, 10000);
        clearByKey(linkedList, 10000);
    }

}
