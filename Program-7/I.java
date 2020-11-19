import java.util.Scanner;
class I
{
	private static Scanner fs = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number of nodes");
		int n = fs.nextInt();
		int arr[][] = new int[n][n];
		System.out.println("Enter the 1 if edge present and 0 if not present");
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<n ;j++) {

				arr[i][j] = fs.nextInt();
				
			}
		}

		int src = 0;
		int [] dist = new int[n];
		for(int i=0;i<n;i++) dist[i] = Integer.MAX_VALUE;
		dist[src] =0;

		for(int i=1;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i][j] ==1)
				{
					if(dist[j] !=Integer.MAX_VALUE && dist[j]+1<dist[i])
					{
						dist[i] = dist[j] +1;
					}
				}
			}
		}
		System.out.println("Vertex Distance from Source"); 
		System.err.println("Here A is the Source ");
        for (int i = 0; i < n; ++i) 
        System.out.println((char)('A' + i) + "\t\t" + dist[i]);


		
	}
}