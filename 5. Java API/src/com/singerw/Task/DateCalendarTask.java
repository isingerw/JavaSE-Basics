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
