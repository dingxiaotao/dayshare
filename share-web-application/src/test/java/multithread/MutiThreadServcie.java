package multithread;

import org.mockito.internal.runners.InternalRunner;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author dingxiaotao
 * @date 2020/6/8
 */
public class MutiThreadServcie {
    public void execute() {
        // newCacheThreadPool
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0,5,60, TimeUnit.MINUTES, new SynchronousQueue<>());
        //ArrayBlockingQueue LinkedBlockingQueue SynchronousQueue

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i =0; i< 10; i ++) {
            executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName() + "执行的任务");
                try {
                    Thread.sleep(2000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

//        for (int i =0; i< 10; i ++) {
//            threadPoolExecutor.execute(() ->{
//                        System.out.println(Thread.currentThread().getName() + "执行的任务");
//                        try {
//                            Thread.sleep(2000);
//                        }catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
//            );
//        }

    }
}
