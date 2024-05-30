package basics;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start=System.currentTimeMillis();
		long count=0L;
		
		while(true) {
			count++;
			if(count%37==0) {
				if(count%111==0) {
					System.out.println(count+" ");
					}
			}
			
			if(count==1E4)break;
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start+" ms");
	}

}
