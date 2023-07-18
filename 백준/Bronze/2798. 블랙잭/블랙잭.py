def main():
    count, target = map(int, input().split())
    arr = list(map(int, input().split()))
    result = 0
    for i in range(len(arr) - 2):
        for j in range(i + 1, len(arr) - 1):
            for k in range(j + 1, len(arr)):
                test_num = arr[i] + arr[j] + arr[k]
                if target >= test_num and (target - result) >= (target - test_num):
                    result = test_num
    print(result)


main()
