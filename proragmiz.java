public class proragmiz {
    public static void main(String[] args) {
       add();
    }
    static void add(){
        int a=5,b=7;
        char ch='k';
        int asciivalue=(int)ch;
        System.out.println(asciivalue);
        float c=2.5f,d=5.5f;
        System.out.println(c*d);
        System.out.println(a+b);
        int x=26,y=5;

        // find quo and reminder;
        int quo=x/y;
        int reminder=x%y;
        System.out.println("quo is: "+quo);
        System.out.println("reminder is: "+reminder);
        
        //swap two num
        int p=5,q=6;
       System.out.println("before swaping value p is: "+p+" and q is: "+q);
        int temp=p;
        p=q;
        q=temp;

        System.out.println("value of p is: "+p);
        System.out.println("value of q is: "+q);

        // cheak even and odd
        x=55;
        if(x%2==0){
            System.out.println("it is even num ");
        }
        else{
            System.out.println("it is odd num ");
        }

        // which is the greatest num in three
        int e=4,f=6,g=9;
        if(a>b && a>c){
            System.out.println("a is greater num ");
        }
        else if(b>a && b>c){
            System.out.println("b is greater num ");
        }
        else{
            System.out.println("c is the greatest num ");
        }
        //leap year

        int year=2050;
        if(year%400==0 && year%100==0){
           System.out.println("it is a leap year");
        }
        else if(year%4==0 && year%100!=0){
            System.out.println("it is leap year");
        }
        else{
            System.out.println("it is not leap year");
        }

        //count words
        String words="akshat keshari";
        int countwords =words.split("").length;
        System.out.println(countwords);
       // System.out.println(words.length());

        //reverse the sentences
        //String original="akshu";
        //String reversed=reverse(original);
        
        
    }
    
}
