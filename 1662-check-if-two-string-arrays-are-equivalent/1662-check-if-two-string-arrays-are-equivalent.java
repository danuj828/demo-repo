class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        return(String.join("", word1).equals(String.join("", word2)));
        
        
//         int arrindex1=0, arrindex2=0;
//         int id1=0, id2=0;
        
//         while(arrindex1<word1.length && arrindex2<word2.length){
//             if(word1[arrindex1].charAt(id1) != word2[arrindex2].charAt(id2)){
//                 return false;
//             }
//             id1++;
//             id2++;
//             if(id1==word1[arrindex1].length()){
//                 id1=0;
//                 arrindex1++;
//             }
//             if(id2==word2[arrindex2].length()){
//                 id2=0;
//                 arrindex2++;
//             }
//         }
//         return arrindex1==word1.length && arrindex2==word2.length;
    }   
}