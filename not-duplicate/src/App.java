public class App {
    public static void main(String[] args) throws Exception {
        String[] firstArray = new String[] { "Morango", "Uva", "Acerola", "Manga" };
        String[] secondArray = new String[] { "Pêra", "Caju", "Morango", "Manga" };

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {
                    System.out.println(firstArray[i]);
                    return;
                }
            }
        }
    }
}
