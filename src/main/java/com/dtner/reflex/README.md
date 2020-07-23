# 反射

## 反射的定义
能够分析类能力的程序称为反射。反射机制的功能及其强大，反射可以用来: 
- 在运行时分析类的能力
- 在运行时查看对象
- 实现通用的数组操作代码
- 利用 Method 对象

### 获取 class 对象
1. 可以通过 Class.forName 方法
2. 通过类名.class 来获取 Class 对象
3. 通过实例化之后的对象 .getClass 来获取

### 变量 
1. public 变量: getFields
2. 所有变量:  getDeclaredFields
3. 以上的方法都可以通过给方法赋值来获取指定的变量

### 构造方法
1. public 构造方法: getConstructors
2. 所有构造方法: getDeclaredConstructors
3. 以上的方法都可以通过指定变量类型来获取指定的构造方法

### 方法
1. public 方法: getMethods
2. 所有方法: getDeclaredMethods
3. 以上的方法都可以通过指定方法名和方法参数来获取指定的方法

可以通过 invoke 来获取方法的值 