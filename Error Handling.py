import os
from dotenv import load_dotenv

load_dotenv()

DB_NAME = os.getenv("DB_NAME")
DEBUG = os.getenv("DEBUG") == "True"

print("Database Name:", DB_NAME)
print("Debug Mode:", DEBUG)
