public class BobSort {
    
    private int[] array;
    private int length;
    
    public BobSort(int[] array){
        this.array = array;
        this.length = array.length;
    }
    
    public void display(){
        for(int i : array){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public void bobSort(){
        for(int i=0;i<length-1;i++){//排序轮数
            for(int j=0;j<length-1-i;j++){//比较次数
                if(array[j]>array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    
    /**
     * 测试方法
     * @param args
     */
    public static void main(String[] args){
        int[] array = {77,29,28,36,33,25,10};
        BobSort bobSort = new BobSort(array);
        System.out.println("排序前的数据为：");
        bobSort.display();
        bobSort.bobSort();
        System.out.println("排序后的数据为：");
        bobSort.display();
    }
}