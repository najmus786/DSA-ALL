class Solution {
    int thirdLargest(int arr[]) {
        // Your code here
        int first=-1;
        int second=-1;
        int third=-1;
        for(int a:arr){
            if(a>first){
                third=second;
                second=first;
                first=a;
            }else if(a>second && a<=first){
                third=second;
                second=a;
            }else if(a>third && a<=second && a<=first){
                third=a;
            }
        }
        return third;
    }
}