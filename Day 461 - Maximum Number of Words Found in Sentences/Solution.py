class Solution:

    def mostWordsFound(self, sentences: list[str]) -> int:
        
        max_words = 0

        for i in sentences:
            arr = i.split(" ")
            max_words = max(max_words, len(arr))

        return max_words
