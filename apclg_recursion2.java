public class apclg_recursion2 {
    // public static  void towerof(int n,String src,String helper,String dest){
    //     if( n==1 ){
    //         System.out.println("transfer disk "+n+" from "+src+" to "+dest);
    //         return;
    //     }
    //     towerof(n-1, src, dest, helper);
    //     System.out.println("transfer disk "+n+" from "+src+" to "+dest);
    //     towerof(n-1, helper, src, dest);
    // }
    // public static void main(String args[]) {
    //     int n=3;
    //     towerof(n,"S","H","D");

    // }

    //2nd 

    // public static void revstring(String str,int idx){
    //     if(idx==0){
    //         System.out.println(str.charAt(idx));
    //         return;
    //     }
    //     System.out.print(str.charAt(idx)+" ");
    //     revstring(str, idx-1);
    // }

    // public static void main(String[] args) {
    //     String str="abcd";
    //     revstring(str, str.length()-1);
    // }

    //3rd

    // public static boolean sorted(int arr[],int idx){
    //     if(idx==arr.length-1){
    //         return true;
    //     }
    //     if(arr[idx]<=arr[idx+1]){
    //         //array is sorted till now'
    //         return sorted(arr,idx+1);
    //     }
    //     else{
    //         return false;
    //     }

    // }
    // public static void main(String[] args) {
    //     int arr[]={1,3,5,9};
    //     System.out.println(sorted(arr, 0));
    // }

    // 3rd 

    public static void moveallx(String str,int idx,int count,String newstring){
        if(idx==str.length()){
            for(int i=0; i<count; i++){
                newstring +='x';
            }
            System.out.println(newstring);
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar=='x'){
            count++;
            moveallx(str, idx+1, count, newstring);
        }
        else{
            newstring +=currChar;
            moveallx(str, idx+1, count, newstring);
        }
    }
    public static void main(String[] args) {
        String str="axbcxxd";
        moveallx(str, 0, 0, "");
    }
}
