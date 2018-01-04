package threadsTask.task4;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SumForkJoin {
    private int n = 1000000;
    private int threadsNum = 8;
    private int[] mas = new int[1000000];

    public void runTask() {
        for (int i = 0; i < n; i++) {
            mas[i] = (int) (Math.random() * 100);
        }
        ForkJoinPool forkJoinPool = new ForkJoinPool(threadsNum);
        int realSum = forkJoinPool.invoke(new RecSumForkJoin(0, n - 1));
        System.out.println(realSum);
        calculateRealSum();
    }

    private void calculateRealSum() {
        int localSum = 0;
        for (int i = 0; i < n; i++) {
            localSum += mas[i];
        }
        System.out.println(localSum);
    }

    class RecSumForkJoin extends RecursiveTask<Integer> {
        int from, to;

        public RecSumForkJoin(int from, int to) {
            this.from = from;
            this.to = to;
        }

        @Override
        protected Integer compute() {
            if ((to - from) <= 20) {
                int sum = 0;
                for (int i = from; i <= to; i++) {
                    sum += mas[i];
                }
                return sum;
            } else {
                int mid = (from + to) / 2;
                RecSumForkJoin firstHalf = new RecSumForkJoin(from, mid);
                firstHalf.fork();
                RecSumForkJoin secondHalf = new RecSumForkJoin(mid + 1, to);
                int resultSecond = secondHalf.compute();
                return firstHalf.join() + resultSecond;
            }
        }
    }
}
