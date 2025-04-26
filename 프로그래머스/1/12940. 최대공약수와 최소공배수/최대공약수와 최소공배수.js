function gcd(p, q) {
    if (q ===  0) return p;
    return gcd(q, p % q)
}

function solution(n, m) {
    var answer = [];
    
    answer[0] = gcd(n, m);
    answer[1] = n * m / answer[0];
    
    return answer;
}