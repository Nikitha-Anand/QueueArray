public class QueueArray {
    public static Integer[] Queue = new Integer[100];
    public static Integer HeadPointer = 0;
    public static Integer TailPointer = 0;

    public static Boolean Enqueue(Integer numb){
        if(TailPointer != 100){
            Queue[TailPointer] = numb;
            TailPointer = TailPointer + 1;
            return true;
        }else{
            return false;
        }
    }

    public static Integer IterativeOutput(Integer start){
        if(start < 0){
            return 0;
        }
        return Queue[start] + IterativeOutput(start - 1);
    }

    public static void main(String[] args){
        for (int i = 1; i < 21; i++) {
            if(Enqueue(i)){
                System.out.println("Successful");
            } else{
                System.out.println("Unsuccessful");
            }
        }
        System.out.println("\nTotal sum is " + IterativeOutput(TailPointer - 1));
    }

}
