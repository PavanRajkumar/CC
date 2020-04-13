#Write a program that accepts a sentence as input from user and builds a dictionary #with LETTERS, DIGITS, UPPERCASE,LOWERCASE as keys and the their count as the #corresponding values. For example : Sentence : VTU123@eLearning. Then dictionary #is {'LETTERS': 12,'DIGITS': 3,'UPPERCASE': 4,'LOWERCASE': 8}

#Pavan Rajkumar Magesh 1CR17CS090 6B

sentence = input("Enter the sentence : ")

dict = {"LETTERS":0,"DIGITS":0,"UPPERCASE":0,"LOWERCASE":0}

for element in range(0, len(sentence)):
	if sentence[element].isalpha():
		dict["LETTERS"] = dict["LETTERS"] + 1
		if sentence[element].isupper():
			dict["UPPERCASE"] = dict["UPPERCASE"] + 1
		if sentence[element].islower():
			dict["LOWERCASE"] = dict["LOWERCASE"] + 1

	if sentence[element].isnumeric():
		dict["DIGITS"] = dict["DIGITS"] + 1

print(dict)

#Output
#Enter the sentence : H123 U@uu
#{'LETTERS': 4, 'DIGITS': 3, 'UPPERCASE': 2, 'LOWERCASE': 2}

