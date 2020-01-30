public class Main {
    public static void main(String[] args) {
        boolean[] openLocker = new boolean[100];

        for (int i = 1; i <= openLocker.length; i++) {
            for (int j = i; j <= openLocker.length; j += i) {
                if (openLocker[j - 1]) {
                    openLocker[j - 1] = false;
                }
                else {
                    openLocker[j - 1] = true;
                }
            }
        }

        for (int i = 0; i < openLocker.length; i++) {
            if (openLocker[i] == true) {
                System.out.println("Locker " + (i + 1) + " is open.");
            }
        }
    }
}
