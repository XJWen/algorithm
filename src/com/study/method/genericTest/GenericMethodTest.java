package com.study.method.genericTest;

/**
 * 定义泛型方法的规则：
 *
 * ·所有泛型方法声明都有一个类型参数声明部分（由尖括号分隔），
 * 该类型参数声明部分在方法返回类型之前（在下面例子中的<E>）。
 *
 * ·每一个类型参数声明部分包含一个或多个类型参数，参数间用逗号隔开。
 * 一个泛型参数，也被称为一个类型变量，是用于指定一个泛型类型名称的标识符。
 *
 * ·类型参数能被用来声明返回值类型，并且能作为泛型方法得到的实际参数类型的占位符。
 *
 * ·泛型方法体的声明和其他方法一样。注意类型参数只能代表引用型类型，
 * 不能是原始类型（像int,double,char的等）。
 * */
public class GenericMethodTest {
    /**
     * 泛型方法书写
     * **/
    public static <E> void printArray(E[] inputArray){
        for (E element : inputArray){
            System.out.printf("%s",element);
        }
        System.out.println();
    }
    /**
     * 有界的类型参数
     * 泛型方法继承Comparable类来实现比较
     * 要声明一个有界的类型参数，首先列出类型参数的名称，后跟extends关键字，最后紧跟它的上界
     * **/
    public static <T extends Comparable<T>> T maxnum(T x,T y,T z){
        T max = x;
        if (y.compareTo(max)>0){
            max = y;
        }
        if (z.compareTo(max)>0){
            max = z;
        }
        return max;
    }

    public static void main(String[] args){
        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("整型数组为：");
        printArray(intArray);
        System.out.println("\n双精度型数组为：");
        printArray(doubleArray);
        System.out.println("\n字符型数组为：");
        printArray(charArray);

        System.out.println("\n\n3数比较");
        System.out.printf("%d %d和%d三数比较结果:%d",3,5,7,maxnum(3,5,7));
        System.out.printf("\n%.2f %.2f和%.2f三数比较结果:%.2f",3.3,2.5,4.7,maxnum(3.3,2.5,4.7));
        System.out.printf("\n%s %s和%s三数比较结果:%s","apple","banana","pear",maxnum("apple","pear","banana"));
    }
}
