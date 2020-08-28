import java.util.Scanner;


public class Code15 {
    public static void main(String[] args) {
        
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int[] data=new int[n];

        for(int i=0;i<n;i++){
           // 입력한 값을 일단 가지고 있는다. 
           int tmp=kb.nextInt();
           // 현재 위치의 인덱스 
           // ex. i=1, j=0 즉, 비교인덱스 = 현재 인덱스 -1
           int j = i-1; 
           // 입력한 값이 배열의 최근 값 보다 작으면 
           while(j>=0 && data[j]>tmp){
               data[j+1]=data[j]; // data[j]를 한칸씩 뒤로보냄
               j--;
           }
           data[j+1]=tmp;

           for(int k=0;k<=i;k++){
               System.out.print(data[k]+" ");
           }
           System.out.println();
        }
        kb.close();

        
    }
}