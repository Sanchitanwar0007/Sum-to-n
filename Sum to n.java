
import java.util.HashMap;
import java.util.Scanner;


public class SumOfN {
   
    public static int[] sum(int nums[],int target){
        int size= nums.length;
        int indices[]={0,0};
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        
        for(int i=0;i<size;i++){
            int number = nums[i];
            int total= target-nums[i];
            if(map.containsKey(total)){
                int in= map.get(total);
                indices[0]=in;
                indices[1]=i;
                break;
            }
         map.put(nums[i],i);
            
        }
        for(int i=0;i<indices.length;i++){
        System.out.println(indices[i]);
        }
        return indices;
    }
    
   
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in); //Scanner class for  user input
        int n= scan.nextInt(); // Enter no. of elements in an array
        int[] nums= new int[n];
        
        for(int i=0;i<n;i++){
            nums[i]=scan.nextInt(); // Enter elements of an array one by one
        }
        int target=  scan.nextInt();
        sum(nums, target);
       
    }
         }
