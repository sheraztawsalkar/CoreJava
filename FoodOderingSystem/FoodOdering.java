package FoodOderingSystem;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;


interface Registration
{
	void signup();
	void login();
}

class register implements Registration
{
	private String firstName;
	private String lastName;
	private String email;
	private long contact;
	private String address;
	private String password;
	
//FIRSTNAME
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName() 
	{
		try
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter FristName: " + " ");
		firstName = sc.nextLine();
		boolean valid = true; //assume input is valid
		while(firstName.isBlank()) // for blank/space 
		{
			System.out.println("Please Enter FirstName");
			setFirstName();
		}
		if(firstName.length() >= 3)  //length for name
		{
		for(int i = 0; i < firstName.length();i++) //for loop is used to iterate each character in the String
		{
			char ch = firstName.charAt(i);//get character at index i
			if(!(ch >= 'a' && ch <= 'z' ||ch >= 'A' && ch <= 'Z'))
			{
				valid = false;
				break;
			}
		}
		if(valid)
		{
//			System.out.println(firstName);
		}
		else
		{
			System.out.println("Please Enter Correct Name : ");
			setFirstName();
		}
		}
		else 
		{
			valid = false;
			System.out.println("Please enter correct Name : ");
			setFirstName();
		}
		}
		catch(Exception Registration)
		{
			System.out.println("Please enter correct name");
			setFirstName();
		}
	}
	
//LASTNAME
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName() 
	{
		try
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter LastName: " + " ");
		lastName = sc.nextLine();
		boolean valid = true; //assume input is valid
		while(lastName.isBlank())
		{
			System.out.println("Please Enter LastName : ");
			setLastName();
		}
		if(lastName.length() >= 3)
		{
		for(int i = 0; i < lastName.length();i++) //for loop is used to iterate each character in the String
		{
			char ch = lastName.charAt(i);//get character at index i
			if(!(ch >= 'a' && ch <= 'z' ||ch >= 'A' && ch <= 'Z'))
			{
				valid = false;
				break;
			}
		}
		if(valid)
		{
//			System.out.println(lastName);
		}
		else
		{
			System.out.println("Please Enter Correct Name : ");
			setLastName();
		}
		
		}
		else
		{
			valid = false;
			System.out.println("enter correct name : ");
			setLastName();
		}
		}
		catch(Exception Registration)
		{
			System.out.println("please enter correct Name");
			setLastName();
		}
	}
	
//EMAIL_ID
	public String getEmail()
	{
		return email;
	}
	public void setEmail() 
	{
		try
		{
		System.out.println("Enter your EmailId : ");
		Scanner sc = new Scanner(System.in);
		email = sc.nextLine();
//		boolean valid = true;
		while(email.isBlank())
		{
			System.out.println("enter EmailId : ");
			setEmail();
		}
//		for(int i = 0 ; i < email.length(); i++)
//		{
//		char ch = email.charAt(i);
//		if(!(Character.isLowerCase(ch) && Character.isUpperCase(ch) && Character.isDigit(ch) && "@".indexOf(ch) ))
//		{
//			valid = false;
//			break;
//		}
//		}
//		if(valid)
//		{
//			
//		}
//		else
//		{
//			System.out.println("Please Enter Valid EmailId : ");
//			setEmail();
//		}
	}
	catch(Exception Registration)
	{
		System.out.println("Please Enter valid Email ID");
	}
	}
	
//CONTACT
	public long getContact()
	{
		return contact;
	}
	public void setContact() 
	{
		try
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your Contact Number : ");
		contact = sc.nextLong();
		sc.nextLine();
		if(contact > 999999999L && contact < 10000000000L)
		{
		}
		else 
		{
			System.out.println("Please Enter 10-Digit valid phoneNumber : ");
			setContact();
		}
		
		System.out.println("Please Enter ContactNumber again ");
		long Contact = sc.nextLong();
		if(this.contact == Contact)
		{	
		}
		else
		{
			System.out.println("phone number not match");
			setContact();
		}
		}
		catch(Exception Registration)
		{
			System.out.println("Please Enter Valid PhoneNumber");
			setContact();
		}
	}
	
//ADDRESS
	public String getAddress() 
	{
		return address;
	}
	public void setAddress() 
	{
		try
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Address");
		address = sc.nextLine();
		if(address.length() > 5)
		{
		while(address.isBlank())
		{
			System.out.println("please enter address");
		}
		}
		else
		{
			System.out.println("please enter address");
			setAddress();
		}
		}
		catch(Exception Registration)
		{
			setAddress();
		}
	}
	

//PASSWORD
	public String getPassword() 
	{
		return password;
	}
	public void setPassword() 
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Password");
			password = sc.nextLine();
			if(password.length() >= 8)
			{
			while(password.isBlank())
			{
				System.out.println("please Enter Password");
				setPassword();
			}
			
			System.out.println("Enter confirm password");
			String Password = sc.nextLine();
			while(Password.isBlank())
			{
				System.out.println("please Enter Password");
				setPassword();
			}
			
			if(this.password.equals(Password))
			{
			}
			else 
			{
				System.out.println("Password not match");
				System.out.println("enter again");
				setPassword();
			}
			}
			else
			{
				System.out.println("enter 8 digit password");
				setPassword();
			}
		}
		catch(Exception Registration)
		{
			setPassword();
		}
	}
	
	@Override
	public void signup()
	{
		try
		{
		System.out.println("=*=*=*=*=*=*=*= SignUp Process =*=*=*=*=*=*=*=");
		setFirstName();
		setLastName();
		setEmail();
		setContact();
		setAddress();
		setPassword();
		System.out.println("=*=*=*=*=*=*=*= Account Created Successfully =*=*=*=*=*=*=*=");
		
		login();
		}
		catch(Exception Registration)
		{
			signup();
		}
		
	}
	
	@Override
	public void login()
	{
		try
		{
			System.out.println("=*=*=*=*=*=*=*= Login Procees =*=*=*=*=*=*=*=");
			System.out.println(" ");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Contact Number");
			long contact = sc.nextLong();
			sc.nextLine();
			System.out.println("enter Your Password");
			String password = sc.nextLine();
			
			if(this.contact == contact && this.password.equals(password))
			{
				System.out.println("=*=*=*=*=*=*=*= Login Successfull =*=*=*=*=*=*=*=");
			}
			else
			{
				System.out.println("Invalid Deatils try again..");
				login();
			}
		}
		catch(Exception Registration)
		{
			System.out.println("Invalid Details");
			login();
		}
	}
}



interface Stater
{
	void vegStater();
	void nonVegStater();
}
interface MainCourse
{
	void vegMainCourse();
	void nonVegMainCourse();
}
interface Drink
{
	void drink();
}
interface Dessert
{
	void dessert();
}

class FoodItems implements Stater,MainCourse,Drink,Dessert
{
	private int foodItemNumber;
	private String foodItemName;
	private int foodItemPrice;
	private String foodItemDetails;
	
	FoodItems(int foodItemNumber,String foodItemName,int foodItemPrice,String foodItemDetails)
	{
		this.foodItemNumber=foodItemNumber;
		this.foodItemName=foodItemName;
		this.foodItemPrice=foodItemPrice;
		this.foodItemDetails=foodItemDetails;
	}
	
	public int getFoodIdNumber()
	{
		return foodItemNumber;
	}
	public void setFoodItemNumber(int foodItemNumber)
	{
		this.foodItemNumber=foodItemNumber;
	}
	
	public String getFoodItemName()
	{
		return foodItemName;
	}
	public void setFoodItemName(String foodItemName)
	{
		this.foodItemName=foodItemName;
	}
	
	public int getFoodItemPrice()
	{
		return foodItemPrice;
	}
	public void setFoodItemPrice(int foodItemPrice)
	{
		this.foodItemPrice=foodItemPrice;
	}
	
	public String getFoodItemDetails()
	{
		return foodItemDetails;
	}
	public void setFoodItemDetails(String foodItemDetails)
	{
		this.foodItemDetails=foodItemDetails;
	}
	
	@Override
	public void vegStater()
	{
		System.out.println(foodItemNumber);
		System.out.println("Food Name : " + foodItemName );
		System.out.println("Food Price : " + foodItemPrice );
		System.out.println("Food Details : " + foodItemDetails );
	}
	@Override
	public void nonVegStater()
	{
		System.out.println(foodItemNumber);
		System.out.println("Food Name : " + foodItemName );
		System.out.println("Food Price : " + foodItemPrice );
		System.out.println("Food Details : " + foodItemDetails );
	}
	
	@Override
	public void vegMainCourse()
	{
		System.out.println(foodItemNumber);
		System.out.println("Food Name : " + foodItemName );
		System.out.println("Food Price : " + foodItemPrice );
		System.out.println("Food Details : " + foodItemDetails );
	}
	@Override
	public void nonVegMainCourse()
	{
		System.out.println(foodItemNumber);
		System.out.println("Food Name : " + foodItemName );
		System.out.println("Food Price : " + foodItemPrice );
		System.out.println("Food Details : " + foodItemDetails );
	}
	
	@Override
	public void drink()
	{
		System.out.println(foodItemNumber);
		System.out.println("Food Name : " + foodItemName );
		System.out.println("Food Price : " + foodItemPrice );
		System.out.println("Food Details : " + foodItemDetails );
	}
	
	@Override
	public void dessert()
	{
		System.out.println(foodItemNumber);
		System.out.println("Food Name : " + foodItemName );
		System.out.println("Food Price : " + foodItemPrice );
		System.out.println("Food Details : " + foodItemDetails );
	}
}

class Staters extends FoodItems implements Stater,MainCourse,Drink,Dessert
{
	public Staters(int foodItemNumber,String foodItemName,int foodItemPrice,String foodItemDetails)
	{
		super(foodItemNumber,foodItemName,foodItemPrice,foodItemDetails);
	}
}

class MainCourses extends FoodItems implements Stater,MainCourse,Drink,Dessert
{
	public MainCourses(int foodItemNumber,String foodItemName,int foodItemPrice,String foodItemDetails)
	{
		super(foodItemNumber,foodItemName,foodItemPrice,foodItemDetails);
	}
}

class Drinks extends FoodItems implements Stater,MainCourse,Drink,Dessert
{
	public Drinks(int foodItemNumber,String foodItemName,int foodItemPrice,String foodItemDetails)
	{
		super(foodItemNumber,foodItemName,foodItemPrice,foodItemDetails);
	}
}

class Desserts extends FoodItems implements Stater,MainCourse,Drink,Dessert
{
	public Desserts(int foodItemNumber,String foodItemName,int foodItemPrice,String foodItemDetails)
	{
		super(foodItemNumber,foodItemName,foodItemPrice,foodItemDetails);
	}
}


class Bill
{
	static int bill;
	public void totalBill()
	{
		System.out.println(" Your Total Bill Amount is " + bill);
		int discount = (int) (bill * 0.1);
		int discountedbill = bill - discount;
		System.out.println("After Discount the Total Bill is " + discountedbill);
		Scanner sc = new Scanner(System.in);
		System.out.println(" Press 1 for UPI ");
		System.out.println();
		System.out.println(" Press 2 for Cash ");
		int n = sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Enter the Contact Number ");
			long contact = sc.nextLong();
			payment(contact,discountedbill);
		break;
		case 2:
			payment(discountedbill);
		break;
		default:
			System.out.println("Invalid Option. please try again...");
//			bill = bill + discount;
			totalBill();
			return;
//		break;
		}
		System.exit(0);
	}
		public void payment(long upi,int amount)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println(" Enter the Amount ");
			int enteredAmount = sc.nextInt();
			if(enteredAmount == amount)
			{
			System.out.println(" Thank You for paying " + amount);
			}
			else
			{
				System.out.println("Incorrect amount.");
				totalBill();
			}
		}
		
		public void payment(int cash)
		{
			System.out.println(" Thank You for Paying " + cash);
		}
}

class Resturant extends Bill
{
	Scanner sc = new Scanner(System.in);
	
//Veg-Staters
	public void stater()
	{
//		Scanner sc = new Scanner(System.in);
		LinkedList<FoodItems> vegStater = new LinkedList();
		Staters vegStater1 = new Staters(0,"",000,"");
				vegStater1.setFoodItemNumber(1);
				vegStater1.setFoodItemName("Paneer Tikka");
				vegStater1.setFoodItemPrice(200);
				vegStater1.setFoodItemDetails("Paneer Tikka is a classic veg Indian snaks for party known for its delightfull taste.it consist marinated and grilled paneer cubes,resulting in a perfect blend of smoky and spicy flavours.");
				vegStater1.getFoodIdNumber();
				vegStater1.getFoodItemName();
				vegStater1.getFoodItemPrice();
				vegStater1.getFoodItemDetails();
				vegStater.add(vegStater1);
		
		Staters vegStater2 = new Staters(0,"",000,"");
				vegStater2.setFoodItemNumber(2);
				vegStater2.setFoodItemName("Crispy Potato");
				vegStater2.setFoodItemPrice(150);
				vegStater2.setFoodItemDetails("Crispy Potato is simple yet irresistable, these potato weges are seasoned and baked to perfection,offering a deliciously crunchy experience.");
				vegStater2.getFoodIdNumber();
				vegStater2.getFoodItemName();
				vegStater2.getFoodItemPrice();
				vegStater2.getFoodItemDetails();
				vegStater.add(vegStater2);
		
		Staters vegStater3 = new Staters(0,"",000,"");
				vegStater3.setFoodItemNumber(3);
				vegStater3.setFoodItemName("Gobi Manchurian");
				vegStater3.setFoodItemPrice(200);
				vegStater3.setFoodItemDetails("It is most significant veg stater.this dish features deep-fried cauliflower florets,coated in a spicy corn flour batter,and served in a thick, flavorful gravy.it's mouthwatering fusion of textures and tastes,offering a delightful balance of crispy and saucy.");
				vegStater3.getFoodIdNumber();
				vegStater3.getFoodItemName();
				vegStater3.getFoodItemPrice();
				vegStater3.getFoodItemDetails();
				vegStater.add(vegStater3);
				
		Staters vegStater4 = new Staters(0,"",000,"");
				vegStater4.setFoodItemNumber(4);
				vegStater4.setFoodItemName("Spinach and Cheese Stuffed Mushrooms");
				vegStater4.setFoodItemPrice(400);
				vegStater4.setFoodItemDetails("These Mushroom are savoury snacks for party at home, stuffed with a mixture of apinach and cheesy,creating a heavenly combination.");
				vegStater4.getFoodIdNumber();
				vegStater4.getFoodItemName();
				vegStater4.getFoodItemPrice();
				vegStater4.getFoodItemDetails();
				vegStater.add(vegStater4);
				
		Staters vegStater5 = new Staters(0,"",000,"");
				vegStater5.setFoodItemNumber(5);
				vegStater5.setFoodItemName("Cheesy Maggie Rolls");
				vegStater5.setFoodItemPrice(200);
				vegStater5.setFoodItemDetails("Cheesy Maggie Rolls are fusion of the beloved Maggi noodles and cheesy goodness, rolled up in a crispy casing.");
				vegStater5.getFoodIdNumber();
				vegStater5.getFoodItemName();
				vegStater5.getFoodItemPrice();
				vegStater5.getFoodItemDetails();
				vegStater.add(vegStater5);
	
				
//Non-Veg-Staters
				LinkedList<FoodItems> nonVegStater = new LinkedList();
				Staters nonVegStater1 = new Staters(0,"",000,"");
						nonVegStater1.setFoodItemNumber(1);
						nonVegStater1.setFoodItemName("Chicken Spring Rolls");
						nonVegStater1.setFoodItemPrice(300);
						nonVegStater1.setFoodItemDetails("Fully cooked spring rolls filled with chicken and vegetables.");
						nonVegStater1.getFoodIdNumber();
						nonVegStater1.getFoodItemName();
						nonVegStater1.getFoodItemPrice();
						nonVegStater1.getFoodItemDetails();
						nonVegStater.add(nonVegStater1);
						
				Staters nonVegStater2 = new Staters(0,"",000,"");
								nonVegStater2.setFoodItemNumber(2);
								nonVegStater2.setFoodItemName("Chicken Manchurian");
								nonVegStater2.setFoodItemPrice(300);
								nonVegStater2.setFoodItemDetails("It is fusion food with chinese cuisine adapted with some tangy soya sauce to bring out something new.it can be served in a dry variation or in a cury way.");
								nonVegStater2.getFoodIdNumber();
								nonVegStater2.getFoodItemName();
								nonVegStater2.getFoodItemPrice();
								nonVegStater2.getFoodItemDetails();
								nonVegStater.add(nonVegStater2);
								
				Staters nonVegStater3 = new Staters(0,"",000,"");
								nonVegStater3.setFoodItemNumber(3);
								nonVegStater3.setFoodItemName("Seekh kebab");
								nonVegStater3.setFoodItemPrice(350);
								nonVegStater3.setFoodItemDetails("This is one of the best delicious indian non-vegetarian stater with a great blend of spices and minced meat grilled with tandoor,giving a crusty texture and charred with grilled meat fragrance which enhances the taste buds.");
								nonVegStater3.getFoodIdNumber();
								nonVegStater3.getFoodItemName();
								nonVegStater3.getFoodItemPrice();
								nonVegStater3.getFoodItemDetails();
								nonVegStater.add(nonVegStater3);
								
				Staters nonVegStater4 = new Staters(0,"",000,"");
								nonVegStater4.setFoodItemNumber(4);
								nonVegStater4.setFoodItemName("Cheesy Chicken Tikka");
								nonVegStater4.setFoodItemPrice(300);
								nonVegStater4.setFoodItemDetails("Tikka recipes are delicious and mouthwatering.Cheesy chicken tikkas is definetly of the indulgent side of the recipe since both cheese and frsh cream is used in it.");
								nonVegStater4.getFoodIdNumber();
								nonVegStater4.getFoodItemName();
								nonVegStater4.getFoodItemPrice();
								nonVegStater4.getFoodItemDetails();
								nonVegStater.add(nonVegStater4);
								
								
									System.out.println(" =*=*=*= Staters =*=*=*= ");
									System.out.println("");
									System.out.println(" Press 1 for Veg Staters ");
									System.out.println("");
									System.out.println(" Press 2 for Non-Veg Staters ");
									System.out.println("");
		
									int subchoice = sc.nextInt();
									switch(subchoice)
									{
									case 1 :
										System.out.println(" =*=*=*= Veg Staters Menu =*=*=*= ");
										System.out.println("");
										System.out.println(" Press 1 for Paneer Tikka ");
										vegStater.get(0).vegStater();
										System.out.println("");
										System.out.println(" Press 2 for Crispy Potato ");
										vegStater.get(1).vegStater();
										System.out.println("");
										System.out.println(" Press 3 for Gobi Manchurian ");
										vegStater.get(2).vegStater();
										System.out.println("");
										System.out.println(" Press 4 for Spinach and Cheese Stuffed Mushrooms ");
										vegStater.get(3).vegStater();
										System.out.println("");
										System.out.println(" Press 5 for Cheesy Maggie Rolls ");
										vegStater.get(4).vegStater();
										System.out.println("");
										System.out.println(" Press 0 for Go Back");
										System.out.println("");
										
										subchoice = sc.nextInt();
										switch(subchoice)
										{
										case 0:
											Resturant.this.stater();
										break;
										case 1 :
											System.out.println(" You Have Selected Paneer Tikka ");
											System.out.println(" the Price is 200 ");
											System.out.println(" Press 1 to place order or press any number to Go Back ");
											subchoice = sc.nextInt();
											if(subchoice == 1)
											{
												bill = bill + 200;
											}
											else
											{
												FoodOdering.welcome();
											}
											System.out.println(" Do You Want to Choose Another Dish? ");
											System.out.println(" If Yes then Press Y and for No Press N ");
											char ch = sc.next().charAt(0);
											if(ch == 'y' || ch == 'Y')
											{
												FoodOdering.welcome();
											}
											else
											{
												totalBill();
											}
										break;
										case 2:
											System.out.println(" You Have Selected Crispy Potato ");
											System.out.println(" the Price is 150 ");
											System.out.println(" Press 1 to place order or press any number to Go Back ");
											subchoice = sc.nextInt();
											if(subchoice == 1)
											{
												bill = bill + 150;
											}
											else
											{
												FoodOdering.welcome();
											}
											System.out.println(" Do You Want to Choose Another Dish? ");
											System.out.println(" If Yes then Press Y and for No Press N ");
											ch = sc.next().charAt(0);
											if(ch == 'y' || ch == 'Y')
											{
												FoodOdering.welcome();
											}
											else
											{
												totalBill();
											}
										break;
										case 3:
											System.out.println(" You Have Selected Gobi Manchurian ");
											System.out.println(" the Price is 80 ");
											System.out.println(" Press 1 to place order or press any number to Go Back ");
											subchoice = sc.nextInt();
											if(subchoice == 1)
											{
												bill = bill + 80;
											}
											else
											{
												FoodOdering.welcome();
											}
											System.out.println(" Do You Want to Choose Another Dish? ");
											System.out.println(" If Yes then Press Y and for No Press N ");
											ch = sc.next().charAt(0);
											if(ch == 'y' || ch == 'Y')
											{
												FoodOdering.welcome();
											}
											else
											{
												totalBill();
											}
										break;
										case 4:
											System.out.println(" You Have Selected Spinach and Cheese Stuffed Mushrooms ");
											System.out.println(" the Price is 400 ");
											System.out.println(" Press 1 to place order or press any number to Go Back ");
											subchoice = sc.nextInt();
											if(subchoice == 1)
											{
												bill = bill + 400;
											}
											else
											{
												FoodOdering.welcome();
											}
											System.out.println(" Do You Want to Choose Another Dish? ");
											System.out.println(" If Yes then Press Y and for No Press N ");
											ch = sc.next().charAt(0);
											if(ch == 'y' || ch == 'Y')
											{
												FoodOdering.welcome();
											}
											else
											{
												totalBill();
											}
										break;
										case 5:
											System.out.println(" You Have Selected Cheesy Maggie Rolls ");
											System.out.println(" the Price is 200 ");
											System.out.println(" Press 1 to place order or press any number to Go Back ");
											subchoice = sc.nextInt();
											if(subchoice == 1)
											{
												bill = bill + 200;
											}
											else
											{
												FoodOdering.welcome();
											}
											System.out.println(" Do You Want to Choose Another Dish? ");
											System.out.println(" If Yes then Press Y and for No Press N ");
											ch = sc.next().charAt(0);
											if(ch == 'y' || ch == 'Y')
											{
												FoodOdering.welcome();
											}
											else
											{
												totalBill();
											}
										break;
										}
//Non-Veg
									case 2:
										System.out.println("=*=*=*= Non-Veg Staters Menu =*=*=*= ");
										System.out.println("");
										System.out.println(" Press 1 for Chicken Spring Rolls ");
										nonVegStater.get(0).nonVegStater();
										System.out.println("");
										System.out.println(" Press 2 for Chicken Manchurian Tikka ");
										nonVegStater.get(1).nonVegStater();
										System.out.println("");
										System.out.println(" Press 3 for Seekh kebab ");
										nonVegStater.get(2).nonVegStater();
										System.out.println("");
										System.out.println(" Press 4 for Cheesy Chiken Tikka ");
										nonVegStater.get(3).nonVegStater();
										System.out.println("");
										System.out.println(" Press 0 for Go Back");
										System.out.println("");
										
										subchoice = sc.nextInt();
										switch(subchoice)
										{
										case 0:
											Resturant.this.stater();
										break;
										case 1 :
											System.out.println(" You Have Selected Chicken Spring Rolls ");
											System.out.println(" the Price is 300 ");
											System.out.println(" Press 1 to place order or press any number to Go Back ");
											subchoice = sc.nextInt();
											if(subchoice == 1)
											{
												bill = bill + 300;
											}
											else
											{
												FoodOdering.welcome();
											}
											System.out.println(" Do You Want to Choose Another Dish? ");
											System.out.println(" If Yes then Press Y and for No Press N ");
											char ch = sc.next().charAt(0);
											if(ch == 'y' || ch == 'Y')
											{
												FoodOdering.welcome();
											}
											else
											{
												totalBill();
											}
										break;
										case 2 :
											System.out.println(" You Have Selected Chicken Manchurian ");
											System.out.println(" the Price is 300 ");
											System.out.println(" Press 1 to place order or press any number to Go Back ");
											subchoice = sc.nextInt();
											if(subchoice == 1)
											{
												bill = bill + 300;
											}
											else
											{
												FoodOdering.welcome();
											}
											System.out.println(" Do You Want to Choose Another Dish? ");
											System.out.println(" If Yes then Press Y and for No Press N ");
											ch = sc.next().charAt(0);
											if(ch == 'y' || ch == 'Y')
											{
												FoodOdering.welcome();
											}
											else
											{
												totalBill();
											}
										break;
										case 3 :
											System.out.println(" You Have Selected Seekh kebab ");
											System.out.println(" the Price is 350 ");
											System.out.println(" Press 1 to place order or press any number to Go Back ");
											subchoice = sc.nextInt();
											if(subchoice == 1)
											{
												bill = bill + 350;
											}
											else
											{
												FoodOdering.welcome();
											}
											System.out.println(" Do You Want to Choose Another Dish? ");
											System.out.println(" If Yes then Press Y and for No Press N ");
											ch = sc.next().charAt(0);
											if(ch == 'y' || ch == 'Y')
											{
												FoodOdering.welcome();
											}
											else
											{
												totalBill();
											}
										break;
										case 4 :
											System.out.println(" You Have Selected Cheesy Chicken Tikka");
											System.out.println(" the Price is 300 ");
											System.out.println(" Press 1 to place order or press any number to Go Back ");
											subchoice = sc.nextInt();
											if(subchoice == 1)
											{
												bill = bill + 300;
											}
											else
											{
												FoodOdering.welcome();
											}
											System.out.println(" Do You Want to Choose Another Dish? ");
											System.out.println(" If Yes then Press Y and for No Press N ");
											ch = sc.next().charAt(0);
											if(ch == 'y' || ch == 'Y')
											{
												FoodOdering.welcome();
											}
											else
											{
												totalBill();
											}
										break;
										}
									}
	}
	
//Main-Course
	public void mainCourse()
	{
		LinkedList<FoodItems> vegMainCourse = new LinkedList();
		MainCourses vegMainCourse1 = new MainCourses(0,"",000,"");
					vegMainCourse1.setFoodItemNumber(1);
					vegMainCourse1.setFoodItemName("Paneer Biryani");
					vegMainCourse1.setFoodItemPrice(600);
					vegMainCourse1.setFoodItemDetails("Paneer Biryani is a mildly spiced and delicately flavoured dum cooked,traditional biryani recipe.simple moreish and flavorful paneer that pairs beautifully with any raita.");
					vegMainCourse1.getFoodIdNumber();
					vegMainCourse1.getFoodItemName();
					vegMainCourse1.getFoodItemPrice();
					vegMainCourse1.getFoodItemDetails();
					vegMainCourse.add(vegMainCourse1);
						
		MainCourses vegMainCourse2 = new MainCourses(0,"",000,"");
					vegMainCourse2.setFoodItemNumber(2);
					vegMainCourse2.setFoodItemName("Rajma Chawal");
					vegMainCourse2.setFoodItemPrice(300);
					vegMainCourse2.setFoodItemDetails(" The Rajma recipe is a lightly spiced, creamy and a delicious punjabi curry made with kidney beans,onions,tomatoes and spices.");
					vegMainCourse2.getFoodIdNumber();
					vegMainCourse2.getFoodItemName();
					vegMainCourse2.getFoodItemPrice();
					vegMainCourse2.getFoodItemDetails();
					vegMainCourse.add(vegMainCourse2);
						
					
		MainCourses vegMainCourse3 = new MainCourses(0,"",000,"");
					vegMainCourse3.setFoodItemNumber(3);
					vegMainCourse3.setFoodItemName("Dal Makhani");
					vegMainCourse3.setFoodItemPrice(400);
					vegMainCourse3.setFoodItemDetails("Dal Makhani is most love authentic punjabi food.");
					vegMainCourse3.getFoodIdNumber();
					vegMainCourse3.getFoodItemName();
					vegMainCourse3.getFoodItemPrice();
					vegMainCourse3.getFoodItemDetails();
					vegMainCourse.add(vegMainCourse3);			
					
		MainCourses vegMainCourse4 = new MainCourses(0,"",000,"");
					vegMainCourse4.setFoodItemNumber(4);
					vegMainCourse4.setFoodItemName("Veg Pulao");
					vegMainCourse4.setFoodItemPrice(500);
					vegMainCourse4.setFoodItemDetails("Veg Pulao, there are so many veggies in pulao like peas,potatoes and green beans.");
					vegMainCourse4.getFoodIdNumber();
					vegMainCourse4.getFoodItemName();
					vegMainCourse4.getFoodItemPrice();
					vegMainCourse4.getFoodItemDetails();
					vegMainCourse.add(vegMainCourse4);
					
		MainCourses vegMainCourse5 = new MainCourses(0,"",000,"");
					vegMainCourse5.setFoodItemNumber(5);
					vegMainCourse5.setFoodItemName("Matar paneer");
					vegMainCourse5.setFoodItemPrice(550);
					vegMainCourse5.setFoodItemDetails("Spiced and creamy made with peas and cottage cheese.");
					vegMainCourse5.getFoodIdNumber();
					vegMainCourse5.getFoodItemName();
					vegMainCourse5.getFoodItemPrice();
					vegMainCourse5.getFoodItemDetails();
					vegMainCourse.add(vegMainCourse5);
					
					
//Non-Veg MainCourse
		LinkedList<FoodItems> nonVegMainCourse = new LinkedList();
		MainCourses nonVegMainCourse1 = new MainCourses(0,"",000,"");
					nonVegMainCourse1.setFoodItemNumber(1);
					nonVegMainCourse1.setFoodItemName("Butter Chicken");
					nonVegMainCourse1.setFoodItemPrice(350);
					nonVegMainCourse1.setFoodItemDetails("Butter chicken is traditionally known as Murg Makhani it is a type of curry with a spiced tomato and butter(makhan)sauce.its sauce is known for its rich texture.");
					nonVegMainCourse1.getFoodIdNumber();
					nonVegMainCourse1.getFoodItemName();
					nonVegMainCourse1.getFoodItemPrice();
					nonVegMainCourse1.getFoodItemDetails();
					nonVegMainCourse.add(nonVegMainCourse1);
					
		MainCourses nonVegMainCourse2 = new MainCourses(0,"",000,"");
					nonVegMainCourse2.setFoodItemNumber(2);
					nonVegMainCourse2.setFoodItemName("Chicken Chilly");
					nonVegMainCourse2.setFoodItemPrice(450);
					nonVegMainCourse2.setFoodItemDetails("Chiken chilly, a iron hot spices with a base of ginger and garlic pepper roasted with dry masala tossed with chicken on slow fry.");
					nonVegMainCourse2.getFoodIdNumber();
					nonVegMainCourse2.getFoodItemName();
					nonVegMainCourse2.getFoodItemPrice();
					nonVegMainCourse2.getFoodItemDetails();
					nonVegMainCourse.add(nonVegMainCourse2);
			
		MainCourses nonVegMainCourse3 = new MainCourses(0,"",000,"");
					nonVegMainCourse3.setFoodItemNumber(3);
					nonVegMainCourse3.setFoodItemName("Chicken Kabsa");
					nonVegMainCourse3.setFoodItemPrice(700);
					nonVegMainCourse3.setFoodItemDetails("Chiken Kabsa Arabic style rice dish made with Arabic spice mix,chicken stock and loads of vegetables making it a one-pot meal.");
					nonVegMainCourse3.getFoodIdNumber();
					nonVegMainCourse3.getFoodItemName();
					nonVegMainCourse3.getFoodItemPrice();
					nonVegMainCourse3.getFoodItemDetails();
					nonVegMainCourse.add(nonVegMainCourse3);
					
		MainCourses nonVegMainCourse4 = new MainCourses(0,"",000,"");
					nonVegMainCourse4.setFoodItemNumber(4);
					nonVegMainCourse4.setFoodItemName("Korma");
					nonVegMainCourse4.setFoodItemPrice(450);
					nonVegMainCourse4.setFoodItemDetails("Creamy Korma,fiery laal maas or flavorable chicken masala");					nonVegMainCourse4.getFoodIdNumber();
					nonVegMainCourse4.getFoodItemName();
					nonVegMainCourse4.getFoodItemPrice();
					nonVegMainCourse4.getFoodItemDetails();
					nonVegMainCourse.add(nonVegMainCourse4);
					
		MainCourses nonVegMainCourse5 = new MainCourses(0,"",000,"");
					nonVegMainCourse5.setFoodItemNumber(5);
					nonVegMainCourse5.setFoodItemName("Goat Curry");
					nonVegMainCourse5.setFoodItemPrice(650);
					nonVegMainCourse5.setFoodItemDetails("Rich Mutton Curry with warm flavours of sesame seeds and jaggery.");
					nonVegMainCourse5.getFoodIdNumber();
					nonVegMainCourse5.getFoodItemName();
					nonVegMainCourse5.getFoodItemPrice();
					nonVegMainCourse5.getFoodItemDetails();
					nonVegMainCourse.add(nonVegMainCourse5);
					
					System.out.println(" =*=*=*= Main Course =*=*=*= ");
					System.out.println("");
					System.out.println(" Press 1 for Veg MainCourse ");
					System.out.println("");
					System.out.println(" Press 2 for Non-Veg MainCourse ");
					System.out.println("");
					
					int subchoice = sc.nextInt();
					switch(subchoice)
					{
					case 1 :
						System.out.println(" =*=*=*= Veg MainCourse Menu =*=*=*= ");
						System.out.println("");
						System.out.println(" Press 1 for Paneer Biryani ");
						vegMainCourse.get(0).vegMainCourse();
						System.out.println("");
						System.out.println(" Press 2 for Rajma Chawal ");
						vegMainCourse.get(1).vegMainCourse();
						System.out.println("");
						System.out.println(" Press 3 for Dal Makhani ");
						vegMainCourse.get(2).vegMainCourse();
						System.out.println("");
						System.out.println(" Press 4 for Veg Pulao ");
						vegMainCourse.get(3).vegMainCourse();
						System.out.println("");
						System.out.println(" Press 5 for Matar Paneer ");
						vegMainCourse.get(4).vegMainCourse();
						System.out.println("");
						System.out.println(" Press 0 for Go Back");
						System.out.println("");
						subchoice = sc.nextInt();
						switch(subchoice)
						{
						case 0:
							Resturant.this.mainCourse();
						break;
						case 1 :
							System.out.println(" You Have Selected Paneer Biryani ");
							System.out.println(" the Price is 600 ");
							System.out.println(" Press 1 to place order or press any number to Go Back ");
							subchoice = sc.nextInt();
							if(subchoice == 1)
							{
								bill = bill + 600;
							}
							else
							{
								FoodOdering.welcome();
							}
							System.out.println(" Do You Want to Choose Another Dish? ");
							System.out.println(" If Yes then Press Y and for No Press N ");
							char ch = sc.next().charAt(0);
							if(ch == 'y' || ch == 'Y')
							{
								FoodOdering.welcome();
							}
							else
							{
								totalBill();
							}
						break;
						case 2 :
							System.out.println(" You Have Selected Rajma Chaval ");
							System.out.println(" the Price is 300 ");
							System.out.println(" Press 1 to place order or press any number to Go Back ");
							subchoice = sc.nextInt();
							if(subchoice == 1)
							{
								bill = bill + 300;
							}
							else
							{
								FoodOdering.welcome();
							}
							System.out.println(" Do You Want to Choose Another Dish? ");
							System.out.println(" If Yes then Press Y and for No Press N ");
							ch = sc.next().charAt(0);
							if(ch == 'y' || ch == 'Y')
							{
								FoodOdering.welcome();
							}
							else
							{
								totalBill();
							}
						break;
						case 3 :
							System.out.println(" You Have Selected Dal Makhani ");
							System.out.println(" the Price is 300 ");
							System.out.println(" Press 1 to place order or press any number to Go Back ");
							subchoice = sc.nextInt();
							if(subchoice == 1)
							{
								bill = bill + 300;
							}
							else
							{
								FoodOdering.welcome();
							}
							System.out.println(" Do You Want to Choose Another Dish? ");
							System.out.println(" If Yes then Press Y and for No Press N ");
							ch = sc.next().charAt(0);
							if(ch == 'y' || ch == 'Y')
							{
								FoodOdering.welcome();
							}
							else
							{
								totalBill();
							}
						break;
						case 4 :
							System.out.println(" You Have Selected Veg Pulao ");
							System.out.println(" the Price is 500 ");
							System.out.println(" Press 1 to place order or press any number to Go Back ");
							subchoice = sc.nextInt();
							if(subchoice == 1)
							{
								bill = bill + 500;
							}
							else
							{
								FoodOdering.welcome();
							}
							System.out.println(" Do You Want to Choose Another Dish? ");
							System.out.println(" If Yes then Press Y and for No Press N ");
							ch = sc.next().charAt(0);
							if(ch == 'y' || ch == 'Y')
							{
								FoodOdering.welcome();
							}
							else
							{
								totalBill();
							}
						break;
						case 5 :
							System.out.println(" You Have Selected Mattar Paneer ");
							System.out.println(" the Price is 550 ");
							System.out.println(" Press 1 to place order or press any number to Go Back ");
							subchoice = sc.nextInt();
							if(subchoice == 1)
							{
								bill = bill + 550;
							}
							else
							{
								FoodOdering.welcome();
							}
							System.out.println(" Do You Want to Choose Another Dish? ");
							System.out.println(" If Yes then Press Y and for No Press N ");
							ch = sc.next().charAt(0);
							if(ch == 'y' || ch == 'Y')
							{
								FoodOdering.welcome();
							}
							else
							{
								totalBill();
							}
						break;
						}
					case 2:
						System.out.println(" =*=*=*= Non-Veg MainCourse Menu =*=*=*= ");
						System.out.println("");
						System.out.println(" Press 1 for Butter Chicken ");
						nonVegMainCourse.get(0).nonVegMainCourse();
						System.out.println("");
						System.out.println(" Press 2 for Chicken Chilly ");
						nonVegMainCourse.get(1).nonVegMainCourse();
						System.out.println("");
						System.out.println(" Press 3 for Chicken Kabsa ");
						nonVegMainCourse.get(2).nonVegMainCourse();
						System.out.println("");
						System.out.println(" Press 4 for Korma ");
						nonVegMainCourse.get(3).nonVegMainCourse();
						System.out.println("");
						System.out.println(" Press 5 for Goat Curry ");
						nonVegMainCourse.get(4).nonVegMainCourse();
						System.out.println("");
						System.out.println(" Press 0 for Go Back");
						System.out.println("");
						subchoice = sc.nextInt();
						switch(subchoice)
						{
						case 0:
							Resturant.this.mainCourse();
						break;
						case 1 :
							System.out.println(" You Have Selected Butter Chicken ");
							System.out.println(" the Price is 350 ");
							System.out.println(" Press 1 to place order or press any number to Go Back ");
							subchoice = sc.nextInt();
							if(subchoice == 1)
							{
								bill = bill + 350;
							}
							else
							{
								FoodOdering.welcome();
							}
							System.out.println(" Do You Want to Choose Another Dish? ");
							System.out.println(" If Yes then Press Y and for No Press N ");
							char ch = sc.next().charAt(0);
							if(ch == 'y' || ch == 'Y')
							{
								FoodOdering.welcome();
							}
							else
							{
								totalBill();
							}
						break;
						case 2 :
							System.out.println(" You Have Selected Chicken Chilly ");
							System.out.println(" the Price is 450 ");
							System.out.println(" Press 1 to place order or press any number to Go Back ");
							subchoice = sc.nextInt();
							if(subchoice == 1)
							{
								bill = bill + 450;
							}
							else
							{
								FoodOdering.welcome();
							}
							System.out.println(" Do You Want to Choose Another Dish? ");
							System.out.println(" If Yes then Press Y and for No Press N ");
							ch = sc.next().charAt(0);
							if(ch == 'y' || ch == 'Y')
							{
								FoodOdering.welcome();
							}
							else
							{
								totalBill();
							}
						break;
						case 3 :
							System.out.println(" You Have Selected Chicken Kabsa ");
							System.out.println(" the Price is 700 ");
							System.out.println(" Press 1 to place order or press any number to Go Back ");
							subchoice = sc.nextInt();
							if(subchoice == 1)
							{
								bill = bill + 700;
							}
							else
							{
								FoodOdering.welcome();
							}
							System.out.println(" Do You Want to Choose Another Dish? ");
							System.out.println(" If Yes then Press Y and for No Press N ");
							ch = sc.next().charAt(0);
							if(ch == 'y' || ch == 'Y')
							{
								FoodOdering.welcome();
							}
							else
							{
								totalBill();
							}
						break;
						case 4 :
							System.out.println(" You Have Selected Korma ");
							System.out.println(" the Price is 450 ");
							System.out.println(" Press 1 to place order or press any number to Go Back ");
							subchoice = sc.nextInt();
							if(subchoice == 1)
							{
								bill = bill + 450;
							}
							else
							{
								FoodOdering.welcome();
							}
							System.out.println(" Do You Want to Choose Another Dish? ");
							System.out.println(" If Yes then Press Y and for No Press N ");
							ch = sc.next().charAt(0);
							if(ch == 'y' || ch == 'Y')
							{
								FoodOdering.welcome();
							}
							else
							{
								totalBill();
							}
						break;
						case 5 :
							System.out.println(" You Have Selected Goat Curry ");
							System.out.println(" the Price is 650 ");
							System.out.println(" Press 1 to place order or press any number to Go Back ");
							subchoice = sc.nextInt();
							if(subchoice == 1)
							{
								bill = bill + 650;
							}
							else
							{
								FoodOdering.welcome();
							}
							System.out.println(" Do You Want to Choose Another Dish? ");
							System.out.println(" If Yes then Press Y and for No Press N ");
							ch = sc.next().charAt(0);
							if(ch == 'y' || ch == 'Y')
							{
								FoodOdering.welcome();
							}
							else
							{
								totalBill();
							}
						break;
						}
						break;						
					}
}
	
//Drinks
	public void drinks()
	{
		LinkedList<FoodItems> drinks = new LinkedList();
		Drinks drinks1 = new Drinks(0,"",000,"");
			   drinks1.setFoodItemNumber(1);
	       	   drinks1.setFoodItemName("Pineapple Mocktail ");
			   drinks1.setFoodItemPrice(480);
			   drinks1.setFoodItemDetails("The sweet pineapple mocktail is refreshing and not too sweet. the fresh lime juice mellows out the tang of the pineapple juice, while the muddled mint adds a refreshing bright,adding the egg white,vanilla,and pineapple syrup creates texture and mouthfeel,making it feel more like a cocktail.the egg white also creates a light,foamy head that elevates the drinking experience");
			   drinks1.getFoodIdNumber();
			   drinks1.getFoodItemName();
			   drinks1.getFoodItemPrice();
			   drinks1.getFoodItemDetails();
			   drinks.add(drinks1);
						
		Drinks drinks2 = new Drinks(0,"",000,"");
			   drinks2.setFoodItemNumber(2);
	       	   drinks2.setFoodItemName("Strawberry Agua Fresca ");
			   drinks2.setFoodItemPrice(450);
			   drinks2.setFoodItemDetails("Stay Hydrated with his simple and variant beverage that gets its bright color and fresh flavor from a simple strawberry mash");
			   drinks2.getFoodIdNumber();
			   drinks2.getFoodItemName();
			   drinks2.getFoodItemPrice();
			   drinks2.getFoodItemDetails();
			   drinks.add(drinks2);
	
					
		Drinks drinks3 = new Drinks(0,"",000,"");
			   drinks3.setFoodItemNumber(3);
	       	   drinks3.setFoodItemName(" Cherry Limeade");
			   drinks3.setFoodItemPrice(400);
			   drinks3.setFoodItemDetails("If you love sonic's Cherry limeade,the perfect balance of tart and sweet");
			   drinks3.getFoodIdNumber();
			   drinks3.getFoodItemName();
			   drinks3.getFoodItemPrice();
			   drinks3.getFoodItemDetails();		
			   drinks.add(drinks3);
	
			   
		Drinks drinks4 = new Drinks(0,"",000,"");
			   drinks4.setFoodItemNumber(4);
	       	   drinks4.setFoodItemName("Frozen Strawberry Lemonade");
			   drinks4.setFoodItemPrice(450);
			   drinks4.setFoodItemDetails("Both tangy and sweet,this fruit-infused frozen-drink is always feel extra special.");
			   drinks4.getFoodIdNumber();
			   drinks4.getFoodItemName();
			   drinks4.getFoodItemPrice();
			   drinks4.getFoodItemDetails();
			   drinks.add(drinks4);

		Drinks drinks5 = new Drinks(0,"",000,"");
			   drinks5.setFoodItemNumber(5);
	       	   drinks5.setFoodItemName("Frozen Blueberry Lemonade");
			   drinks5.setFoodItemPrice(500);
			   drinks5.setFoodItemDetails("This icy sipper is a delicious way to combine the sweet-tart flavors of lemonade and blueberry.");
			   drinks5.getFoodIdNumber();
			   drinks5.getFoodItemName();
			   drinks5.getFoodItemPrice();
			   drinks5.getFoodItemDetails();
			   drinks.add(drinks5);
			   
			   System.out.println(" =*=*=*= Drinks Menu =*=*=*= ");
				System.out.println("");
				System.out.println(" Press 1 for Veg MainCourse ");
				System.out.println("");
				
				int subchoice = sc.nextInt();
				switch(subchoice)
				{
				case 1 :
					System.out.println(" =*=*=*= Drinks Menu =*=*=*= ");
					System.out.println("");
					System.out.println(" Press 1 for Pineapple Mocktail ");
					drinks.get(0).drink();
					System.out.println("");
					System.out.println(" Press 2 for Strawberry Agua Fresca ");
					drinks.get(1).drink();
					System.out.println("");
					System.out.println(" Press 3 for Cherry Limeade ");
					drinks.get(2).drink();
					System.out.println("");
					System.out.println(" Press 4 for Frozen Strawberry Lemonade ");
					drinks.get(3).drink();
					System.out.println("");
					System.out.println(" Press 5 for Frozen Blueberry Lemonade ");
					drinks.get(4).drink();
					System.out.println("");
					System.out.println(" Press 0 for Go Back");
					System.out.println("");
					subchoice = sc.nextInt();
					switch(subchoice)
					{
					case 0:
						Resturant.this.drinks();
					break;
					case 1 :
						System.out.println(" You Have Selected Pineapple Mocktail ");
						System.out.println(" the Price is 480 ");
						System.out.println(" Press 1 to place order or press any number to Go Back ");
						subchoice = sc.nextInt();
						if(subchoice == 1)
						{
							bill = bill +480;
						}
						else
						{
							FoodOdering.welcome();
						}
						System.out.println(" Do You Want to Choose Another Dish? ");
						System.out.println(" If Yes then Press Y and for No Press N ");
						char ch = sc.next().charAt(0);
						if(ch == 'y' || ch == 'Y')
						{
							FoodOdering.welcome();
						}
						else
						{
							totalBill();
						}
					break;
					case 2 :
						System.out.println(" You Have Selected Strawberry Agua Fresca ");
						System.out.println(" the Price is 450 ");
						System.out.println(" Press 1 to place order or press any number to Go Back ");
						subchoice = sc.nextInt();
						if(subchoice == 1)
						{
							bill = bill + 450;
						}
						else
						{
							FoodOdering.welcome();
						}
						System.out.println(" Do You Want to Choose Another Dish? ");
						System.out.println(" If Yes then Press Y and for No Press N ");
						ch = sc.next().charAt(0);
						if(ch == 'y' || ch == 'Y')
						{
							FoodOdering.welcome();
						}
						else
						{
							totalBill();
						}
					break;
					case 3 :
						System.out.println(" You Have Selected Cherry Limeade ");
						System.out.println(" the Price is 400 ");
						System.out.println(" Press 1 to place order or press any number to Go Back ");
						subchoice = sc.nextInt();
						if(subchoice == 1)
						{
							bill = bill + 400;
						}
						else
						{
							FoodOdering.welcome();
						}
						System.out.println(" Do You Want to Choose Another Dish? ");
						System.out.println(" If Yes then Press Y and for No Press N ");
						ch = sc.next().charAt(0);
						if(ch == 'y' || ch == 'Y')
						{
							FoodOdering.welcome();
						}
						else
						{
							totalBill();
						}
					break;
					case 4 :
						System.out.println(" You Have Selected Frozen Strawberry Lemonade ");
						System.out.println(" the Price is 450 ");
						System.out.println(" Press 1 to place order or press any number to Go Back ");
						subchoice = sc.nextInt();
						if(subchoice == 1)
						{
							bill = bill + 450;
						}
						else
						{
							FoodOdering.welcome();
						}
						System.out.println(" Do You Want to Choose Another Dish? ");
						System.out.println(" If Yes then Press Y and for No Press N ");
						ch = sc.next().charAt(0);
						if(ch == 'y' || ch == 'Y')
						{
							FoodOdering.welcome();
						}
						else
						{
							totalBill();
						}
					break;
					case 5 :
						System.out.println(" You Have Selected Frozen Blueberry Lemonade ");
						System.out.println(" the Price is 500 ");
						System.out.println(" Press 1 to place order or press any number to Go Back ");
						subchoice = sc.nextInt();
						if(subchoice == 1)
						{
							bill = bill + 500;
						}
						else
						{
							FoodOdering.welcome();
						}
						System.out.println(" Do You Want to Choose Another Dish? ");
						System.out.println(" If Yes then Press Y and for No Press N ");
						ch = sc.next().charAt(0);
						if(ch == 'y' || ch == 'Y')
						{
							FoodOdering.welcome();
						}
						else
						{
							totalBill();
						}
					break;
					}
					break;						
				}

	}
	
	
	
//Desserts
		public void desserts()
		{
			LinkedList<FoodItems> desserts = new LinkedList();
			Desserts desserts1 = new Desserts(0,"",000,"");
				     desserts1.setFoodItemNumber(1);
		       	     desserts1.setFoodItemName("Banana Pudding");
				     desserts1.setFoodItemPrice(400);
				     desserts1.setFoodItemDetails("Banana Pudding is a pudding generally consisting of layers of sweet vanila flavored.");
				     desserts1.getFoodIdNumber();
				     desserts1.getFoodItemName();
				     desserts1.getFoodItemPrice();
				     desserts1.getFoodItemDetails();
				     desserts.add(desserts1);
							
			Desserts desserts2 = new Desserts(0,"",000,"");
				     desserts2.setFoodItemNumber(2);
		       	     desserts2.setFoodItemName(" Mango Pudding");
				     desserts2.setFoodItemPrice(480);
				     desserts2.setFoodItemDetails("It's very Delicious");
				     desserts2.getFoodIdNumber();
				     desserts2.getFoodItemName();
				     desserts2.getFoodItemPrice();
				     desserts2.getFoodItemDetails();
				     desserts.add(desserts2);
		
						
			Desserts desserts3 = new Desserts(0,"",000,"");
			        desserts3.setFoodItemNumber(3);
			        desserts3.setFoodItemName("Ice Cream");
				    desserts3.setFoodItemPrice(400);
				    desserts3.setFoodItemDetails("");
				    desserts3.getFoodIdNumber();
				    desserts3.getFoodItemName();
				    desserts3.getFoodItemPrice();
				    desserts3.getFoodItemDetails();		
				    desserts.add(desserts3);
		
				   
			Desserts desserts4 = new Desserts(0,"",000,"");
					 desserts4.setFoodItemNumber(4);
					 desserts4.setFoodItemName("Cakes and Cupcakes");
				   	 desserts4.setFoodItemPrice(450);
				     desserts4.setFoodItemDetails("Fresh and tastefull cakes and cupcakes.");
				     desserts4.getFoodIdNumber();
				     desserts4.getFoodItemName();
				     desserts4.getFoodItemPrice();
				     desserts4.getFoodItemDetails();
				     desserts.add(desserts4);

			Drinks desserts5 = new Drinks(0,"",000,"");
			       desserts5.setFoodItemNumber(5);
			       desserts5.setFoodItemName("Shahi Tukra");
			       desserts5.setFoodItemPrice(500);
		     	   desserts5.setFoodItemDetails("It's a type of Bread pudding.");
				   desserts5.getFoodIdNumber();
				   desserts5.getFoodItemName();
				   desserts5.getFoodItemPrice();
				   desserts5.getFoodItemDetails();
				   desserts.add(desserts5);
				   
				   System.out.println(" =*=*=*= Desserts Menu =*=*=*= ");
					System.out.println("");
					System.out.println(" Press 1 for Desserts ");
					System.out.println("");
					
					int subchoice = sc.nextInt();
					switch(subchoice)
					{
					case 1 :
						System.out.println(" =*=*=*= Desserts Menu =*=*=*= ");
						System.out.println("");
						System.out.println(" Press 1 for Banana Pudding ");
						desserts.get(0).dessert();
						System.out.println("");
						System.out.println(" Press 2 for Mango Pudding ");
						desserts.get(1).dessert();
						System.out.println("");
						System.out.println(" Press 3 for Ice Cream ");
						desserts.get(2).dessert();
						System.out.println("");
						System.out.println(" Press 4 for Cakes and CupCakes ");
						desserts.get(3).dessert();
						System.out.println("");
						System.out.println(" Press 5 for Shahi Tukra ");
						desserts.get(4).dessert();
						System.out.println("");
						System.out.println(" Press 0 for Go Back");
						System.out.println("");
						subchoice = sc.nextInt();
						switch(subchoice)
						{
						case 0:
							Resturant.this.desserts();
						break;
						case 1 :
							System.out.println(" You Have Selected Banana Pudding ");
							System.out.println(" the Price is 400 ");
							System.out.println(" Press 1 to place order or press any number to Go Back ");
							subchoice = sc.nextInt();
							if(subchoice == 1)
							{
								bill = bill +400;
							}
							else
							{
								FoodOdering.welcome();
							}
							System.out.println(" Do You Want to Choose Another Dish? ");
							System.out.println(" If Yes then Press Y and for No Press N ");
							char ch = sc.next().charAt(0);
							if(ch == 'y' || ch == 'Y')
							{
								FoodOdering.welcome();
							}
							else
							{
								totalBill();
							}
						break;
						case 2 :
							System.out.println(" You Have Selected Mango Pudding ");
							System.out.println(" the Price is 480 ");
							System.out.println(" Press 1 to place order or press any number to Go Back ");
							subchoice = sc.nextInt();
							if(subchoice == 1)
							{
								bill = bill + 480;
							}
							else
							{
								FoodOdering.welcome();
							}
							System.out.println(" Do You Want to Choose Another Dish? ");
							System.out.println(" If Yes then Press Y and for No Press N ");
							ch = sc.next().charAt(0);
							if(ch == 'y' || ch == 'Y')
							{
								FoodOdering.welcome();
							}
							else
							{
								totalBill();
							}
						break;
						case 3 :
							System.out.println(" You Have Selected Ice Cream ");
							System.out.println(" the Price is 400 ");
							System.out.println(" Press 1 to place order or press any number to Go Back ");
							subchoice = sc.nextInt();
							if(subchoice == 1)
							{
								bill = bill + 400;
							}
							else
							{
								FoodOdering.welcome();
							}
							System.out.println(" Do You Want to Choose Another Dish? ");
							System.out.println(" If Yes then Press Y and for No Press N ");
							ch = sc.next().charAt(0);
							if(ch == 'y' || ch == 'Y')
							{
								FoodOdering.welcome();
							}
							else
							{
								totalBill();
							}
						break;
						case 4 :
							System.out.println(" You Have Selected Cakes and CupCakes ");
							System.out.println(" the Price is 450 ");
							System.out.println(" Press 1 to place order or press any number to Go Back ");
							subchoice = sc.nextInt();
							if(subchoice == 1)
							{
								bill = bill + 450;
							}
							else
							{
								FoodOdering.welcome();
							}
							System.out.println(" Do You Want to Choose Another Dish? ");
							System.out.println(" If Yes then Press Y and for No Press N ");
							ch = sc.next().charAt(0);
							if(ch == 'y' || ch == 'Y')
							{
								FoodOdering.welcome();
							}
							else
							{
								totalBill();
							}
						break;
						case 5 :
							System.out.println(" You Have Selected Shahi Tukra ");
							System.out.println(" the Price is 500 ");
							System.out.println(" Press 1 to place order or press any number to Go Back ");
							subchoice = sc.nextInt();
							if(subchoice == 1)
							{
								bill = bill + 500;
							}
							else
							{
								FoodOdering.welcome();
							}
							System.out.println(" Do You Want to Choose Another Dish? ");
							System.out.println(" If Yes then Press Y and for No Press N ");
							ch = sc.next().charAt(0);
							if(ch == 'y' || ch == 'Y')
							{
								FoodOdering.welcome();
							}
							else
							{
								totalBill();
							}
						break;
						}
						break;						
					}

		}
	
		
					
}

//Driver Class
public class FoodOdering 
{
	
	public static void welcome()
	{
		try
		{
		System.out.println("=*=*=*=*=*=*=*= Welcome to MY RESTURANT =*=*=*=*=*=*=*= ");
		System.out.println("");
		System.out.println(" Press 1 For Staters.");
		System.out.println("");
		System.out.println(" Press 2 For Main Course.");
		System.out.println("");
		System.out.println(" Press 3 For Drinks.");
		System.out.println("");
		System.out.println(" Press 2 For Desserts.");
		System.out.println("");
		System.out.println(" Press 0 For Exit.");
		Scanner sc = new Scanner(System.in);
		int CHOICE = sc.nextInt();
		switch(CHOICE)
		{
		case 1 :
			Resturant resturantStater = new Resturant();
			resturantStater.stater();
		break;
		case 2:
			Resturant resturantMainCourse = new Resturant();
			resturantMainCourse.mainCourse();
		break;
		case 3:
			Resturant resturantDrinks = new Resturant();
			resturantDrinks.drinks();
		break;
		case 4:
			Resturant resturantDesserts = new Resturant();
			resturantDesserts.desserts();
		break;
		}
		}
		catch(Exception FoodOdering)
		{
			System.out.println("Enter Correct Input");
			main(null);
		}
	}
	
	
	
	
	public static void main(String[] args) 
	{

		try
		{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press 1 for Registration/login");
		System.out.println("");
		System.out.println("press 2 for Food Menu");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1 :
				try
				{
				Registration reg = new register();
				System.out.println("*=*=*=*=*=*= WELCOME =*=*=*=*=*=*");
				System.out.println("");
				System.out.println("----- Enter Your Choice --------");
				System.out.println("--------------------------------");
				System.out.println("----- Press 1 For SignUp. -------");
				System.out.println("--------------------------------");
				System.out.println("----- Press 2 for Login. -------");
				choice = sc.nextInt();
				switch(choice)
				{
				case 1:
					reg.signup();
					break;
					
				case 2: 
					reg.login();
					break;
				case 3:
					
					break;
				}
				}
				catch(Exception FoodOdering)
				{
					System.out.println("enter correct input");
					main(null);
				}
				
		case 2 :
			welcome();
			
		default:
				main(null);
				break;
			}
		}
		catch(Exception FoodOdering)
		{
			System.out.println("Enter Correct Input");
			main(null);
		}
	}
}
