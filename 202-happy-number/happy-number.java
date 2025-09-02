class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs=new HashSet<>();
        while(true){
            int sum=0;
            while(n!=0){
                int digit=n%10;
                sum+=Math.pow(digit,2.0);
                n/=10;
            }
            if(sum==1){
                return true;
            }
             n=sum;
            if(hs.contains(n)){
                return false;
            }
            hs.add(n);
        }
    }
}