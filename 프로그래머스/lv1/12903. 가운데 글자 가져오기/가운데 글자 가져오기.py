def solution(s):
    a = len(s)
    aa = a/2
    aa = int(aa)
    answer = ''
    if a%2 == 0:
        answer = s[aa-1] + s[aa]
        print(aa)
        print(s[aa-1]+s[aa])
    else: 
        answer = s[aa]
    return answer