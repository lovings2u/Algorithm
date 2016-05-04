#본체는 1.5
#모니터 1.0
#프린터 2.0
#라우터 0.5



import math

a=int(input("컴퓨터입력:"))
b=int(input("프린터입력:"))
c=int(input("라우터입력"))
sum=(a*2.5+b*2.0+c*0.5)
fuse=math.ceil(sum/5)*10
print(fuse)
