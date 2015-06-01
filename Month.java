import java.util.ArrayList;


public class Month {
	String name;
	String[] monthName={"January","Febuary","March","April","May","June","July","August", "September", "October","November","December"};
	String[] week={"su ","mo ","tu ","we ","th ","fr ","sa "};
	int numDays; static int startDay; int last;
	int[][] dayCount= new int [5][7];
	ArrayList<Month> Cal= new ArrayList<Month>();
	
	
	public Month(String name, int numDays,int last, int startDay){
		this.name= name; this.numDays= numDays; this.last=last; this.startDay=startDay;
		int i=0; int j=0; 
		//name equals the iteration of monthName[];
		for ( i=0; i<monthName.length; i++){
			name=monthName[i];
		}
		//last equals the number of numDays in the previous month starting with the first
		//definite position in January
		for(i=0; i<5;i++)
			for(j=0; j<7; j++){
				dayCount[i][j]=numDays+startDay;
				numDays++;
		}
		
		for(i=0; i<5; i++){
			for(j=0; j<7; j++)
				if(numDays==last){
					last = startDay;
				}
				System.out.print(dayCount[i][j]+ " ");
				System.out.println();
			}
		
	
		
		//startDay equals the last position in the week of the previous month.
		
		System.out.println("Welcome to a 2015 Calendar\n");
	}
	
	//Fills the month to the number of numDays at the correct start day.
	
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
				dayCount[i][j]=k+startDay;
			k++;
		}
		
		for(i=0; i<5; i++){
			for(j=0; j<7; j++)
				if(dayCount[i][j]==last){
					last = startDay;
				}
				System.out.print(dayCount[i][j]+ " ");
				System.out.println();
			}
		
		
	}
	
	public static void main(String args[]){
		Month Jan= new Month("January",31,31,4);
		Month Feb= new Month("Febuary",startDay,last,startDay);
		Month Mar= new Month("March",startDay,last,startDay);
		Jan.setMonth(31);

	}
}
