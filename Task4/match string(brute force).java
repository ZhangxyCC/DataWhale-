int strStr(string haystack, string needle) {
    if (needle.empty()) return 0;
    int m = haystack.size(), n = needle.size();
    for (int i = 0; i <= m - n; i++) {
        for (int j = 0; j < n; j++) {
            if (needle[j] != haystack[i + j])
                break;
            if (j == n - 1)
                return i;
        }
    }
    return -1;
}