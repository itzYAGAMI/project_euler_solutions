# /*
#  * Solution to Project Euler problem 3
#  * Copyright (c) Project of Tommy_fking_Shelby. All rights reserved.
#  * Euler link - https://projecteuler.net/problem=3
#  */
n = 600851475143
i = 2
while i * i < n:
    while n % i == 0:
        n = n / i
    i = i + 1

print(n)
