package ru.meta_devs.amalysheva;

import org.openjdk.jmh.annotations.*;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = 3, time = 2)
@Measurement (iterations = 10, time = 1, timeUnit = TimeUnit.MILLISECONDS)
@OutputTimeUnit(TimeUnit.MILLISECONDS)

public class ComplexityOfStack {
    @Benchmark
    public void complexityOfPushFor1000() {
        MyStack <Integer> stack = new MyStack<Integer>(1000);
        for (int i = 0; i < 1000; i++) {
            stack.push(i);
        }
    }

    @Benchmark
    public void complexityOfPushFor10000() {
        MyStack <Integer> stack = new MyStack<Integer>(10000);
        for (int i = 0; i < 10000; i++) {
            stack.push(i);
        }
    }

    @Benchmark
    public void complexityOfPushFor100000() {
        MyStack <Integer> stack = new MyStack<Integer>(100000);
        for (int i = 0; i < 100000; i++) {
            stack.push(i);
        }
    }

    @Benchmark
    public void complexityOfPopFor1000(){
        MyStack <Integer> stack = new MyStack<Integer>(1000);
        for (int i = 0; i < 1000; i++) {
            stack.push(i);
        }
        do {
            stack.pop();
        } while (stack.isEmpty());
    }

    @Benchmark
    public void complexityOfPopFor10000(){
        MyStack <Integer> stack = new MyStack<Integer>(10000);
        for (int i = 0; i < 10000; i++) {
            stack.push(i);
        }
        do {
            stack.pop();
        } while (stack.isEmpty());
    }

    @Benchmark
    public void complexityOfPopFor100000(){
        MyStack <Integer> stack = new MyStack<Integer>(100000);
        for (int i = 0; i < 100000; i++) {
            stack.push(i);
        }
        do {
            stack.pop();
        } while (stack.isEmpty());
    }

}
