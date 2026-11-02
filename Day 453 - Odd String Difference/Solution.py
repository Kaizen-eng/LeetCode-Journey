class Solution:
    def oddString(self, words: List[str]) -> str:
        patterns = {}

        for word in words:
            diff = tuple(
                ord(word[i + 1]) - ord(word[i])
                for i in range(len(word) - 1)
            )

            patterns.setdefault(diff, []).append(word)

        for group in patterns.values():
            if len(group) == 1:
                return group[0]
