class Solution {
    public int numberOfSteps(int num) {
        if(num==0||num==1){
           return num;
        }
        int count=0;
        while(num>0){
        if(num%2==0){
          num=num/2;  
        }
        else{
            num=num-1;
        }
        count++;
    }
    return count;
    }
}