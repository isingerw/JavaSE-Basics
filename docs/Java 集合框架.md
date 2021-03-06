# Java 集合框架 （Iterable迭代）

[TOC]

<img src="https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/05/27/9ee3dc9720c24.png" style="zoom:75%;"/>



# 一、Collection 接口



## 1.1 List 子接口

特点：有顺序以线性方式存储,可以存放重复对象，可以为`null`，长度可变



### 1.1.1 ArrayList 类

* 实现所有可选列表操作，并允许所有元素，包括`null` 。 
* 每个ArrayList实例都有一个容量 。 容量是用于存储列表中的元素的数组的大小，初始容量是`10`，加载因子是`1`，临界值超出会自动增加`1.5`倍
* `ArrayList`的底层数据结构就是一个数组，数组元素的类型为`Object`类型，对`ArrayList`的所有操作底层都是基于数组.。



**ArrayList的优点：**

* ArrayList底层以数组实现，是一种随机访问模式，再加上它实现了RandomAccess接口，因此查找也就是get的时候非常快。
* ArrayList在顺序添加一个元素的时候非常方便，只是往数组里面添加了一个元素而已。
* 根据下标遍历元素，效率高。
* 根据下标访问元素，效率高。
* 可以自动扩容，默认为每次扩容为原来的1.5倍。默认情况下，ArrayList初始容量10.当我们添加到11个元素-》 容量变成了 15；

**ArrayList的缺点：**

* 插入和删除元素的效率不高。
* 根据元素下标查找元素需要遍历整个元素数组，效率不高。
* 线程不安全。

```java
// 集合关系
// 类 引用 = new 类（）
ArrayList list = new ArrayList();

// 接口 引用 = new 类（）
List list = new ArrayList();
// 比较这个对象是否有元素存储
System.out.println(list.isEmpty());

```



**构造方法：**

```java
ArrayList() //构造一个初始容量为十的空列表。 
ArrayList(int initialCapacity) //构造具有指定初始容量的空列表。 
```



**实例方法：**

```java
list1.add()
    
list1.size()
    
list1.remove();

list1.get()
    
list1.forEach(System.out::println)
```



```java
package com.singerw.list.arraylist;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        // 初始容量===》20
        ArrayList list2 = new ArrayList(20);

        // 将元素添加到集合尾部
        list1.add(1);
        list1.add("singerw");
        list1.add(LocalDateTime.now());
        list1.add(34.56);
        // 返回此列表的元素数
        System.out.println(list1.size());

        // 通过索引位置来访问
        // 索引位置1
        System.out.println(list1.get(1));

        // 异常
        // System.out.println(list1.get(list1.size()));

        list1.add(0, "zhangsingerw");
        System.out.println(list1.size());

        // 删除指定位置的元素
        list1.remove(1);
        System.out.println(list1.get(1));

        // for循环遍历并输出集合的元素
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        // foreach循环遍历并输出集合的元素
        for (Object object : list1
        ) {
            System.out.println(object);
        }

        // foreach 1.8新特性
        list1.forEach(System.out::println);

    }
}
```

**学生信息示例：**

```java
package com.singerw.list.arraylist;


class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
        // TODO Auto-generated constructor stub
    }

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}
```

```java
package com.singerw.list.arraylist;

import java.awt.*;
import java.util.ArrayList;

public class TestStudent {

    public static void main(String[] args) {
        //1-> 数组一旦长度可变.
        //2->提供很多的固定算法。直接调用. 插入，添加到尾部，排序，查找等等

        ArrayList<Student> list = new ArrayList();
        Student s1 = new Student("tom", 20);
        Student s2 = new Student("jerry", 21);
        Student s3 = new Student("singerw",23);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list.size());

        System.out.println(list.get(2));

        list.remove(2);
        System.out.println(list.size());

        //遍历输出
        list.forEach(System.out::println);
    }
}
```

> 3
> Student{name='singerw', age=23}
> 2
> Student{name='tom', age=20}
> Student{name='jerry', age=21}



### 1.1.2 LinkedList 类

* 双向链表

* 实现所有可选列表操作，并允许所有元素，包括`null` 。 

* 当数据量很大或者操作很频繁的情况下，**添加和删除元素**时具有比`ArrayList`更好的性能。但在元素的**查询和修改方面**要弱于`ArrayList`。

**构造方法：**

```java
LinkedList() //构造一个空列表
```



**实例方法：**

```java
addFirst(E e) 
addLast(E e) 

getFirst() //检索，但不删除，这个deque的第一个元素。 
getLast() //检索，但不删除，这个deque的最后一个元素。 
```



**LinkedList和ArrayList相比：**

* `ArrayList`采用了和数组相同的存储方式，在内存中分配连续的空间
* `LinkedList`的优点在于增加了很多关于首尾的操作，所有插入、删除元素时效率比较高
* `ArrayList`的优点在于遍历元素和随机访问元素的效率比较高

**ArrayList的特点：**

* 底层以数组实现，根据下标元素遍历，遍历或随机访问效率高；
* 可以自动扩容；
* 线程不安全；

**LinkendList的特点：**

* 以双向链表实现，增加了很多首尾操作，所以插入删除元素是效率高；
* 线程安全；



### 1.1.3 Vector 类

线程安全





### 1.1.4 Stack 类











---

## 1.2 Set 子接口

特点：无顺序,不包含重复的元素，可以为`null`，长度可变



### 1.2.1 HashSet 类

HashSet堪称查询速度最快的集合，因为其内部是以`HashCode`来实现的。它内部元素的顺序是由哈希码来决定的，所以它不保证`set`的迭代顺序；特别是它不保证该顺序恒久不变。（无序）

* 此类实现`Set`接口，由哈希表（实际为`HashMap`实例）支持。 对集合的迭代次序不作任何保证,不重复.
* 这个类允许`null`元素，但只容许一个`null`。
* **底层是一个map**，每个`HashSet`实例都有一个容量 ，容量是用于存储列表中的元素的数组的大小。 其中`loadFactor`为加载因子，当`容量 * 加载因子 = threshold`，为这个容器的临界值，当存储的元素到了这个临界值，那么容器就会自动扩容. 第一次扩容结果为原始长度 `16*2; =>32`
* `HashSet`集合之所以能确保不出现重复的元素，是因为它在添加对象时，会先调用该对象的`hashCode()`方法来确定元素的存储位置，再调用对象的`equals()`方法来确保该位置没有重复元素。

**构造方法：**

```java
public class HashSet<E>
extends AbstractSet<E>
implements Set<E>, Cloneable, Serializable

// 构造一个新的空集合; 背景HashMap实例具有默认初始容量（16）和负载因子（0.75）。 
public HashSet()
```

**实例方法：**

```java 
add(E e) 
将指定的元素添加到此集合（如果尚未存在）。 

clear() 
从此集合中删除所有元素。 
    
isEmpty() 
如果此集合不包含元素，则返回 true 。
    
iterator() 
返回此集合中元素的迭代器。 
    
remove(Object o) 
如果存在，则从该集合中删除指定的元素。 
    
size() 
返回此集合中的元素数（其基数）。 
```

**实例：集合元素的`hashCode`方法返回的哈希值对`HashSet`而言非常重要，因为`HashSet`会优先使用这个哈希值来判定两个元素是否相同并确定元素的位置**。

```java
package com.singerw.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet01 {

    public static void main(String[] args) {
        HashSet set1 = new HashSet();

        // 1 添加元素（不重复）
        set1.add("tom");
        set1.add("jerry");
        set1.add("tom");

        // 2 能否为null
        // 可以
        set1.add(null);
        // 但不可重复
        set1.add(null);

        System.out.println(set1.contains("tom"));

        // 3 查看size
        System.out.println(set1.size());
        // 输出-->但不保证顺序

        // 4 获取迭代器
        Iterator itor = set1.iterator();
        System.out.println(itor);

        // itor方法 hasNext()遍历集合
        while(itor.hasNext()){
            Object obj = itor.next();
            System.out.println(obj);
        }

        // 5 删除
        set1.remove(null);
        System.out.println("********************************");
        set1.iterator();
        while (itor.hasNext()){
            Object obj = itor.next();
            System.out.println(obj);
        }
    }
}
```



**基于哈希的集合在使用`hashCode`的时配合`equals`一起使用：**

* **将两个对象加入HashSet，首先需要重写`hashCode`和`equals`的方法，重写后比较两个对象的`hashCode`值。**
* **若`hashCode`返回的值不同，则两个对象不同，返回`false`。**
* **若`hashCode`返回的值相同，则两个对象相同，再使用`equals`方法进行比较：**
  * **若equals方法返回的值相同，则两个对象相同，返回`true`；**
  * **若equals方法返回的值相同，则两个对象不同，返回`false`。**

![](https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/05/24/5a1afe1fc3ba9.png)

---

**案例如下：**

```java
package com.singerw.set.students;


import java.util.HashSet;

public class StudentsTest {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();

        Students s1 = new Students(1,"singerw");
        Students s2 = new Students(1,"singerw");
        set.add(s1);
        set.add(s2);
        
        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(s1.equals(s2));
    }

}
```

```java
package com.singerw.set.students;

import java.util.Objects;

public class Students {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Students() {
    }

    public Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Students)) {
            return false;
        }
        Students students = (Students) o;
        return getId() == students.getId() &&
                getName().equals(students.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }
}
```

> true
> true



### 1.2.2 TreeSet 类

​		基于`TreeMap`，生成一个总是处于排序状态的`set`，内部以`TreeMap`来实现。它是使用元素的自然顺序对元素进行排序，或者根据创建`Set`时提供的`Comparator`进行排序，具体取决于使用的构造方法。

```java
public class TreeSet<E>
extends AbstractSet<E>
implements NavigableSet<E>, Cloneable, Serializable
```

**构造方法：**

```java
TreeSet() 
构造一个新的，空的树组，根据其元素的自然排序进行排序。 
```



```java
package com.singerw.set.treeset;

import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<Object> set = new TreeSet<>();
        // 添加的时候，按照自然顺序排序（a.b.c.d.e.f.g.h....）
        set.add("abc");
        set.add("abcd");
        set.add("cba");
        set.add("zabc");
        set.add("cba");
        System.out.println(set);
    }
}
```















## 1.3 Iterator











---

# 二、Map 接口

**`Interface Map<K,V>`**

特点：键值对，键必须是唯一，值可以重复，键和值可以为`null`



## 2.1 HashMap（重点面试高频）

* HashMap是基于哈希表的Map接口的**非同步**实现，继承自AbstractMap，AbstractMap是部分实现Map接口的抽象类
* **HashMap是非线程安全的**
* **ConcurrentHashMao 线程安全**

```java
public class HashMap<K,V>
extends AbstractMap<K,V>
implements Map<K,V>, Cloneable, Serializable
```

**构造方法：**

```java
HashMap() 
构造一个空的 HashMap ，默认初始容量（16）和默认负载系数（0.75）。

HashMap(int initialCapacity) 
构造一个空的 HashMap具有指定的初始容量和默认负载因子（0.75）。 
    
HashMap(int initialCapacity, float loadFactor) 
构造一个空的 HashMap具有指定的初始容量和负载因子。 
```

**实例方法：**

```java
put(K key, V value)
将指定的键和值进行添加。 
    
remove(Object key)
从该地图中删除指定键的映射（如果存在）。 
    
remove(Object key, Object value)
仅当指定的密钥当前映射到指定的值时删除该条目。
    
size()
返回此地图中键值映射的数量。
    
get()
获取元素，通过key得到V
    
containsKey(Object key)
如果此映射包含指定键的映射，则返回 true 。 
    
containsValue(Object value)
如果此地图将一个或多个键映射到指定值，则返回 true 。 
    
keySet()
键集
    
values()
值集

entrySet()
键值集
    
get(Object key) 
返回到指定键所映射的值，或 null如果此映射包含该键的映射。 
    
for遍历和forEach遍历
```



**基本操作：**

```java
package com.singerw.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: TestHashMap
 * @Description: //TODO 类描述
 * @Author: CodeSleep
 * @Date: 2021-05-31 10:08
 * @Version: 1.0
 */
public class TestHashMap {
    public static void main(String[] args) {
        // 接口引用 = 实现类对象
        Map map = new HashMap();

        // 类引用 = 类对象
        HashMap hashMap = new HashMap();

        // 1 添加元素
        hashMap.put("1", "singer");
        hashMap.put("2", "image.singerw.com");
        hashMap.put("3", "singer.com");
        // 2 获取元素，通过key得到V
        System.out.println(hashMap.get("1"));

        // 3 添加一重复的key会覆盖原来存在的那个value
        hashMap.put("1", "zhangsingerw");
        System.out.println(hashMap.get("1"));

        //4 size element个数
        System.out.println(hashMap.size());

        // 5 键集 值集 键值合集
        System.out.println("keySet:" + hashMap.keySet());
        System.out.println("values" + hashMap.values());
        System.out.println("entrySet" + hashMap.entrySet());

        // 6 遍历得到键
        for (Object o : hashMap.keySet()) {
            System.out.println("keySet" + o);
        }

        // 7 遍历得到值
        for (Object o : hashMap.values()) {
            System.out.println("values" + o);
        }

        // 8 查询 contains
        System.out.println("containsKey:" + hashMap.containsKey("1"));
        System.out.println("containsValue" + hashMap.containsValue("singer.com"));
        
        // 9 删除
        System.out.println(hashMap.remove("1"));
        System.out.println(hashMap.containsKey("1"));
    }
}
```



## 2.2 TreeMap











## 2.3 tableMap

线程安全











---

## 2.4 线程同步













---

# 三、Collections 工具类

```java
public class Collections
extends Object
    
此类仅由静态方法组合或返回集合。 
```

针对数组的操作类

## 3.1 Collections













# 四、自然排序

## 4.1 Arrays 工具类

针对集合的操作类

```java
public class Arrays
extends Object
```

* 该类包含用于操作数组的各种方法（如排序和搜索）。 该类还包含一个静态工厂，可以将数组视为列表。 
* 如果指定的数组引用为空，则该类中的方法都抛出一个`NullPointerException` ，除非另有说明。 

**方法实例：**

```java
asList(T... a) // 返回由指定数组支持的固定大小的列表。

sort(int[] a) // 按照数字顺序排列指定的数组
    
sort(T[] a , Comparator<? super T> c)
// 根据指定的比较器引发的顺序对指定的对象数组进行排序
```



## 4.2 内部比较器 Comparable

一个类如果想【支持排序】，那么就必须实现接口`Comparable<T>`，该接口被称为对象的内部比较器；

该接口中只有一个方法：

| **方法名**              | **方法描述**                                                 |
| ----------------------- | ------------------------------------------------------------ |
| ` int compareTo(T o)  ` | 返回正数，表示当前对象“大于”参数o;返回0，表示“相等”；返回负数，表示当前对象“小于”参数o |

一个类实现`Comparable`这个内部比较器后，该类支持排序，然而只能有一种排序逻辑，比较受限制； 

**内部比较器实例小练习**

```java
package com.singerw.arrays.student_comparable;

/**
 * @ClassName: Student
 * @Description: //TODO 类描述
 * @Author: CodeSleep
 * @Date: 2021-05-31 15:21
 * @Version: 1.0
 */
public class Student implements Comparable<Student> {

    @Override
    public int compareTo(Student o){
        return this.age - o.age;
    }

    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

```

```java
package com.singerw.arrays.student_comparable;


import java.util.Arrays;

class StudentTest {
    public static void main(String[] args) {
        Student xb = new Student(1, "小白", 20);
        Student xh = new Student(1, "小黑", 18);
        Student xl = new Student(1, "小绿", 2);

        // 数组存放数据
        Student[] array = {xb, xh, xl};
        // 没有排序
        for (Student student : array) {
            System.out.println(student);
        }
        System.out.println("*************");
        // 按照年龄从小到大
        Arrays.sort(array);
        // 自定义比较器使用之后
        for (Student student : array) {
            System.out.println(student);
        }

    }
}
```

> Student{id=1, name='小白', age=20}
> Student{id=1, name='小黑', age=18}
> Student{id=1, name='小绿', age=2}
> *************
> Student{id=1, name='小绿', age=2}
> Student{id=1, name='小黑', age=18}
> Student{id=1, name='小白', age=20}



## 4.3 外部比较器 Comparator

**可以使用外部比较器`Comparator`，灵活为类定义多种比较器，此时类本身不需要实现`Comparable`接口；**

比较功能，对一些对象的集合施加了一个*整体排序* 。 可以将比较器传递给排序方法（如`Collections.sort`或`Arrays.sort`，以便对排序顺序进行精确控制。 比较器还可以用来控制某些数据结构（如顺序`sorted sets`或`sorted  maps`，或对于不具有对象的集合提供的排序`natural ordering`  。 

```java
public interface Comparator<T>{
    
}
```

**`Comparator`接口中有两个方法：**

| **方法名**                       | **方法描述**                                                 |
| :------------------------------- | ------------------------------------------------------------ |
| ` int compare(T o1, T o2)   `    | 返回正数，表示o1“大于”o2；返回0，表示“相等”；返回负数，表示o1“小于”o2 |
| `  boolean equals(Object obj)  ` | 相等返回true，否则返回false                                  |

**外部比较器的使用步骤：**

* 定义一个`Comparator`接口的实现类，重写`comparator`方法
* 使用数组工具`Array.sort`方法，两个参数（数组，`Comparator`接口实现类对象）
* 按照自定义重写方法规则





**实例：**

```java
package com.singerw.arrays;

import java.util.Comparator;
/**
 * @ClassName: MyComparator01
 * @Description: //TODO 外部比较器
 * @Author: CodeSleep
 * @Date: 2021-05-31 15:03
 * @Version: 1.0
 */
public class MyComparator01 implements Comparator<String> {
    public int compare(String o1, String o2) {
        return Integer.valueOf(o1) - Integer.valueOf(o2);
    }
}
```

```java
package com.singerw.arrays;

import java.util.Arrays;

/**
 * @ClassName: MyComparator01Test
 * @Description: //TODO 外部比较器测试类
 * @Author: CodeSleep
 * @Date: 2021-05-31 15:04
 * @Version: 1.0
 */
class MyComparator01Test {
    public static void main(String[] args) {
        String[] array = {"6", "12", "23", "23", "32"};
        Arrays.parallelSort(array, new MyComparator01());
        for (String i : array) {
            System.out.println(i);
        }
    }
}
```

> 6
> 12
> 23
> 23
> 32



**外部类实例小练习**

```java
package com.singerw.arrays.student_comparator;
/**
 * @ClassName: Student
 * @Description: //TODO 类描述
 * @Author: CodeSleep
 * @Date: 2021-05-31 15:21
 * @Version: 1.0
 */
public class Student {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

```

```java
package com.singerw.arrays.student_comparator;

import java.util.Comparator;

/**
 * @ClassName: StudentComparator
 * @Description: //TODO Student外部比较器
 * @Author: CodeSleep
 * @Date: 2021-05-31 15:30
 * @Version: 1.0
 */
public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2){
        return o1.getAge() - o2.getAge();
    }
}
```

```java
package com.singerw.arrays.student_comparator;

import java.util.Comparator;

/**
 * @ClassName: StudentComparator
 * @Description: //TODO Student外部比较器
 * @Author: CodeSleep
 * @Date: 2021-05-31 15:30
 * @Version: 1.0
 */
public class IdComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getId() - o2.getId();
    }
}
```

```java
package com.singerw.arrays.student_comparator;


import java.util.Arrays;

class StudentTest {
    public static void main(String[] args) {
        Student xb = new Student(1,"小白",20);
        Student xh = new Student(1,"小黑",18);
        Student xl = new Student(1,"小绿",2);

        // 数组存放数据
        Student [] array = {xb,xh,xl};
        // 排序
        for (Student student : array){
            System.out.println(student);
        }
        System.out.println("*************");
        // 按照年龄从小到大
        Arrays.sort(array,new AgeComparator());
        // 自定义比较器使用之后
        for (Student student : array){
            System.out.println(student);
        }

        // 按照id从小到大
        Arrays.sort(array,new IdComparator());
        // 自定义比较器使用之后
        for (Student student : array){
            System.out.println(student);
        }
    }
}
```

> Student{id=1, name='小白', age=20}
> Student{id=1, name='小黑', age=18}
> Student{id=1, name='小绿', age=2}
>
> *************
> Student{id=1, name='小绿', age=2}
> Student{id=1, name='小黑', age=18}
> Student{id=1, name='小白', age=20}
> Student{id=1, name='小绿', age=2}
> Student{id=1, name='小黑', age=18}
> Student{id=1, name='小白', age=20}









