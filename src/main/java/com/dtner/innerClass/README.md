## 内部类

### 静态内部类
使用 static 修饰的内部类。
实例化时：
```java
        StaticInnerClass staticInnerClass = new StaticInnerClass();
         new StaticInnerClass.InnerClass();
```

静态内部类实例化时，可以值初始化内部类

### 成员内部类
未使用 static 修饰，且不在方法里的内部类

```java
InnerClass innerClass = new InnerClass();
        innerClass.new InnerNoClass();
```