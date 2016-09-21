# findMissingBitInteger
Given int 0~n, there is only one number missing, find it in O(n) Time

You could only access the jth bit of A[i], which takes constant time

If they are integers, not bit integers, we could sum them up, int v=n(n+1)/2-sum


We could use the same method, add all bit *2^j, the length of bitInteger is lgn, there are n numbers, so it takes O(nlgn)

We could count the 0s, and 1s at the least significant position

if count(0s)<=count(1s), the missing one v's least significant is 0

if count(1s)<=count(0s), the missing one v's least significant is 1

in this way, each step, we could cut half of these numbers, lgn*lgn, it takes O(n) Time, We could use recursion to implement it

