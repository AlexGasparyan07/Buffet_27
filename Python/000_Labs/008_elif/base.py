num1=int(input("Enter a number: "))
num2=int(input("Enter a number: "))
total1=(num1*num2)
total2=(num1/num2)
total3=(num1-num2)
total4=(num1+num2)
op=input("Enter an operation(+,-,*,/): ")
if(op=="+"):
    print(str(num1)+" + "+str(num2)+" = "+str(total4))
if(op=="-"):
    print(str(num1)+" - "+str(num2)+" = "+str(total3))
if(op=="/"):
    print(str(num1)+" / "+str(num2)+" = "+str(total2))
if(op=="*"):
    print(str(num1)+" * "+str(num2)+" = "+str(total1))
else:
    print("That was not a valid operation. Please rerun.")
