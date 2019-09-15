package creational.singleton;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

public class SingletonTest {
	@Test
	public void test() throws InterruptedException {
		ExecutorService service = Executors.newFixedThreadPool(10);
		Collection<Callable<Integer>> tasks = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			tasks.add(() -> {
				ThreadSafeSingleton s = ThreadSafeSingleton.getInstance();
				System.out.println(s);
				return 0;
			});
		}

		service.invokeAll(tasks);
	}
}
