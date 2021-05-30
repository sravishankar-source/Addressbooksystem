package addressbooksystem;

public class Addressbooksystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//create a table to hold the information
String[][] addressbook = new String[100][8];
addressbook[0][0]="Mobile number";
addressbook[0][1]="First Name";
addressbook[0][2]="Last NAME";
addressbook[0][3]="Address";
addressbook[0][4]="City";
addressbook[0][5]="Country";
addressbook[0][6]="Telephone Number";

//pre-populate address book for testing purpose

addressbook[1][0]="1";
addressbook[1][1]="Ravi";
addressbook[1][2]="Suryawanshi";
addressbook[1][3]="Latur";
addressbook[1][4]="Ausa";
addressbook[1][5]="India";
addressbook[1][6]="086-1581077";
addressbook[1][7]="098-45368";

addressbook[2][0]="2";
addressbook[2][1]="Mc";
addressbook[2][2]="lovin";
addressbook[2][3]="Hawaii";
addressbook[2][4]="Hawaii";
addressbook[2][5]="Hawaii";
addressbook[2][6]="12345";
addressbook[2][7]="412-555-1234";

//menu options
System.out.print("Welcome to my Address book!");
System.out.print("\n");
System.out.print("\n1 - Insert a New Contact \n2 - Search Contact by Last Name \n3 - Delete Contact \n4 - Show All Contacts \n5 - Exit " );
System.out.print("\n");
System.out.print("\nChoose your option: ");

Object input;
int option = ((Object) input).nextInt();

if (option ==1)
{
    System.out.print("\nPlease enter your First Name : ");
}
if (option ==2)
{
}

if (option ==3)
{
}

if (option ==4)
{
System.out.println(addressbook[1][0]+
"\t"+addressbook[1][2]+ ", "+addressbook[1][1]+
"\n\t"+addressbook[1][3]+
"\n\t"+addressbook[1][4]+ ", "+addressbook[1][5]+ " "+addressbook[1][6]+
"\n\t"+addressbook[1][7]);
}

if (option ==5)
{
}

}


	}


