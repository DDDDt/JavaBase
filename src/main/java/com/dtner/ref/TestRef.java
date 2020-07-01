package com.dtner.ref;

import com.dtner.ref.domain.RefDoamin;

import java.lang.reflect.*;

/**
 * @ClassName TestRef
 * @Description:
 * @Author dt
 * @Date 2020-07-01
 **/
public class TestRef {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {

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

        /*获取实例,newInstance*/
        RefDoamin refDoamin = aClass.newInstance();
        /*如果 class 的泛型类未知，返回的则是 Object*/
        Object o = cl1.newInstance();

        /*获取类的变量*/

        // getFields 只能获取到 public 公共的变量，其他的变量获取不到
        Field[] fields = aClass.getFields();
        for (Field f : fields){
            System.out.println("Field：" + f.getName());
        }

        // getDeclaredFields 可以获取到所有的变量
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field f : declaredFields) {
            System.out.println("Declared Field: "+f.getName());
            // 如果变量是私有类型，会报java.lang.IllegalAccessException错误，所以需要设置 setAccessible
            f.setAccessible(true);
            System.out.println(f.getName() +":"+f.get(ref));
        }

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

        /*获取方法*/
        Method nameMethod = aClass.getMethod("getName");
        System.out.println("getName 方法的值"+nameMethod.invoke(ref));

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

    }

}
