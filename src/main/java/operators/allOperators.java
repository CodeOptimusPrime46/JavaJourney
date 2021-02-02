package operators;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;

public class allOperators {

    public static void main(String args[]){

        int a = 30;
        int b = 50;
        int c= a+b ;
        int d = a & b ;

        System.out.println("sum is " + c );
        System.out.println("bitand  is " + d );

    }
}
