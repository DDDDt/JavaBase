## 设计模式-单例模式

### 定义

单例模式（Singleton Pattern）是 Java 中最简单的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

这种模式涉及到一个单一的类，该类负责创建自己的对象。这个类提供了一种访问其唯一的对象方式，可以直接访问，不需要实例化该类的对象

### 介绍

#### 注意
- 单例类只能有一个实例
- 单例类必须自己创建自己的唯一实例
- 单例类必须给所有其他对象提供这一实例

#### 意图
保证一个类仅有一个实例，并提供一个访问它的全局访问点

#### 主要解决
一个全局使用的类频繁地创建与销毁

#### 何时使用
当您想控制实例数目，节省系统资源的时候

#### 如何解决
判断系统是否已经有这个单例，如果有则返回，如果没有则创建

#### 关键代码
构造函数是私有的 

### 实现方式

#### 非线程安全的懒汉式
1. 私有化一个类变量
2. 私有化构造方法
3. 判断是否为空，为空就 new ,不为空就直接返回.
```java
public class SluggardUnsafeSingleton {

    private static SluggardUnsafeSingleton sluggardUnsafeSingleton;

    private SluggardUnsafeSingleton() {
    }

    public static SluggardUnsafeSingleton getInstance(){
        if(sluggardUnsafeSingleton == null){
            sluggardUnsafeSingleton = new SluggardUnsafeSingleton();
        }
        return sluggardUnsafeSingleton;
    }

}
```

#### 线程安全的懒汉式
1. 私有化一个类变量
2. 私有化构造方法
3. 通过 synchronized 对方法进行枷锁。 判断是否为空，为空就 new ,不为空就直接返回.
```java
public class SluggardSafeSingleton {

    private static SluggardSafeSingleton sluggardSafeSingleton;

    private SluggardSafeSingleton() {
    }

    public static synchronized SluggardSafeSingleton getInstance(){
        if (sluggardSafeSingleton == null){
            sluggardSafeSingleton = new SluggardSafeSingleton();
        }
        return sluggardSafeSingleton;
    }

}

```

#### 饿汉式
1. 私有化一个类变量,并直接初始化
2. 私有化构造方法
3. 直接返回初始化的类变量
```java
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
```

#### 双重校验锁（DCL）
 1. 使用 volatile 修饰类变量
 ２. 私有化构造方法
 ３. 先判断类变量是否为空，不为空直接返回。为空，则用 synchronized 进行加锁，然后实例化。
 
```java
public class DoubleCheckLockSingleton {

    private static byte[] lcok = new byte[0];

    private volatile static DoubleCheckLockSingleton singleton;

    private DoubleCheckLockSingleton() {
    }
    public static DoubleCheckLockSingleton getInstance(){
        if(singleton == null){
            synchronized (lcok){
                singleton = new DoubleCheckLockSingleton();
            }
        }
        return singleton;
    }
}

```

#### 静态内部类
1.  在类里创建一个静态内部类
2. 静态内部类初始化一个外部类的变量，并用 static final 修饰
３. 外部类的方法可以直接返回，静态内部类的该变量

使用的是静态内部类的延迟加载

```java
public class InnerClassSingleton {

    private static class SinletonHolder{
        private static final InnerClassSingleton innerClass = new InnerClassSingleton();
    }

    private InnerClassSingleton() {
    }

    public static final InnerClassSingleton getInstance(){
        return SinletonHolder.innerClass;
    }

}
```

### 枚举
直接创建枚举，通过枚举类来实现
```java
public enum  EnumSingleton {

    INSTANCE;
    public void whateverMethod(){

    }

}
```