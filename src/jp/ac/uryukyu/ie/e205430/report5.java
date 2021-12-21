package jp.ac.uryukyu.ie.e205430;

public class report5 {
    public static void main(String[] args){
        try {
            //処理したいコード
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            //Exceptionが起きたときの処理
            System.out.println("NullPointerExceptionが発生");
            System.out.println(e.getMessage());
        } 
    }
}
