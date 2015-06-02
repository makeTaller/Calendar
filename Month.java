import java.util.ArrayList;


public class Month {
	String name;
	String[] monthName={"January","Febuary","March","April","May","June","July","August", "September", "October","November","December"};
	String[] week={"su ","mo ","tu ","we ","th ","fr ","sa "};
	private static int[] numDays={31,28,30,31,30,31,31,30,30,31,30,31};  
	private int last; private int first;
	int[][] dayCount= new int [5][7];
	ArrayList<Month> Cal= new ArrayList<Month>();
	
	
	public Month(String name, int[] numDays){
		this.name= name; this.numDays[]= numDays[]; 
		
			System.out.println("Welcome to a 2015 Calendar\n");
	}
	//calAlg equals the last position in the week of the previous month.
	//Fills the month to the number of numDays at the correct start day.
	public static Month calAlg(Month mnth){
		
		int i=0; int j=0; 
		
		//name equals the iteration of monthName[];
		for ( i=0; i<monthName.length; i++){
			for(j=0;j<numDays.length;j++)
		}
			name=monthName[i];
			
			if (name=="January"){
		
		//last equals the number of numDays in the previous month starting with the first
		//definite position in January
		for(i=0; i<5;i++)
			for(j=0; j<7; j++){
				dayCount[i][j]=numDays;
				numDays++;
				if (dayCount[0][4]==3){
					
					first=dayCount[0][4];
					
					for(i=0; i<5;i++)
						for(j=0; j<1; j++){
							if (j==1) j=7;
							dayCount[i][j]=numDays[0];
							numDays++;
							if(numDays[i]==31)
								last = first;
							break;
				}
		}//end for
		
		for(i=0; i<5; i++){
			for(j=0; j<7; j++)
				if(numDays==last){
					last = first;
				}
				System.out.print(dayCount[i][j]+ " ");
				System.out.println();
				}//end
			}//end if January if 
		}//end monthName for loop
		return mnth;
		
	}//end method
	public void setMonth(){
		int k=0;
		int i=0;
		int j=0;
		
		for(String we: week){

			System.out.print(we + " ");
		}
		System.out.println();
		
		for(i=0; i<5;i++)
			for(j=0; j<7; j++){
				dayCount[i][j]=k+calAlg;
			k++;
		}
		
		for(i=0; i<5; i++){
			for(j=0; j<7; j++)
				if(dayCount[i][j]==last){
					last = first;
				}
				System.out.print(dayCount[i][j]+ " ");
				System.out.println();
			}
		
		
	}
	
	public static void main(String args[]){
		Month Jan= new Month("January",31);
		Month Feb= new Month("Febuary",28);
		Month Mar= new Month("March",30);
		Jan.calAlg(Jan);

	}
}
