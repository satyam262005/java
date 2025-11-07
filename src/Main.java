import java.util.Scanner;
class main {
    public static void main(String[] args) {
//       String str="hello java";
//       System.out.println(str.length());
//        System.out.println(str.charAt());
//        System.out.println(str.toUpperCase());
//        System.out.println(str.toLowerCase());
//        System.out.println(str.indexOf());
//        System.out.println(str.substring());
//        System.out.println(str.substring());
//        System.out.println(str.length());
//        System.out.println(str.trim());
        String str="hello";
        int v=0;
        for (char ch :str.toCharArray()){
            if ("aeuio".indexOf(ch)!=-1){
                v++;
            }
        }
        System.out.println(v);
    }
}