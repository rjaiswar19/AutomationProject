package API.APIAUtomation;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n=11;
	    if(n==1)
	    {
	    	System.out.println("Smallest prime number is 2");
	    }
	    for(i=2;i<n;i++)
	    {
	    	if(n%(i)==0)
	    	{
	    		System.out.println("it is not a prime number");
	    		break;
	    	}
	    }
	    if(n==i)
	    {
	    	System.out.println(n+" is a prime number");
	    }
	}

}
