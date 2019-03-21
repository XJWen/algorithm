package com.study.method.refrenceTest;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Test {
    /**
     * java四种引用的学习
     * **/
    public static void main(String[] args)throws InterruptedException{
        //强引用
        String str = "abc";
        Object object = new Object();
        System.out.println("强引用:");
        System.out.println(str+"  obj:"+object);
        System.gc();
        System.out.println(str+"  obj:"+object);
        //软引用 JVM只会在内存不足的情况下回收该对象
        SoftReference<String> softReference = new SoftReference<>(new String("abc"));
        System.out.println("软引用：");
        System.out.println(softReference.get());
        System.gc();
        System.out.println(softReference.get());
        //弱引用 如果某个对象与弱引用关联，那么当JVM在进行垃圾回收时，无论内存是否充足，都会回收此类对象。
        // 被弱引用关联的对象，总是会在垃圾回收时被回收掉
        WeakReference<String> weakReference = new WeakReference<>(new String("abc"));
        System.out.println("弱引用：");
        System.out.println(weakReference.get());
        System.gc();
        Thread.sleep(2000);
        System.out.println(weakReference.get());
        //虚引用 任何时候都可能被JVM回收
        ReferenceQueue<String> referenceQueue = new ReferenceQueue<>();
        PhantomReference<String> phantomReference = new PhantomReference<>("abc",referenceQueue);
        System.out.println("虚引用：");
        System.out.println(phantomReference.get());
    }
}
