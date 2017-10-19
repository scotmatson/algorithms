import sys

def fibonacci(n):
    if n < 2:
        return 1
    else:
        return fibonacci(n - 1) + fibonacci(n - 2)

if __name__ == "__main__":
    result = fibonacci(int(sys.argv[1]))
    print(result)
