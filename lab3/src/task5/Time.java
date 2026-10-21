package task5;



public class Time implements Comparable <Time>{
		int hour;
		int minute;
		int second;
		public Time(int hour,int minute,int second) {
			if(validInput(hour,minute,second)) {
				this.hour=hour;
				this.minute=minute;
				this.second=second;
			}
			else {
				System.out.println("Invalid input");
			}
		}
		public boolean validInput(int hour,int minute,int second) {
			return (hour>=0 && hour<=24)&&(minute>=0 && minute<=60)&&(second>=0 && second<=60);
			
		}
		public String universalFormat() {
			return String.format("%02d:%02d:%02d",hour,minute,second);
		}
		public String standardFormat() {
			String period=(hour<12)?"AM" : "PM";
			int standardHour=(hour==0||hour==12)?12:hour%12;
			return String.format("%02d:%02d:%02d%s", standardHour,minute,second,period);
		}
		
		public Time addTime(Time otherTime) {
			int newHour=this.hour+otherTime.hour;
			int newMinute=this.minute+otherTime.minute;
			int newSecond=this.second+otherTime.second;
			if(newSecond>=60) {
				newSecond-=60;
				newMinute+=1;
				
			}
			if(newMinute>=60) {
				newMinute-=60;
				newHour+=1;
			}
			if(newHour>=24) {
				newHour-=24;
			}
			return new Time(newHour,newMinute,newSecond);
			
		}
		@Override
		public int compareTo(Time o) {
			// TODO Auto-generated method stub
			
			Time t=(Time)o;
		
			if(this.hour!=t.hour) {
				if(this.hour>t.hour) {
					return 1;
				}
				if(this.hour<t.hour) {
					return -1;
				}
			}
			else if (this.minute!=t.minute) {
				if(this.minute>t.minute) {
					return 1;
				}
				if(this.minute<t.minute) {
					return -1;
				}
			}
			else {
				if(this.second>t.second) {
					return 1;
				}
				if(this.second<t.second) {
					return -1;
				}
			}
			return 0;

		}
		public String toString(){
			return hour+":"+minute+":"+second;
		}
		
}
