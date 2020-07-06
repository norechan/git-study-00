import java.util.Scanner;

public class study3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] param = input.split(" ");
        int sum = calc(param,0,param.length - 1) ;
        System.out.println(sum);
    }

    public static int calc(String[] param, int startIdx, int endIdx){
        int sum = 0 ;
        String type = null ;
        for(int idx = startIdx ; idx < endIdx + 1 ; idx ++){
            if(param[idx].equals("+") || param[idx].equals("-")){
                type = param[idx] ;
            }else if(param[idx].equals("(")){
                int endOfFormula = checkEnd(param,idx) ;
                if(type != null){
                    if(type.equals("+")){
                       sum = sum + calc(param, idx + 1 , endOfFormula - 1);
                    }else if(type.equals("-")){
                       sum = sum - calc(param, idx + 1 , endOfFormula - 1);
                    }
                }else{
                    sum = calc(param, idx + 1 , endOfFormula - 1) ;
                }
                idx = endOfFormula ;
            }else{
                int num = Integer.parseInt(param[idx]);
                if(type != null){
                    if(type.equals("+")){
                        sum = sum + num;
                    }else if(type.equals("-")){
                        sum = sum - num;
                    }
                }else{
                    sum = num ;
                }
            }
        }
        return sum ;
    }

    public static int checkEnd(String[] param, int startIdx){
        int end = startIdx + 1;
        int startCount = 0 ;
        for(int idx = startIdx + 1 ; idx < param.length; idx ++){
            end = idx ;
            if(param[idx].equals("(")){
                startCount ++ ;
            }else if(param[idx].equals(")")){
                if(startCount == 0){
                    break ;
                }else{
                    startCount -- ;
                }
            }
        }
        return end ;
    }
}