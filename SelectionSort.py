# This Program is for Selection sort Algortithm.

li = list([1,8,5,6,2,7,3])

for i in range(len(li)):
	pos = i
	for j in range(i+1, len(li)):
		if(li[j] < li[pos]):
			pos = j
	li[pos], li[i] = li[i], li[pos]

print(li)
