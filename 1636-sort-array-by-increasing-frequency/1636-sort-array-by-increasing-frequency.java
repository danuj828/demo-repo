class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        return Arrays.stream(nums).boxed().sorted((a, b) -> map.get(a) != map.get(b) ? map.get(a) - map.get(b) : b-a).mapToInt(n -> n).toArray();
    }
}

//.stream() :-- iterate through the array.

//.boxed() :-- converts each int to Integer object, this is because .sorted() can only operate on objects.

//.sorted((a,b) -> map.get(a) != map.get(b) ? map.get(a) - map.get(b) : b - a) :-- if frequency of two numbers are not the same, sort by ascending frequency. If frequencies are the same, sort by decending numeric value.

//.mapToInt(n -> n) :-- converts Integer to int.

//.toArray() :-- return arrays.