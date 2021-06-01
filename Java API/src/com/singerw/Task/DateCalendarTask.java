package com.singerw.Task;

        import java.util.Calendar;
        import java.util.Scanner;

/**
 * @ClassName: DateCalendarTask
 * @Description: �û��ڿ���̨����һ������·ݣ�ʹ��Date/Calendarʵ�ִ�ӡ���������
 * @Author ����
 * @Date 2021-05-24 16:00
 */
public class DateCalendarTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("������Ҫ��ѯ����ݣ�");
        int years = input.nextInt();
        System.out.print("������Ҫ��ѯ���·ݣ�");
        int month = input.nextInt();

        // ��ȡ��������
        Calendar c = Calendar.getInstance();
        c.set(years, month, 1);
        // //����һ��
        c.add(Calendar.DATE, -1);
        //��õ�������
        int dayCount = c.get(Calendar.DAY_OF_MONTH);

        //��ӡ1��ǰ�Ŀո�
        c.set(Calendar.DATE, 1);
        //���1�����ڼ�
        int weekDay = c.get(Calendar.DAY_OF_WEEK);
        String[] weeks = {"��", "һ", "��", "��", "��", "��", "��"};
        for (int i = 0; i < weeks.length; i++) {
            System.out.print(weeks[i] + "\t");
        }
        System.out.println();
        for (int i = 1; i < weekDay; i++) {
            System.out.print("\t");
        }
        for (int i = 1; i <= dayCount; i++) {
            //���һ�����ڣ�����������һ�졣
            c.set(Calendar.DAY_OF_MONTH, i);
            System.out.print(i + "\t");
            //��ӡ����������
            if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
            {
                System.out.println();
            }
        }
    }
}
