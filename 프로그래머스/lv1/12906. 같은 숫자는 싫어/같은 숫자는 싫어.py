def solution(arr):
    answer = []
    aaa = -1
    for aa in arr:
        if aa != aaa:
            answer.append(aa)
            aaa = aa
    return answer