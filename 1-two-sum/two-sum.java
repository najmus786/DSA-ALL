class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int aux[]=Arrays.copyOf(numbers,numbers.length);
        Arrays.sort(numbers);
        int i=0;
        int j=numbers.length-1;
        int n1=0,n2=0;
        int ans[]=new int [2];
        while(i<j){
            if((numbers[i]+numbers[j])==target){
                n1=numbers[i];
                n2=numbers[j];
                break;
            }
            else if((numbers[i]+numbers[j])>target){
                j--;
            }
            else if(numbers[i]+numbers[j]<target){
                i++;
            }
        }
        int m=-1;
        int n=-1;
        for(int k=0;k<aux.length;k++){
            if(m==-1 && aux[k]==n1){
                m=k;
            }
            else if(n==-1 && aux[k]==n2){
                n=k;
            }
        }
        return new int []{m,n};
    }
}