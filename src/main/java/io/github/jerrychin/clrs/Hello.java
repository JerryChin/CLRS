package io.github.jerrychin.clrs;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

public class Hello {

    @Benchmark @BenchmarkMode(Mode.Throughput)
    public void init() {

        int i = 0;
        int k = 0;
        int sum = i + k;
        //noop
    }
}
