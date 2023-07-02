public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts={
            {2,8,17},
            {7,4,1,13},
            {1,9,15},
            {2,11,9,15}
        };
        System.out.println(maxWealth(accounts));

    }
    static int maxWealth(int[][] accounts){
        int wealth=0;
        for(int prsn=0;prsn<accounts.length;prsn++){
            if(wealth<sum(accounts[prsn])){
                wealth=sum(accounts[prsn]);
            }
        }
        return wealth;
    }
    static int sum(int[] arr){
        int sum=0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
