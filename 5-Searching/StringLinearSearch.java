public class StringLinearSearch {
    public static void main(String[] args) {
        String name = "Anirudh";
        char key = 'u';
        System.out.println(linearSearch(name,key));
    }
    static boolean linearSearch(String name, char key)
    {
        if(name.isEmpty())
            return false;
        for(int i=0;i<name.length();i++)
            if(key == name.charAt(i))
                return true;
        return false;
    }
}
