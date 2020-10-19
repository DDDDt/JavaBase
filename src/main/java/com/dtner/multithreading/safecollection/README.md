## 线程安全的集合

### 映射、集、队列
java.util.concurrent 包提供了映射、有序集和队列的高效实现

#### ConcurrentHashMap

可以被多线程安全访问的散列映射表

#### ConcurrentSkipListMap

可以被多线程安全访问的有序的映像表

#### ConcurrentSkipListSet

可以被多线程安全访问的有序集

#### ConcurrentLinkedQueue
可以被多线程安全访问的无边阶非阻塞的队列