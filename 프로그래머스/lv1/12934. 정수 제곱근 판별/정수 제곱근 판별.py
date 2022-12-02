def solution(n):
    answer = 0
    a = n**(1/2)
    a = int(a)
    if a**2 == n:
        answer = (a+1)**2
    else: answer = -1
    return answer