import sys

def factorial(n):
  if n < 2:
      return 1
  else:
      return n * factorial(n - 1)

if __name__ == "__main__":
    result = factorial(int(sys.argv[1]))
    print(result)
