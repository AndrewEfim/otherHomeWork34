public class Main4 {

    
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 7, 6, 5, 7, 3, 7, 20};
        int[] a2 = new int[a.length]; //для запиcи чисел
        int[] a3 = new int[a.length]; // для записи повторений
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    a2[i] = a[i];
                    a3[i]++;
                }
            }
        }
            for (int i = 0; i < a.length; i++) {
                if (a2[i] == a[i]) {
                    a3[i]++;
                }
            }
                for (int i = 0; i < a.length-1; i++){
                    if (a2[i] != 0) {
                        System.out.printf("%s%d%s-%s %d\n", "[", a2[i], "]", "повторений", a3[i]);
                    }
                }
            }
}