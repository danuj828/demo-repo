class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(arr);
        
        for(int i = 0; i<arr.length-2; i++){
            if(i==0 || (i>0 && arr[i] != arr[i-1])){
                int low = i+1;
                int high = arr.length-1;
                int sum = 0-arr[i];
                while(low < high){
                    if(arr[low] + arr[high] == sum){
                        list.add(Arrays.asList(arr[i], arr[low], arr[high]));
                    
                    while(low < high && arr[low] == arr[low+1]) low++;
                    while(low < high && arr[high] == arr[high-1]) high--;
                    low++;
                    high--;
                } else if(arr[low] + arr[high] < sum){
                    low++;
                } else {
                    high--;
                    }
                }
            }
        }
        return list;
    }
}