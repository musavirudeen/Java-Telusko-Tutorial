public class prog17 {
    public static void main(String[] args){
        int[][] nums = new int[3][];    //Jagged Array
        nums[0]= new int[4];
        nums[1] = new int[2];
        nums[2]= new int[3];

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j]=(int)(Math.random()*10);
            }
        }
        for(int[] n:nums){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
    
}
