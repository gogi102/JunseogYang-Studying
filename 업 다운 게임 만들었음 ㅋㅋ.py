import random
rn = random.randrange(1,101,1)
num = -1
cnt = 0
while True:
  a = int(input("숫자 입력: "))
  cnt = cnt+1
  if a > rn:
    print("다운")
    continue

  elif a < rn:
    print("업")
    continue 
  else :
    print("맞추셨습니다",cnt,"번 시도 하셨습니다")
    break
