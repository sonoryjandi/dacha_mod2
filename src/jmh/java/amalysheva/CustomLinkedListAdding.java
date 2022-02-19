package amalysheva;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = 10, time = 1)
@Measurement(iterations = 50, time = 10, timeUnit = TimeUnit.MILLISECONDS)
@OutputTimeUnit(TimeUnit.MILLISECONDS)

public class CustomLinkedListAdding extends CustomLinkedListInitialization {
    @Benchmark
    public void addFirst100() {
        CustomDoublyLinkedList<Integer> linkedList = new CustomDoublyLinkedList<>();
        fillFirst(linkedList, 100);
    }

    @Benchmark
    public void addFirst1000() {
        CustomDoublyLinkedList<Integer> linkedList = new CustomDoublyLinkedList<>();
        fillFirst(linkedList, 1000);
    }

    @Benchmark
    public void addFirst10000() {
        CustomDoublyLinkedList<Integer> linkedList = new CustomDoublyLinkedList<>();
        fillFirst(linkedList, 10000);
    }

    @Benchmark
    public void addLast100() {
        CustomDoublyLinkedList<Integer> linkedList = new CustomDoublyLinkedList<>();
        fillLast(linkedList, 100);
    }

    @Benchmark
    public void addLast1000() {
        CustomDoublyLinkedList<Integer> linkedList = new CustomDoublyLinkedList<>();
        fillLast(linkedList, 1000);
    }

    @Benchmark
    public void addLast10000() {
        CustomDoublyLinkedList<Integer> linkedList = new CustomDoublyLinkedList<>();
        fillLast(linkedList, 10000);
    }

    @Benchmark
    public void addAfter100() {
        CustomDoublyLinkedList<Integer> linkedList = new CustomDoublyLinkedList<>();
        fillAfter(linkedList, 100);
    }

    @Benchmark
    public void addAfter1000() {
        CustomDoublyLinkedList<Integer> linkedList = new CustomDoublyLinkedList<>();
        fillAfter(linkedList, 1000);
    }

    @Benchmark
    public void addAfter10000() {
        CustomDoublyLinkedList<Integer> linkedList = new CustomDoublyLinkedList<>();
        fillAfter(linkedList, 10000);
    }
}