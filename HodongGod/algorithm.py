
""" 손해
N, M, P, C = eval(input())
print((P + N) - (M))
"""

""" 사탕
pay, marco = eval(input())
marco = 10 ** marco
print(round((pay / marco)) * marco)
"""

""" 화장실
import math
count_of = eval(input())
MAX = math.ceil((count_of / 2.0))
MIN = math.ceil((count_of / 3.0))
print(MAX, MIN)
"""
import math
computer, printer, router = eval(input())
electric = computer * 2.5 + printer * 2.0 + router * 0.5
fuse = math.ceil(electric / 5) * 10
print(fuse, "amperes")