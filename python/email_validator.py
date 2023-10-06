import re

def is_valid_email(email):
    # Simple regex pattern to check if a string is an email address.
    pattern = r"^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+(\.[a-zA-Z0-9-]+)+$"
    return bool(re.match(pattern, email))

def main():
    while True:
        email = input("Enter an email address (or 'exit' to quit): ")
        if email.lower() == 'exit':
            break
        if is_valid_email(email):
            print("This is a valid email address.")
        else:
            print("This is NOT a valid email address.")

if __name__ == "__main__":
    main()
