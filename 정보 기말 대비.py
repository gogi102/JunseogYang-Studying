# def = 함수 정의
# array = 배열
# .py = 파이썬 확장자
# 논리연산자 !=, and , or <=, not
abc = '1,2,3,4,5'
ddong = abc.split(',')
print(ddong)
print(ddong[2]) 

num = int(input())
if num >= 0:
  while num <= 10:
    print(num)
    num = num + 1 
    
num = int(input())
sum = 0
i = 1
while i <= num:
  sum = sum+i
  i = i+1
print(sum)  
