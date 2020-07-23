## 反射
### 定义
java 反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意方法和属性；这种动态获取信息以及动态调用对象方法的功能称为 java 语言的反射机制.

### 反射机制的相关类

类 | header 2
---|---
Class | 类
Field | 变量
Constructor |  构造方法
Method | 非构造方法

### Class 类
Class 代表类的实体，在运行的 Java 程序中表示类和接口。

#### 获取 Class 对象
1. 可以通过 Class.forName 方法
2. 通过类名.class 来获取 Class 对象
3. 通过实例化之后的对象 .getClass 来获取

```
        /*获取反射的类对象*/
        RefDoamin ref = new RefDoamin();
        Class<? extends RefDoamin> aClass = ref.getClass();
        System.out.println(aClass.getName());

        /*通过类的地址和名称*/
        String className = "com.dtner.ref.domain.RefDoamin";
        Class<?> cl1 = Class.forName(className);
        System.out.println(cl1.getName());

        /*通过类来获取 class 对象*/
        Class<RefDoamin> refDoaminClass = RefDoamin.class;
        System.out.println(refDoaminClass.getName());
```

注: RefDomain 为任意的实体类

### Field 对象
Field 代表类的成员变量(成员变量也称为类的属性)

#### 获取 Field 类
1. `getField(String name)`: 获得某个公有的属性对象
2. `getFields()`: 获得所有公有的属性对象
3. `getDeclaredField(String name)`:	获得某个属性对象
4. `getDeclaredFields()`: 获得所有属性对象

注: 全部为 Class 类的方法
```
        /*获取 public 修饰的公共变量*/
        Field[] fields = aClass.getFields();
        for (Field f : fields){
            System.out.println("Field：" + f.getName());
        }

        /*getDeclaredFields 可以获取到所有的变量*/
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field f : declaredFields) {
            System.out.println("Declared Field: "+f.getName());
            // 如果变量是私有类型，会报java.lang.IllegalAccessException错误，所以需要设置 setAccessible
            f.setAccessible(true);
            System.out.println(f.getName() +":"+f.get(ref));
        }
```

### Constructor 类
Constructor 代表类的构造方法

#### 获取 Constructor 

1. `getConstructor(Class...<?> parameterTypes)`: 获得该类中与参数类型匹配的公有构造方法
2. `getConstructors()`: 获得该类的所有公有构造方法
3. `getDeclaredConstructor(Class...<?> parameterTypes)`: 获得该类中与参数类型匹配的构造方法
4. `getDeclaredConstructors()`: 获得该类所有构造方法

注: 全部为 Class 类的方法
```
        /*获取类的构造方法*/
        // getConstructors 获取的 public 构造方法
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> c : constructors) {
            System.out.println("constructor : "+c.getName());
            System.out.println("constructor modifier: "+Modifier.toString(c.getModifiers()));
            Class<?>[] parameterTypes = c.getParameterTypes();Modifier.toString(c.getModifiers());
            for (Class<?> p : parameterTypes) {
                System.out.println("parameter types: "+p.getName());
            }
        }
        //getDeclaredConstructors() 获取所有的构造方法
```

### Method 类
Method 代表类的方法

#### 获取 Method 

1. `getMethod(String name, Class...<?> parameterTypes)`: 	获得该类某个公有的方法
2. `getMethods()`: 获得该类所有公有的方法
3. `getDeclaredMethod(String name, Class...<?> parameterTypes)`: 获得该类某个方法
4. `getDeclaredMethods()`: 获得该类所有方法

注: 全部为 Class 类的方法

```
        // getMethods 获取类的 public 方法
        Method[] methods = aClass.getMethods();
        for (Method m : methods) {
            System.out.println("method: "+m.getName());
        }

        // getDeclaredMethods 获取所有的方法
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method dm : declaredMethods) {
            System.out.println("declare method: "+ dm.getName());
            System.out.println(dm.getDefaultValue());
            System.out.println(dm.toString());
//            System.out.println(dm.invoke(ref));
        }

```
