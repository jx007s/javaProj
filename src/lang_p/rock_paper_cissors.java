package lang_p;

import java.util.Scanner;

public class rock_paper_cissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] arr = {"가위","바위","보"};
		String [][] res = {//user
				{"비김","패","승"},		//가위		
				{"승","비김","패"},		//바위
				{"패","승","비김"}			//보
		//com  //가위, 바위,  보
		};
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("가위 바위 보!!!!");
			String str="";
			for (int i = 0; i < arr.length; i++) {
				str+=i+". "+arr[i]+", ";
			}
			str+=arr.length+". 종료";
			System.out.println(str);
			System.out.print("입력:");
			int user = sc.nextInt();
			
			if(user ==arr.length)
				break;
			
			int com = (int)(Math.random()*arr.length);
	
			System.out.println("게이머:"+arr[user]);
			System.out.println("컴퓨터:"+arr[com]);
			System.out.println("결과:"+res[user][com]);
			
			
		}
		System.out.println("게임종료");
	}

}


