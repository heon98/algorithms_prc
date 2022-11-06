def solution(arr1, arr2):
    answer = [[]]
    import numpy as np
    arr1 = np.array(arr1)
    arr2 = np.array(arr2)
    answer = arr1 + arr2
    return answer.tolist()