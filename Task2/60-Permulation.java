public class Solution {
public String getPermutation(int n, int k) {
    int pos = 0;
    List<Integer> numbers = new ArrayList<>();
    int[] factorial = new int[n+1];
    StringBuilder sb = new StringBuilder();
    
    // create an array of factorial lookup
    int sum = 1;
    factorial[0] = 1;
    for(int i=1; i<=n; i++){
        sum *= i;
        factorial[i] = sum;
    }
    // factorial[] = {1, 1, 2, 6, 24, ... n!}
    
    // create a list of numbers to get indices
    for(int i=1; i<=n; i++){
        numbers.add(i);
    }
    // numbers = {1, 2, 3, 4}
    
    k--;
    
    for(int i = 1; i <= n; i++){
        int index = k/factorial[n-i];
        sb.append(String.valueOf(numbers.get(index)));
        numbers.remove(index);
        k-=index*factorial[n-i];
    }
    
    return String.valueOf(sb);
}
///////////////////////iterative method/////////////////////
class Solution {
    public String getPermutation(int n, int k) {
        int[] array = new int[n];
        for(int i = 1; i <= n; i++) array[i - 1] = i;
        for(int i = 1; i < k; i++){
            int a = -1;
            for(int j = n - 1; j >= 1; j--){
                if(array[j] > array[j - 1]){
                    a = j - 1;
                    break;
                }
            }
            int b;
            for(b = n - 1; b >= a; b--){
                if(array[b] > array[a]){
                    int temp = array[b];
                    array[b] = array[a];
                    array[a] = temp;
                    break;
                }
            }
            for(int j = 1; j <= (n - a) / 2; j++){
                int temp = array[a + j];
                array[a + j] = array[n - j];
                array[n - j] = temp;   
            }
        }
        String res = "";
        for(int i : array){
            res += i;
        }
        return res;
    }
}