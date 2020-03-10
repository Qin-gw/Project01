package com.qin.bean;

import java.util.ArrayList;

/**
 * @author qingw
 * @date 2020/3/10 - 12:58
 */
public class TemplatesTest {
    //prsf
    private static final int a=10;
    //psf
    public static final int b =10;
    //psfs
    public static final String c="qq";
    //pavm
    public static void main(String[] args) {
        //sout/soutm/soutp/soutv
        System.out.println();
        System.out.println("TemplatesTest.main");
        //fori
        String[] arr =new String[]{"aaa","bbb","ccc","ddd"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        //iter
        for (String s : arr) {
            System.out.println(s);

        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }
        //list.for
        ArrayList list =new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Object o : list) {

        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }
        //ifn
        if (list == null) {

        }
        //inn
        if (list != null) {

        }
        //xxx.nn / xxx.null
        if (list != null) {

        }
        if (list == null) {

        }




    }
}
