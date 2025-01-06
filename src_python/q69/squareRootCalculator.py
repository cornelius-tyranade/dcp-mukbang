class Solution:

    def mySqrt(self, x: int) -> int:
        l, r = 0, x
        res = 0;

        while l <= r:
            m = l + ((r - l) // 2)
            val = m ** 2;

            if val > x:
                r = m - 1
            elif val < x:
                l = m + 1
                res = m
            else:
                return m

        return res

    def mySqrt_2(self, x: int) -> int:
        for i in range(x + 1):
            if i * i == x:
                return i
            elif i * i > x:
                return i - 1

obj = Solution()
print(obj.mySqrt(4))
print(obj.mySqrt(8))
print(obj.mySqrt_2(4))
print(obj.mySqrt_2(8))

