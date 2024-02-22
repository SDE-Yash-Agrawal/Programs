# This Program is to use Decorators!

def lower_case_decorator(function): #This is the decorator define in which we are passing a function!
	def wrapper(): #This is the wrapper function which will perform the operation on function and if we want to pass the argument then we have to pass it here!
		func = function()
		lower_string = func.lower()
		return lower_string
	return wrapper
@lower_case_decorator #This is the decorator call

def demo(): #This is the function define
	return "Hello World!"

print(demo()) #This is function call and printing value

