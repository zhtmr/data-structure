public class TaskSet1 {
    public static void main(String[] args) {
        
        int count=0;
        for(int n = 2; n<=100000; n++){
           
            for(int i=2; i*i<=n; i++){
                if(i%2==0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}