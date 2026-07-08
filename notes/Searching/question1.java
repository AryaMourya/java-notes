public class question1 {
    public static void main(String[] args){
        String name = "kunal";
        char target = 'a';
        System.out.println(search(name, target));
    }
    static boolean search(String str,char target){
        for(int i = 0; i < str.length(); i++){ // here str.length() have () because it is a method of the string class and not a property of the string//
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
