import java.util.*;
public class stringsss {
    public static boolean isPallindrome(String str){
        for(int i = 0;i <str.length()/2;i++){
            int n = str.length()/2;
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;


            }


            }
        return true;
        }

        // finding shortest distance between intial and final point
        public static float getshortestpath(String path){
        int x = 0, y = 0;
        for(int i = 0; i<path.length();i++){
            char dir = path.charAt(i);
            if(dir == 'N'){
                y++;
            }
            else if(dir =='s'){
                y--;
            } else if (dir == 'w') {
                x--;

            }
            else{
                x++;
            }
        }
        int X = x*x;
        int Y = y*y;
        return (float) Math.sqrt(X + y);
        }


        public static String sub_string(String path,int si, int ei){
            String substr = "";
        for (int i = 0;i<=ei;i++){

            substr += path.charAt(i);
        }
        return substr;
        }
        public static String firstletteruppercase(String a){
        StringBuilder m = new StringBuilder("");
        m.append(Character.toUpperCase(a.charAt(0)));
        for(int i =1;i<a.length();i++){
            if(a.charAt(i) == ' ' && i<a.length()-1){
                m.append(a.charAt(i));
                i++;
                m.append(Character.toUpperCase(a.charAt(i)));
            }else{
                m.append(a.charAt(i));
            }
        }
        return m.toString();



        }


        public static String compressing_string(String p){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0;i<p.length();i++){
            Integer count = 1;
            while (i<p.length()-1 && p.charAt(i) == p.charAt(i+1)){
                count ++;
                i++;

            }
            sb.append(p.charAt(i));
            if (count >1){
                sb.append(count.toString());
            }

        }
        return sb.toString();


        }




    public static void main(String args[]){
        String s = "ssspppppppmmmrrr";
        String a = "i am mayur";
        String str = "mam";
        int si = 0, ei = 6;
        String path = "WNEENESENNN";
       // System.out.println(isPallindrome(str));
       // System.out.println("shortest distance is " + getshortestpath(path));
        System.out.println(sub_string(path,si,ei));
        //java also supports inbuilt substring function
        System.out.println(path.substring(1,6));
        //printing the first letter of each word in uppercase
        System.out.println(firstletteruppercase(a));
        // string compressing problem
        System.out.println(compressing_string(s));





    }
}
