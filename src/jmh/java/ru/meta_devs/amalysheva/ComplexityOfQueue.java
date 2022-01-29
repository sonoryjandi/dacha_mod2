package ru.meta_devs.amalysheva;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = 3, time = 2)
@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.MILLISECONDS)
@OutputTimeUnit(TimeUnit.MILLISECONDS)

public class ComplexityOfQueue {
    @Benchmark
    public void complexityOfAddFor1000() {
        MyQueue <Integer> queue = new MyQueue<>(1000);
        for (int i = 0; i < 1000; i++) {
            queue.add(i);
        }
    }

    @Benchmark
    public void complexityOfAddFor10000() {
        MyQueue <Integer> queue = new MyQueue<>(10000);
        for (int i = 0; i < 10000; i++) {
            queue.add(i);
        }
    }

    @Benchmark
    public void complexityOfAddFor100000() {
        MyQueue <Integer> queue = new MyQueue<>(100000);
        for (int i = 0; i < 100000; i++) {
            queue.add(i);
        }
    }

    @Benchmark
    public void complexityOfRemoveFor1000() {
        MyQueue <Integer> queue = new MyQueue<>(1000);
        for (int i = 0; i < 1000; i++) {
            queue.add(i);
        }
        do {
            queue.remove();
        } while (queue.isEmpty());
    }

    @Benchmark
    public void complexityOfRemoveFor10000() {
        MyQueue <Integer> queue = new MyQueue<>(10000);
        for (int i = 0; i < 10000; i++) {
            queue.add(i);
        }
        do {
            queue.remove();
        } while (queue.isEmpty());
    }

    @Benchmark
    public void complexityOfRemoveFor100000() {
        MyQueue <Integer> queue = new MyQueue<>(100000);
        for (int i = 0; i < 100000; i++) {
            queue.add(i);
        }
        do {
            queue.remove();
        } while (queue.isEmpty());
    }
}
