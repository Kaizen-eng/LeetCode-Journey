
class Solution:

    def maxHeightOfTriangle(self, red: int, blue: int) -> int:

        def calculate_height(red, blue, use_red):

            balls_needed = 1
            count = 0

            while True:

                if use_red:

                    if red < balls_needed:
                        break

                    red -= balls_needed

                else:

                    if blue < balls_needed:
                        break

                    blue -= balls_needed

                balls_needed += 1
                use_red = not use_red
                count += 1

            return count

        first = calculate_height(red, blue, True)
        second = calculate_height(red, blue, False)

        return max(first, second)
