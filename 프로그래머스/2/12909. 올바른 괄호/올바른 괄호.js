function solution(s){
    let sum = 0;

    if (s[0] === ")" || s[s.length-1] === "(") return false;
    
    for (const str of s) {
        sum = str === "(" ? sum + 1 : sum - 1;
        
        if (sum < 0) return false;
    }

    return sum == 0 ? true : false;
}