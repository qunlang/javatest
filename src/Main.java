import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int number = 10000;
        int[] num10= new int[10];
        int[] num = new int[number];
        for(int i = 0; i< number; i++){
            num[i]= (int)(Math.random()*number);
        }
        for(int i =0; i<10; i++){
            num10[i]=num[i];
        }
        Arrays.sort(num10);

        for(int i= 0; i<number; i++){
            if(num10[9]<num[i]){
                if(num10[0]<num[i]){
                    num10[0]=num[i];
                    break;
                }else if(num10[5]<num[i]){
                    if(num10[2]<num[i]){
                        if(num10[1]<num[i]){
                            num10[1]=num[i];
                            break;
                        }else {
                            num10[2]=num[i];
                            break;
                        }
                    }else if(num10[4]<num[i]){
                        if (num10[3]<num[i]){
                            num10[3]=num[i];
                            break;
                        }else {
                            num10[4]=num[i];
                            break;
                        }
                    }
                }else if(num10[5]>num[i]){
                    if(num10[7]<num[i]){
                        if (num10[6]<num[i]){
                            num10[6]=num[i];
                            break;
                        }else {
                            num10[7]=num[i];
                            break;
                        }
                    }else{
                        num10[8]=num[i];
                        break;
                    }
                }else {
                    num10[0]=num[i];
                    break;
                }
            }else {
                break;
            }

        }
        for(int i=0; i<10; i++) {
            System.out.println(num10[i]);
        }
    }

}
