[TOC]

# Java 常用类(API)

> `API`（`Application Programming Interface`，应用程序接口）是一些预先定义的函数，或指软件系统不同组成部分衔接的约定。 目的是提供应用程序与开发人员基于某软件或硬件得以访问一组例程的能力，而又无需访问原码，或理解内部工作机制的细节。

## 一、Object 类

`java.lang.Object`

* Object类是Java语言中所有类的根（父类、基类），所有的类都直接或间接的继承了`Object`类；
* 数组也继承了`Object`类；
* **`Object`类中定义了equals方法`public boolean equals Object`，用来比较两个对象的虚地址，如果虚地址相同则返回`true`，否则返回`false`；**



### 1.1 equals 方法

* `Object`类中定义了equals方法`public boolean equals( Object obj ) `，用来比较两个对象的虚地址，如果虚地址相同则返回`true`，否则返回`false`；
* `Object`类中的`equals`方法的作用，与==相同，都是比较两个对象的虚地址；

很多类覆盖了`equals`方法，用来比较两个对象的属性值，如果属性值相同，则认为两个对象相等；例如，`String`类就覆盖了`equlas`方法，用来比较两个字符串的字符序列值

```java
package com.singerw.objdet;

public class TestStudent {

	public static void main(String[] args) {

		Student s1 = new Student(1, "水文");
		Student s2 = new Student(1, "水文");

		System.out.println(s1 == s2);// 地址 false
		System.out.println(s1.equals(s2)); // 调用Object方法 结果依然是false

		// 程序业务有个需求，如果学号和姓名是相同的.我们就认为这两个学生是同一个学生.
		System.out.println(s1.equals(s2)); // true
	}
}


```

> false
> true
> true

```java
package com.singerw.objdet;

public class TestString {
	public static void main(String[] args) {

		// 字符串对象创建
		String str1 = new String("abc");
		String str2 = new String("abc");
		// 方法,从Object继承而来，但是重写了.依次比较两个字符串中字符的内容
		boolean flag = str1.equals(str2);

		System.out.println(flag);
		
		System.out.println(str1.hashCode());

	}

}
```

> true
> 96354

如果需要使用`equals`比较对象的属性值等，可以进行覆盖；例如：

```java
package com.singerw.objdet;

public class TestObject01 {

	public static void main(String[] args) {

		Obj obj1 = new Obj();

		Obj obj2 = new Obj();

		// == 引用类型来说比较的是地址,内存中存储区域是否相同
		System.out.println(obj1 == obj2);// ? false

		// 当且仅当x和y引用相同的对象（ x == y具有值 true）时，该方法返回true 。
		System.out.println(obj1.equals(obj2));// ? false

		Obj obj3 = obj2;// 将obj2赋值给Obj3 等价于obj3和obj2指向的地址一一样的

		System.out.println(obj2 == obj3);
		System.out.println(obj2.equals(obj3));

		System.out.println(obj1.hashCode());
		//obj2 obj3指向同一个对象
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
	}
}

class Obj extends Object {

}
```

> false
> false
> true
> true
> 460141958
> 1163157884
> 1163157884

equals 小练习：

```java
public class Test {
    public static void main(String[] args) {
        String str = "ILoveJava";
        String str1 = "I";
        String str2 = "Love";
        String str3 = "Java";
        System.out.println(str == (str1 + str2 + str3));

        String str4 = "I" + "Love" + "Java";
        System.out.println(str == str4);

        String str5 = (str1 + str2 + str3).intern();
        String str6 = str5;
        System.out.println(str == str6);
    }
}
```

> false
> true
> true

```java
package com.singerw.stringdemo;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date d1 = new Date(100000L);
        Date d2 = new Date(100000L);
        System.out.println(d1.equals(d2));
    }
}
```

> true

### 1.2 hashCode 方法

* `Object`类中定义了`hashCode`方法`public int hashCode()` ，用来返回对象的哈希码；
* 默认情况下【即没有重新`hashCode`方法时】，当两个引用的虚地址相同时，`hashCode`返回相同的值，否则返回不同的值；
* 可以使用IDEA 和 Eclipse的工具重写`equals`和`hashCode`方法；

事实上，基于哈希的集合在使用`hashCode`的时候，基本都是和equals一起使用；

![](https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/05/24/5a1afe1fc3ba9.png)



### 1.3 to String



### 1.4 finalize 

垃圾回收





---

## 二、String类

* `String`无法子类化，因为`String`类是一个`final`类。因为`Sting`是这样定义的：`public final class String extends Object`，里边有`final`关键字，所以不能被继承。
* 字符串不变; 它们的值在创建后不能被更改。 字符串缓冲区支持可变字符串。  因为`String`对象是不可变的，它们可以被共享。

什么时候用可变字符串？什么情况选择String?

答：频繁对字符串进行拼接，而我们业务要求知识得到最后拼接的那个结果而已。用`StringBuffer`或者`StringBuilder`



### 2.1 String 字符串特性

**不可变性：**不可变的意思是，一旦一个字符串被创建后，它的值就不能被修改。

* 不变性，字符串一旦赋值，那么在内存中存储后，
* 如果我们改变引用的值，原来存储的位置的值还是不变的。
* 只是引用的指向改变了而已。

```java
package com.singerw.stringdemo;

/**
 * 不变性，字符串一旦赋值，那么在内存中存储后，
 * 如果我们改变引用的值，原来存储的位置的值还是不变的。
 * 只是引用的指向改变了而已。
 */
public class TestString_03 {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str);
        str += "xyz";
        System.out.println(str);
    }
}
```



* 为了能够重用这些不变的字符串，`Java`使用了字符串常量池
* 凡是用`=`直接赋值的方式得到的字符串，都存储在常量池中；相同的共用一个具体字符串；
* 而使用`new`创建的字符串不适用常量池，每次都会分配新的存储空间

```java
package com.singerw.stringdemo;

// java.lang包默认导入，无需手动导入
public class TestString_01 {
    public static void main(String[] args) {
        String str1 = new String();
        String str2 = new String("hello");
        String str3 = new String("hello");
        System.out.println(str2 == str3); // 地址
        System.out.println(str2.equals(str3)); // 底层原理：转换为字符数组，依次比较

        //存储位置在常量池中。
        String str4 = "java";
        String str5 = "java";
        System.out.println(str4 == str5);  // 地址
        // 底层原理：转换为字符数组，依次比较
        // 但是如果按照上字面值的方式来赋值，直接判断==的时候，str4与str5的地址是一样的。
        System.out.println(str4.equals(str5));

        String str6 = new String("java");
        System.out.println(str6 == str5);
        System.out.println(str6.equals(str5));
    }
}
```

### 2.2 常量池





### 2.3 常见方法API

* `charAt(int index)`  ：返回char指定索引处的值
* `index of`：返回指定字符第一次出现的字符串内的索引
* `length()` ：返回此字符串的长度
* `intern()` ：返回字符串对象的规范表示

- `startsWith(String prefix,  int toffset)` ：
- `endsWith(String suffix)` ：
- `split()`：将此字符串分割为给定的匹配
- `substring(int beginIndex)` ：
- `substring(int beginIndex,  int endIndex)` ：
- `replace`：替换
- `trim()` ：返回一个字符串，并删除任何前面和后面的空格

```java
package com.singerw.stringdemo;

public class TestString_04 {
    public static void main(String[] args) {
        String str = new String("zhangsingerw@gmail.com");
        // 1.charAT
        char ch = str.charAt(0);
        System.out.println(ch);

        // 2.lenght方法，提前字符串长度
        int le = str.length();
        System.out.println(le);
        // 提取最后一个字符
        System.out.println(str.charAt(le - 1));

        // 3.index 有找到返回索引位置，没找到返回-1
        int index1 = str.indexOf("@");
        System.out.println("index:" + index1 + "位");

        // 4.startsWith endsWith
        boolean flag1 = str.startsWith("zhang");
        System.out.println(flag1);

        boolean flag2 = str.endsWith(".com");
        System.out.println(flag2);

        // 5.intern  返回字符串对象的规范表示
        String intern = str.intern();
        System.out.println(intern);

        // 6.split
        String str2 = "hello ,world ,l ,am ,java";
        String[] array = str2.split(",");
        System.out.println(array.length);
        for (String s : array) {
            System.out.println(s);
        }

        // 7.substring
        System.out.println(str2.substring(12));
        // 所有12-17，不包括17
        System.out.println(str2.substring(12, 17));

        // 8.replace 替换 --> 做过滤的
        String str3 = "singerw.com";
        System.out.println(str3.replace("singerw", "zhangsingerw"));

        // 9.trim 去首尾空格（如在用户输入用户名和密码时，需要去除空格）
        System.out.println(" j a v a ".trim().length());
    }
}
```

```java
package com.singerw.Task;

public class Test {
    public static void main(String[] args) {
        String str = "string@sima.com";
        String[] arr = str.split("@");
        System.out.println(arr.length);
        // 替换，会在新的内存区域存储
        str.replace("@", "#");
        
        int index = str.indexOf("@");
        String username = str.substring(0, index);
        System.out.println(username);
    }
}
```



### 2.4 StringBuilder 类

* 一个可变的字符序列。 此类提供与`StringBuffer`的`API`，但不保证同步。 

> ​		此类设计用作简易替换为`StringBuffer`在正在使用由单个线程字符串缓冲区的地方（如通常是这种情况）。  在可能的情况下，建议使用这个类别优先于`StringBuffer` ，因为它在大多数实现中将更快。 

```java
package com.singerw.stringdemo;

public class TestStringBuilder {
    public static void main(String[] args) {
        // 不能直接复制，new可变的字符串，常见方法append,在尾部添加新的字符串
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abc");
        stringBuilder.append("xyz");
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.reverse());  // 导致该字符序列被序列的相反代替。
    }
}

```



### 2.5 StringBuffer 类

* 线程安全，可变的字符序列。 字符串缓冲区就像一个`String` ，但可以修改。 
* 字符串缓冲区可以安全地被多个线程使用。
* `StringBuffer `线程同步 ==> 线程安全
* 常见方法`append`，在尾部添加新的字符串

```java
package com.singerw.stringdemo;

public class TestStringBuffer {

    public static void main(String[] args) {
        // 不能直接复制，new可变的字符串，常见方法append,在尾部添加新的字符串
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("abc");
        stringBuffer.append("xyz");
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.reverse());
    }
}
```





---

## 三、包装类

### 2.1 包装类

Java语言中的8个包装器类型如下所示：

|   **类型**   | **字节型** | **短整型** | **整型** | **长整型** | **单精度**  **浮点型** | **双精度**  **浮点型** | **字符型** | **布尔型** |
| :----------: | :--------: | :--------: | :------: | :--------: | :--------------------: | :--------------------: | ---------- | :--------: |
| 基本数据类型 |    byte    |   short    |   int    |    long    |         float          |         double         | char       |  boolean   |
|  包装器类型  |    Byte    |   Short    | Integer  |    Long    |         Float          |         Double         | Character  |  Boolean   |

> 除了整型及字符型外，其他的包装器类型名字都是将基本数据类型首字母变大写即可；
>
> 以`Integer`类为例，可以把`int`类型转换成`Integer`引用类型；

```java
		int a = 1;
        // Integer 大名
        // 可以通过引用名.属性和方法
        Integer i = 1;
		// 接下来就可以调用Integer类中的方法，例如：
        i.hashCode();
```



### 2.2 自动装箱与拆箱

* 装箱：基本数据类型转换为包装器类型，称为装箱（`boxing`）；例如，`int`型转换为`Integer`类型；

* 拆箱：包装器类型转换为基本数据类型，称为拆箱（`unboxing`）；例如`Integer`类型转换为`int`类型；

  JDK1.5以后，装箱拆箱可以自动进行；例如：

```java
package com.singerw.box;

public class TestInt {
    public static void main(String[] args) {
        // opp语言-->万事万物皆对象
        // int 小名/昵称 ===> 简单的数学计算
        int a = 1;
        // Integer 大名
        // 可以通过引用名.属性和方法
        Integer i = 1;
        i.hashCode();

        // 字符串  ===> 转换为 int
        int n = Integer.parseInt("123");

        // 装箱
        int j = 1;
        Integer jj = j; // 基本类型可以直接赋值给包装类，这种操作叫 “装箱”
        // 拆箱
        Integer k = new Integer(1);
        int kk = k;  // Integer类型自动转换为-->int包装类型
    }
}
```



* 在自动装箱拆箱过程中，Java使用到了常量池；（缓存）

* 如前面所学习，常量池就是方法区的一部分，是内存的逻辑分区；

  如下代码所示,`i1`、`i2`使用到了自动装箱，`i3`和`i4`则没有使用：

```java
package com.singerw.box;

public class TestPool {
    public static void main(String[] args) {
        // 池技术，直接复制存储在内存逻辑区  --》 方法区  --》 常量池
        Integer i1 = 20;
        Integer i2 = 20;
        // 所以我们说,i1和i2只想的数据地址是相同的。
        System.out.println("i1 == i2 " + (i1 == i2));
        
        // 而每次new操作，new对象是堆在存储的，地址一定不同。
        Integer i3 = new Integer(20);
        Integer i4 = new Integer(20);
        System.out.println("i3 == i4 " + (i3 == i4));
    }
}
```

> i1 == i2 true
> i3 == i4 false



Java程序中基本类型的变量可以直接在常量池中读取字面量。基本类型的包装类的大部分都实现了常量池技术，这些类是`Byte`,`Short`,`Integer`,`Long`,`Character`,`Boolean`。另外`Byte`,`Short`,`Integer`,`Long`,`Character`这5种整型的包装类只是在对应值小于等于127时才可使用常量池。

* 原因：在自动装箱拆箱过程中，只有数值是byte范围内的时候，才使用到常量池，否则都是分配新的内存空间；
* `1000`早就超出了`byte`的范围，所以`i3`/`i4`是两个空间；

```java
package com.singerw.box;

public class TestPool2 {
    public static void main(String[] args) {
        // 池技术，直接复制存储在内存逻辑区  --》 方法区  --》 常量池
        Integer i1 = 1000;
        Integer i2 = 1000;
        // 所以我们说,i1和i2只想的数据地址是相同的。
        System.out.println("i1 == i2 " + (i1 == i2));

        // 而每次new操作，new对象是堆在存储的，地址一定不同。
        Integer i3 = new Integer(1000);
        Integer i4 = new Integer(1000);
        System.out.println("i3 == i4 " + (i3 == i4));
    }
}
```

> i1 == i2 false
> i3 == i4 false



```java
package com.singerw.box;

public class Task {
    public static void main(String[] args) {
        double i0 = 0.1;
        Double i1 = new Double(0.1);
        Double i2 = new Double(0.1);
        // equals 方法在Double中有做了重写，比较的double值是否相等。
        System.out.println(i1.equals(i2));
        System.out.println(i1.equals(i0));

        // new不同地址比较
        System.out.println(i1 == i2);
        // i1和直接复制比较   包装类型 、简单类型
        // 直接理解为拆箱，二者比较值是否相等。
        System.out.println(i2 == i0); 
        
    }
}

```

> true
> true
>
> false
> true





## 四、Math 类

特点：`Math`类基本都是私有化静态方法

* `Math.PI`
* `Math.E`
* `Math.abs`
* `Math.random`   // 随机数（0-1）
* `Math.ceil`   // 向上取整
* `Math.floor` // 向下取整
* `Math.max`  // 返回结果最大值
* `Math.min` // 返回结果最小值
* `Math.pow`

## 五、random类

### 4.1 random类的使用

* java.util包中的Random类可以用来生成不同类型的随机值，功能更为强大；
* Random类创建对象两种方式：

| **方法声明**        | **方法描述**                                                 |
| ------------------- | ------------------------------------------------------------ |
| `Random()   `       | 创建`Random`对象，该对象每次生成的随机数不同                 |
| `Random(long seed)` | 使用一个种子参数创建`Random`对象，参数相同的`Random`对象，每次生成的随机数相同。 |

**java.util包中的Random类有多个生成随机数的相关方法：**

| **方法声明**                    | **方法描述**                            |
| ------------------------------- | --------------------------------------- |
| ` int nextInt()   `             | 生成int类型随机数，数值范围不定；       |
| ` int nextInt(int n)   `        | 生成int类型随机数，数值范围[0,n)；      |
| `  long nextLong()   `          | 生成long类型随机数                      |
| `  float nextFloat()   `        | 生成float类型随机数，数值范围[0,1.0)；  |
| `  double nextDouble()   `      | 生成double类型随机数，数值范围[0,1.0)； |
| `  boolean nextBoolean()   `    | 生成boolean类型随机数；                 |
| `  void setSeed(long  seed)   ` | 修改Random对象的种子值                  |

* **`Random`类有两个构造方法，无参的构造方法创建对象后，每次都生成不同的随机数；有参的构造方法创建对象后，如果种子参数值一样，那么每次生成的随机数也相同；**
* **`Random`类功能强大，能生成`int`,`float`,`double`,`boolean`各种类型的随机数；**
* **`nextInt`生成不定范围的`int`随机数，而带参数的`nextInt`生成的随机数有范围；**



### 4.2 小练习

使用JavaAPI相关随机数方法 ， 实现双色球模拟开奖:

* 双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
* 红色球号码从1--33中选择；
* 蓝色球号码从1--16中选择。
* 注需要选择6个红色球号码，1个蓝色球号码。

```java
package com.singerw.Task;

/**
 * @ClassName: TwoColorBall
 * @Description: TODO(使用JavaAPI相关随机数方法 ， 实现双色球模拟开奖)
 * @Author 张欣
 * @Date 2021-05-24 20:09
 */
public class TwoColorBall {
    /**
     * 双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
     * 红色球号码从1--33中选择；
     * 蓝色球号码从1--16中选择。
     * 注需要选择6个红色球号码，1个蓝色球号码。
     *
     * @param args
     */
    public static void main(String[] args) {
        // 定义长度为7的数组
        int[] array = new int[7];

        // 生成红色球
        int n = 0;
        while (true) {
            // 设置标志是否有重复
            boolean flag = true;
            int red = (int) Math.floor(Math.random() * 33 + 1);
            // 判断生成的随机数是否存在相等的
            for (int j = 0; j < array.length; j++) {
                if (array[j] == red) {
                    flag = false;
                    break;
                }
            }
            // 如不不重复，就写进数组
            if (flag) {
                array[n] = red;
                n++;
            }
            // 数组长度为6退出
            if (n > 5) {
                break;
            }
        }

        // 生成蓝色球
        double blue = Math.round(Math.floor(Math.random() * 16 + 1));
        array[6] = (int) blue;

        // 遍历数组输出
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
```





## 六、UUID类 

* 全称（`Universally Unique Identifier`），是唯一的机器生成的标识符
* `UUID`不是人工生成的，这样风险太高
* `UUID`是16字节128位长的数字，通常以36字节的字符串表示，示例：`16c42997-2941-4173-8f3d-b85909f3e664`

```java
package com.singerw.box;

import java.util.UUID;

public class TestUUID {
    public static void main(String[] args) {
        // UUID.randomUUID()方法
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
    }
}
```



## 七、时间日期 

* Date :`import java.util.Date;`
* Calendar : `import java.util.Date;`

> ​		JDK1.8版本中，对时间和日期相关的API进行了较大改动，将日期和时间分开用不同类型表示，每种类中都有相似的方法；主要的三个类有`LocalDate`、`LocalTime`、`LocalDateTime`；

### 6.1 Date

```java
package com.singerw.box;

import java.util.Date;

public class TestData {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
    }
}
```

> Mon May 24 15:49:59 CST 2021



### 6.2 Calendar

```java
package com.singerw.box;

import java.util.Calendar;

public class TestData {
    public static void main(String[] args) {
        Calendar rightNow = Calendar.getInstance();
        System.out.println(rightNow);
    }
}
```

> java.util.GregorianCalendar[time=1621843928239,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=31,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=4,WEEK_OF_YEAR=22,WEEK_OF_MONTH=5,DAY_OF_MONTH=24,DAY_OF_YEAR=144,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=12,SECOND=8,MILLISECOND=239,ZONE_OFFSET=28800000,DST_OFFSET=0]



### 6.3 小练习

1、用户在控制台输入一个年和月份，使用`Date`/`Calendar`实现打印这个月月历。

```java
package com.singerw.Task;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @ClassName: DateCalendarTask
 * @Description: 用户在控制台输入一个年和月份，使用Date/Calendar实现打印这个月月历
 * @Author 张欣
 * @Date 2021-05-24 16:00
 */
public class DateCalendarTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入要查询的年份：");
        int years = input.nextInt();
        System.out.print("请输入要查询的月份：");
        int month = input.nextInt();

        // 获取当月天数
        Calendar c = Calendar.getInstance();
        c.set(years, month, 1);
        // //回退一天
        c.add(Calendar.DATE, -1);
        //获得当月天数
        int dayCount = c.get(Calendar.DAY_OF_MONTH);

        //打印1号前的空格
        c.set(Calendar.DATE, 1);
        //获得1号星期几
        int weekDay = c.get(Calendar.DAY_OF_WEEK);
        String[] weeks = {"日", "一", "二", "三", "四", "五", "六"};
        for (int i = 0; i < weeks.length; i++) {
            System.out.print(weeks[i] + "\t");
        }
        System.out.println();
        for (int i = 1; i < weekDay; i++) {
            System.out.print("\t");
        }
        for (int i = 1; i <= dayCount; i++) {
            //输出一个日期，日期往后走一天。
            c.set(Calendar.DAY_OF_MONTH, i);
            System.out.print(i + "\t");
            //打印完周六换行
            if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
            {
                System.out.println();
            }
        }
    }
}
```



### 6.4 时间转换

* `SimpleDateFormat`格式化时间
* `SimpleDateFormat`中定义了对时间进行格式化的方法；该类继承了抽象父类`DateFormat`，某些方法在父类中定义，可以自定义一个模式字符串来构建`SimpleDateFormat`对象：

可以自定义一个模式字符串来构建`SimpleDateFormat`对象：

| **方法声明**                                            | **方法描述**                       |
| ------------------------------------------------------- | :--------------------------------- |
| ` SimpleDateFormat(String  pattern)   `                 | 使用模式字符串创建对象；           |
| `  SimpleDateFormat(String  pattern, Locale locale)   ` | 使用模式字符串和区域信息创建对象； |

通常使用format方法进行格式化；

| **方法声明**                  | **方法描述**         |
| ----------------------------- | -------------------- |
| ` String format(Date date)  ` | 把`date`进行格式化； |

使用`SimpleDateFormat`格式化时间代码演示：

```java
package com.singerw.datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFormat {
    public static void main(String[] args) throws ParseException {
        // 时间格式：yyyy-MM-dd HH-mm-ss 年-月-日 时:分:秒
        SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // String --> date
        String str = "2021-05-35 10:17:45";
        // 转换
        Date datestr = simple.parse(str);
        System.out.println(datestr);

        // date --> String
        Date now = new Date();
        System.out.println(now);
        // 参数转换，参数为Date类型，返回值为String
        String formatdate = simple.format(now);
        System.out.println(formatdate);
    }
}
```



### 6.5 LocalDate

JDK8中定义了`java.time.LocalDate`，用来表示日期，默认格式是`yyyy-MM-dd`；该类不包含时间信息；

常用的获得`LocalDate`对象的方式如下：

| **方法声明**                                                 | **方法描述**                        |
| :----------------------------------------------------------- | ----------------------------------- |
| `static LocalDate now()  `                                   | 使用当前日期生成`LocalDate`对象；   |
| `  static LocalDate   of(int  year, int  month, int dayOfMonth)  ` | 使用年月日数值生成`LocalDate`对象； |

`LocalDate`类中部分方法如下：

| **方法声明**                                       | **方法描述**                    |
| -------------------------------------------------- | ------------------------------- |
| `  int getYear()  `                                | 返回年字段值；                  |
| `int getMonthValue()  `                            | 返回月字段值；                  |
| `int  getDayOfMonth()  `                           | 返回天字段值                    |
| `static   LocalDate   parse(CharSequence  text)  ` | 将字符串转换成`LocalDate`对象； |

```java
package com.singerw.datedemo;

import java.time.LocalDate;

public class TestLocalDate {
    public static void main(String[] args) {
        //1用当前日期生成LocalDate
        LocalDate localDate1 = LocalDate.now();
        System.out.println(localDate1);

        //2使用指定数字生成LocalDate
        LocalDate localDate2 = LocalDate.of(2021, 05, 14);
        System.out.println(localDate2);
        //返回各字段值
        System.out.println("年：" + localDate2.getYear() + " 月：" + localDate2.getMonthValue() + " 日：" + localDate2.getDayOfMonth());

        // 3参数可以是一个字符串
        //将字符串转换
        LocalDate localDate3 = LocalDate.parse("2021-06-23");
        System.out.println(localDate3);
    }
}
```



### 6.6 LocalTime

`LocalDate`类只表示日期，JDK8中定义了新类`LocalTime`用来表示时间，用法与`LocalDate`类似；：

```java
package com.singerw.datedemo;

import java.time.LocalTime;

public class TestLocalTime {
    public static void main(String[] args) {
        // 1用当前日期生成LocalTime
        LocalTime localTime1 = LocalTime.now();
        System.out.println(localTime1);

        //2使用指定数字生成LocalTime
        LocalTime localTime2 = LocalTime.of(23, 51, 23);
        System.out.println(localTime2);
        //返回各字段值
        System.out.println("时：" + localTime2.getHour() + " 分：" + localTime2.getMinute() + " 秒：" + localTime2.getSecond());


        // 3参数可以是一个字符串
        // 将字符串转换
        LocalTime localTime3 = LocalTime.parse("11:43:23");
        System.out.println(localTime3);
    }
}
```



### 6.7 LocalDateTime

JDK8中还定义了一个`LocalDateTime`类，同时包含日期与时间，用法与`LocalDate`及`LocalTime`类似；：

```java
package com.singerw.datedemo;

import java.time.LocalDateTime;

public class TestLocalDateTime {
    public static void main(String[] args) {
        //1用当前日期生成LocalDateTime
        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println("datetime1:" + localDateTime1);

        //2使用指定数字生成LocalDateTime
        LocalDateTime localDateTime2 = LocalDateTime.of(2021, 05, 14, 15, 45, 45);
        System.out.println("datetime2:" + localDateTime2);
        //返回各字段值
        System.out.println("时：" + localDateTime2.getHour() + " 分：" + localDateTime2.getMinute() + " 秒：" + localDateTime2.getSecond());

        // 3参数可以是一个字符串
        //将字符串转换
        LocalDateTime localDateTime3 = LocalDateTime.parse("2009-12-12T12:34:09");
        System.out.println("datetime3:" + localDateTime3);
    }
}
```



### 6.8 时间格式转换

* **`LocalDate`、`LocalTime`、`LocalDateTime`类都可以使用`DateTimeFormatter`对象进行格式化；**
* **`LocalDate`、`LocalTime`、`LocalDateTime`类都定义了`parse`方法，可以使用`DateTimeFormatter`对象把字符串按照指定的格式转换成时间日期类型对象；**

```java
package com.singerw.datedemo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TestDateTimeFormatter {

    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDate ldate = LocalDate.now();
        System.out.println(ldate);

        System.out.println("********LocalDate LocalTime LocalDateTime ==> String*******************");
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(ldate.format(format1));
        
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(time.format(format2));

        System.out.println("******** String ==> LocalDate LocalTime LocalDateTime *****************");

        String str2 = "15点25分";
        DateTimeFormatter time1Formater = DateTimeFormatter.ofPattern("HH点mm分");
        LocalTime time2 = LocalTime.parse(str2, time1Formater);
        System.out.println("time2:" + time2);

        String str3 = "2020年11月11日";
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        LocalDate date2 = LocalDate.parse(str3, dateFormatter);
        System.out.println("date2:" + date2);
    }
}
```



## 八、System

```java
package com.singerw.system;

import java.util.Scanner;

public class TestSystem {
    public static void main(String[] args) {
        // 输出
        System.err.println("abc");
        System.out.println("abc");
        // 输入
        Scanner input = new Scanner(System.in);
        
        // 常见的方法
        // 1 运行垃圾回收器
        System.gc();
        // 2 当前实际毫秒值(当前时间 举例1970-1-1的差值)
        System.out.println(System.currentTimeMillis());
        // 3 退出 终止虚拟机,通常用来结束程序
        System.exit(0);
        System.out.println("over");
    }
}
```



## 九、正则表达式

* 正则表达式（regular expression）就是用来**描述字符串逻辑规则**的工具；

### 9.1 Java中的正则表达式基本语法

正则表达式由“元字符”组成，掌握了元字符的含义，就可以开始编写正则表达式；

`matches`

1、常用元字符：

| **元字符**   | **含义**                                                 |
| :----------- | :------------------------------------------------------- |
| `x  `        | 字符  x                                                  |
| `  \\  `     | 反斜线字符                                               |
| `  \0n  `    | 带有八进制值  0 的字符 n (0 <= n <= 7)                   |
| ` \0nn  `    | 带有八进制值  0 的字符 nn (0 <= n <= 7)                  |
| `  \0mnn  `  | 带有八进制值  0 的字符 mnn（0  <= m <= 3、0  <= n <= 7） |
| `  \xhh  `   | 带有十六进制值  0x 的字符 hh                             |
| `  \uhhhh  ` | 带有十六进制值  0x 的字符 hhhh                           |
| ` \t  `      | 新行（换行）符  ('\u000A')                               |
| `  \r  `     | 回车符  ('\u000D')                                       |
| `  \f  `     | 换页符  ('\u000C')                                       |
| ` \a  `      | 报警  (bell)  符 ('\u0007')                              |

| **元字符**          | **含义**                                        |
| ------------------- | ----------------------------------------------- |
| ` \e  `             | 转义符  ('\u001B')                              |
| ` \cx  `            | 对应于  x 的控制符                              |
| `  [abc]  `         | a、b 或 c（简单类）                             |
| `[^abc]  `          | 任何字符，除了  a、b 或 c（否定）               |
| `  [a-zA-Z]  `      | a 到  z 或 A 到  Z，两头的字母包括在内（范围）  |
| `  [a-d[m-p]]  `    | a 到 d 或 m 到 p，等同于：[a-dm-p]（并集）      |
| ` [a-z&&[def]]  `   | d、e 或  f（交集）                              |
| ` [a-z&&[^bc]]  `   | a 到  z，除了 b 和  c，等同于c：[ad-z]（减去）  |
| `  [a-z&&[^m-p]]  ` | a 到  z，而非 m 到  p，等同于：[a-lq-z]（减去） |
| ` .  `              | 任何字符（与行结束符可能匹配也可能不匹配）      |
| `  \d  `            | 数字，等同于：[0-9]                             |
| `  \D  `            | 非数字，等同于：  [^0-9]                        |
| ` \s  `             | 空白字符，等同于：[ \t\n\x0B\f\r]               |

| **元字符** | **含义**                                     |
| ---------- | -------------------------------------------- |
| `\S  `     | 非空白字符，等同于：[^\s]                    |
| `\w  `     | 单词字符，等同于：[a-zA-Z_0-9]               |
| `\W  `     | 非单词字符，等同于：[^\w]                    |
| ` ^  `     | 行的开头                                     |
| `$  `      | 行的结尾                                     |
| ` \b  `    | 单词边界                                     |
| ` \B  `    | 非单词边界                                   |
| ` \A  `    | 输入的开头                                   |
| ` \G  `    | 上一个匹配的结尾                             |
| `  \Z  `   | 输入的结尾，仅用于最后的结束符（如果有的话） |
| ` \z  `    | 输入的结尾                                   |



* 正则表达式中往往需要对一些字符出现的次数进行规定，则需要量词；
* 量词有不同的策略，Java中有三种策略，此处列出的是Greedy策略；

常用量词：

| **元字符** | **含义**                       |
| ---------- | ------------------------------ |
| `X?  `     | X，一次或一次也没有            |
| `X*  `     | X，零次或多次                  |
| `X+  `     | X，一次或多次                  |
| `X{n}  `   | X，恰好  n 次                  |
| `X{n,}  `  | X，至少  n 次                  |
| `X{n,m}  ` | X，至少  n 次，但是不超过 m 次 |

```java
package com.singerw.reg;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 用户输入一个字符串，判断是否符合手机号码的规则
 * 用户输入一个字符串，判断是否符合身份证的规则
 * @Author 张欣
 * @Date 2021-05-26 10:39
 */
public class TestReg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个手机号:");
        String iphoneNumber = input.next();
        System.out.println("请输入一个身份证号码：");
        String idcade = input.next();

        boolean matches1 = Pattern.matches("\\d{3}-\\d{8}|\\d{4}-\\{7,8}", iphoneNumber);
        boolean matches2 = Pattern.matches("^(\\d{6})(\\d{4})(\\d{2})(\\d{2})(\\d{3})([0-9]|X)$", idcade);

        System.out.println(iphoneNumber + matches1);
        System.out.println(idcade + matches2);
    }
}
```



## 十、Class 类

Class类的`类`表示正在运行的Java应用程序中的类和接口。 

* 所有类或接口类型
* 反射的基础
* 得到Class类型的

```java

```
