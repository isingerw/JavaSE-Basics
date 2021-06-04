# Java 异常

* `API`中标准异常的顶级父类是Throwable类；
* `Throwable`类有两个子类：`Exception`和`Error`；
* 所有异常都是`Exception`类的直接或间接子类；
* 所有错误都是`Error`的直接或间接子类；

![](https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/06/01/edae35b021d60.png)



## 一、Exception

**运行时异常**

* 所有异常都是`Exception`类的直接或间接子类；
* Exception有很多子类；这些子类又可以分为两大类；

即**运行时异常**和**非运行时异常**;`RuntimeException`的子类都是运行时异常，其他的都是非运行时异常；

![image-20210601112650844](C:\Users\Zhang_Singer\AppData\Roaming\Typora\typora-user-images\image-20210601112650844.png)

### 1.1 ArithmeticException 

运行时异常

```java
package com.singerw.exception;

public class ArithmeticException {
    public static void main(String[] args) {
        System.out.println(1/0);
    }
}
```

```java
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.singerw.exception.ArithmeticException.main(ArithmeticException.java:5)
```

```java
```



### 1.2 ClassCastException

运行时异常

```java
```

```java
```

```java
```





### 1.3 NullPointerException

运行时异常

```java
```

```java
```

```java
```







### 1.4 IllegalArgumentException

方法的参数错误，检查异常（编译时异常）编译器就去检查，这个异常需要显示处理

```java
```

```java
```

```java
```







### 1.5 IndexalArgumentException

```java
```

```java
```

```java
```





## 二、Error

****





作者：[Singerw](https://singerw.com)
欢迎任何形式的转载，但请务必注明出处。
限于本人水平，如果文章和代码有表述不当之处，还请不吝赐教。

