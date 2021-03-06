# Java 内部类

[TOC]

## 一、内部类简单解释

* 内部类是Java独有的一种语法结构，即在一个类的内部定义另一个类，此时，内部类就成为外部类中的成员，访问权限遵循类成员的访问权限机制，可以是public、protected、缺省和private
* 内部类可以很方便地访问外部类中的其它成员



## 二、内部类的意义

* **完善多重继承**：折中解决了java类不支持多继承问题。
* **形成闭包**：外部类不能直接访问内部类成员；但是内部类可以直接访问外部类成员，单向包含的关系。



* 内部类是个编译时的概念，一旦编译成功后，它就与外围类属于两个完全不同的类（当然他们之间还是有联系的）
* 对于一个名为`OuterClass`的外围类和一个名为`InnerClass`的内部类，在编译成功后，会出现这样两个`class`文件：`OuterClass.class`和`OuterClass$InnerClass.class`
* 在Java中内部类主要分为
  * **成员内部类**
  * **局部内部类**
  * **匿名内部类**
  * **静态内部类**



## 三、内部类分类

### 3.1 成员内部类

* 可以无限制的访问外围类的所有成员属性和方法，即便是`private`的，但是外围类要访问内部类的成员属性和方法则需要通过内部类实例来访问。
* **在成员内部类中要注意两点：**
  * **第一：成员内部类中不能存在任何`static`的变量和方法**
  * **第二：成员内部类是依附于外围类的，所以只有先创建了外围类才能够创建内部类。**

```java
package com.singerw.moinner;

public class OutClass {
    private String name;

    // 成员内部类
    public class InnerClass {
        
        //内部类
        public InnerClass() {
            // 这个name是外部类
            name = "singerw";
        }
        
        //内部类方法
        //获得外部类的私有属性
        public void show() {
            System.out.println("show:" + name);
        }
        
    }
}
```

```java
package com.singerw.moinner;

public class InnerClassTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        OutClass.InnerClass innerClass = outClass.new InnerClass();
        innerClass.show();
    }
}
```

> 

### 3.2 局部内部类

* 嵌套在方法和作用域内，局部内部类只能在该方法和作用域中被使用，出了该方法和作用域就会失效。

**局部内部类对外部类变量访问存在以下规则：**

* 局部内部类可以直接操作外部类的成员变量，但是对于方法的临时变量（包括方法的参数，要求是`final`常量才能操作）

```java
package com.singerw.moinner;

public class OutClass {
    public void t() {
        int a = 1;
        // 在方法中定义一个内部类，不能使用Public
        // 方法内部类（局部内部类）
        class InnerClass1 {
            public void InnerClass1() {
                // 这个name是外部类
                name = "jerry";
            }

            public void show() {
                System.out.println("show jerry:" + name);
            }
        }
        InnerClass1 ic = new InnerClass1();
        ic.show();
    }
}
```

> 

### 3.3 静态内部类（Static内部类）

关键字`static`可以修饰成员变量、方法、代码块，其实它还可以修饰内部类，使用static修饰的内部类我们称之为静态内部类或嵌套内部类。

* 静态内部类与非静态内部类之间存在一个最大的区别，**非静态内部类在编译完成之后会隐含地保存着一个引用，该引用是指向创建它的外部类，但是静态内部类却没有。**没有这个引用就意味着：
  * **它的创建是不需要依赖于外部类的**
  * **它不能使用任何外部类的非`static`成员变量和方法**
  * **和成员内部类不同，`static`内部类能够声明static的成员**

```java
package com.singerw.moinner;

public class OutClass2 {

    private static String name;

    // 静态内部类
    public static class InnerClass2 {
        public InnerClass2() {
            // 这个name是外部类
            name = "static : tom";
        }

        public void show() {
            System.out.println("static show:" + name);
        }
    }
}
```

```java
package com.singerw.moinner;


class OutClass2Test {
    public static void main(String[] args) {
        // 静态内部类
        // 外部类.内部类 引用名 = new 外部类.内部类()
        OutClass2.InnerClass2 i2 = new OutClass2.InnerClass2();
        i2.show();
    }
}
```



### 3.4 匿名内部类

如果一类内部类仅需要构建一个单一的对象，那么这个类其实并不需要额外取一个特有的名字，对于不存在名字的内部类，我们称为匿名内部类

* **匿名内部类必须继承一个父类或实现一个接口**

匿名内部类的声明使用方法如下：

```java
[访问权限] [修饰符]父类名/接口名 引用名 = new 父类名/接口名（[父类构造方法参数列表]）{
    匿名内部类成员；
}
```

```java
package com.singerw.moinner;

public interface IFly {

    void fly();
}

class Bird implements IFly {
    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("笨鸟先飞");
    }
}

class T {
    public static void main(String[] args) {

        new IFly() {
            @Override
            public void fly() {
                System.out.println("傻鸟先吃");
            }
        }.fly();
//		ifly.fly();
    }
}
```

---

```java
package com.etc.demoinnerclass;

public class A {
	
	public void ta() {
		System.out.println("a  ta");
	}
}
```

```java
package com.etc.demoinnerclass;

public class B {
	
	public void tb() {
		System.out.println("b  tb");
	}
}
```

```java
package com.etc.demoinnerclass;

public class C extends A {

	public void tc() {
		System.out.println("tc");
	}

	class D extends B {
		public void td() {
			ta(); // A
			tb();// B
			tc();// C
		}
	}
}
```

**方法局部变量在内部类中的访问原则:**

* 匿名内部类**没有构造方法**（匿名内部类没有显式类名）
* 匿名内部类要想完成一些初始化工作可以交由类初始化或实例初始化代码块来完成
* 匿名内部类对类成员、方法临时变量的访问规则和具备名字的内部类保持一致







