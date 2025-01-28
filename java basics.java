public class Main
{
    public static void main(String[] args) {
        double bill=6000;
        if (bill>5000)
        {
            double discount=bill*20/100;
            bill =bill-discount;
            System.out.println("toal amount:\t"+bill);
        }
        else
        System.out.println("total bill:\t"+bill);
        
        
        
        
        
        //if-else-if
        // int sides=6;
        // if (sides==3)
        // System.out.println("triangle");
        // else if(sides==4)
        // System.out.println("rectangle/square");
        // else if(sides==5)
        // System.out.println("pentegon");
        // else
        // System.out.println("other side");
        
        
        //nested if 
        // int num=25;
        // if (num>0){
        //     if (num%2==0)
        //     System.out.println("num is even");
        //     else
        //     System.out.println("num is not even");
        // }
        // else
        // System.out.println("num is not a positive");
        
//calculate the average ,total,discount of different products       
// 	    String proId1="sp250",proId2="sp252",proId3="sp253";
// 		String proName1="bag",proName2="biscuit",proName3="dark fantacy";
// 		int proCost1=500,proCost2=75,proCost3=450;
// 		System.out.println("product Ids:"+proId1+","+proId2+","+proId3);
// 		System.out.println("product Names:"+proName1+","+proName2+","+proName3);
// 		System.out.println("product costs:"+proCost1+","+proCost2+","+proCost3);
// 		int total=proCost1+proCost2+proCost3;
// 		double average=total/3;
// 		double discount=total*15/100;
// 		double price=total-discount;
// 		System.out.println("total of three products:"+total+","+"average of three products:"+average);
// 		System.out.println("discount:"+discount);
// 		System.out.println("price to pay for the products:"+price);
	    
	    
	    
// 		String proId1="sp250",proId2="sp252",proId3="sp253";
// 		String proName1="bag",proName2="biscuit",proName3="dark fantacy";
// 		int proCost1=300,proCost2=30,proCost3=55;
// 		System.out.println("product -1 id:"+proId1+","+"product -1 Name:"+proName1+","+"product -1 cost:"+proCost1);
// 		System.out.println("product -2 id:"+proId2+","+"product -2 Name:"+proName2+","+"product -2 cost:"+proCost2);
// 		System.out.println("product -3 id:"+proId3+","+"product -3 Name:"+proName3+","+"product -3 cost:"+proCost3);
// 		int total=proCost1+proCost2+proCost3;
// 		double average=total/3;
// 		double discount=total*15/100;
// 		System.out.println("total of three products:"+total+","+"average of three products:"+average);
// 		System.out.println("discount:"+discount);
		
		
		// float r=2.14;
		// float pi=3.14;
		// System.out.println("area of circle:"+(pi*r*r));

		// double numofApples=55,costperDozen=243.45;
		// double totalprice=(numofApples/12)*costperDozen;
		// System.out.println("Amount to pay:"+totalprice);

		//without using third variable
		// int a=10,b=20;
		// System.out.println("Before swap:"+a+","+b);
		// a=a+b;
		// b=a-b;
		// a=a-b;
		//System.out.println("After swap:"+a+","+b);

		//with using third variable
		// System.out.println("Before swap:"+a+","+b);
		// int c=a;
		// a=b;
		// b=c;
		// System.out.println("After swap:"+a+","+b);



		//to find total and average
		// double a=2.3,b=3.4,c=4.5,d=5.6;
		// double tot=a+b+c+d;
		// double avg=tot/4;
		// System.out.println("total :"+(tot));
		// System.out.println("average:"+(avg));

		//to print the last digit
		// int n=365;
		// System.out.println("last Digit is :"+(n%10));

		// String name="Ram";
		// System.out.println("\'"+name+"\'");
		// System.out.println("\""+name+"\"");

		//System.out.println("it is 'Java' classes");
		//System.out.println("it is \"Java\" classes");
		//System.out.println("it is \'Java\' classes");

		// int a=10,b=20;
		// System.out.println(a+"+"+b+"="+(a+b));
		// System.out.println(a+"-"+b+"="+(a-b));
		// System.out.println(a+"*"+b+"="+(a*b));
		// System.out.println(a+"/"+b+"="+(a/b));
		// System.out.println(a+"%"+b+"="+(a%b));


		// int a=10,b=20;
		// int c=a+b;
		// System.out.println(c);
		// System.out.println("sum of "+a+" & "+b+" is "+c);
		// System.out.println(a+"+"+b+"="+c);

		// String name="Ram";
		// int age=22;
		// double height=5.7;
		// char gender ='M';
		// System.out.println("details:"+name+","+age+","+height+","+gender);

// 		int age=23,a=22,b=20,c=25;
// // 		System.out.println(age);
// // 		System.out.println("age");
// // 		System.out.println(a);
// // 		System.out.println(a+","+b);
// // 		System.out.println(a+"\t"+b+"\t"+c);
// // 		System.out.println(a+"\n"+b+"\n"+c);


	}
}