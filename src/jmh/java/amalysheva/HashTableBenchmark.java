package amalysheva;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = 10, time = 2)
@Measurement(iterations = 50, time = 1, timeUnit = TimeUnit.MICROSECONDS)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class HashTableBenchmark extends HashTableInitialisationBenchmark {
    @Setup(Level.Invocation)
    public void setupList() {
        listInitialisation();
    }

    @Benchmark
    public void insert100Elements() {
        MyHashTable<Integer> hashTable = new MyHashTable<>(100);
        fillTable(hashTable, 99);
    }

    @Benchmark
    public void insert1000Elements() {
        MyHashTable<Integer> hashTable = new MyHashTable<>(1000);
        fillTable(hashTable, 999);
    }

    @Benchmark
    public void insert10000Elements() {
        MyHashTable<Integer> hashTable = new MyHashTable<>(10000);
        fillTable(hashTable, 9999);
    }

    @Benchmark
    public void insertAndDelete100Elements() {
        MyHashTable<Integer> hashTable = new MyHashTable<>(100);
        fillTable(hashTable, 99);
        clearTable(hashTable, 99);
    }

    @Benchmark
    public void insertAndDelete1000Elements() {
        MyHashTable<Integer> hashTable = new MyHashTable<>(1000);
        fillTable(hashTable, 999);
        clearTable(hashTable, 999);
    }

    @Benchmark
    public void insertAndDelete10000Elements() {
        MyHashTable<Integer> hashTable = new MyHashTable<>(10000);
        fillTable(hashTable, 9999);
        clearTable(hashTable, 9999);
    }
}
