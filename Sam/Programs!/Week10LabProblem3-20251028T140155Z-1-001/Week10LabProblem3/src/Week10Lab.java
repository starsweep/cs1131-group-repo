public class Week10Lab{

		public boolean isPalindrome(String s){
			boolean palinbool = false;
			String reverse = "";
			String reverseShow ="";
			String staken = s;
			if(staken.contains(" ")){
				staken = ""+s.replace(" ","");
			}

			for(int i = staken.length()-1; i >=0; i--)
			{		
				reverse += staken.charAt(i);
			}
			for(int i = s.length()-1; i >=0; i--)
			{
				reverseShow += s.charAt(i);
			}

			if (reverse.toLowerCase().equals(staken.toLowerCase()))
			{
				palinbool = true;

			}
		System.out.println("Original = "+s+"\n Reverse"+reverseShow);


	return palinbool;

}

}
