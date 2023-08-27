import java.util.*;
class Example{
	public final static void clearConsole() {
	try {
		final String os = System.getProperty("os.name");
		if (os.contains("Windows")) {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} else {
			System.out.print("\033[H\033[2J");
			System.out.flush();
		}
		} catch (final Exception e) {
			e.printStackTrace();
		// Handle any exceptions.
		}
	}
	public static void sort(String ar[],int br[], double cr[]){
		for(int i=1; i<br.length; i++){
			for(int j=1; j<br.length; j++){
				if(br[j-1]<br[j]){
					int t=br[j-1];
					br[j-1]=br[j];
					br[j]=t;
					
					String s=ar[j-1];
					ar[j-1]=ar[j];
					ar[j]=s;
					
					double d=cr[j-1];
					cr[j-1]=cr[j];
					cr[j]=d;
						
				}
			}
		}
		
		for(int k=0;k<ar.length;k++){
					System.out.println("|                                                                                 |");
					System.out.println("|      "+ar[k]+"                    "+br[k]+"                         "+cr[k]+"            ");
					System.out.println("+---------------------------------------------------------------------------------+");
		}
					
	}
	
	
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		boolean b1=true;
		int order_n=1;
		String order[]=new String[0];
		String phone_number[]=new String[0];
		String size[] =new String[0];
		int qty[]=new int[0];
		double amount[]= new double[0];
		final String orderStatus[]={"Processing","Delivering","Delivered"};
		String orderState[] = new String[0];
		do{
			clearConsole();
			System.out.println("\r\n  /$$$$$$                    /$$       /$$                            /$$$$$$  /$$                          \r\n /$$__  $$                  | $$      |__/                           /$$__  $$| $$                          \r\n| $$  \\__//$$$$$$   /$$$$$$$| $$$$$$$  /$$  /$$$$$$  /$$$$$$$       | $$  \\__/| $$$$$$$   /$$$$$$   /$$$$$$ \r\n| $$$$   |____  $$ /$$_____/| $$__  $$| $$ /$$__  $$| $$__  $$      |  $$$$$$ | $$__  $$ /$$__  $$ /$$__  $$\r\n| $$_/    /$$$$$$$|  $$$$$$ | $$  \\ $$| $$| $$  \\ $$| $$  \\ $$       \\____  $$| $$  \\ $$| $$  \\ $$| $$  \\ $$\r\n| $$     /$$__  $$ \\____  $$| $$  | $$| $$| $$  | $$| $$  | $$       /$$  \\ $$| $$  | $$| $$  | $$| $$  | $$\r\n| $$    |  $$$$$$$ /$$$$$$$/| $$  | $$| $$|  $$$$$$/| $$  | $$      |  $$$$$$/| $$  | $$|  $$$$$$/| $$$$$$$/\r\n|__/     \\_______/|_______/ |__/  |__/|__/ \\______/ |__/  |__/       \\______/ |__/  |__/ \\______/ | $$____/ \r\n                                                                                                  | $$      \r\n                                                                                                  | $$      \r\n                                                                                                  |__/      \r\n");
			System.out.println("-----------------------------------------------------------------------------------------------------------\r\n\r\n\r\n\t[1] Place Order\t\t\t\t\t[2] Search Customer\r\n\r\n\t[3] Search Order\t\t\t\t[4] View Reports\r\n\r\n\t[5] Change Order Status\t\t\t\t[6] Delete Order");
		
			String tshirtSize[]={"XS","S","M","L","XL","XXL"};
			double pricelist[]={600.00,800.00,900.00,1000.00,1100.00,1200.00};
		
			System.out.print("\n\n\n    	Input Option : ");
			int op1=input.nextInt();
			
			int orderId[]=new int[5];
			int n=0;
		
		
	L1:	switch(op1){
		
			case 1: 
					boolean b2=true;
			do{
				String temp_order[]=new String[order.length+1];
				String temp_phone_number[]=new String[phone_number.length+1];
				String temp_size[] = new String[size.length+1];
				int temp_qty[] = new int[qty.length+1];
				double temp_amount[] = new double[amount.length+1];
				String temp_orderState[] = new String[orderState.length+1];
				for(int j=0;j<qty.length;j++){
					temp_order[j]=order[j];
					temp_phone_number[j]=phone_number[j];
					temp_size[j]=size[j];
					temp_qty[j]=qty[j];
					temp_amount[j]=amount[j];
					temp_orderState[j]=orderState[j];
				}	
				clearConsole();
				System.out.print("\r\n  _____  _                   ____          _           \r\n |  __ \\| |                 / __ \\        | |          \r\n | |__) | | __ _  ___ ___  | |  | |_ __ __| | ___ _ __ \r\n |  ___/| |/ _` |/ __/ _ \\ | |  | | \'__/ _` |/ _ \\ \'__|\r\n | |    | | (_| | (_|  __/ | |__| | | | (_| |  __/ |   \r\n |_|    |_|\\__,_|\\___\\___|  \\____/|_|  \\__,_|\\___|_|   \r\n______________________________________________________                                                     \r\n                                                      \r\n");
				n=order_n;
				String O_ID2="";
				for(int i=0;i<5;i++){
					orderId[4-i]=n%10;
					O_ID2=orderId[4-i]+O_ID2;
					n=n/10;
				}
				String O_ID="ODR#"+O_ID2;
				
				temp_order[order.length]=O_ID;
				order=temp_order;
				System.out.print("Enter Order ID :	"+"ODR#");
				for(int i=0;i<5;i++){
					System.out.print(orderId[i]);
				}
				
				//order_n=order_n+1;
				System.out.println("\n");
				boolean pnv=true;
				do{
					System.out.print("Enter Customer Phone number : ");
					String reply0=input.next();
					temp_phone_number[phone_number.length]=reply0;
					phone_number=temp_phone_number;
					if(reply0.length()==10 && reply0.charAt(0)=='0'){
						pnv=false;
						break;
					}
					System.out.println();
					System.out.println("Invalid phone Number...Try again");
					System.out.println();
					System.out.print("Do you want to enter phone number again? (Y/N)");
					char reply1= input.next().charAt(0);
					if(reply1=='Y'){
						System.out.print("\033[3A");
						System.out.print("\033[0J");
					}else if(reply1=='N'){
						break L1;
					}
				}while(pnv);
				System.out.println();
				String reply2=("");
				do{
					System.out.print("Enter T-Shirt Size (XS/S/M/L/XL/XXL) :");
					reply2= input.next();
					temp_size[size.length]=reply2;
					size=temp_size;
					
					if(reply2.equals("XS")||reply2.equals("S")||reply2.equals("M")||reply2.equals("L")||reply2.equals("XL")||reply2.equals("XXL")){
						break;
					}else{
						System.out.print("\033[1A");
						System.out.print("\033[0J");
					}
				}while(true);				
				System.out.println();
				System.out.print("Enter QTY : ");
				int reply3 = input.nextInt();
				temp_qty[qty.length]=reply3;
				qty=temp_qty;
				
				
				double unitprice=0.0;
				for(int i=0;i<tshirtSize.length;i++){
					if(tshirtSize[i].equals(reply2)){
						unitprice=pricelist[i];
					}
				}
				
				double price = reply3*unitprice;
				System.out.println();
				System.out.println("Amount : "+price);
				temp_amount[amount.length]=price;
				amount = temp_amount;
				

				System.out.println();
				System.out.print("Do you want to place this order? (Y/N): ");
				char reply4= input.next().charAt(0);
				if(reply4=='Y'){
					temp_orderState[orderState.length]= orderStatus[0];
					orderState=temp_orderState;
					order_n=order_n+1;
					System.out.println("\n");
					System.out.print("			Order Placed. . .!");
					System.out.println("\n");
					System.out.print("Do you want to place another order (Y/N): ");
					char reply5= input.next().charAt(0);
					if(reply5=='N'){
						b2=false;
					}
					if(reply5=='Y'){
						b2=true;
					}
				}
				System.out.println(Arrays.toString(phone_number));
				System.out.println(Arrays.toString(size));
				System.out.println(Arrays.toString(qty));
				System.out.println(Arrays.toString(amount));
				}while(b2);	

				break;
				
			case 2:
				b1=false;
				boolean b3=false;
				boolean matches=false;
				L2:do{
					clearConsole();
					System.out.print("   _____                     _        _____          _                            \r\n  / ____|                   | |      / ____|        | |                           \r\n | (___   ___  __ _ _ __ ___| |__   | |    _   _ ___| |_ ___  _ __ ___   ___ _ __ \r\n  \\___ \\ / _ \\/ _` | \'__/ __| \'_ \\  | |   | | | / __| __/ _ \\| \'_ ` _ \\ / _ \\ \'__|\r\n  ____) |  __/ (_| | | | (__| | | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |   \r\n |_____/ \\___|\\__,_|_|  \\___|_| |_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|   \r\n __________________________________________________________________________________ ");
					System.out.println("\n");
					System.out.print("Enter Customer Phone Number : ");
					String reply6 = input.next();
					System.out.println("\n\n");

					int qty3[]=new int[0];
					String size3[]=new String[0];
					double amount3[] =new double[0];
					
					for(int i=0;i<phone_number.length;i++){
						if(reply6.equals(phone_number[i])){
							int temp_qty3[]=new int[qty3.length+1];
							String temp_size3[]=new String[size3.length+1];
							double temp_amount3[]=new double[amount3.length+1];
							for(int j=0;j<qty3.length;j++){
								temp_qty3[j]=qty3[j];
								temp_size3[j]=size3[j];
								temp_amount3[j]=amount3[j];
							}
							matches=true;
							temp_qty3[qty3.length]=qty[i];
							temp_size3[qty3.length]=size[i];
							temp_amount3[qty3.length]=amount[i];
							qty3=temp_qty3;
							size3=temp_size3;
							amount3=temp_amount3;
						}
					}
					if(matches){
						System.out.println("+---------------------------------------------------------------------------------+");
						System.out.println("|      Size          |         QTY            |             Amount                |");
						System.out.println("+---------------------------------------------------------------------------------+");
					
						sort(size3,qty3,amount3);
						double total=0.0;
						for(int m=0;m<amount.length;m++){
							total=total+amount3[m];
						}
						System.out.println("+---------------------------------------------------------------------------------+");
						System.out.println("|          Total Amount                       |        "+total+"              |");
						System.out.println("+---------------------------------------------------------------------------------+");
						
					}
					if(!matches){
						System.out.println("\n\n   	Invalid ID . . .");
					}
										
					System.out.print("\n\nDo you want to search another customer report? (Y/N) ");
					char reply7=input.next().charAt(0);
					if(reply7=='N'){
						b1=true;
						break L1;
					}else{
						b3=true;
					}
				
				}while(b3);
				break;
				
			case 3:
				b1=false;
				boolean b4=false;
				boolean matches2=false;
				
				do{
					clearConsole();
					System.out.print(" \r\n   _____                     _        ____          _           \r\n  / ____|                   | |      / __ \\        | |          \r\n | (___   ___  __ _ _ __ ___| |__   | |  | |_ __ __| | ___ _ __ \r\n  \\___ \\ / _ \\/ _` | \'__/ __| \'_ \\  | |  | | \'__/ _` |/ _ \\ \'__|\r\n  ____) |  __/ (_| | | | (__| | | | | |__| | | | (_| |  __/ |   \r\n |_____/ \\___|\\__,_|_|  \\___|_| |_|  \\____/|_|  \\__,_|\\___|_|   \r\n ______________________________________________________________                                                               \r\n                                                                \r\n");
					System.out.print("Enter Order ID : ");
					String reply8 = input.next();
					for(int i=0;i<order.length;i++){
						if(reply8.equals(order[i])){
							matches2=true;
							System.out.println("Phone Number   :"+phone_number[i]+"\nSize           :"+size[i]+"\nQuantity       :"+qty[i]+"\nAmount         :"+amount[i]);
						}
					}
				
					if(!matches2){
						System.out.println("\n\n   	Invalid ID . . .");
					}
				
					System.out.print("\n\n Do you want to search another order? (Y/N) ");
					char reply9=input.next().charAt(0);
					if(reply9=='N'){
						b1=true;
						break L1;
					}else{
						b4=true;
					}
				
				}while(b4);
				
				break;
				
			case 4:
				b1=false;
				System.out.print("");
				break;
				
			case 5:
				b1=false;
				System.out.print("");
				break;
				
			case 6:
			b1=false;
				boolean b6=false;
				boolean matches3=false;
				
				do{
					String temp_order6[]=new String[order.length-1];
					String temp_phone_number6[]=new String[phone_number.length-1];
					String temp_size6[] = new String[size.length-1];
					int temp_qty6[] = new int[qty.length-1];
					double temp_amount6[] = new double[amount.length-1];					
					
					clearConsole();
					System.out.print("   _____       _      _          ____          _           \r\n |  __ \\     | |    | |        / __ \\        | |          \r\n | |  | | ___| | ___| |_ ___  | |  | |_ __ __| | ___ _ __ \r\n | |  | |/ _ \\ |/ _ \\ __/ _ \\ | |  | | \'__/ _` |/ _ \\ \'__|\r\n | |__| |  __/ |  __/ ||  __/ | |__| | | | (_| |  __/ |   \r\n |_____/ \\___|_|\\___|\\__\\___|  \\____/|_|  \\__,_|\\___|_|   \r\n ________________________________________________________  \r\n");
					System.out.print("Enter Order ID : ");
					String reply11 = input.next();
					for(int i=0;i<order.length;i++){
						if(reply11.equals(order[i])){
							matches3=true;
							System.out.println("Phone Number   :"+phone_number[i]+"\nSize           :"+size[i]+"\nQuantity       :"+qty[i]+"\nAmount         :"+amount[i]+"\nOrder State    :"+orderState[i]);
							System.out.println("\nDo you want to delete this order ?(Y/N) : ");
							char reply12=input.next().charAt(0);
							if(reply12=='N'){
								b1=true;
								break L1;
							}else if(reply12=='Y'){
								for(int j=0,k=0;j<qty.length;j++){
									if(i==j){
										continue;
									}else{
										temp_order6[k]=order[j];
										temp_phone_number6[k]=phone_number[j];
										temp_size6[k]=size[j];
										temp_qty6[k]=qty[j];
										temp_amount6[k]=amount[j];
										k++;
									}
									b6=true;
								}
							}
						}
					}
					
					order=temp_order6;
					phone_number=temp_phone_number6;
					size=temp_size6;
					qty=temp_qty6;
					amount=temp_amount6;
				
					if(!matches3){
						System.out.println("\n\n   	Invalid ID . . .");
					}
				
					System.out.print("\n\n Do you want to delete another order? (Y/N) ");
					char reply12=input.next().charAt(0);
					if(reply12=='N'){
						b1=true;
						break L1;
					}else{
						b6=true;
					}
				
				}while(b6);
				
			default:	
				break L1;
		}
		
	}while(b1);
	}
	
}






 
