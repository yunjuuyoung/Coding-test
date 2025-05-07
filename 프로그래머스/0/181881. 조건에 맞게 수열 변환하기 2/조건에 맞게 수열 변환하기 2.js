function solution(arr) {
    var answer = 0;
    
    while(true) {
        let copyArr = arr.slice();
        
        for (let i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 === 0) {
                    arr[i] /= 2;
            } else if (arr[i] < 50 && arr[i] % 2 === 1) {
                arr[i] *= 2;
                arr[i] += 1;
            }
        }
        if (JSON.stringify(copyArr) === JSON.stringify(arr)) break;
        answer++;
    }
    
    return answer;
}