
### `Solution.java`

```java
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] frequency = new int[1001];

        for (int num : target) {
            frequency[num]++;
        }

        for (int num : arr) {
            frequency[num]--;
        }

        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
