public class Test0084StaticAndGlobalVariablesInRecursion {
    public static int fun(int n) {
        if (n > 0) {
            return fun(n - 1) + n;
        }
        return 0; 
    }

    public static void main(String[] args) {
        int a = 5;
        int result = fun(a);
        System.out.println("The sum from 1 to " + a+ " is: " + result);
    }
}