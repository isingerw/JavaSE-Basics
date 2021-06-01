package com.singerw.day13;
/**
* @ClassName: MethodTnvoke
* @Description: 1*2*3*4*5*6*...nµÝ¹éµ÷ÓÃ
* @Author ÕÅÐÀ
* @Date 2021-05-21 11:27
*/
public class MethodTnvoke {
    public static void main(String[] args) {
        MethodTnvoke methodTnvoke = new MethodTnvoke();
        long result =  methodTnvoke.fun(3);
        System.out.println(result);
    }
    public long fun(int n ){
        if (n == 1){
            return 1;
        }
        return fun(n-1)*n;
    }
}



