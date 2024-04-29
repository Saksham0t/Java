package Class_612;
public class Freq_In_Array {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,1,1,5,2,3};
        int length = arr.length;
        int []fr = new int[length];
        int visit = -1;
        for(int i=0; i<length; i++){
            int count = 1;
            for(int j=i+1; j<length; j++){
                if(arr[i]==arr[j]){
                    count++;
                    fr[j]= visit;
                }
            }
            if(fr[i] != visit){
                fr[i]=count;
            }
        }
        for(int i=0; i<length; i++){
            if(fr[i] != visit){
                System.out.println("num:"+arr[i]);
                System.out.println("frequency:"+fr[i]);
            }
        }

    }
}
