package loop;

public class Test09 {

	public static void main(String[] args) {

//		int num = 61;
//		
//		for(int i=2; i<=100; i++) {
//			boolean sosu = num/i == 1 || num/i==0;
//			if(sosu) {
//				System.out.println(num);
//			}
//		
//		}
		//System.out.println(num);
		
		
		  int count=0;

          for(int i=2; i<=100; i++) // 1은 소수가 아니므로 2부터 시작
          {
              for(int j=2; j<=i; j++)
              {
                   if(i%j ==0) 
                   {
                        count ++;
                   }    
              }
              
              // 소수는 1과 자기자신으로만 나눠지므로 자기자신으로 한번만 나눠질때 소수
              if(count==1)
              {
                   System.out.print(i+",");
              }
              count=0;
          }

	}

}
