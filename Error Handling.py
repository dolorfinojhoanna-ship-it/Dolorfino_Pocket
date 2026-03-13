try:
    num1 = int(input("Enter a number: "))
    num2 = int(input("Enter another number: "))
    print("Division Result:", num1 / num2)
except ValueError:
    print("Error: Please enter valid numbers.")
except ZeroDivisionError:
    print("Error: Cannot divide by zero.")
except Exception as e:
    print("Unexpected error:", e)
finally:
    print("Program finished.")
