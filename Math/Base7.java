public class Base7 {
     // simple math + recursion problem, get vase 7 of a number , same technique can also answer base 2 base 3.....
    public String convertToBase7(int num) {
        if(num<0){
            return "-"+convertToBase7(-num);
        }
        if (num < 7)return num + "";
        
        return convertToBase7(num / 7) + num % 7;
    }
}
