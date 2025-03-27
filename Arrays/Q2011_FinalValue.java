package Arrays;

public class Q2011_FinalValue {
    public static void main(String[] args) {
        String[] arr = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(arr));

    }
//    public static int finalValueAfterOperations(String[] operations){
//        int val = 0;
//        for(int i = 0; i<operations.length; i++){
//            switch (operations[i]){
//                case "--X":
//                    --val;
//                    break;
//                case "X--":
//                    val--;
//                    break;
//                case "++X":
//                    ++val;
//                    break;
//                case "X++":
//                    val++;
//                    break;
//                default:
//                    break;
//            }
//        }
//        return val;
//    }

    public static int finalValueAfterOperations(String[] operations) {
        return calculate(operations, 0, 0);
    }
    public static int calculate(String[] operations, int index, int val) {
        if (index == operations.length) {
            return val;
        }
        switch (operations[index]) {
            case "--X":
                --val;
                break;
            case "X--":
                val--;
                break;
            case "++X":
                ++val;
                break;
            case "X++":
                val++;
                break;
            default:
                break;
        }
        return calculate(operations, index + 1, val);
    }
}
