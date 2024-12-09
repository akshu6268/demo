public class apclg_backtracking {
    public static void printperm(String str,String perm,int index){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currchar=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            printperm(newstr, perm+currchar, index+1);
        }
    }
    public static void main(String[] args) {
        String str="ABC";
        printperm(str,"", 0);
    }
}
