package org.example.udemy.section8;

import java.util.regex.Pattern;

class Lesson_11_4_IP {
    // 0-255.0-255.0-255.0-255 - проверка
    void checkIP (String ip){
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}"+
                "(25[0-5]|[0-4]\\d|[01]?\\d?\\d)";
        // 25[0-5]       |          2[0-4]\d       |          [01]?\d?\d)                                                                         (\.)      {3}
        //250-255     or           200 - 249        or        0 or 1 может быть а может и не(?)\ любая цыфра(может и не быть) \  любая цыфра     точка      повтори 3 раза то что слева


        System.out.println(ip + " is OK? "+ Pattern.matches(regex, ip));
    }

    public static void main(String[] args) {
        String ip1 = "255.38.192.99";
        String ip2 = "182.262.91.05";

        Lesson_11_4_IP lesson114Ip = new Lesson_11_4_IP();
        lesson114Ip.checkIP(ip1);
        lesson114Ip.checkIP(ip2);
    }
}
