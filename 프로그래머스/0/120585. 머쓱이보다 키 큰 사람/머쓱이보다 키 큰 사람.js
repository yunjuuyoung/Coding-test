function solution(array, height) {
    var answer = 0;
    
    for(const el of array) 
        if (el > height) answer++;
    
    return answer;
}