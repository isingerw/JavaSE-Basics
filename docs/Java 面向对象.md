[TOC]

# Java 面向对象

**面向对象的三个阶段：**

* 面向对象的分析OOA
* 面向对象的设计OOD
* 面向对象的编程 OOP



**面向对象编程的本质就是：以类的方式组织代码，以对象的组织（封装）数据。**

**面向对象的三个特征：封装 、 继承 、 多态**



![QQ截图20210518224339.png](https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/05/18/faf1976eb305e.png)



---

## 一、 类和对象

> - **对象**：对象是类的一个实例，有状态和行为。例如，一条狗是一个对象，它的状态有：颜色、名字、品种；行为有：摇尾巴、叫、吃等。
> - **类**：类是一个模板，它描述一类对象的行为和状态。

**类和对象的关系：**类是概念性模型，抽象的，是对象的类型。对象是类的实例。



### 1.1 创建类

**类可以看成是创建 Java 对象的模板。**

```java
【访问权限修饰符】 【修饰符】 class 类名{
    //成员列表
    成员变量
    成员方法
}
```

通过下面一个简单的类来理解下 Java 中类的定义：

```java
package com.singerw.day08;

public class OOP_Class_01 {
    public static void main(String[] args) {
        // 创建对象，实例化类
        // 左侧 person 称为引用名，右侧 new Person()创建对象
        Person person = new Person();
        // 怎么使用属性和方法？
        person.sfz = "632123199712237532";
        person.height = 178;
        person.sex = '男';
        person.weight = 130;
        String address;

        System.out.println(person.height);
        System.out.println(person.address);

        //方法
        person.eat();
        person.drink();
        person.coding();
    }
}

// 创建一个对象，
// Java —> 对象要依赖于类存在
// 对象，万事万物皆对象
class Person{
    // 静态，属性，变量，变量直接放在类中，成为成员属性
    String sfz;
    int height;
    double weight;
    char sex;
    String address;

    // 动态， 表现就是方法，成员方法
    // 修饰符 方法的返回值类型 方法名（参数）{ }
    public void eat(){
        System.out.println("吃蛋炒饭");
    }

    public void drink(){
        System.out.println("和快乐水");
    }

    public void coding(){
        System.out.println("敲Java代码，Java是全世界最好的语言");
    }
}

```



### 1.2 创建对象

​		**现在让我们深入了解什么是对象。看看周围真实的世界，会发现身边有很多对象，车，狗，人等等。所有这些对象都有自己的状态和行为。**

>  拿一条狗来举例，它的状态有：名字、品种、颜色，行为有：叫、摇尾巴和跑。
>
> 对比现实对象和软件对象，它们之间十分相似。
>
> 软件对象也有状态和行为。软件对象的状态就是属性，行为通过方法体现。
>
> 在软件开发中，方法操作对象内部状态的改变，对象的相互调用也是通过方法来完成。

```java
package com.singerw.day08;

public class OOP_Class_01 {
    public static void main(String[] args) {
        // 创建对象
        // 左侧 person 称为引用名或引用数据类型，右侧 new Person()创建对象
        Person person = new Person();
        // 怎么使用属性和方法？
        person.sfz = "632123199712237532";
        person.height = 178;
        person.sex = '男';
        person.weight = 130;
        String address;

        System.out.println(person.height);
        System.out.println(person.address);

        //方法
        person.eat();
        person.drink();
        person.coding();
    }
}


// 创建一个对象，
// Java —> 对象要依赖于类存在
// 对象，万事万物皆对象
class Person{
    // 静态，属性，变量，变量直接放在类中，成为成员属性
    String sfz;
    int height;
    double weight;
    char sex;
    String address;

    // 动态， 表现就是方法，成员方法
    // 修饰符 方法的返回值类型 方法名（参数）{ }
    public void eat(){
        System.out.println("吃蛋炒饭");
    }

    public void drink(){
        System.out.println("和快乐水");
    }

    public void coding(){
        System.out.println("敲Java代码，Java是全世界最好的语言");
    }
}

```



---

## 二、类和对象的创建与使用

### 2.1 类成员属性声明与初始化

* 成员变量是类中的特有属性变量
* 再类中声明成员变量的格式

```java
public class OOP_Class_02 {
    // 成员变量，也叫属性
    // 8个基本类型
    int age;
    char sex;
    
    //引用类型
    String name;
    // 自定义引用类型
    Person person;
}
```

* 成员变量的类型可以是Java中任意的数据类型，包括基本类型、类、接口、数组等

**`private`**：私有的成员变量

**`public`**：公共的

**2、初始值**

* int的初始值为0；
* 引用类型需要初始化后才能使用，引用类型初始值为`null`

> 178
> null



### 2.2 局部变量和成员变量的区别

**区别一：代码的位置不同**

* 成员变量：类中方法外定义的变量
* 局部变量：方法中定义的变量 或 代码块 `{ }` 中定义的变量

**区别二：代码的作用范围不同**

* 成员变量：带去类的很多方法
* 局部变量：当前一个方法（当前代码块）

**区别三：是否有默认值**

* 成员变量：有
* 局部变量：无

**区别四：是否要初始化**

* 成员变量：不需要，不建议初始化，后续使用的时候再赋值即可
* 局部变量：一定需要，不然直接使用的时候会报错

**区别五：内存中的位置不同**

* 成员变量：堆内存
* 局部变量：栈内存

**区别六：作用时间不同**

* 成员变量：当前对象从创建到销毁
* 局部变量：当前方法从开始到执行结束

| **比较** |                         **成员变量**                         |               **局部变量**               |
| :------: | :----------------------------------------------------------: | :--------------------------------------: |
| 定义位置 |                        直接在类中定义                        |               定义在方法中               |
| 声明赋值 | 可以在声明时赋初始值；若不赋值，会有默认初始值，基本数据类型的值为0，引用类型的值为null |         需要显式初始化后才能使用         |
|  作用域  | 在整个类内部都是可见的，所有成员方法都可以使用它，如果访问权限允许，还可以在类外部使用 | 仅限于定义它的方法，在该方法外无法访问它 |
|   注意   | （1）在同一个方法中，不允许有同名的局部变量。在不同的方法中，可以有同名的局部变量  （2）局部变量可以和成员变量同名，并且在使用时，局部变量具有更高的优先级 |                                          |



### 2.3 实例化类的对象

* 说明新建对象所属的类名
* 说明新建对象的名字
* 用new为新建对象开辟内存空间

```java
类名 引用名

//声明对象
Person person;



类名 引用名 = new 类名();

// 声明并实例化
Person person = new Person();
```

> 使用已经定义好的类，创建该类对象的过程称之为`“实例化”`



### 2.4 类的属性与方法

**1.方法的声明格式：**

```JAVA
public static void main(String[] args) {
    
}

// 访问权限 修饰符 返回值类型 方法名（参数）{

}
// 方法method01
public void method01() {
    
}
```

**2.调用**

```java
import java.util.Scanner;

public class OOP_Class_Method_01 {

    public static void main(String[] args) {
        //main()调用 method01()
        // 创建类对象
        OOP_Class_Method_01 oop1 = new OOP_Class_Method_01();
        // 引用名字/对象名.方法名（）
        oop1.method01();

    }

    /**
     * 定义method01方法
     */
    public void method01() {
        Scanner input = new Scanner(System.in);
        // 定义数组，for循环完成控制台输入
        int[] numberArray = new int[10];
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个整数：");
            numberArray[i] = input.nextInt();
        }
        // for循环完成比较，比较的轮次为数组长度-1；
        for (int i = 0; i < numberArray.length - 1; i++) {
            for (int j = 0; j < numberArray.length - i - 1; j++) {
                if (numberArray[j] > numberArray[j + 1]) {
                    int a = numberArray[j];
                    numberArray[j] = numberArray[j + 1];
                    numberArray[j + 1] = a;
                }
            }
        }
        // 遍历打印结果
        for (int n : numberArray) {
            System.out.println(n);
        }
    }
}
```



### 2.5 调用类的成员变量

> Java中实例化对象后，就可以访问到类中的成员
>
> 使用成员运算符`（.）`来访问成员，一般语法是：

```java
对象名.成员名

如

students.age = 18;   // 为成员属性赋值；
```

```java
public class OOP_Class_03 {
    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.show1();
        pig.show2();
        pig.show3();
    }
}

class Pig{
    // 可以在任何实例方法中使用
    String name = "佩琪";

    public void show1(){
        // name只能在这个方法内使用，如果外部有同名，此时引用为就近原则；
        String name = "八戒";
        // 输出八戒
        System.out.println("show1:"+name);
    }

    public void show2(){
        // name 输出佩奇
        System.out.println("show2:"+name);
    }

    public void show3(){
        String name = "猪猪侠";
        // this 为代称 ；指当前这个类的对象。
        System.out.println("show3:"+this.name);
    }
}
```

> show1:八戒
> show2:佩琪
> show3:佩琪



---

## 三、方法的定义与调用

### 3.1 方法的基本声明形式

方法的基本组成部分包括：修饰符、返回值类型、方法名（）、参数和方法体。下面是它的基本声明形式：

> 返回类型可以是任意的`Java`数据类型，当一个方法不需要返回值时，返回类型为`void`。

```java
【访问控制】【方法修饰符】 返回值类型  方法名称(参数1,参数2,…) {
       …(statements;)    //方法体：方法的内容
}

如
    
public  void swap(int a, int b) {
    int t = a;
    a = b;
    b = t;
    System.out.println("swap a:" + a + "b:" + b);
}
```

**1. 方法定义的格式：**

* 修饰符
* 方法返回值类型：方法的返回值对应的数据类型，可以是基本数据类型也可以是引用类型。
* 方法名：见名知意，首字母小写，遵循驼峰命名规则，一般采用英文
* 形式参数：方法定义的时候需要的形式参数，相当于告诉方法的调用者需要传入几个参数，需要传入的参数的类型
* 实际参数：方法调用的时候传入的具体的参数，根据形式参数的需要传入
* 方法体：具体的业务逻辑代码
* return：方法返回值
  * 方法如果有返回值的话，`return`+`方法返回值`，将返回值返回到方法的调用处。
  * 方法如果没有返回值的话：`return`可以省略不写，且方法的返回值类型定义成`void`



**2. 方法的定义需要注意什么？**

* 形参列表要怎么写，定义几个参数，分别是什么类型？
* 方法到底是否需要有返回值，如果需要的话，返回值的类型是什么？



**3. 参数：**

**实现参数：在方法被调用时用于接收外界输入的数据。**

**实际参数：调用方法时实际传给方法的数据。**

```java
package com.singerw.method;

public class Demo01 {
    public static void main(String[] args) {
        // 实际参数，实际调用方法时传递给方法的参数
       int sum =  add(1,2);
        System.out.println(sum);
    }
    // 加法
    // 形式参数，用来定义作用的
    public static int add(int a, int b) {
        return a + b;
    }
}
```



**4. 方法的基本语法结构案例：**

```java
public class Review01 {
    public static void main(String[] args) {
        // 常见对象
        Person person = new Person();
        person.name = "张哥哥";
        person.eat1();
        person.eat2("沙茶面");
        person.eat3("沙茶面", "蛋花汤");


    }
}

class Person {
    // 静：属性、变量、“成员”变量
    // 语法：访问权限 修饰符 变量类型 变量名 = 值；如果不赋值有默认值
    String name;
    int age;
    char sex;


    //动：方法、函数、成员方法
    // 语法：访问权限 修饰符 返回值类型 方法名(参数1 参数2){ }

    /**
     * 无参数，无返回值
     */
    public void eat1() {
        System.out.println(name + "在吃");
    }

    /**
     * 带参数，无返回值
     * @param food
     */
    public void eat2(String food) {
        System.out.println(name + "在吃" + food);
    }

    /**
     * 带参数，无返回值
     * @param food
     * @param drink
     */
    public void eat3(String food, String drink) {
        System.out.println(name + "在吃" + food + ",配" + drink);
    }
}
```



**5. 类实例方法带参数带返回值实例：**

```java
package com.singerw.day08;

public class Calc {
    // a b 称之为参数，是方法执行的必备条件
    // 不能确定a b的值，所以a b为形式参数
    public void add(int a, int b) {
        System.out.println("和为：" + (a + b));
    }


    public void sub(int a, int b) {
        System.out.println("差为：" + (a - b));
    }

    // 乘法运算
    public int mul(int a, int b) {
        int sum = a * b;
        // return 从方法中返回结果给调用
        return sum;
    }

    /**
     *
     * @param a
     * @param b
     */
    public void swap(int a, int b) {
        int t = a;
        a = b;
        b = t;
        System.out.println("swap a:" + a + "b:" + b);
    }
}
```

```java
package com.singerw.day08;

/**
 * @ClassName: TestCalc
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author 张欣
 * @Date 2021-05-14 15:11
 */
public class TestCalc {
    public static void main(String[] args) {

        // 创建对象
        Calc calc = new Calc();
        // 调用方法
        calc.add(10, 2);
        calc.sub(2, 6);


        // 如果方法有返回值，要接收mul的返回值 定义一个合适的类型接收返回值
        // 函数 和 方法是同一个东西
        int result = calc.mul(6, 5);
        System.out.println(result);

        int a = 1, b = 2;
        calc.swap(a, b);
        System.out.println("main:  a:" + a + "b:" + b);
    }
}
```



> 创建类，定义方法完成判断某个是是否是质数
>
> * 有参数，无返回值
> * 有参数，有返回值
> * 使用`Debug`完成程序的调试

```java
package com.singerw.day08;

/**
 * @ClassName: OOP_Class_04
 * 创建类，定义方法完成判断某个是是否是质数
 * 有参数，无返回值
 * 有参数，有返回值
 * 使用Debug完成程序的调试
 * @Author 张欣
 * @Date 2021-05-20 0:26
 */
public class OOP_Class_04 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ZhiShu zhiShu = new ZhiShu();
        int n = 123;
        zhiShu.judge1(n);
        boolean flag = zhiShu.judge2(n);
        if (flag) {
            System.out.println(n + "是质数");
        } else {
            System.out.println(n + "不是质数");
        }
    }

}

// _______________________________________________________________

package com.singerw.day08;

/**
 * 创建类，定义方法完成判断某个是是否是质数
 * 有参数，无返回值
 * 有参数，有返回值
 * 使用`Debug`完成程序的调试
 *
 * @Author 张欣
 * @Date 2021-05-20 0:34
 */
public class ZhiShu {
    /**
     * @param n
     */
    public void judge1(int n) {
        // 判断n是否是质数，输出结果
        boolean flag = true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(n + "是质数");
        } else {
            System.out.println(n + "不是质数");
        }
    }

    /**
     * @param n
     * @return
     */
    public boolean judge2(int n) {
        // 判断n是否是质数，输出结果
        boolean flag = true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
```



### 3.4 方法的调用

* 调用方法：`对象名.方法名（实参列表）`
* 如果方法返回值是void时，方法调用一定是一条语句。
* 当方法返回一个值的时候，方法调用通常被当作一个值，例如：

```java
int larger = max(10,30)
```

```java
package com.singerw.day09;

public class Demo01 {
    public static void main(String[] args) {
        // 静态方法调用
        Test01.method01();
        // 非静态方法调用
        Test01 test01 = new Test01();
        test01.method02();
    }
}

class Test01 {
    /**
     * 实例方法1
     * 静态方法 static
     */
    public static void method01() {
        System.out.println("method01");
    }

    /**
     * 实例方法2
     * 非静态方法
     */
    public void method02() {
        // 两个实例方法之间相互调用，不用加引用名
        method01();
        System.out.println("method02");
    }

}
```

> method01
> method01
> method02



**方法的调用需要注意什么？**

* 实际参数要怎么传入：传入几个参数，传入什么类型的？
* 方法是否有返回值需要接收？



### 3.5 可变参数

* 在JDK1.5开始，Java支持传递同类型的可变参数给一个方法
* 在方法声明中，在指定参数类型后面加一个省略号 `...`  。
* 一个方法中只能指定一个可变参数，它必须时方法的最后一个参数，任何普通的参数必须在它之前声明。

```java
public class Demo04 {
    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        demo04.printMax(1,2,5,23,132);

    }
    // 可变参数，（不定项参数）
    public void printMax(int... i){

    }
}
```



### 3.6 数组作为参数练习

​		**当我们参数为引用类型数组名，传递的参数是数组名，由于数组是引用类型，所以我们传递参数相当于参数n和自定义方法的参数n，指向的是内存中的同一个地址。**

```java
package com.singerw.day09;

/**
 * @ClassName: Method_03
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author 张欣
 * @Date 2021-05-17 13:47
 */
public class Method_03 {
    public static void main(String[] args) {

        Test03 t = new Test03();
        int[] n = {1, 2, 3, 5, 7};
        t.method01(n);
        // 调用方法结束之后，我们也可以数组n
        // 输出数组元素，a是数组中每个元素
        // 当我们参数为引用类型数组名，传递的参数是数组名，由于数组是引用类型，
        // 所以我们传递参数相当于参数n和自定义方法的参数n，指向的是内存中的同一个地址。
        System.out.println("main===> 数组n中的元素");
        for (int a : n) {
            System.out.println(a);
        }
    }
}

class Test03 {
    /**
     * 实例方法，方法的参数是一个整型的数组
     *
     * @param n
     */
    public void method01(int[] n) {
        for (int i = 0; i < n.length; i++) {
            // 数组每个元素在原来的基础上乘以2
            n[i] = n[i] * 2;
        }
        System.out.println("Test03===> 数组n中的元素");
        for (int a : n) {
            System.out.println(a);
        }
    }
}



```



### 3.7 递归调用

* 递归就是：A方法调用A方法，自己调用自己。**方法直接或者间接调用其自身的方法叫做递归调用，简称递归。其设计方法被应用到很多特殊问题的解决上.**

递归调用包含两个部分：

* 递归头：什么时候不调用自身方法。如果没有头，将陷入死循环。（栈溢出）
* 递归体：什么时候需要调用自身方法。

```java
public class Demo05 {
    public static void main(String[] args) {
        System.out.println(f(5));
    }
    // 递归调用
    // 阶乘
    // 1！ 1
    // 2！ 2*1
    // 3！ 3*2*1
    
    // n=2 2 * f(1)
    // n=3 3 * f(2)
    // n=4 4 * f(3)
    public static int f(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * f(n - 1);
        }
    }
}
```

![](https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/05/23/8fb9d2a2fc1fb.png)



### 3.8 方法的重载

**1、重载：在同一个类中，方法名相同，形式参数不同的多个方法，构成了方法的重载；**

**2、方法的重载的规则：**

* 方法名必须相同。
* 参数列表不许不同（个数不同、个数相同类型不同或参数排列顺序不同等）。
* 方法的返回值类型可以相同也可以不相同。
* 仅仅返回值类型不同不足以称为方法的重载。

**3、作用：方法名的复用，增强可读性**

> 同一个类Pig中，两个[多个]方法名 `sort` **相同，参数个数不同**: 

```java
eat() 0个参数 eat(String food) 一个参数 ;

如

class Test06{
    public void sort(int[] array){
         …(statements;)    //方法体：方法的内容
    }
    
    public void sort(String [] array){
         …(statements;)    //方法体：方法的内容
    }
    
    public void sort(float[] array){
         …(statements;)    //方法体：方法的内容
    }
    
    public void sort(double[] array){
         …(statements;)    //方法体：方法的内容
    }
}
```



### 3.9 值传递和引用传递













---

## 四、构造方法

​		能够在**创建对象的同时，完成新建对象的初始化工作，**正是由于在实例化对象的同时会自动调用构造方法，所以构造方法一般用来给数据成员分配资源或初始化数据成员。

### 4.1 构造方法的特点

* **构造方法名必须与类同名的方法**
* **没返回值，也不能写void**
* **主要作用是完成新建对象的初始化工作**
* **使用new关键字，本质是在调用构造器，一般不能显式地直接调用，而是用new来调用（后面会存在使用this/super调用）**
* **创建一个类的新对象的同时，系统自动调用该类的构造函数，为新建对象的初始化**
* **一但定义了有参构造，无参构造就必须显示定义,否则就无效**

**注意：**

* **我们一般不会在空构造器进行初始化操作，因为这样每个对象的属性就一样了。**
* **一般我们会重载构造器，在重载的构造器中进行属性的赋值操作。**
* **加入空构造器忘记写了，系统也不会分配默认的空构造器了，那么调用的时候会报错。**
* **当形参名字和属性名字重名的时候，就会出现就近原则。在要表示的对象的属性前加上`this`，因为`this`代表的就是创建的那个对象。**



### 4.3 构造方法的作用

* 构造器不是为了创建对象，因为再调用构造器之前，这个对象就已经创建好了，并且属性有默认的初始化的值。
* 调用构造器的目的是给属性进行赋值操作的。

```java
public class A{
    // 没有声明构造，默认有构造，有修饰符和类相同
}

class B{
    // 没有显示构造，默认有构造，有修饰符和类相同
}
```

### 4.2 构造方法的定义与调用

```java
package com.singerw.oop;

public class Demo02 {
    // 一个类名即使什么都不写，它也会存在一个方法
    // 显示的定义构造器
    String name;
    int age;

    // 无参构造，使用new关键字，本质是在调用构造器
    // 用来初始化值
    public Demo02(){

    }

    // Alt+Insert
    // 有参构造：一但定义了有参构造，无参构造就必须显示定义,否则就无效
    public Demo02(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

```

```java
package com.singerw.oop;

class Demo02Test {
    public static void main(String[] args) {
        // new 实例化一个对象
        Demo02 demo02 = new Demo02("张欣",23);
        System.out.println(demo02.name);
        System.out.println(demo02.age);
    }
}
```



### 4.3 this 关键字

**作用：**

* `this`可以调用本类中的属性，也就是类中的成员变量；
* `this`可以调用本类中的其他方法；
* `this`可以调用本类中的其他构造方法，调用时要放在构造方法的首行。

