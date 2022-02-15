package amalysheva;

import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = 3, time = 2)
@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.MICROSECONDS)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class BenchmarkBinaryTreeAdding extends BenchmarkInitialization {
    private ArrayList<Integer> randomElements100;
    private ArrayList<Integer> randomElements1000;
    private ArrayList<Integer> randomElements10000;

    @Setup(Level.Invocation)
    public void startInitialisation(){
        randomElements100 = listInitialization(100);
        randomElements1000 = listInitialization(1000);
        randomElements10000 = listInitialization(10000);
    }

    @Benchmark
    public void insert100Elements(){
        MyTree<Integer> tree = new MyTree<>();
        fillTree(tree, randomElements100, 100);
    }

    @Benchmark
    public void insert1000Elements(){
        MyTree<Integer> tree = new MyTree<>();
        fillTree(tree, randomElements1000, 1000);
    }

    @Benchmark
    public void insert10000Elements(){
        MyTree<Integer> tree = new MyTree<>();
        fillTree(tree, randomElements10000, 10000);
    }
}
