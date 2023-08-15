
public class ReverseInteger {

	public static void main(String[] args) {
		reverse(121);
	}
	
	 public static int reverse(int x) {
	        boolean flag=false;
	        if(x<0){
	            x=x*-1;
	            flag= true;
	        }
	        long output=0;
	        while(x>0){
	            int k = x%10;
	            x =  x/10;
	             
	            output=output*10+k;
	        }

	        
	        if(output<Math.pow(-2,31) || output>Math.pow(2,31) )
	            return 0;
	        if(flag) {
	            return (int)output *-1;
	            }
	        return (int)output;
	    }
}
