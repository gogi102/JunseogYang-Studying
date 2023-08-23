import random
guest = []
order = random.randrange(1,11,1)
for i in range(1,4,1):
  guest.append(i)
  print(i,"번째 손님이 들어왔습니다")
print()
print("어서오세요 *입니다")
print()
for i in guest:
  order = random.randrange(1,11,1)
  print("손님이",order,"번째 음식을 주문하였습니다")
  print("주문하신 음식이 나왔습니다")
  print(guest.pop(0),"번째 손님이 나갔습니다")
  if len(guest)==0:
    print("손님이 없습니다")
