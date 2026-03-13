import sqlite3

conn = sqlite3.connect("users.db")
cursor = conn.cursor()

cursor.execute(
    "CREATE TABLE IF NOT EXISTS users (username TEXT, password TEXT)"
)

username = input("Enter username: ")
password = input("Enter password: ")

cursor.execute("INSERT INTO users (username, password) VALUES (?, ?)", (username, password))

conn.commit()

print("User added safely!")
conn.close()
