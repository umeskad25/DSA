
public class palindromeNumber {

	public static void main(String[] args) {
		
		isPalindrome(121);
	}
	
	
	 public static boolean isPalindrome(int x) {
	        
	        String a = String.valueOf(x);
	        int n = a.length();
	        for(int i=0;i<n;i++){
	            if(a.charAt(i)!= a.charAt(n-1-i)) {
	                return false;
	            }
	        }
	        return true;

	    }
}
