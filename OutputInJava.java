class Pattern
{
    public static void printNums(int n) 
    { 
        int i, j,num; 
    
        for(i=1; i<=n; i++) 
        { 
            num=1; 
            for(j=1; j<=n-i+1; j++)
            { 
                
                System.out.print(num+ " "); 
    
                num++; 
            } 
            
            System.out.println(); 
        } 
    } 
       public static void main(String args[]) 
    { 
        int n = 5; 
        printNums(n); 
    } 
}