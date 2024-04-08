public class Solution {
    public String reverseWords(String s) {
        char[] letters = s.toCharArray();
        int i = 0, j = 0;
        while (i < letters.length) {
            j = findSpace(i, letters);
            reverse(i, j, letters);
            i = j + 2; 
        }
        return new String(letters);
    }

    public int findSpace(int i, char[] arr) {
        while (i < arr.length && arr[i] != ' ') {
            i++;
        }
        return i - 1; 
    }

    public void reverse(int i, int j, char[] arr) {
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
