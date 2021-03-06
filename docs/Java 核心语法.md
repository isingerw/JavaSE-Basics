# JavaSE基础

[TOC]



> `Java` 是由`Sun Microsystems`公司于`1995年5月`推出的高级程序设计语言。
>
> `Java`是一门面向对象编程语言，不仅吸收了`C++`语言的各种优点，还摒弃了`C++`里难以理解的多继承、指针等概念，因此`Java`语言具有功能强大和简单易用两个特征。
>
> 语言：java [编译+解释] C[编译]  JavaScript【解释】
>
> Java语言：特性：面向对象，跨平台，健壮性，分布式，多线程等
>
> Jdk：jdk->jre->jvm

## 一、Java 开发环境配置

### 1.1 Jdk下载与配置

#### 1. Jdk下载

> 官方下载地址： [https://www.oracle.com/java/technologies/javase-downloads.html#JDK](https://www.oracle.com/java/technologies/javase-downloads.html#JDK)

#### 2. 环境配置

配置环境变量：右击 `我的电脑` --> `属性` --> `高级系统设置` --> `环境变量`

- 在系统变量里新建 `JAVA_HOME`变量 , 添加变量值： `F:\Java\jdk1.8.0_281`
- 在`Path`变量中（已存在不用新建）, 添加变量值 : `%JAVA_HOME%\bin` `%JAVA_HOME%\jre\bin`
- 新建 `Classpath`, 添加变量值： `.;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools.jar;`

> **补充环境变量的解析：**
>
> **`JAVA_HOME`为`JDK`的安装路径**
>
> **`Classpath`:`Java`加载类路径，只有类在`Classpath` 中`Java`命令才能识别，在路径前加了个`.`表示当前路径。**
>
> **`Path`：系统在任何路径下都可以识别`Java` , `Javac`命令。**



### 1.2 JDK JRE JVM定义与基本关系

#### 1. 三者定义

> `JDK(Java Development Kit) `是整个`Java`的核心，包括了`Java`运行环境（Java Runtime Envirnment），一堆`Java`工具（javac/java/jdb等）和Java基础的类库。
>
> `JRE（Java Runtime Environment）` `Java`运行环境，包含`JVM`标准实现及`Java`核心类库。
>
> `JVM（Java Virtual Machine）`，即`Java`虚拟机, `Java`运行时的环境，`JVM`是一种用于计算设备的规范，它是一个虚构出来的计算机，是通过在实际的计算机上仿真模拟各种计算机功能来实现的。

#### 2. 基本关系

![](https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/05/07/0465dacf0e6a9.png)

> **1.三者联系：**
> `JVM`不能单独搞定class的执行，解释`class`的时候`JVM`需要调用解释所需要的类库`lib`。在`JDK`下面的的`jre`目录里面有两个文件夹`bin`和`lib`,在这里可以认为`bin`里的就是`jvm`，lib中则是`jvm`工作所需要的类库，而`jvm`和` lib`和起来就称为`jre`。`JVM+Lib=JRE`。总体来说就是，我们利用`JDK`（调用`JAVA API`）开发了属于我们自己的`JAVA`程序后，通过`JDK`中的编译程序（`javac`）将我们的文本`java`文件编译成`JAVA`字节码，在`JRE`上运行这些JAVA字节码，`JVM`解析这些字节码，映射到`CPU`指令集或`OS`的系统调用。
>
> **2.三者区别：**
> `JDK`和`JRE`区别：在`bin`文件夹下会发现，`JDK`有`javac.exe`而`JRE`里面没有，`javac`指令是用来将`java`文件编译成`class`文件的，这是开发者需要的，而用户（只需要运行的人）是不需要的。`JDK`还有`jar.exe`, `javadoc.exe`等等用于开发的可执行指令文件。这也证实了一个是开发环境，一个是运行环境。
> `JRE`和`JVM`区别：`JVM`并不代表就可以执行`class`了，`JVM`执行`.class`还需要`JRE`下的`lib`类库的支持，尤其是`rt.jar`。
> ——————————————————————————————————————————————————————
> 原文链接：https://blog.csdn.net/ancientear/article/details/79483592



---

## 二、Java 基本语法

### 2.1 关键字

下面列出了Java保留字。这些保留字不能用于常量、变量、和任何标识符的名称。

<img src="https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/05/07/bc5d7610eed3a.png" alt="" style="zoom:80%;" />



### 2.2 表达式

Java语言中的表达式可以是如下几种：

* 常量：`19`，`false`
* 用单引号引起来的字符：`'A'`   `'中'`
* 用双引号引起来的字符：`"中软"`   `"卓越"`
* 正确声明的变量：`name`  `stuld`
* 用运算符连接的：`i++`  `x+2`  `(m+n)`



### 2.3 标识符 常量 变量

#### 1. Java标识符

Java所有的组成部分都需要名字。类名、变量名以及方法名都被称为标识符。

关于Java标识符，有以下几点需要注意：

- 所有的标识符都应该以字母（A-Z或者a-z）,美元符（$）、或者下划线（_）开始
- 首字符之后可以是任何字符的组合
- 关键字不能用作标识符
- 标识符是大小写敏感的
- 合法标识符举例：`age`、`$salary`、`_value`、`__1_value`
- 非法标识符举例：`123abc`、`-salary`

#### 2. Java变量

Java中主要有如下几种类型的变量

- 局部变量
- 类变量（静态变量）
- 成员变量（非静态变量）

#### 3. Java常量

JAVA常量就是在程序中固定不变的值，是不能改变的数据。例如数字1、字符“a”、浮点数3.2等。在Java中，常量包括整型常量、浮点数常量、布尔常量、字符常量等。

#### 实例

```java
package com.singerw.day01;

public class Work01 {
    /*
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 22:49 2021-05-09
     * @Param
     * @return
    **/
    public static void main(String[] args) {
        // 定义一个整型变量
        // a 称为变量名
        // 1 通常有字母 数字 下划线和 $ 符号组成，不能重复
        // 2 不能以数字开头
        // 3 不能是java中关键字，在相同作用域内不能重复
        int a = 12;     // 变量，a的值是可以随时改变的
        a = a + 1;      //a = a + 1 先计算a+1 =》12+1  =》 a = 13
        System.out.println(a + 1);

        final int b = 12;   //final为常量，在程序运行过程中，值u不能改变
        
        b = b + 1;
        final double d = 3.14;
        d = d+1;
    }
}
```

#### 4. 案例

交换两个变量的值

```java
package com.singerw.day01;
/**
* @Author Singerw_辛格 
* @Description //TODO 
* @Date 23:07 2021-05-09
* @Param 文档注释[类前或者 方法前] 注释是一种规范 这个类只是一个测试类...
* @return  
*/
public class Work02 {
    /**
    * @Author Singerw_辛格 
    * @Description //TODO 
    * @Date 23:07 2021-05-09
    * @Param 方法前注释
    * @return  
    */
    public static void main(String[] args) {
        // 1- 声明变量（告知这个变量的数据类型） a
        // 2- 赋值为1
        int a = 1;
        // 定义变量b并赋值为2
        int b = 2;
        System.out.println("********交换前***********");
        System.out.println(a);
        System.out.println(b);
        // 交换a和b的值; 解决方案 ： 使用临时变量(空杯子)
        // 步骤1 将a的值赋给c
        int c = a;
        // 步骤2 将b的值 赋给a
        a = b;
        // 步骤3 将c的值 赋给 b
        b = c;
        System.out.println("********交换后***********");
        System.out.println(a);
        System.out.println(b);
    }
}
```



### 2.4 Java命名规则

- **大小写敏感**：Java是大小写敏感的，这就意味着标识符Hello与hello是不同的。
- **类名**：对于所有的类来说，类名的首字母应该大写。如果类名由若干单词组成，那么每个单词的首字母应该大写，例如 MyFirstJavaClass 。
- **方法名**：所有的方法名都应该以小写字母开头。如果方法名含有若干单词，则后面的每个单词首字母大写。
- **源文件名**：源文件名必须和类名相同。当保存文件的时候，你应该使用类名作为文件名保存（切记Java是大小写敏感的），文件名的后缀为.java。（如果文件名和类名不相同则会导致编译错误）。
- **主方法入口**：所有的Java 程序由**public static void main(String\**[]\** args)**方法开始执行。



### 2.5 注释

```java
public class MyFirstJavaProgram{
   /* 这是第一个Java程序
    *它将打印Hello World
    * 这是一个多行注释的示例
    */
    public static void main(String []args){
       // 这是单行注释的示例
       /* 这个也是单行注释的示例 */
       System.out.println("Hello World"); 
    }
} 
```



## 三、Java 数据类型及其拓展

![](https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/05/09/1138e3201db7f.png)

### 3.1 基本数据类型

![](https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/05/10/800b6d49540de.png)

#### 1. 整型 

> `byte`  `short` `int` `long`

```java
int num1 = 10;   //最常用的整数数据类型
byte nmu2 = 20;
short num3 = 30;
long num4 = 30;   //Long类型要在数字后面加个L，用来区分
```



####  2. 浮点型（小数）

> `float` `double`

```java
float num5 =50.1f;   //带小数点的默认都是double类型，float类型要在数字后面加个f，强类型   
double num6=3.141592654785;   //双精度
double num7=3.14;   //单精度
```



####  3. 字符型

> `char` `String`

```java
char name = '张';
String name2="张欣牛逼";   //字符串String不是关键字，是数据类型
```



####  4. 布尔值（标识是非）

> `boolean`

```java
boolean flag = true;   //真
boolean flag = false;  //假
```

### 3.2 引用类型

* 自定义类
* 接口
* 枚举
* 数组
* 注解



---

## 四、Java 运算符

- 算术运算符
- 关系运算符
- 位运算符
- 逻辑运算符
- 赋值运算符
- 其他运算符

### 4.1 算术运算符

| 操作符 | 描述                              | 例子                 |
| :----: | :-------------------------------- | :------------------- |
|  `+`   | 加法 - 相加运算符两侧的值         | `A + B等于30`        |
|  `-`   | 减法 - 左操作数减去右操作数       | `A – B等于-10`       |
|  `*`   | 乘法 - 相乘操作符两侧的值         | `A * B等于200`       |
|  `/`   | 除法 - 左操作数除以右操作数       | `B / A等于2`         |
|  `％`  | 取模 - 左操作数除以右操作数的余数 | `B%A等于0`           |
|  `++`  | 自增 - 操作数的值增加1            | `B++ 或 ++B 等于 21` |
|  `--`  | 自减 - 操作数的值减少1            | `B-- 或 --B 等于 19` |

### 4.2 关系运算符

| 运算符 | 描述                                                         | 例子                   |
| :----: | :----------------------------------------------------------- | :--------------------- |
|  `==`  | 检查如果两个操作数的值是否相等，如果相等则条件为真。         | `(A == B)为假(非真)。` |
|  `!=`  | 检查如果两个操作数的值是否相等，如果值不相等则条件为真。     | `(A != B) 为真。`      |
|  `> `  | 检查左操作数的值是否大于右操作数的值，如果是那么条件为真。   | `(A> B)非真。`         |
|  `< `  | 检查左操作数的值是否小于右操作数的值，如果是那么条件为真。   | `(A <B)为真。`         |
|  `>=`  | 检查左操作数的值是否大于或等于右操作数的值，如果是那么条件为真。 | `(A> = B)为假。`       |
|  `<=`  | 检查左操作数的值是否小于或等于右操作数的值，如果是那么条件为真。 | `(A <= B)为真。`       |

### 4.3 位运算符

| 操作符 | 描述                                                         | 例子                            |
| :----: | ------------------------------------------------------------ | ------------------------------- |
|  `＆`  | 按位与操作符，当且仅当两个操作数的某一位都非0时候结果的该位才为1。 | `（A＆B），得到12，即0000 1100` |
|  `^`   | 按位异或操作符，两个操作数的某一位不相同时候结果的该位就为1。 | `（A ^ B）得到49，即 0011 0001` |
|  `〜`  | 按位补运算符翻转操作数的每一位。                             | `（〜A）得到-61，即1100 0011`   |
| `<< `  | 按位左移运算符。左操作数按位左移右操作数指定的位数。         | `A << 2得到240，即 1111 0000`   |
| `>> `  | 按位右移运算符。左操作数按位右移右操作数指定的位数。         | `A >> 2得到15即 1111`           |
| `>>>`  | 按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充。 | `A>>>2得到15即0000 1111`        |



### 4.4 逻辑运算符

![](https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/05/10/6b13e556c9774.png)

### 4.5 赋值运算符

| 操作符 | 描述                                                         | 例子              | 结果 |
| :----: | :----------------------------------------------------------- | :---------------- | ---- |
|  `=`   | 简单的赋值运算符，将右操作数的值赋给左侧操作数               | `int a =7`        | `7`  |
|  `+=`  | 加和赋值操作符，它把左操作数和右操作数相加赋值给左操作数     | `int a =7 , a+=2` | `9`  |
|  `-=`  | 减和赋值操作符，它把左操作数和右操作数相减赋值给左操作数     | `int a =7 , a-=2` | `5`  |
|  `*=`  | 乘和赋值操作符，它把左操作数和右操作数相乘赋值给左操作数     | `int a =7 , a*=2` | `14` |
|  `/=`  | 除和赋值操作符，它把左操作数和右操作数相除赋值给左操作数     | `int a =7 , a/=2` | `3`  |
| `％=`  | 取模和赋值操作符，它把左操作数和右操作数取模后赋值给左操作数 | `int a =7 , a%=2` | `1`  |

### 4.6 条件运算符（?:）









### 4.7 运算符优先级表

<img src="https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/05/10/63fcefb33d953.png" style="zoom:100%;" />

### 4.8 控制台输入

```java
Scanner input = new Scanner(System.in);
System.out.println("请输入两个整数");
a = input.nextInt();
b = input.nextInt();
```

### 4.9 练习

**1.控制台输入两位整数，计算和差商积**

```java
package com.singerw.day03;

import java.util.Scanner;

public class Work02 {
    /*
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 20:05 2021-05-08
     * @Param
     * @return
     **/
    public static void main(String[] args) {

        //两个变量的值是从控制台输入进来的
        int a,b;
        //输入方式是用到Java中工具类Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("请输入两个整数");

        a = input.nextInt();
        b = input.nextInt();

        //输出和差积商
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}

```

**2.控制台输入一个五位数，并计算五位数个位十位百位千万万位的和**

```java
package com.singerw.day03;

import java.util.Scanner;

public class Work03 {
    /*
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 20:19 2021-05-08
     * @Param
     * @return
    **/
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个五位数整数");
        a = input.nextInt();

        int g = a%10;
        int s = a/10%10;
        int b = a/100%10;
        int q = a/1000%10;
        int w = a/10000%10;

        int sum =  g + s + b + q + w;
        System.out.println(sum);
    }
}

```

**3.控制台输入一个数，判断是否为水仙花数**

```java
package com.singerw.day03;

import java.util.Scanner;

public class Work04 {
    /*
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 20:23 2021-05-08
     * @Param
     * @return
    **/
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数");

        a = input.nextInt();
        int g = a % 10;
        int s = a /10 % 10;
        int b = a /100 %10;
        int sum = g*g*g+s*s*s+b*b*b;
        String info = sum == a?"数字"+a+"是水仙花数":"数字"+a+"不是水仙花数";
        System.out.println(info);
    }
}
```

## 五、类加载器









