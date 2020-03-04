package day2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 记票统计 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Map<String,Integer> map=new HashMap<>();
        while(in.hasNext()) {
            int candidate_num = in.nextInt();//候选人数量
            String[] candidate_name = new String[candidate_num];
            for (int i = 0; i < candidate_num; i++) {
                candidate_name[i] = in.next();
            }//候选人姓名
            int vote_num = in.nextInt();//投票人数
            String[] vote_name = new String[vote_num];
            for (int i = 0; i < vote_num; i++) {
                vote_name[i] = in.next();
            }//投票
            int sum=0;
            for (int i = 0; i < candidate_num; i++) {
                int count=0;
                for(int j=0;j<vote_num;j++){
                    if(vote_name[j].equals(candidate_name[i])){
                        count++;
                    }
                }
                sum+=count;
                map.put(candidate_name[i],count);
            }
            for(Map.Entry<String,Integer> e:map.entrySet()){
                System.out.println(e.getKey()+":"+e.getValue());
            }
            System.out.println("Invalid"+":"+(vote_num-sum));
        }
    }
}
