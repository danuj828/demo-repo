//{ Driver Code Starts
import java.util.*;


class Check_IsToepliz
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T =  sc.nextInt();
		while(T>0)
		{
			int N = sc.nextInt();
			int M = sc.nextInt();
			int arr[][] = new int[N][M];
			for(int i=0; i<N; i++)
			{
				for(int j=0; j<M; j++)
				arr[i][j] = sc.nextInt();
			}
			
			GfG g = new GfG();
			boolean b = g.isToepliz(arr,N,M);
			if(b == true)
				System.out.println(1);
			else
				System.out.println(0);
			
		T--;
		}
	}
}
// } Driver Code Ends


class GfG
{
    /*You are required to complete this method*/
    boolean isToepliz(int matrix[][], int n, int m)
    {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                int key = i-j;
                if(map.containsKey(key)){
                    if(map.get(key) != matrix[i][j]){
                        return false;
                    }
                } else {
                    map.put(i-j, matrix[i][j]);
                }
            }
        }
        return true;
    }
}