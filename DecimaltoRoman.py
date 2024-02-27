# This Program is to convert decimal value into roman value!

romanlis = ["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"]
numlis = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
ans = ""
num = int(input("Enter the number: "))
value = num
if(num >=1 and num <= 3999):
	for i in range(13):
		while(num >= numlis[i]):
			ans = ans + romanlis[i]
			num = num - numlis[i]

print(str(value) + " -> " + ans)