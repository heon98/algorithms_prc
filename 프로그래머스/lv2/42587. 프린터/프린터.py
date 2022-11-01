def solution(priorities, location):
    queue = [(i, j) for i, j in enumerate (priorities)]
    answer = 0
    #print(queue) 번호매김
    
    while queue:
        job = queue.pop(0)
        #print(job) 비교
        if any(job[1] < job2[1] for job2 in queue):
            queue.append(job)
            #print(queue) 비교하고 바꾸기
        else:
            answer += 1
            if job[0] == location:
                return answer