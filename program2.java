import java.util.Scanner;
class student 
{
	String usn,name;
	int cred[]=new int [5];
	int marks[]=new int [5];

	Scanner sc=new Scanner(System.in);
	void accept()
	{
		System.out.println("Enter usn of the student:");
		usn=sc.next();
		System.out.println("Enter the name of the student:");
		name=sc.next();
		System.out.println("Enter the credits:");
		for(int i=0;i<5;i++)
		{
			cred[i]=sc.nextInt();
		}
		System.out.println("Enter the marks:");
		for(int i=0;i<5;i++)
		{
			marks[i]=sc.nextInt();
		}
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Usn: "+usn);
		System.out.println("Credits: ");
		for(int i=0;i<5;i++)
		{
			System.out.println(cred[i]);
		}		
		System.out.println("Marks: ");
		for(int i=0;i<5;i++)
		{
			System.out.println(marks[i]);
		}
	}
	float calc_sgpa()
	{
		int sum=0;
		float p=0;
		float gpa;
		int g[]=new int[5];
		for(int i=0;i<5;i++)
		{
			sum=sum+cred[i];
			if(marks[i]>90 && marks[i]<=100)
			{
				p=p+(cred[i]*10);
			}
			else if(marks[i]>80 && marks[i]<=90)
			{
				p=p+(cred[i]*9);
			}
			else if(marks[i]>70 && marks[i]<=80)
			{
				p=p+(cred[i]*8);
			}
			else if(marks[i]>60 && marks[i]<=70)
			{
				p=p+(cred[i]*7);
			}	
			else if(marks[i]>50 && marks[i]<=60)
			{
				p=p+(cred[i]*6);
			}	
			else if(marks[i]>40 && marks[i]<=50)
			{
				p=p+(cred[i]*5);
			}	
			else 
			{
				p=p+(cred[i]*0);
			} 
			
		}
		gpa=p/20;
		return(gpa);
	}
}

class program
{
	public static void main(String args[])
	{
		float sgpa;
		student s1=new student();
		s1.accept();
		s1.display();
		sgpa=s1.calc_sgpa();
		System.out.println("SGPA: "+sgpa);

	}
}
	
	
