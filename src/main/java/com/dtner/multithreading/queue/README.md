## 阻塞队列

### Java 阻塞队列

#### LinkedBlockingQueue

无上线的阻塞队列，用链表实现，也可以指定容量。

#### LinkedBlockingDeque

无上限的双向队列，用链表实现，也可以指定容量。

#### ArrayBlockingQueue

指定容量和公平性设置的阻塞队列。该队列用循环数组实现.

#### PriorityBlockingQueue

带优先级先进先出的队列，元素按照它们的优先级顺序被移出。该队列没有容量上限，但是队列如果是空的，取元素的操作会阻塞。

#### DelayQueue

包含 Delayed 元素的无界阻塞时间有限的阻塞队列，getDelay 方法返回对象的残留延迟。负值标识延迟已经结束。元素只有在延迟用完的情况下才能从 DelayQueue 移除。还必须
实现 compareTo 方法。DelayQueue 使用该方法对元素进行排序。

#### TransferQueue

允许生产者线程等待，直到消费者准备就绪可以接受一个元素。如果生产者调用 `q.transfer(item);` 这个调用阻塞，直到另一个线程将元素
(item) 删除。LinkTransferQueue 类实现了这个接口。

