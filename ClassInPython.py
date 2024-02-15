#This Program is to show the concept of Class!

class Student:
	def __init__(self, name, age, section):
		self.name = name
		self.age = age
		self.section = section

	def func(self):
		print("Name: "+str(self.name)+", Age: "+ str(self.age))

stu1 = Student("Yash", 21, 'B')
stu1.func()