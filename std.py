name = str(input("Enter your name:"))
units = int(input("Enter number of registerd units:"))

if units > 7:
    status= "Overload -  Approval Required"
else:
    status = "Registration Accepted"

print(f"NAME:{name}")
print(f"UNITS:{units}")
print(f"STATUS:{status}")