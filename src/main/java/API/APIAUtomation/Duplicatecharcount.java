package API.APIAUtomation;

public class Duplicatecharcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wrc=1;
		String s="tom will come to the tom office the to will will";
		//int len=s.length();
		//System.out.println(len);
		//char[]ch=s.toCharArray();
		String str[]=s.split(" ");
		
		
		for(int i=0;i<str.length;i++)
		{
			//System.out.println("i am here");
			for(int j=i+1;j<str.length;j++){
			if(str[i].equals(str[j]))
			{
				str[j]="0";
				wrc++;	
				//System.out.println("i am in second for loop");
			}
			}
			if(str[i]!="0")
			System.out.println(str[i] +" count is "+wrc);
			wrc=1;
			
		}
		

	}

}
