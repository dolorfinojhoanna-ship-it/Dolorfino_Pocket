def validate_username(username):
    if not username:
        return "Username cannot be empty."
    
    if len(username) < 4:
        return "Username must be at least 4 characters."
    
    if not username.isalnum():
        return "Username must contain only letters and numbers."
    
    return "Valid"

username = input("Enter username: ")
result = validate_username(username)
print("Validation Result:", result)
