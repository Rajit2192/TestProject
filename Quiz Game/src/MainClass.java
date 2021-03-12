import java.util.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class MainClass 
{
	public static  void Easy()
	{
		Scanner sc = new Scanner(System.in);
		try {
			
			String query = "insert into easymode (id ,ques1,ques2,ques3,ques4,ques5)values(?,?,?,?,?,?)";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizgame","root","root");
			PreparedStatement stm = con.prepareStatement(query);
			stm.setInt(1, 0);
			
			FileReader fis = new FileReader("F:\\Program\\Quiz Game\\src/easyQues.txt");
			BufferedReader br = new BufferedReader(fis);
			String ques = br.readLine();
			int j=1;
			int c=2;
			int result = 0;
			while(ques !=null )
			{
				for(int i=1;i<=5;i++)
				{
				System.out.println(ques);
				ques = br.readLine();
				}
				System.out.print("Enter yours answer option number--");
				Thread.sleep(30000);

				int a = sc.nextInt();
				
				if(a<0||a>4)
				{
				System.out.println("Wrong Input");
				stm.setInt(c, 0);
				}
				
				else {
				stm.setInt(c, a);
				}
				
				if(a==j)
				{
					result = result +1;
				}
				j++;
				c++;
				if(j==5)
				{
					j=1;
				}
				}
			fis.close();
			stm.executeUpdate();
				if(result==1)
					System.out.println("Participant your Grade is ---Poor");
					if(result==2)
						System.out.println("Participant your Grade is ---Bad");
						if(result==3)
							System.out.println("Participant your Grade is ---Good");
							if(result==4)
								System.out.println("Participant your Grade is ---Strong");
								if(result==5)
									System.out.println("Participant your Grade is --- Very Strong");
								System.out.print("Correct Answer are" +"\n"+ "Q1--option(1)"+"\n"+"Q2--option(2)"+"\n"+"Q3--option(3)"+"\n"+"Q4--option(4)"+"\n"+"Q5--option(1)"+"\n");
			
			
		}
			catch (Exception e) {
	System.out.println(e);
		}
	}
	public static void Medium()
	{
		Scanner sc = new Scanner(System.in);
		try {
			String query = "insert into mediummode (id ,ques1,ques2,ques3,ques4,ques5)values(?,?,?,?,?,?)";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizgame","root","root");
			PreparedStatement stm = con.prepareStatement(query);
			stm.setInt(1, 0);
			
			
			FileReader fis = new FileReader("F:\\Program\\Quiz Game\\src/mediumQues.txt");
			BufferedReader br = new BufferedReader(fis);
			String ques = br.readLine();
			int j=1;
			int c = 2;
			int result = 0;
			while(ques !=null )
			{
				for(int i=1;i<=5;i++)
				{
					System.out.println(ques);
					ques = br.readLine();
				}
				System.out.print("Enter yours answer option number--");
				Thread.sleep(30000);
					int a = sc.nextInt();
					
					
					if(a<0||a>4)
					{
					System.out.println("Wrong Input");
					stm.setInt(c, 0);
					}	
						
						else {
						stm.setInt(c, a);
						}	
					
					
					if(a==j)
					result = result +1;
						
						
					j++;
					c++;
				if(j==5)
				{
					j=1;
				}
			}
			fis.close();
			stm.executeUpdate();
			if(result==1)
				System.out.println("Participant your Grade is ---Poor");
				if(result==2)
					System.out.println("Participant your Grade is ---Bad");
					if(result==3)
						System.out.println("Participant your Grade is ---Good");
						if(result==4)
							System.out.println("Participant your Grade is ---Strong");
							if(result==5)
								System.out.println("Participant your Grade is ---Very Strong");
							System.out.print("Correct Answer are" +"\n"+ "Q1--option(1)"+"\n"+"Q2--option(2)"+"\n"+"Q3--option(3)"+"\n"+"Q4--option(4)"+"\n"+"Q5--option(1)"+"\n");
							
		}
			catch (Exception e) {
	System.out.println(e);
		}
		
	}
	public static void Hard()
	{
		Scanner sc = new Scanner(System.in);
		try {
			
			String query = "insert into hardmode (id ,ques1,ques2,ques3,ques4,ques5)values(?,?,?,?,?,?)";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizgame","root","root");
			PreparedStatement stm = con.prepareStatement(query);
			stm.setInt(1, 0);
			
			
			FileReader fis = new FileReader("F:\\Program\\Quiz Game\\src/hardQues.txt");
			BufferedReader br = new BufferedReader(fis);
			String ques = br.readLine();
			int j=1;
			int c=2;
			int result = 0;
			while(ques !=null )
			{
				for(int i=1;i<=5;i++)
				{
				System.out.println(ques);
				ques = br.readLine();
				}
				System.out.print("Enter yours answer option number--");
				Thread.sleep(30000);
				int a = sc.nextInt();
				
				
				if(a<0||a>4)
				{
					System.out.println("Wrong Input");
					stm.setInt(c, 0);
				}	
					
					else {
					stm.setInt(c, a);
					}	
				
				
				if(a==j)
					result = result +1;
			
				j++;
				c++;
				if(j==5)
				{
					j=1;
				}
				}
			fis.close();
			stm.executeUpdate();
			if(result==1)
				System.out.println("Participant your Grade is ---Poor");
				if(result==2)
					System.out.println("Participant your Grade is ---Bad");
					if(result==3)
						System.out.println("Participant your Grade is ---Good");
						if(result==4)
							System.out.println("Participant your Grade is ---Strong");
							if(result==5)
								System.out.println("Participant your Grade is ---Very Strong");
							System.out.print("Correct Answer are" +"\n"+ "Q1--option(1)"+"\n"+"Q2--option(2)"+"\n"+"Q3--option(3)"+"\n"+"Q4--option(4)"+"\n"+"Q5--option(1)"+"\n");
							
		}
			catch (Exception e) {
	System.out.println(e);
		}
	}
		public static void main(String args[])
		{
			System.out.println("Press 1 for Easy Mode");
			System.out.println("Press 2 for Medium Mode");
			System.out.println("Press 3 for Hard Mode");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			if(a==1)
				Easy();

			else if(a==2)
			{
				Medium();
			}
			else if(a==3)
			{
				Hard();
			}
			else 
			{
				System.out.println("Wrong Input");
			}
			System.out.println("Want Another Quiz press--0 to YES and press--1 to NO");
			int b = sc.nextInt();
			while(b==0)
			{
				System.out.println("Press 1 for Easy Mode");
				System.out.println("Press 2 for Medium Mode");
				System.out.println("Press 3 for Hard Mode");
				
				a = sc.nextInt();
				if(a==1)
					Easy();

				else if(a==2)
				{
					Medium();
				}
				else if(a==3)
				{
					Hard();
				}
				else 
				{
					System.out.println("Wrong Input");
				System.exit(0);
				}
				
				System.out.print("Want Another Quiz press--0 to YES and press--1 to NO");
				b = sc.nextInt();
			}
			if(b==1)
			{
				System.out.println("Byeee");
			}
		}
}
