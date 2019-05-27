 public static int maxValue(int[] weight, int[] value, int capacity) {
        int weightLen = weight.length;
        int valueLen = capacity + 1;//列值长度加1，是因为最后一列要保证重量值为lenColumn
        int maxValue = 0;
        int[][] v = new int[weightLen][valueLen];
        for (int i = 0; i < weightLen; i++) {
            for (int j = 0; j < valueLen; j++) {
                if (i == 0) {
                    v[i][j] = 0;
                } else if (j == 0) {
                    v[i][j] = 0;
                } else {
                    if (weight[i] > j) {
                        v[i][j] = v[i - 1][j];
 
                    } else if (weight[i] <= j) {
                        v[i][j] = Math.max(v[i - 1][j], v[i - 1][j - weight[i]] + value[i]);
                    }
                    maxValue = v[i][j];
                }
 
            }
 
        }
        return maxValue;
    }
