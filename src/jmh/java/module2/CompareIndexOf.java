package module2;

import org.openjdk.jmh.annotations.*;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = 3, time = 2)
@Measurement (iterations = 10, time = 1, timeUnit = TimeUnit.MICROSECONDS)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class CompareIndexOf {

    @Benchmark
    public void returnIndexOf1000Element(){
        MyArrayList<Integer> array = new MyArrayList<Integer>(1000);
        for (int i = 0; i < 1000; i++) {
            array.add(i);
        }
        array.indexOf(999);
    }

    @Benchmark
    public void returnIndexOf10000Element() {
        MyArrayList<Integer> array = new MyArrayList<Integer>(10000);
        for (int i = 0; i < 10000; i++) {
            array.add(i);
        }
        array.indexOf(9999);
    }

    @Benchmark
    public void returnIndexOf100000Element() {
        MyArrayList<Integer> array = new MyArrayList<Integer>(100000);
        for (int i = 0; i < 100000; i++) {
            array.add(i);
        }
        array.indexOf(99999);
    }

    @Benchmark
    public void addElement1000(){
        MyArrayList<Integer> array = new MyArrayList<Integer>(1000);
        for (int i = 0; i < 1000; i++) {
            array.add(i);
        }
        array.add(999,1001);
    }

    @Benchmark
    public void addElement10000(){
        MyArrayList<Integer> array = new MyArrayList<Integer>(10000);
        for (int i = 0; i < 10000; i++) {
            array.add(i);
        }
        array.add(9999,10001);
    }

    @Benchmark
    public void addElement100000(){
        MyArrayList<Integer> array = new MyArrayList<Integer>(100000);
        for (int i = 0; i < 100000; i++) {
            array.add(i);
        }
        array.add(99999,100001);
    }

    @Benchmark
    public void removeElement1000(){
        MyArrayList<Integer> array = new MyArrayList<Integer>(1000);
        for (int i = 0; i < 1000; i++) {
            array.add(i);
        }
        array.remove(999);
    }

    @Benchmark
    public void removeElement10000(){
        MyArrayList<Integer> array = new MyArrayList<Integer>(10000);
        for (int i = 0; i < 10000; i++) {
            array.add(i);
        }
        array.remove(9999);
    }

    @Benchmark
    public void removeElement100000(){
        MyArrayList<Integer> array = new MyArrayList<Integer>(100000);
        for (int i = 0; i < 100000; i++) {
            array.add(i);
        }
        array.remove(99999);
    }

}
