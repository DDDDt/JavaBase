## 多线程

### Thread

继承 Thread, 无返回参数 

### Runnable

实现 Runnable 接口，无返回参数 

### Callable 和 Future

带有返回参数

```

        // 带有返回值
        FutureTask<String> future = new FutureTask<>(() -> {
            System.out.println("123");
            return "123";
        });

        Thread t = new Thread(future);
        t.start();

        String result = future.get();

```