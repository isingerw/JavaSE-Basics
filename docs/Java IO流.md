# Java IO流

流从概念上来说是一个连续的数据流。当程序需要读数据的时候就需要使用输入流读取数据，当需要往外写数据的时候就需要输出流。

BIO 中操作的流主要有两大类，字节流和字符流，两类根据流的方向都可以分为输入流和输出流。

- 字节流
  - 输入字节流：`InputStream`
  - 输出字节流：`OutputStream`
- 字符流
  - 输入字符流：`Reader`
  - 输出字符流：`Writer`

<img src="https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/06/02/f9518c8b9df60.png" style="zoom:150%;" />

## 一、File 文件类

`File` 类是 `java.io` 包中唯一对文件本身进行操作的类。它可以对文件、目录进行增删查操作。



### 1.1 File常用方法

**1、名称或路径常用方法：**

* `getName()`  返回由此抽象路径名表示的文件或目录的名称。 
* `getPath()` 获取路径，构建相对路径返回相对路径，构建绝对路径返回绝对路径
* `getAbsolutePath()`  绝对路径，返回此抽象路径名的绝对路径名字符串。
* `getAbsoluteFile()`  返回此抽象路径名的绝对形式。 
* `getParent` 父路径 返回上一层路径，上路径不存在，返回`null`

【示例】名称或路径名日常操作：

```java
public class FileDemo04 {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\demo\\1.txt");
        if (!src.exists()) {
            boolean flag = src.createNewFile();
            System.out.println("判断文件不存在后是否创建:" + flag);
            System.out.println("getName:" + src.getName());
            System.out.println("getPath:" + src.getPath());
            System.out.println("getAbsolutePath：" + src.getAbsolutePath());
            System.out.println("getAbsoluteFile：" + src.getAbsoluteFile());
            System.out.println("getParent：" + src.getParent());

        }
        if (src.exists()) {
            boolean flag = src.delete();
            System.out.println("判断文件存在后是否删除："+flag);
        }
    }
}
```

输出：

```java
判断文件不存在后是否创建:true
getName:1.txt
getPath:D:\demo\1.txt
getAbsolutePath：D:\demo\1.txt
getAbsoluteFile：D:\demo\1.txt
getParent：D:\demo
判断文件存在后是否删除：true
```



**2、文件状态常用方法：**

* `exists()` 判断是否存在，测试是否存在，存在返回trun,否则返回false
* `isFile()` 判断是否是文件，测试是文件，是返回trun,否则返回false
* `isDirectory()`  判断是否是文件夹或目录

【示例】文件状态日常操作：

```java
public class FileDemo02 {
    public static void main(String[] args) {
        File src = new File("Path");
        if (src==null || !src.exists()){
            System.out.println("文件不存在");
        }else {
            if (src.isFile()){
                System.out.println("进行文件的操作");
            }else {
                System.out.println("进行文件夹的操作");
            }
        }
    }
}
```



**3、其他信息常用方法：**

* `length()` 文件字节数长度
* `createNewFile()` 创建新文件（前提是不存在才创建，存在则返回空）
* `delete()`  删除文件，需要注意的是，如果删除的是目录，且目录不为空，直接用 `delete()` 删除会失败。

```java
public class FileDemo03 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\1.txt");
        if (!file.exists()) {
            boolean flag = file.createNewFile();
            System.out.println(flag);
        }
        if (file.exists()){
            boolean flag = file.delete();
            System.out.println(flag);
        }
    }
}
```



### 1.2 createNewFille

**可以使用 `createNewFille()` 方法创建一个新文件**。

注：

* Windows 中使用反斜杠表示目录的分隔符 `\`。
* Linux 中使用正斜杠表示目录的分隔符 `/`。

最好的做法是使用 `File.separator` 静态常量，可以根据所在操作系统选取对应的分隔符。

【示例】使用separator分隔符

```java
public class FileDemo01 {
    public static void main(String[] args) {
        String path = "I:/IDEA2019_Project/Java 高琪说300级/6. Java IO流";
        File file = new File(path);
        System.out.println(file.length());
    }
}
```

【示例】创建文件

```java
// 1、构建File对象
File f = new File(filename);
boolean flag = f.createNewFile();

// 2、构建File对象
String path = "I:/IDEA2019_Project/Java 高琪说300级/6. Java IO流";
        File file = new File(path);
        System.out.println(file.length());
```



### 1.3 mkdir 和 mkdirs

`File` 中给出了两种创建文件夹的方法：

* `mkdir()`  **可以使用 `mkdir()` 来创建文件夹，必须确保上级目录存在**，如果要创建的目录的父路径不存在，则无法创建成功。
* `mkdirs()` 使用 `mkdirs()`，上级目录可以不存在，当父路径不存在时，会连同上级目录都一并创建。推荐使用mkdirs

【示例】创建目录

```java
public class MkdirDemo {
    public static void main(String[] args) {
        File dir = new File("G:\\IOtest\\mkdir");
        // mkdir
        boolean flag = dir.mkdir();
        System.out.println("mkdir:" + flag);
        // mkdirs  推荐使用mkdirs
        boolean flag2 = dir.mkdirs();
        System.out.println("mkdirs:" + flag2);
    }
}
```

输出：

```java
mkdir:false
mkdirs:true
```







### 1.4 list 和 listFiles

`File` 中给出了两种列出文件夹内容的方法：

- **`list()`: 列出全部名称，返回一个字符串数组**。列出下级名称
- **`listFiles()`: 列出完整的路径，返回一个 `File` 对象数组**。 列车下级File对象

`list()` 【示例】：

```java
File f = new File(filename);
String str[] = f.list();
```

`listFiles()` 【示例】：

```java
File f = new File(filename);
File files[] = f.listFiles();
```

**listFiles层级遍历目录及子文件**

【示例】：

```java
package com.singerw.file;

import java.io.File;

/**
 * @ClassName: FileDemo04
 * @Description: //TODO 层级遍历，遍历目录和子目录及其文件
 * @Author: CodeSleep
 * @Date: 2021-06-02 14:02
 * @Version: 1.0
 */
public class FileDemo04 {
    public static void main(String[] args) {
        File file = new File("C:\\Windows");
        // 调用方法
        showsFile(file);
    }

    /**
     * @Author: CodeSleep
     * @Date: 2021-06-02 14:29
     * @Description: //TODO 遍历file路径下的文件和目录
     * @param file
     */
    private static void showsFile(File file) {
        // 调用listfile方法
        File[] files = file.listFiles();
        // 没有权限 == null
        if (files !=null) {
            // 遍历
            for (File f : files) {
                // 如果f是文件的话，直接输出
                if (f.isFile()) {
                    System.out.println("getAbsolutePath:" + f.getAbsolutePath());
                } else {
                    // 如果f是目录的话，要继续listFiles
                    showsFile(f);
                }
            }
        }
    }
}
```





## 二、RandomAccessFile

> 注：`RandomAccessFile` 类虽然可以实现对文件内容的读写操作，但是比较复杂。所以一般操作文件内容往往会使用字节流或字符流方式。

**`RandomAccessFile` 类是随机读取类，它是一个完全独立的类。**

它适用于由大小已知的记录组成的文件，所以我们可以使用 `seek()` 将记录从一处转移到另一处，然后读取或者修改记录。

文件中记录的大小不一定都相同，只要能够确定哪些记录有多大以及它们在文件中的位置即可。

### 2.1 RandomAccessFile 写操作

当用 `rw` 方式声明 `RandomAccessFile` 对象时，如果要写入的文件不存在，系统将自行创建。

`r` 为只读；`w` 为只写；`rw` 为读写。

【示例】文件随机读写

```java
public class RandomAccessFileDemo02 {
    public static void main(String[] args) throws IOException {
        String path = "I:\\IDEA2019_Project\\JavaSE基础\\Java IO流\\src\\resources\\docs\\singer.txt";
        File src = new File(path);
        // 声明RandomAccessFile类的对象
        RandomAccessFile raf = null;
        raf = new RandomAccessFile(src, "rw");

        // 没进行任何写入操作，位置为0
        long pointer = raf.getFilePointer();
        System.out.println("pointer: "+ pointer);

        // 可写入
        // 写入一个int类型
        int id = 123;
        raf.writeInt(id);
        // 写入一个int类型，占4个字节
        long pointer1 = raf.getFilePointer();
        System.out.println("pointer: "+ pointer1);

        // 写入一个string类型
        // raf.writeUTF("hellojava"); 基本不用这种方法
        raf.write("hellojava".getBytes());
        // 写入一个String类型，占9个字节
        long pointer2 = raf.getFilePointer();
        System.out.println("pointer: "+ pointer2);

        // 写入中文
        raf.write("中文".getBytes());
        // 写入一个中文类型，占2个字节
        long pointer3 = raf.getFilePointer();
        System.out.println("pointer: "+ pointer3);

        System.out.println("写入成功");
        raf.close();
    }
}
```

输出：

```java
pointer: 0
pointer: 4
pointer: 13
pointer: 17
写入成功
```



### 2.2 RandomAccessFile 读操作

读取是直接使用 `r` 的模式即可，以只读的方式打开文件。

读取时所有的字符串只能按照 byte 数组方式读取出来，而且长度必须和写入时的固定大小相匹配。

* `seek(long pos)`  设置文件指针偏移，从该文件的开头测量，发生下一次读取或写入。 

```java
public class RandomAccessFileDemo03 {
    public static void main(String[] args) throws IOException {
        String path = "I:\\IDEA2019_Project\\JavaSE基础\\Java IO流\\src\\resources\\docs\\singer.txt";
        File src = new File(path);
        // 声明RandomAccessFile类的对象
        RandomAccessFile raf = null;
        raf = new RandomAccessFile(src, "r");

        // 可随机读
        raf.seek(4);
        byte[] b = new byte[9];
        // 读取方法
        raf.read(b);

        // 构造一个string对象，参数是byte数组
        String str = new String(b);
        System.out.println(str);

        raf.close();
    }
}
```

输出：

```java
hellojava
```





## 三、System

`System` 类中提供了大量的静态方法，可以获取系统相关的信息或系统级操作，其中提供了三个常用于 IO 的静态成员：

- `System.out` - 一个 PrintStream 流。System.out 一般会把你写到其中的数据输出到控制台上。System.out 通常仅用在类似命令行工具的控制台程序上。System.out 也经常用于打印程序的调试信息(尽管它可能并不是获取程序调试信息的最佳方式)。
- `System.err` - 一个 PrintStream 流。System.err 与 System.out 的运行方式类似，但它更多的是用于打印错误文本。一些类似 Eclipse 的程序，为了让错误信息更加显眼，会将错误信息以红色文本的形式通过 System.err 输出到控制台上。
- `System.in` - 一个典型的连接控制台程序和键盘输入的 InputStream 流。通常当数据通过命令行参数或者配置文件传递给命令行 Java 程序的时候，System.in 并不是很常用。图形界面程序通过界面传递参数给程序，这是一块单独的 Java IO 输入机制。

【示例】重定向 `System.out` 输出流

```java
import java.io.*;
public class SystemOutDemo {

    public static void main(String args[]) throws Exception {
        OutputStream out = new FileOutputStream("d:\\test.txt");
        PrintStream ps = new PrintStream(out);
        System.setOut(ps);
        System.out.println("人生若只如初见，何事秋风悲画扇");
        ps.close();
        out.close();
    }
}
```

【示例】重定向 `System.err` 输出流

```java
public class SystemErrDemo {

    public static void main(String args[]) throws IOException {
        OutputStream bos = new ByteArrayOutputStream();        // 实例化
        PrintStream ps = new PrintStream(bos);        // 实例化
        System.setErr(ps);    // 输出重定向
        System.err.print("此处有误");
        System.out.println(bos);    // 输出内存中的数据
    }
}
```

【示例】`System.in` 接受控制台输入信息

```java
import java.io.*;
public class SystemInDemo {

    public static void main(String args[]) throws IOException {
        InputStream input = System.in;
        StringBuffer buf = new StringBuffer();
        System.out.print("请输入内容：");
        int temp = 0;
        while ((temp = input.read()) != -1) {
            char c = (char) temp;
            if (c == '\n') {
                break;
            }
            buf.append(c);
        }
        System.out.println("输入的内容为：" + buf);
        input.close();
    }
}
```





## 四、Scanner

**`Scanner` 可以获取用户的输入，并对数据进行校验**。

【示例】校验输入数据是否格式正确

```java
import java.io.*;
public class ScannerDemo {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);    // 从键盘接收数据
        int i = 0;
        float f = 0.0f;
        System.out.print("输入整数：");
        if (scan.hasNextInt()) {    // 判断输入的是否是整数
            i = scan.nextInt();    // 接收整数
            System.out.println("整数数据：" + i);
        } else {
            System.out.println("输入的不是整数！");
        }

        System.out.print("输入小数：");
        if (scan.hasNextFloat()) {    // 判断输入的是否是小数
            f = scan.nextFloat();    // 接收小数
            System.out.println("小数数据：" + f);
        } else {
            System.out.println("输入的不是小数！");
        }

        Date date = null;
        String str = null;
        System.out.print("输入日期（yyyy-MM-dd）：");
        if (scan.hasNext("^\\d{4}-\\d{2}-\\d{2}$")) {    // 判断
            str = scan.next("^\\d{4}-\\d{2}-\\d{2}$");    // 接收
            try {
                date = new SimpleDateFormat("yyyy-MM-dd").parse(str);
            } catch (Exception e) {}
        } else {
            System.out.println("输入的日期格式错误！");
        }
        System.out.println(date);
    }
}
```

输出：

```text
输入整数：20
整数数据：20
输入小数：3.2
小数数据：3.2
输入日期（yyyy-MM-dd）：1988-13-1
输入的日期格式错误！
null
```





## 五、字节流

**`InputStream` ：字节输入流的父类，数据单位为字节。**

**常用方法：**

* `int read()`
* `void close()`

**`OutputStream`： 字节输出流的父类，数据单位为字节。**

**常用方法：**

* `void write(String)`
* `void flush()`
* `void close()`

字节流主要操作字节数据或二进制对象。

字节流有两个核心抽象类：`InputStream` 和 `OutputStream`。所有的字节流类都继承自这两个抽象类。

![字节流](https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/06/02/ac82236876db4.png)

### 5.1 文件字节流

`FileOutputStream` 和 `FileInputStream` 提供了读写字节到文件的能力。

文件流操作一般步骤：

1. 使用 `File` 类绑定一个文件。
2. 把 `File` 对象绑定到流对象上。
3. 进行读或写操作。
4. 关闭流

`FileOutputStream` 和 `FileInputStream` 示例：

```java
package com.singerw.filestream;

import java.io.*;

/**
 * @ClassName: FileStreamDemo
 * @Description: //TODO FileOutputStream 和 FileInputStream 文件读写示例
 * 1. 使用 File 类绑定一个文件。
 * 2. 把 File 对象绑定到流对象上。
 * 3. 进行读或写操作。
 * 4. 关闭流
 * @Author: CodeSleep
 * @Date: 2021-06-03 15:37
 * @Version: 1.0
 */
public class FileStreamDemo02 {
    public static void main(String[] args) throws Exception {
        FileStreamDemo02 streamDemo = new FileStreamDemo02();
        streamDemo.write("G:\\IOtest\\temp\\test.zip");
        streamDemo.read("G:\\IOtest\\IOtest.zip");
    }


    /**
     * @Author: CodeSleep
     * @Date: 2021-06-03 15:38
     * @Description: //TODO 文件写入操作
     * @param filepath
     * @throws IOException
     */
    public void write(String filepath) throws IOException {
        // 第1步、使用File类找到一个文件
        File files = new File(filepath);

        // 第2步、通过子类实例化父类FileOutputStream对象
        OutputStream out = null;
        out = new FileOutputStream(files);
        // 实例化时，默认为覆盖原文件内容方式；如果添加true参数，则变为对原文件追加内容的方式。
        // OutputStream out = new FileOutputStream(f, true);

        // 第3步、进行写操作
        String str = "Hello World\n";
        byte[] b = str.getBytes();
        out.write(b);

        // 第4步、关闭输出流
        out.close();
    }

    /**
     * @Author: CodeSleep
     * @Date: 2021-06-03 15:38
     * @Description: //TODO 文件读取操作
     * @param filepath
     * @throws IOException
     */
    public void read(String filepath) throws IOException {
        // 第1步、使用File类找到一个文件
        File files = new File(filepath);

        // 第2步、通过子类实例化父类FileInputStream对象
        InputStream input = null;
        input = new FileInputStream(files);

        // 第3步、进行读操作
        byte[] b = new byte[(int) files.length()];
        // 读取内容
        int len = input.read(b);
        System.out.println("读入数据的长度：" + len);

        // 第4步、关闭输入流
        input.close();
    }
}
```

### 5.2 内存字节流

`ByteArrayInputStream` 和 `ByteArrayOutputStream` 是用来完成内存的输入和输出功能。

内存操作流一般在生成一些临时信息时才使用。 如果临时信息保存在文件中，还需要在有效期过后删除文件，这样比较麻烦。

`ByteArrayInputStream` 和 `ByteArrayOutputStream` 示例：

```java
public class ByteArrayStreamDemo {

    public static void main(String[] args) {
        String str = "HELLOWORLD"; // 定义一个字符串，全部由大写字母组成
        ByteArrayInputStream bis = new ByteArrayInputStream(str.getBytes());
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        // 准备从内存ByteArrayInputStream中读取内容
        int temp = 0;
        while ((temp = bis.read()) != -1) {
            char c = (char) temp; // 读取的数字变为字符
            bos.write(Character.toLowerCase(c)); // 将字符变为小写
        }
        // 所有的数据就全部都在ByteArrayOutputStream中
        String newStr = bos.toString(); // 取出内容
        try {
            bis.close();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(newStr);
    }

}
```

### 5.3 管道流

管道流的主要作用是可以进行两个线程间的通信。

如果要进行管道通信，则必须把 `PipedOutputStream` 连接在 `PipedInputStream` 上。为此，`PipedOutputStream` 中提供了 `connect()` 方法。

```java
public class PipedStreamDemo {

    public static void main(String[] args) {
        Send s = new Send();
        Receive r = new Receive();
        try {
            s.getPos().connect(r.getPis()); // 连接管道
        } catch (IOException e) {
            e.printStackTrace();
        }
        new Thread(s).start(); // 启动线程
        new Thread(r).start(); // 启动线程
    }

    static class Send implements Runnable {

        private PipedOutputStream pos = null;

        Send() {
            pos = new PipedOutputStream(); // 实例化输出流
        }

        @Override
        public void run() {
            String str = "Hello World!!!";
            try {
                pos.write(str.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                pos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /**
         * 得到此线程的管道输出流
         */
        PipedOutputStream getPos() {
            return pos;
        }

    }

    static class Receive implements Runnable {

        private PipedInputStream pis = null;

        Receive() {
            pis = new PipedInputStream();
        }

        @Override
        public void run() {
            byte[] b = new byte[1024];
            int len = 0;
            try {
                len = pis.read(b);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                pis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("接收的内容为：" + new String(b, 0, len));
        }

        /**
         * 得到此线程的管道输入流
         */
        PipedInputStream getPis() {
            return pis;
        }

    }

}
```

### 5.4 对象字节流

**ObjectInputStream 和 ObjectOutputStream 是对象输入输出流，一般用于对象序列化。**

这里不展开叙述，想了解详细内容和示例可以参考：[Java 序列化](https://dunwu.github.io/javacore/io/java-serialization.html)

### 5.5 数据操作流

数据操作流提供了格式化读入和输出数据的方法，分别为 `DataInputStream` 和 `DataOutputStream`。

`DataInputStream` 和 `DataOutputStream` 格式化读写数据示例：

```java
public class DataStreamDemo {

    public static final String FILEPATH = "temp.log";

    public static void main(String[] args) throws IOException {
        write(FILEPATH);
        read(FILEPATH);
    }

    private static void write(String filepath) throws IOException {
        // 1.使用 File 类绑定一个文件
        File f = new File(filepath);

        // 2.把 File 对象绑定到流对象上
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f));

        // 3.进行读或写操作
        String[] names = { "衬衣", "手套", "围巾" };
        float[] prices = { 98.3f, 30.3f, 50.5f };
        int[] nums = { 3, 2, 1 };
        for (int i = 0; i < names.length; i++) {
            dos.writeChars(names[i]);
            dos.writeChar('\t');
            dos.writeFloat(prices[i]);
            dos.writeChar('\t');
            dos.writeInt(nums[i]);
            dos.writeChar('\n');
        }

        // 4.关闭流
        dos.close();
    }

    private static void read(String filepath) throws IOException {
        // 1.使用 File 类绑定一个文件
        File f = new File(filepath);

        // 2.把 File 对象绑定到流对象上
        DataInputStream dis = new DataInputStream(new FileInputStream(f));

        // 3.进行读或写操作
        String name = null; // 接收名称
        float price = 0.0f; // 接收价格
        int num = 0; // 接收数量
        char[] temp = null; // 接收商品名称
        int len = 0; // 保存读取数据的个数
        char c = 0; // '\u0000'
        try {
            while (true) {
                temp = new char[200]; // 开辟空间
                len = 0;
                while ((c = dis.readChar()) != '\t') { // 接收内容
                    temp[len] = c;
                    len++; // 读取长度加1
                }
                name = new String(temp, 0, len); // 将字符数组变为String
                price = dis.readFloat(); // 读取价格
                dis.readChar(); // 读取\t
                num = dis.readInt(); // 读取int
                dis.readChar(); // 读取\n
                System.out.printf("名称：%s；价格：%5.2f；数量：%d\n", name, price, num);
            }
        } catch (EOFException e) {
            System.out.println("结束");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 4.关闭流
        dis.close();
    }

}
```

### 5.6 合并流

合并流的主要功能是将多个 `InputStream` 合并为一个 `InputStream` 流。合并流的功能由 `SequenceInputStream` 完成。

```java
public class SequenceInputStreamDemo {

    public static void main(String[] args) throws Exception {

        InputStream is1 = new FileInputStream("temp1.log");
        InputStream is2 = new FileInputStream("temp2.log");
        SequenceInputStream sis = new SequenceInputStream(is1, is2);

        int temp = 0; // 接收内容
        OutputStream os = new FileOutputStream("temp3.logt");
        while ((temp = sis.read()) != -1) { // 循环输出
            os.write(temp); // 保存内容
        }

        sis.close(); // 关闭合并流
        is1.close(); // 关闭输入流1
        is2.close(); // 关闭输入流2
        os.close(); // 关闭输出流
    }

}
```





## 六、字符流 

**`Reader` :  字符输入流的父类，数据单位为字符。**

**常用方法：**

* `int read()`
* `void close()`

**`Writer `:  字符输出流的父类，数据单位为字符。**

**常用方法：**

* `void write(String)`
* `void flush()`
* `void close()`

字符流主要操作字符，一个字符等于两个字节。非常适合处理字符串和文本。

字符流有两个核心类：`Reader` 类和 `Writer` 。所有的字符流类都继承自这两个抽象类。

![字符流](https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/06/02/47a674e87e96d.png)

### 6.1 文件字符流

文件字符流 `FileReader` 和 `FileWriter` 可以向文件读写文本数据。

`FileReader` 和 `FileWriter` 读写文件示例：

```java
public class FileReadWriteDemo {

    private static final String FILEPATH = "temp.log";

    public static void main(String[] args) throws IOException {
        write(FILEPATH);
        System.out.println("内容为：" + new String(read(FILEPATH)));
    }

    public static void write(String filepath) throws IOException {
        // 1.使用 File 类绑定一个文件
        File f = new File(filepath);

        // 2.把 File 对象绑定到流对象上
        Writer out = new FileWriter(f);
        // Writer out = new FileWriter(f, true); // 追加内容方式

        // 3.进行读或写操作
        String str = "Hello World!!!\r\n";
        out.write(str);

        // 4.关闭流
        // 字符流操作时使用了缓冲区，并在关闭字符流时会强制将缓冲区内容输出
        // 如果不关闭流，则缓冲区的内容是无法输出的
        // 如果想在不关闭流时，将缓冲区内容输出，可以使用 flush 强制清空缓冲区
        out.flush();
        out.close();
    }

    public static char[] read(String filepath) throws IOException {
        // 1.使用 File 类绑定一个文件
        File f = new File(filepath);

        // 2.把 File 对象绑定到流对象上
        Reader input = new FileReader(f);

        // 3.进行读或写操作
        int temp = 0; // 接收每一个内容
        int len = 0; // 读取内容
        char[] c = new char[1024];
        while ((temp = input.read()) != -1) {
            // 如果不是-1就表示还有内容，可以继续读取
            c[len] = (char) temp;
            len++;
        }
        System.out.println("文件字符数为：" + len);

        // 4.关闭流
        input.close();

        return c;
    }

}
```



`BufferedReader`

【示例】：

```java
public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("I:\\IDEA2019_Project\\JavaSE基础\\Java IO流\\src\\resources\\docs\\singer.txt");
        BufferedReader br = new BufferedReader(reader);

        // 一次读取一行
        String str = null;
        // str = br.readLine 读取一行并赋值给str对象
        // str!=null 判断是否为null;
        while ((str = br.readLine()) !=null){
            System.out.println(str);
        }
        // 关闭流
        br.close();
        reader.close();
    }
}
```



### 6.2 字节流转换字符流

我们可以在程序中通过 `InputStream` 和 `Reader` 从数据源中读取数据，然后也可以在程序中将数据通过 `OutputStream` 和 `Writer` 输出到目标媒介中

使用 `InputStreamReader` 可以将输入字节流转化为输入字符流；使用`OutputStreamWriter`可以将输出字节流转化为输出字符流。

`OutputStreamWriter` 示例：

```java
public class DataInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("I:\\IDEA2019_Project\\JavaSE基础\\Java IO流\\src\\resources\\docs\\singer.txt");
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readUTF());
        System.out.println(dis.readInt());
        System.out.println(dis.readLong());
        System.out.println(dis.readChar());

        // 关闭
        dis.close();
        fis.close();
    }
}
```

`InputStreamReader` 示例：

```java
public class DataOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("I:\\IDEA2019_Project\\JavaSE基础\\Java IO流\\src\\resources\\docs\\singer.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        // 使用dos方法
        dos.writeUTF("张小娴");
        dos.writeInt(23);
        dos.writeLong(123232);
        dos.writeChars("zhang");
        System.out.println("写入成功");

        // 关闭
        dos.close();
        fos.close();
    }
}
```





## 七、字节流 VS 字符流

相同点：

字节流和字符流都有 `read()`、`write()`、`flush()`、`close()` 这样的方法，这决定了它们的操作方式近似。

不同点：

- 数据类型
  - 字节流的数据是字节（二进制对象）。主要核心类是 `InputStream` 类和 `OutputStream` 类。
  - 字符流的数据是字符，一个字符等于两个字节。主要核心类是 `Reader` 类和 `Writer` 类。
- 缓冲区
  - 字节流在操作时本身不会用到缓冲区（内存），是文件直接操作的。
  - 字符流在操作时是使用了缓冲区，通过缓冲区再操作文件。

选择：

所有的文件在硬盘或传输时都是以字节方式保存的，例如图片，影音文件等都是按字节方式存储的。字符流无法读写这些文件。

所以，除了纯文本数据文件使用字符流以外，其他文件类型都应该使用字节流方式。





## 八、IO流小结

![IO流思知识点总结](https://singerwimg-1300001977.cos.ap-beijing.myqcloud.com/2021/06/03/5095af52900e8.png)

