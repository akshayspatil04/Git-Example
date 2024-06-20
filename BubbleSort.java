import java.util.Arrays;
public class BubbleSort{

public static void main(String[] args){

int[] a = {4,7,2,3,1,5,6};
int n = a.length-1;

for(int i=0; i<n; i++){
    for(int j=0; j<n; j++){
        if(a[j]>a[j+1]){
            int temp = a[j];
            a[j] = a[j+1];
            a[j+1] = temp;
        }
    }
}
 System.out.println(Arrays.toString(a));
}
}