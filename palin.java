package MVC;

public class palin {
     public  boolean disp(int n) {
         int a=n;
         int n2=0;
         while(a!=0) {
        	 int mod=a%10;
        	 n2=n2*10+mod;
        	 a/=10;
         }
         if(n-n2==0) return true;
         else return false;
}
}
