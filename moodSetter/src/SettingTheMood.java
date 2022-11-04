	import java.util.Scanner;

	
	public class SettingTheMood {



		public static void main(String[] args) {

			Scanner in= new Scanner(System.in);

			int input;

			HappyOrNot customer =new HappyOrNot();

		do {

			

		   System.out.println("1 :D  2 :)  3 :|  4 :(  0 exit");

	       input = in.nextInt();

		   customer.click(input);

		

		    }while(input>0  &&  input<=4);

		

		

		customer.chutdown();

		  System.out.println(customer.getIsOn());

		}



	}//end of main 

	class Device

	{

		protected boolean isOn;

		public void start()

		{

			isOn = true;

		}

		public void chutdown()

		{

			isOn = false;

		}

		public boolean getIsOn() {

			return isOn;

		}



	}//end of super class

	class HappyOrNot extends Device

	{

	private int button1;

	private int button2;	

	private int button3;	

	private int button4;	



	public HappyOrNot()

	{

		button1=0;

		button2=0;

		button3=0;

		button4=0;

	}

	          public void click(int button)

	{

	  if(button==1)

	  {

		  button1++;

	  }

	  else if(button==2)

	  {

		  button2++;

	  }

	  else if(button==3)

	  {

		  button3++;

	  }

	  else if(button==4)

	  {

		  button4++;

	  }

	}

	     private void printFeedback()

	     {

	    	 System.out.println(":D "+button1+"\r\nsmile "+button2+"\r\n:| "+button3+"\r\nsad "+button4);

	    	 

	     }

	     @Override

	           public void chutdown()

	     {

	    	 isOn = false;

	    	 printFeedback();

	     }



	}



